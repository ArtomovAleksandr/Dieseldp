package application.service.implementation;

import application.entity.goods.Uzel;
import application.repository.UzelRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UzelServise implements EntityService<Uzel> {
    @Autowired
    UzelRepository uzelRepository;
    @Override
    public List<Uzel> getAll() throws Exception {
        return uzelRepository.findAll();
    }

    @Override
    public Uzel getById(int id) throws Exception {
        return uzelRepository.findById(id).get();
    }

    @Override
    public Uzel save(Uzel uzel) throws Exception {
        return uzelRepository.save(uzel);
    }

    @Override
    public void delete(int id) throws Exception {
        uzelRepository.deleteById(id);
    }
}
