package application.controller;

import application.entity.goods.Category;
import application.entity.goods.Factory;
import application.service.implementation.CategoryServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/category")
public class CategoryViewController {
    private static int sizepagin=5;
    @Autowired
    private CategoryServise categoryServise;
    @GetMapping("/show/{id}")
    public String index(@PathVariable int id, Model model){
        List<Category> categoryList=new ArrayList<>();
        try{
            categoryList= categoryServise.getAll();

        }catch (Exception ex){
            ex.printStackTrace();
        }
         categoryList=setNumberShowNumber(categoryList,true);
        List<Category> category = paginListCategiry(categoryList,id);
        int countpagin= (int) ((categoryList.size()/(sizepagin+0.01))+1);
        model.addAttribute("category", category );
        model.addAttribute("countpagin",countpagin);
        return "category/category";
    }
    @GetMapping("/basket/show/{id}")
    public String indexBasket(@PathVariable int id, Model model){
        List<Category> categoryList=new ArrayList<>();
        try{
            categoryList= categoryServise.getAll();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        categoryList=setNumberShowNumber(categoryList,false);
        List<Category> category = paginListCategiry(categoryList,id);
        int countpagin= (int) ((categoryList.size()/(sizepagin+0.01))+1);
        model.addAttribute("category", category );
        model.addAttribute("countpagin",countpagin);
        return "category/categorybasket";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable int id, Model model){
        Category category=new Category();
        try {
            category = categoryServise.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("category",category);
        return "category/category_edit";
    }
    @GetMapping("/create")
    public String createFactory(){
        return "category/category_create";
    }

     private List setNumberShowNumber(List<Category> categories,boolean isVisible){
        List<Category> list=new ArrayList<>();
        int j=1;
         for (int i=0;i<categories.size();i++){
             if(isVisible==categories.get(i).isVisible()) {
                 categories.get(i).setShow_namber(j);
                 list.add(categories.get(i));
                 j++;
             }
         }

      return list;
     }
     private List<Category> paginListCategiry(List<Category>list,int id){
         List<Category> category = new ArrayList<>();
         for(int i=(id-1)*sizepagin;i<id*sizepagin && i<list.size();i++){
             category.add(list.get(i));
         }
         return category;
     }
}
