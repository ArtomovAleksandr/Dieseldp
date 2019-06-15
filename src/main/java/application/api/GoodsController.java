package application.api;

import application.dto.GoodsDTO;
import application.entity.currency.Current;
import application.entity.goods.*;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1.0/goods")
public class GoodsController {
     @Autowired
     private GoodsService goodsService;
     @PostMapping
     public JSONResult<Goods> addGoods(@RequestBody GoodsDTO goods){
         Goods newGoods=new Goods();
         Current newCurrent=new Current();
         Category newCategory=new Category();
         Factory newFactory=new Factory();
         Groups newGroups=new Groups();
         Uzel newUzel=new Uzel();
         try{

             //добавляем Current
             newCurrent.setId(goods.getCurrent());
             newGoods.setCurrent(newCurrent);
             //добавляем категорию
             newCategory.setId(goods.getCategory());
             newGoods.setCategory(newCategory);
             //добавляем Производителя(Factory)
             newFactory.setId(goods.getFactory());
             newGoods.setFactory(newFactory);
             //добавляем Группу(Groups)
             newGroups.setId(goods.getGroups());
             newGoods.setGroups(newGroups);
             //добавляем узел(Uzel)
             newUzel.setId(goods.getUzel());
             newGoods.setUzel(newUzel);
             //--------------------------------
             newGoods.setNum(goods.getNum());
             newGoods.setCatalog(goods.getCatalog());
             newGoods.setName(goods.getName());
             newGoods.setMark(goods.getMark());
             newGoods.setUnit(goods.getUnit());
             newGoods.setInprice(goods.getInprice());
             newGoods.setCountprice(goods.getCountprice());
             newGoods.setAddition(goods.getAddition());
             newGoods.setOutprice(goods.getOutprice());
            goodsService.save(newGoods);
         }catch (Exception e){
             e.printStackTrace();
             return new JSONResultError<>(newGoods,e.getMessage());
         }
         return new JSONResultOk<>(newGoods);
     }
     @PutMapping("/{id}")
      public JSONResult<Goods> editGoods(@RequestBody GoodsDTO goods,@PathVariable int id){
         Goods newGoods=new Goods();
         Current newCurrent=new Current();
         Category newCategory=new Category();
         Factory newFactory=new Factory();
         Groups newGroups=new Groups();
         Uzel newUzel=new Uzel();
         try{
             newGoods=goodsService.getById(id);
             //добавляем Current
             newCurrent.setId(goods.getCurrent());
             newGoods.setCurrent(newCurrent);
             //добавляем категорию
             newCategory.setId(goods.getCategory());
             newGoods.setCategory(newCategory);
             //добавляем Производителя(Factory)
             newFactory.setId(goods.getFactory());
             newGoods.setFactory(newFactory);
             //добавляем Группу(Groups)
             newGroups.setId(goods.getGroups());
             newGoods.setGroups(newGroups);
             //добавляем узел(Uzel)
             newUzel.setId(goods.getUzel());
             newGoods.setUzel(newUzel);
             //--------------------------------
             newGoods.setNum(goods.getNum());
             newGoods.setCatalog(goods.getCatalog());
             newGoods.setName(goods.getName());
             newGoods.setMark(goods.getMark());
             newGoods.setUnit(goods.getUnit());
             newGoods.setInprice(goods.getInprice());
             newGoods.setCountprice(goods.getCountprice());
             newGoods.setAddition(goods.getAddition());
             newGoods.setOutprice(goods.getOutprice());
             goodsService.save(newGoods);
         }catch (Exception e){
             e.printStackTrace();
             return new JSONResultError<>(newGoods,e.getMessage());
         }
         return new JSONResultOk<>(newGoods);
     }
}
