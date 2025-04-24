package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/product")
public class productoController {
    @GetMapping("/index")
    public String getProduct() {
        return "Bienvenido al listado de productos";
    }
    @GetMapping("/{idproducto}")
    public String getProductString(@PathVariable("idproducto") int idproducto) {
        var productos = new String[10];
        productos[0] = "Manzana";    
        productos[1] = "arroz";
        productos[2] = "peras";
        productos[3] = "uvas";
        productos[4] = "weas";
        productos[5] = "ewfwfew";
        productos[6] = "gag";
        productos[7] = "egwggr";
        productos[8] = "kyuyuyj";
        productos[9] = "trntrntrn";
        //productos[10] = "weas";
        //productos[11] = "weas";



        for (int i = 0; i < 10; i++) {
            if (i == idproducto) {
                return "El producto es: " + productos[i] + " y su id es: " + idproducto;
            }


        }
        return "El producto no existe";    
    }
    
}
