package application.api;

import application.dto.*;
import application.entity.goods.Category;
import application.entity.goods.Factory;
import application.entity.goods.Groups;
import application.entity.goods.Uzel;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1.0/elementspage")
public class ElementsPageController {
    @Autowired
    FactoryService factoryService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    GroupsService groupsService;
    @Autowired
    UzelServise uzelService;
    @GetMapping("/all")
    public JSONResult<GoodsDTOElementsTable> elementspage() {
        GoodsDTOElementsTable elementsTable=new GoodsDTOElementsTable();
        //factory
        List<GoodsDTOFactory> goodsDTOFactoryList=new ArrayList<>();
        List<Factory> factoryList=new ArrayList<>();
        //category
        List<GoodsDTOCategory> goodsDTOCategoryList=new ArrayList<>();
        List<Category>categoryList=new ArrayList<>();
        //groups
        List<GoodsDTOGroups> goodsDTOGroupsList=new ArrayList<>();
        List<Groups> groupsList=new ArrayList<>();
        //uzel
        List<GoodsDTOUzel> goodsDTOUzelList=new ArrayList<>();
        List<Uzel> uzelList=new ArrayList<>();
        try {
            factoryList=factoryService.getAll();
            categoryList=categoryService.getAll();
            groupsList=groupsService.getAll();
            uzelList=uzelService.getAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(elementsTable,ex.getMessage());
        }
        //factory
        for (Factory ff: factoryList) {
            goodsDTOFactoryList.add(new GoodsDTOFactory(ff.getId(),ff.getName()));
        }
        elementsTable.setFactoryList(goodsDTOFactoryList);
        //category
        for (Category cc:categoryList) {
            goodsDTOCategoryList.add(new GoodsDTOCategory(cc.getId(),cc.getName()));
        }
        elementsTable.setCategoryList(goodsDTOCategoryList);
        //groups
        for (Groups gg:groupsList) {
            goodsDTOGroupsList.add(new GoodsDTOGroups(gg.getId(),gg.getName()));
        }
        elementsTable.setGroupsList(goodsDTOGroupsList);
        //uzel
        for (Uzel uu:uzelList) {
            goodsDTOUzelList.add(new GoodsDTOUzel(uu.getId(),uu.getName()));
        }
        elementsTable.setUzelList(goodsDTOUzelList);
        return new JSONResultOk<>(elementsTable);
    }
}
