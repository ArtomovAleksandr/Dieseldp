package application.api;

import application.entity.goods.Category;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1.0/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping
    public JSONResult<Category> addFactory(@RequestBody Category category){
        Category newCategory=new Category();
        try {
            newCategory.setName(category.getName());
            newCategory.setVisible(category.getVisible());
            newCategory= categoryService.save(newCategory);
        }catch (Exception e){
            e.printStackTrace();
            return  new JSONResultError<>(newCategory,e.getMessage());
        }
        return new JSONResultOk<>(newCategory);
    }
    @PutMapping(value = "/move_basket/{id}")
    public JSONResult<Category> moveBasket(@PathVariable int id){
        Category category=new Category();
        try {
            category= categoryService.getById(id);
            category.setVisible(false);
            category= categoryService.save(category);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(category,ex.getMessage());
        }
        return new JSONResultOk<>(category);
    }
    @PutMapping(value = "/restore/{id}")
    public JSONResult<Category> restoreBasket(@PathVariable int id){
        Category category=new Category();
        try {
            category= categoryService.getById(id);
            category.setVisible(true);
            category= categoryService.save(category);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(category,ex.getMessage());
        }
        return new JSONResultOk<>(category);
    }
    @PutMapping("/{id}")
    public JSONResult<Category> updateFactory(@RequestBody Category category,@PathVariable int id){
        Category newCategory=new Category();
        try {
            newCategory= categoryService.getById(id);
            newCategory.setName(category.getName());
            newCategory= categoryService.save(newCategory);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JSONResultError<>(newCategory,ex.getMessage());
        }
        return new JSONResultOk<>(newCategory);

    }
    @DeleteMapping("/{id}")
    public JSONResult<Category> deleteFactory(@PathVariable int id) {
        Category newCategory = new Category();
        try {
            newCategory = categoryService.getById(id);
            categoryService.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(newCategory, ex.getMessage());
        }
        return new JSONResultOk<>(newCategory);
    }
}
