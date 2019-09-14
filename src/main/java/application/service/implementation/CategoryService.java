package application.service.implementation;

import application.entity.goods.Category;
import application.repository.CategoryRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

///import static java.util.stream.Nodes.collect;

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
    public Page<Category> findByVisibleOrderByMetric(Pageable pageable)throws Exception{
        return categoryRepository.findByVisibleAndOrderByMetric(pageable);
    }
    public Page<Category> findByVisibleIsFalseOrderByMetric(Pageable pageable){
        return categoryRepository.findByVisibleIsFalseOrderByMetric(pageable);
    }
    public Page<Category> findByVisibleIsTrueOrderByMetric(Pageable pageable){
        return categoryRepository.findByVisibleAndOrderByMetric(pageable);
    }

}
