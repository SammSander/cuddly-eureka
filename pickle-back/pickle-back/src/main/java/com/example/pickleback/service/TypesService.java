package com.example.pickleback.service;

import com.example.pickleback.model.Types;
import com.example.pickleback.repository.Typesrepository;
import org.springframework.http.HttpStatus;



public interface TypesService {
    Iterable<Types> listTypes();
    Types createTypes(Types types);
    Types getTypesById(Long id);
    HttpStatus deleteTypesById(Long id);


}
