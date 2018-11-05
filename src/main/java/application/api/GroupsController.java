package application.api;


import application.entity.goods.Groups;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1.0/groups")
public class GroupsController {
    @Autowired
    GroupsService groupsService;
    @PostMapping()
    public JSONResult<Groups> addGroups(@RequestBody Groups groups) {
        Groups newGroups = new Groups();
        try {
            newGroups.setName(groups.getName());
            newGroups=groupsService.save(newGroups);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(newGroups, ex.getMessage());
        }
        return new JSONResultOk<>(newGroups);
    }
    @PutMapping("/{id}")
    public JSONResult<Groups> updateGroup(@RequestBody Groups groups,@PathVariable int  id){
        Groups newGroup=new Groups();
        try{
            newGroup=groupsService.getById(id);
            newGroup.setName(groups.getName());
            newGroup=groupsService.save(newGroup);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newGroup,ex.getMessage());
        }
        return new JSONResultOk<>(newGroup);
    }
    @DeleteMapping("/{id}")
    public JSONResult<Groups> deleteGroups(@PathVariable int id){
        Groups newGroups=new Groups();
        try{
            newGroups=groupsService.getById(id);
            groupsService.delete(id);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newGroups,ex.getMessage());
        }
        return new JSONResultOk<>(newGroups);
    }
}
