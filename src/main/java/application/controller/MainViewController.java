package application.controller;

import application.entity.goods.Category;
import application.service.implementation.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainViewController {

    @GetMapping("/")
    public  String index(){
        return "redirect:/user/allcategory/1";
    }
}
