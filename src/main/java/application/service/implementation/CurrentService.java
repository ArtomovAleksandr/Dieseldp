package application.service.implementation;

import application.entity.currency.Current;
import application.repository.CurrentRepositry;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurrentService implements EntityService<Current> {
    @Autowired
    CurrentRepositry currentRepositry;
    @Override
    public List<Current> getAll() throws Exception {
        return currentRepositry.findAll();
    }

    @Override
    public Current getById(int id) throws Exception {
        return currentRepositry.findById(id).get();
    }

    @Override
    public Current save(Current current) throws Exception {
        return currentRepositry.save(current);
    }

    @Override
    public void delete(int id) throws Exception {
         currentRepositry.deleteById(id);
    }
}
