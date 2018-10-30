package application.api;

import application.entity.goods.Factory;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.FactoryServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1.0/factory")
public class FactoryController {
    @Autowired
    FactoryServise factoryServise;
    @PostMapping()
    public JSONResult<Factory> addFactory(@RequestBody Factory factory){
        Factory newFactory=new Factory();
        try {
            newFactory.setName(factory.getName());
            newFactory=factoryServise.save(newFactory);
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
            newFactory=factoryServise.getById(id);
            newFactory.setName(factory.getName());
            newFactory=factoryServise.save(newFactory);
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
            newFactory = factoryServise.getById(id);
            factoryServise.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(newFactory, ex.getMessage());
        }
        return new JSONResultOk<>(newFactory);
    }
}
