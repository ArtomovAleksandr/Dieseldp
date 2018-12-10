package application.controller;

import application.entity.goods.Category;
import application.entity.goods.Uzel;
import application.service.implementation.UzelServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/uzels")
public class UselViewController {
    private static int sizepagin=5;
    @Autowired
    UzelServise uzelServise;
    @GetMapping("/show/{id}")
    public String index(@PathVariable int id, Model model){
        List<Uzel> uzelsList=new ArrayList<>();
        try{
            uzelsList= uzelServise.getAll();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        uzelsList=setNumberShowNumber(uzelsList,true);
        List<Uzel> uzels = paginListUsers(uzelsList,id);
        int countpagin= (int) ((uzelsList.size()/(sizepagin+0.01))+1);
        model.addAttribute("uzels", uzels );
        model.addAttribute("countpagin",countpagin);
        return "uzels/uzels";
    }
 /*   @GetMapping("/basket/show/{id}")
    public String indexBasket(@PathVariable int id, Model model){
        List<Uzel> uzelList=new ArrayList<>();
        try{
            uzelList= uzelServise.getAll();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        categoryList=setNumberShowNumber(categoryList,false);
        List<Uzel> usels = paginListUsers(uzelList,id);
        int countpagin= (int) ((uzelList.size()/(sizepagin+0.01))+1);
        model.addAttribute("usels", usels );
        model.addAttribute("countpagin",countpagin);
        return "usel/uselbasket";
    }*/
    @GetMapping("/{id}")
    public String edit(@PathVariable int id, Model model){
        Uzel uzel=new Uzel();
        try {
            uzel = uzelServise.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("usels",uzel);
        return "uzels/uzel_edit";
    }
    @GetMapping("/create")
    public String createFactory(){
        return "uzels/uzels_create";
    }

     private List setNumberShowNumber(List<Uzel> uzels, boolean isVisible){
        List<Uzel> list=new ArrayList<>();
        int j=1;
         for (int i = 0; i< uzels.size(); i++){
             if(isVisible== uzels.get(i).isVisible()) {
                 uzels.get(i).setShow_namber(j);
                 list.add(uzels.get(i));
                 j++;
             }
         }

      return list;
     }
     private List<Uzel> paginListUsers(List<Uzel>list,int id){
         List<Uzel> users = new ArrayList<>();
         for(int i=(id-1)*sizepagin;i<id*sizepagin && i<list.size();i++){
             users.add(list.get(i));
         }
         return users;
     }
}
