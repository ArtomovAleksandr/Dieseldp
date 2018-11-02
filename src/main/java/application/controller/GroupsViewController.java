package application.controller;

import application.entity.goods.Groups;
import application.service.implementation.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupsViewController {
    private static int sizepagin=5;

    @Autowired
    private GroupsService groupsService;

    @GetMapping("/show/{id}")
    public String index(@PathVariable int id, Model model){
        List<Groups> groupsList=new ArrayList<>();
        try {
            groupsList=groupsService.getAll();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        for(int i=0;i<groupsList.size();i++){
           groupsList.get(i).setShow_namber(i+1);
        }
        List<Groups> groups=new ArrayList<>();
        for(int i=(id-1)*sizepagin;i<id*sizepagin && i<groupsList.size();i++){
            groups.add(groupsList.get(i));
        }
        int countpagin= (int) ((groupsList.size()/(sizepagin+0.01))+1);
        model.addAttribute("groups",groups);
        model.addAttribute("countpagin",countpagin);
        return "groups/groups";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable int id,Model model){
        Groups groups=new Groups();
        try {
            groups= groupsService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("groups",groups);
        return "groups/groups_edit";
    }
    @GetMapping("/create")
    public String createGroups(){return "groups/groups_create";}
}
