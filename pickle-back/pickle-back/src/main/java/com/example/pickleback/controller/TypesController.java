package com.example.pickleback.controller;

import com.example.pickleback.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Types;

@RestController
@RequestMapping ("/types")

public class TypesController {

    @Autowired
    TypesService typesService;

    @GetMapping
    public Iterable<Types> listAllTypes() {
        return listAllTypes();
    }

    @PostMapping
    public Types createTypes(@RequestBody Types types) {
        return typesService.createTypes(types);
    }

    @GetMapping("/{id}")
    public Types getTypesById(@PathVariable Long id) {
        return typesService.getTypesById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteTypes(@PathVariable Long id) {
        return typesService.deleteTypesById(id);
    }

}
