package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodsViewController {
    @GetMapping("/")
    public String index(){
        return "factory/factory_create";
    }

}
