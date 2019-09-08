package application.controller;

import application.entity.currency.Current;
import application.entity.goods.*;
import application.service.implementation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsViewController {
    private static int sizepagin=10;
    @Autowired
    private FactoryService factoryService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private GroupsService groupsService;
    @Autowired
    private UzelServise uzelServise;
    @Autowired
    private CurrentService currentService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UnitServise unitServise;

    @GetMapping("/{id}")
    public String edit (@PathVariable int id, Model model){
        List<Factory> factoryList=new ArrayList<>();
        List<Category> categoryList=new ArrayList<>();
        List<Groups> groupsList=new ArrayList<>();
        List<Uzel> uzelList=new ArrayList<>();
        List<Current> currentList=new ArrayList<>();
        List<Unit> units=new ArrayList<>();
        Goods goods=new Goods();
        try {
            factoryList=factoryService.getAll();
            categoryList=categoryService.getAll();
            groupsList=groupsService.getAll();
            uzelList=uzelServise.getAll();
            currentList=currentService.getAll();
            units=unitServise.getAll();
            goods=goodsService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("factorys",factoryList);
        model.addAttribute("categorys",categoryList);
        model.addAttribute("groups",groupsList);
        model.addAttribute("uzels",uzelList);
        model.addAttribute("currents",currentList);
        model.addAttribute("goods",goods);
        model.addAttribute("units",units);
        //maby model.addAllAttribute
        return "goods/goods_edit";
    }

    @GetMapping("/show")
    public String index(){

       return "goods/goods";
    }
    @GetMapping("/create_goods/{id}")
    String createGoodsById(@PathVariable int id,Model model){
        List<Factory> factoryList=new ArrayList<>();
        List<Category> categoryList=new ArrayList<>();
        List<Groups> groupsList=new ArrayList<>();
        List<Uzel> uzelList=new ArrayList<>();
        List<Current> currentList=new ArrayList<>();
        List<Unit> units=new ArrayList<>();
        Goods goods=new Goods();
        try {
            factoryList=factoryService.getAll();
            categoryList=categoryService.getAll();
            groupsList=groupsService.getAll();
            uzelList=uzelServise.getAll();
            currentList=currentService.getAll();
            units=unitServise.getAll();
            goods=goodsService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("factorys",factoryList);
        model.addAttribute("categorys",categoryList);
        model.addAttribute("groups",groupsList);
        model.addAttribute("uzels",uzelList);
        model.addAttribute("currents",currentList);
        model.addAttribute("goods",goods);
        model.addAttribute("units",units);
        return "goods/goods_create_id";
    }

    @GetMapping("/create")
    public String createGoods(Model model){
        List<Factory> factoryList=new ArrayList<>();
        List<Category> categoryList=new ArrayList<>();
        List<Groups> groupsList=new ArrayList<>();
        List<Uzel> uzelList=new ArrayList<>();
        List<Current> currentList=new ArrayList<>();
        try {
            factoryList=factoryService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            categoryList=categoryService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            groupsList=groupsService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            uzelList=uzelServise.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
           currentList=currentService.getAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("factorys",factoryList);
        model.addAttribute("categorys",categoryList);
        model.addAttribute("groups",groupsList);
        model.addAttribute("uzels",uzelList);
        model.addAttribute("currents",currentList);
        return "goods/goods_create";
    }
    private List<Goods> paginListGoods(List<Goods>list,int id){
        List<Goods> users = new ArrayList<>();
        for(int i=(id-1)*sizepagin;i<id*sizepagin && i<list.size();i++){
            users.add(list.get(i));
        }
        return users;
    }
}
