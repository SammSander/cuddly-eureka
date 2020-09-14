package com.example.pickleback.service;

import com.example.pickleback.repository.Typesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Types;
@Service

public class TypesServiceImpl implements TypesService {
    @Autowired
    Typesrepository typesrepository;

    @Override
    public Iterable<Typesrepository> listTypes() {
        return typesrepository.findAll();
    }

    @Override
    public Types createTypes(Types types) {
        return typesrepository.save(types);
    }

    @Override
    public Types getTypesById(Long id) {
        return (Types) typesrepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteTypesById(Long id) {
        typesrepository.deleteById(id);
        return HttpStatus.OK;
    }
}
