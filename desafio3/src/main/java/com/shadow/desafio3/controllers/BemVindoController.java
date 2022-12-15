package com.shadow.desafio3.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BemVindoController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String BemVindoText(@PathVariable String name) {
        return "Bem Vindo " + name + "!";
    }

}
