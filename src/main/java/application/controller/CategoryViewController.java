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

import java.util.ArrayList;
import java.util.List;

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
        for (int i=0;i<categoryList.size();i++){
            categoryList.get(i).setShow_namber(i+1);
        }
        List<Category> category = new ArrayList<>();
        for(int i=(id-1)*sizepagin;i<id*sizepagin && i<categoryList.size();i++){
            category.add(categoryList.get(i));
        }

        int countpagin= (int) ((categoryList.size()/(sizepagin+0.01))+1);
        model.addAttribute("category", category );
        model.addAttribute("countpagin",countpagin);
        return "category/category";
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


}
