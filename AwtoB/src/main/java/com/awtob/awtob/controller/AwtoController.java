package com.awtob.awtob.controller;


import com.awtob.awtob.models.Person;
import com.awtob.awtob.models.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AwtoController {

    // Dependency
    @Autowired
    private PersonDao personDao;

    // Getter

    @GetMapping("/citizens/{id}")
    public List<Person> simplelist (){
        return personDao.findAll();

    }

    // Post Methods
    @PostMapping( "/citizens") //
    public String citizens (@RequestBody Person person){
        personDao.save(person);
        return "Nombre ingresado con Éxito";
    }

    @PostMapping( "/penalties") //
    public String penalties (@RequestBody Person person){
        personDao.save(person);
        return "Multa generada con éxito";
    }

    @PostMapping( "/vaccines") //
    public String vaccines (@RequestBody Person person){
        personDao.save(person);
        return "Vacuna registrada correctamente";
    }

    // Test Delete Method
    @DeleteMapping("/person/{id}/")
    public ResponseEntity deletePerson(@PathVariable("id") int id){
        return new ResponseEntity(HttpStatus.OK);
    }


}

