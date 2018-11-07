package application.controller;

import application.entity.goods.Factory;
import application.service.implementation.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/factory")
public class FactoryViewController {
    private static int sizepagin=5;
    @Autowired
    private FactoryService factoryService;

    @GetMapping("/show/{id}")
    public String index(@PathVariable int id, Model model){

        List<Factory> factoryList=new ArrayList<>();
        try{
            factoryList= factoryService.getAll();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        for (int i=0;i<factoryList.size();i++){
            factoryList.get(i).setShow_namber(i+1);
        }
        List<Factory> factory=new ArrayList<>();
        for(int i=(id-1)*sizepagin;i<id*sizepagin && i<factoryList.size();i++){
            factory.add(factoryList.get(i));
        }

        int countpagin= (int) ((factoryList.size()/(sizepagin+0.01))+1);
        model.addAttribute("factory", factory );
        model.addAttribute("countpagin",countpagin);
        return "factory/factory";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable int id, Model model){
        Factory factory=new Factory();
        try {
            factory = factoryService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("factory",factory);
        return "factory/factory_edit";
    }
    @GetMapping("/create")
    public String createFactory(){
        return "factory/factory_create";
    }

}
