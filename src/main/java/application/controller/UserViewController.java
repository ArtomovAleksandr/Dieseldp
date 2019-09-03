package application.controller;

import application.entity.goods.Category;
import application.entity.goods.Goods;
import application.service.implementation.CategoryService;
import application.service.implementation.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserViewController {
    private static int sizepagin=8;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/allcategory/{id}")
    public String showAllCategory(@PathVariable int id,Model model) {
        List<Category> categoryList = new ArrayList<>();
        Pageable pageable = PageRequest.of(id-1, sizepagin);
        Page page = null;
        try {
            page = (Page) categoryService.findByVisibleOrderByMetric(pageable);
            categoryList=page.getContent();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        model.addAttribute("categorys", categoryList );
        model.addAttribute("totalpage", page.getTotalPages());
        model.addAttribute("namberpage",page.getNumber());
        model.addAttribute("hasprevios",page.hasPrevious());
        model.addAttribute("hasnext",page.hasNext());
        return "user/allcategory";
    }
    @GetMapping("/category/{idcategory}/{idpage}")
    public String showGoodsByCategory(@PathVariable int idcategory,@PathVariable int idpage,Model model){
        List<Goods> goodsList=new ArrayList<>();
        Pageable pageable = PageRequest.of(idpage-1, sizepagin);
        Page page = null;
        try{
              page=goodsService.findByCategoryIdAndInarhiveOrderByNum(idcategory,pageable);
              goodsList=page.getContent();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        model.addAttribute("goods", goodsList );
        model.addAttribute("totalpage", page.getTotalPages());
        model.addAttribute("namberpage",page.getNumber());
        model.addAttribute("hasprevios",page.hasPrevious());
        model.addAttribute("hasnext",page.hasNext());
        model.addAttribute("idcategory",idcategory);
        return "user/category";
    }
}
