package application.controller;

import application.entity.orders.Order;
import application.service.implementation.OrderServise;
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
@RequestMapping("/userorder")
public class OrdersViewController {
    private static int sizepagin=8;
    @Autowired
    OrderServise orderServise;
    @GetMapping("/showfalsedone/{id}")
    public String index(@PathVariable int id,Model model){
        List<Order> orderList=new ArrayList<>();
        Pageable pageable = PageRequest.of(id-1, sizepagin);
        Page page = null;
        try{
            page=orderServise.findByDoneFalse(pageable);
            orderList=page.getContent();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        for (Order order:orderList) {
            order.setCountGoods();
            order.setQuantityGoodsInOrders(null);
        }
        model.addAttribute("orders",orderList);
        model.addAttribute("totalpage", page.getTotalPages());
        model.addAttribute("namberpage",page.getNumber());
        return "orders/orders";
    }
}
