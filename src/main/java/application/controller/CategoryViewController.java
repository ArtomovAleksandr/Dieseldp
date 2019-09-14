package application.controller;

import application.entity.goods.Category;
import application.service.implementation.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/category")
public class CategoryViewController {
    private static int sizepagin=8;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/show/{id}")
    public String index(@PathVariable int id, Model model){
        List<Category> categoryList=new ArrayList<>();
        Pageable pageable = PageRequest.of(id-1, sizepagin);
        Page page = null;
        try{
            page= categoryService.findByVisibleIsTrueOrderByMetric(pageable);
            categoryList= page.getContent();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        int statrnumber= (int) ((page.getNumber()*sizepagin));
        model.addAttribute("category", categoryList );
        model.addAttribute("totalpage", page.getTotalPages());
        model.addAttribute("namberpage",page.getNumber());
        model.addAttribute("startnumber",statrnumber);
        return "category/category";
    }
    @GetMapping("/basket/show/{id}")
    public String indexBasket(@PathVariable int id, Model model){
        List<Category> categoryList=new ArrayList<>();
        Pageable pageable = PageRequest.of(id-1, sizepagin);
        Page page = null;
        try{
            page= categoryService.findByVisibleIsFalseOrderByMetric(pageable);
            categoryList=page.getContent();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        int statrnumber= (int) ((page.getNumber()*sizepagin));
        model.addAttribute("category", categoryList );
        model.addAttribute("totalpage", page.getTotalPages());
        model.addAttribute("namberpage",page.getNumber());
        model.addAttribute("startnumber",statrnumber);
        return "category/categorybasket";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable int id, Model model){
        Category category=new Category();
        try {
            category = categoryService.getById(id);
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
