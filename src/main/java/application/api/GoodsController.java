package application.api;

import application.dto.GoodsDTO;
import application.entity.goods.Category;
import application.entity.goods.Goods;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1.0/goods")
public class GoodsController {
     @Autowired
     private GoodsService goodsService;
     @PostMapping
     public JSONResult<Goods> addGoods(@RequestBody GoodsDTO goods){
         Goods newGoods=new Goods();
         Category newCategory=new Category();
     //    newCategory.setId(goods.getCategory());
     //    newGoods.setCategory(newCategory);
         try{
             newGoods.setNum(goods.getNum());
             newGoods.setKatalog(goods.getKatalog());
             newGoods.setName(goods.getName());
             newGoods.setMark(goods.getMark());
             newGoods.setUnit(goods.getUnit());
             newGoods.setInprice(goods.getInprice());
             newGoods.setAddition(goods.getAddition());
             //добавляем категорию
             newCategory.setId(goods.getCategory());
             newGoods.setCategory(newCategory);
             //-------------------------------
        //    newGoods.setCurrent(goods.getCurrent());
       //     newGoods.setCategory(goods.getCategory());
      //      newGoods.setFactory(goods.getFactory());
         /*   newGoods.setGroups(goods.getGroups());
            newGoods.setUzel(goods.getUzel());*/
            goodsService.save(newGoods);
         }catch (Exception e){
             e.printStackTrace();
             return new JSONResultError<>(newGoods,e.getMessage());
         }
         return new JSONResultOk<>(newGoods);
     }
}
