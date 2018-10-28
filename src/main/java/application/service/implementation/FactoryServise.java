package application.service.implementation;

import application.entity.goods.Factory;
import application.repository.FactoryRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryServise implements EntityService<Factory> {
    @Autowired
   FactoryRepository factoryRepository;

    @Override
    public List<Factory> getAll() throws Exception {
        return factoryRepository.findAll();
    }

    @Override
    public Factory getById(int id) throws Exception {
        return factoryRepository.findById(id).get();
    }

    @Override
    public Factory save(Factory factory) throws Exception {
        return factoryRepository.save(factory);
    }

    @Override
    public void delete(int id) throws Exception {
        factoryRepository.deleteById(id);
    }
}
