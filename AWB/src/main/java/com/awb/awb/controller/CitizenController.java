package com.awb.awb.controller;
import com.awb.awb.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@RestController
@RequestMapping("/")
public class CitizenController {

    @PostMapping("/citizens")
    public String postsendname(@RequestBody citizen namecitizen){
        return "Nombre : " + namecitizen.getName() + " Ingresado Correctamente";
    }

    @PostMapping("/penalties")
    public String postpenalties(@RequestBody penalty penaltiesend, Integer citizenid){
        citizenid = 1;
        return "Citizendid: " + citizenid + "| Reason: " + penaltiesend.getReason();
    }
    @PostMapping("/vaccines")
    public String vaccines(@RequestBody vaccination vaccuned, Integer citizenid){
        citizenid = 1;
        return "Citizendid: " + citizenid + "| Brand: " + vaccuned.getBrand();
    }

    // Form 1
    @GetMapping("/citizens/{i}")
    public citizenfinal finalget(citizenfinal getname){
        return getname;
    }

    // Form 2
    @GetMapping("/prueba/{i}")
    public List<citizenfinal> citizenfinals(){
        List<citizenfinal> citizenfinals = new ArrayList<>();
        citizenfinals.add(new citizenfinal(1,"Ricardo Soto Muñoz",FALSE,TRUE,"...","Pfizer",162806,"...", 122332,"Multado por andar sin mascarilla"));
        return citizenfinals;
    }

}
