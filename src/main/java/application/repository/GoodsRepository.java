package application.repository;

import application.entity.goods.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;



public interface GoodsRepository extends JpaRepository<Goods, Integer>, JpaSpecificationExecutor<Goods> {
//    @Query(value = "select * from goods where in_arhive='false' and category_id = ?1  order by num",nativeQuery = true)
//    Page<Goods> findByCategoryIdAndInarhiveOrderByNum(String category_id, Pageable pageable);
    Page<Goods> findByCategoryIdEqualsAndInarhiveIsFalseOrderByNum (int id, Pageable pageable);



}
