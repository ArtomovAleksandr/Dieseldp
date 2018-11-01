package application.controller;

import application.entity.goods.Factory;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.FactoryServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/factory")
public class FactoryViewController {
    private static int sizepagin=5;
    @Autowired
    private FactoryServise factoryServise;
    @GetMapping()
    String indexShow(){
    //    Integer factory_view= (Integer) session.getAttribute("factory");
    //    if(factory_view==null) factory_view=1;
        return "redirect:/factory/show/1";
    }

    @GetMapping("/show/{id}")
    public String index(@PathVariable int id, Model model){

   //     System.out.println("factory_view = "+factory_view);
        List<Factory> factoryList=new ArrayList<>();
        try{
            factoryList=factoryServise.getAll();

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
    //    model.addAttribute("activepagin",id);
        return "factory/factory";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable int id, Model model){
        Factory factory=new Factory();
        try {
            factory =factoryServise.getById(id);
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
