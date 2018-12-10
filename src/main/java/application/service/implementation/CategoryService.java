package application.service.implementation;

import application.entity.goods.Category;
import application.repository.CategoryRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements EntityService<Category> {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() throws Exception {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) throws Exception {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category save(Category category) throws Exception {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(int id) throws Exception {
          categoryRepository.deleteById(id);
    }
}
