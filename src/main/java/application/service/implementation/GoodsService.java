package application.service.implementation;

import application.entity.goods.Goods;
import application.repository.GoodsRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsService implements EntityService<Goods> {
    @Autowired
    GoodsRepository goodsRepository;
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
    public List<Goods> getAllfromIdstepSize() throws Exception{
       return   goodsRepository.mySelect();
    }
}
