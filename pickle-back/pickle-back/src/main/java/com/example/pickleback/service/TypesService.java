package com.example.pickleback.service;

import com.example.pickleback.repository.Typesrepository;
import org.springframework.http.HttpStatus;

import java.sql.Types;

public interface TypesService {
    Iterable<Typesrepository> listTypes();
    Types createTypes(Types types);
    Types getTypesById(Long id);
    HttpStatus deleteTypesById(Long id);


}
