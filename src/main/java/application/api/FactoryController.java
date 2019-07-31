package application.api;

import application.dto.GoodsDTOFactory;
import application.entity.goods.Factory;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1.0/factory")
public class FactoryController {
    @Autowired
    FactoryService factoryService;
    @PostMapping()
    public JSONResult<Factory> addFactory(@RequestBody Factory factory){
        Factory newFactory=new Factory();
        try {
            newFactory.setName(factory.getName());
            newFactory= factoryService.save(newFactory);
        }catch (Exception e){
            e.printStackTrace();
            return  new JSONResultError<>(newFactory,e.getMessage());
        }
        return new JSONResultOk<>(newFactory);
    }
    @PutMapping("/{id}")
    public JSONResult<Factory> updateFactory(@RequestBody Factory factory,@PathVariable int id){
        Factory newFactory=new Factory();
        try {
            newFactory= factoryService.getById(id);
            newFactory.setName(factory.getName());
            newFactory= factoryService.save(newFactory);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newFactory,ex.getMessage());
        }
        return new JSONResultOk<>(newFactory);

    }
    @DeleteMapping("/{id}")
    public JSONResult<Factory> deleteFactory(@PathVariable int id) {
        Factory newFactory = new Factory();
        try {
            newFactory = factoryService.getById(id);
            factoryService.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(newFactory, ex.getMessage());
        }
        return new JSONResultOk<>(newFactory);
    }

}
