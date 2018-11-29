package application.api;


import application.entity.goods.Groups;
import application.entity.goods.Uzel;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.UzelServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1.0/uzel")
public class UzelController {
    @Autowired
    UzelServise uzelService;
    @PostMapping()
    public JSONResult<Uzel> addGroups(@RequestBody Uzel uzel) {
        Uzel newUzel = new Uzel();
        try {
            newUzel.setName(uzel.getName());
            newUzel=uzelService.save(newUzel);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(newUzel, ex.getMessage());
        }
        return new JSONResultOk<>(newUzel);
    }
    @PutMapping("/{id}")
    public JSONResult<Uzel> updateGroup(@RequestBody Uzel uzel,@PathVariable int  id){
        Uzel newUzel=new Uzel();
        try{
            newUzel=uzelService.getById(id);
            newUzel.setName(uzel.getName());
            newUzel=uzelService.save(newUzel);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newUzel,ex.getMessage());
        }
        return new JSONResultOk<>(newUzel);
    }
    @DeleteMapping("/{id}")
    public JSONResult<Uzel> deleteGroups(@PathVariable int id){
        Uzel newUzel=new Uzel();
        try{
            newUzel=uzelService.getById(id);
            uzelService.delete(id);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newUzel,ex.getMessage());
        }
        return new JSONResultOk<>(newUzel);
    }
}
