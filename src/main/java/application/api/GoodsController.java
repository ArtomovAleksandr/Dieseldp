package application.api;

import application.dto.*;
import application.entity.currency.Current;
import application.entity.goods.*;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequestMapping(value = "/api/v1.0/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping
    public JSONResult<Goods> addGoods(@RequestBody GoodsDTO goods) {
        Goods newGoods = new Goods();
        Current newCurrent = new Current();
        Category newCategory = new Category();
        Factory newFactory = new Factory();
        Groups newGroups = new Groups();
        Uzel newUzel = new Uzel();
        try {

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
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONResultError<>(newGoods, e.getMessage());
        }
        return new JSONResultOk<>(newGoods);
    }

    @PostMapping("/rest")
    public GoodsPageDTO rest(@RequestBody GoodsDTOTableAJAX data) {
        GoodsPageDTO goodsPageDTO=new GoodsPageDTO();
        List<GoodsDTOTable> goodsDTOTableList = new ArrayList<>();
        List<Goods> goodsList = new ArrayList<>();
        Pageable pageable = PageRequest.of(data.getNumberpage(), data.getPaginator());

        Page page = null;
   //     int totalPages = page.getTotalPages();
        try {
            page = goodsService.findByCriteris(data, pageable);
            goodsList = page.getContent();
        } catch (Exception e) {
            e.printStackTrace();

        }
        for (Goods goods : goodsList) {
            GoodsDTOTable goodsDTO = new GoodsDTOTable();
            goodsDTO.setId(goods.getId());
            goodsDTO.setCurrent(goods.getCurrent().getName());
            goodsDTO.setCategory(goods.getCategory().getName());
            goodsDTO.setFactory(goods.getFactory().getName());
            goodsDTO.setGroups(goods.getGroups().getName());
            goodsDTO.setUzel(goods.getUzel().getName());
            goodsDTO.setNum(goods.getNum());
            goodsDTO.setCatalog(goods.getCatalog());
            goodsDTO.setName(goods.getName());
            goodsDTO.setUnit(goods.getUnit());
            goodsDTO.setMark(goods.getMark());
            goodsDTO.setInprice(goods.getInprice());
            goodsDTO.setCountprice(goods.isCountprice());
            goodsDTO.setAddition(goods.getAddition());
            goodsDTO.setOutprice(goods.getOutprice());
            goodsDTO.setPrice(countPrice(goods.getInprice(), goods.getCurrent().getRate(), goods.isCountprice(), goods.getAddition(), goods.getOutprice()));
            goodsDTOTableList.add(goodsDTO);
        }
        goodsPageDTO.setGoodsDTOTableList(goodsDTOTableList);
        if(page!=null) {
            goodsPageDTO.setNumberpage(page.getNumber());
            goodsPageDTO.setTotalpages(page.getTotalPages());
            goodsPageDTO.setHasPrevious(page.hasPrevious());
            goodsPageDTO.setHasNext(page.hasNext());
        }
        return goodsPageDTO;
    }

    private double countPrice(double inprice, double current, boolean countprice, int addition, double outprice) {
        if (countprice == true) {
            return (double) inprice * current * ((addition / 100.0f) + 1);
        } else {
            return outprice * current;
        }
    }

    @PutMapping("/{id}")
    public JSONResult<Goods> editGoods(@RequestBody GoodsDTO goods, @PathVariable int id) {
        Goods newGoods = new Goods();
        Current newCurrent = new Current();
        Category newCategory = new Category();
        Factory newFactory = new Factory();
        Groups newGroups = new Groups();
        Uzel newUzel = new Uzel();
        try {
            newGoods = goodsService.getById(id);
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
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONResultError<>(newGoods, e.getMessage());
        }
        return new JSONResultOk<>(newGoods);
    }

    @DeleteMapping("/{id}")
    public JSONResult<Goods> deleteGoods(@PathVariable int id) {
        Goods newGood = new Goods();
        try {
            newGood = goodsService.getById(id);
            goodsService.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(newGood, ex.getMessage());
        }
        return new JSONResultOk<>(newGood);
    }

}
