package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsViewController {
    @GetMapping("/create")
    public String createGoods(){
        return "goods/goods_create";
    }

}
