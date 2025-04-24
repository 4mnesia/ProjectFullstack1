package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    @GetMapping("/index")
    public String getCliente() {
        return "Bienvenido al listado de clientes";
    }
    

}
