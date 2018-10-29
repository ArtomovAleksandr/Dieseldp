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

@Controller
@RequestMapping("/factory")
public class FactoryViewController {
    @Autowired
    private FactoryServise factoryServise;

    @GetMapping()
    public String index(Model model){
        try{
            model.addAttribute("factory",factoryServise.getAll());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "factory/factory";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable int id, Model model){
        return "factory/factory_edit";
    }
    @GetMapping("/create")
    public String createFactory(){
        return "factory/factory_create";
    }
    @DeleteMapping("/{id}")
    public JSONResult<Factory> deleteFactory(@PathVariable int id){
        Factory newFactory=new Factory();
        try{
            newFactory=factoryServise.getById(id);
            factoryServise.delete(id);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newFactory,ex.getMessage());
    }
    return new JSONResultOk<>(newFactory);
}
