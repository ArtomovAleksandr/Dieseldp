package application.repository;

import application.entity.goods.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = "select * from category where visible=true order by metric",nativeQuery = true)
    Page<Category> findByVisibleAndOrderByMetric(Pageable pageable);
}
