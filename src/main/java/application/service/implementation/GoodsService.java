package application.service.implementation;

import application.dto.GoodsDTOTableAJAX;
import application.entity.goods.Goods;
import application.repository.GoodsRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService implements EntityService<Goods> {
    private static final int startindexFactory=0;
    private static final int startindexGroups=0;
    private static final int startindexCategory=1;
    private static final int startindexUsel=0;
    @Autowired
    GoodsRepository goodsRepository;


    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public List<Goods> getAll() throws Exception {
        return goodsRepository.findAll();
    }

    @Override
    public Goods getById(int id) throws Exception {
        return goodsRepository.findById(id).get();
    }

    @Override
    public Goods save(Goods goods) throws Exception {
        return goodsRepository.save(goods);
    }

    @Override
    public void delete(int id) throws Exception {
        goodsRepository.deleteById(id);
    }

    public List<Goods> getAllfromIdstepSize() throws Exception {
        return goodsRepository.mySelect();
    }

//    public List<Goods> find(GoodsDTOTableAJAX data) {
//
////        List<Goods> resultList = entityManagerFactory.createEntityManager()
////                .createNativeQuery("select * from goods where name like '" + data.getInputstr() + "%' and in_arhive='false'", Goods.class)
////                .getResultList();
//
//        Specification<Goods> spec1 = (Specification<Goods>) (root, criteriaQuery, criteriaBuilder) -> {
//            if (data.getInputstr() != null && data.getInputstr().trim().length() > 0) {
//               return criteriaBuilder.and(
//                        criteriaBuilder.like(root.get("name"), data.getInputstr() + "%"),
//                        criteriaBuilder.equal(root.get("inarhive"), false));
//            }
//            return criteriaBuilder.and();
//        };
//
//        Specification<Goods> spec2 = (Specification<Goods>) (root, criteriaQuery, criteriaBuilder) -> {
//
//            if (data.getInputstr() != null && data.getInputstr().trim().length() > 0) {
//                return criteriaBuilder.and(
//                        criteriaBuilder.like(root.get("catalog"), data.getInputstr() + "%"),
//                        criteriaBuilder.equal(root.get("inarhive"), false)
//                );
//            }
//            return criteriaBuilder.and();
//        };
//        return goodsRepository.findAll(spec1.or(spec2));
//    }
    public List<Goods> findByCriteris(GoodsDTOTableAJAX data, Pageable pageable){
        return goodsRepository.findAll(
                new Specification<Goods>() {
                    @Override
                    public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                      List<Predicate> predicates=new ArrayList<>();

                          if(data.getInputstr()!=null && data.getInputstr().trim().length()>0){
                              predicates.add(criteriaBuilder.or(
                                      criteriaBuilder.like(root.get("catalog"),data.getInputstr()+"%"),
                                      criteriaBuilder.like(root.get("num"),data.getInputstr()+"%"),
                                      criteriaBuilder.like(root.get("name"),data.getInputstr()+"%"))
                              );
                          }
                          if(data.getUzelid()>startindexUsel) {
                            predicates.add(criteriaBuilder.equal(root.get("uzel"), data.getUzelid()));
                          }
                          if(data.getGroupsid()>startindexGroups) {
                            predicates.add(criteriaBuilder.equal(root.get("groups"), data.getGroupsid()));
                          }
                          if(data.getCategoryid()>startindexCategory) {
                            predicates.add(criteriaBuilder.equal(root.get("category"), data.getCategoryid()));
                          }
                          if(data.getFactoryid()>startindexFactory) {
                               predicates.add(criteriaBuilder.equal(root.get("factory"), data.getFactoryid()));
                          }
                          criteriaQuery.orderBy(criteriaBuilder.asc(root.get("num")));
                          predicates.add(criteriaBuilder.equal(root.get("inarhive"), data.isArhivebool()));

                        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
                    }
                }
        );
    }
}
