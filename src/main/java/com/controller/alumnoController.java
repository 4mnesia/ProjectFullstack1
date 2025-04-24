package com.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;







@RestController
@RequestMapping("/api")
public class alumnoController {
    @GetMapping("/alumnos")
    public String getAlumnos() {
        return "xd";
    }

    @GetMapping("/hello/{nombre}")
    public String getSaludo(@PathVariable("nombre")String nombreSaludo) {
        return "hola todos soy " + nombreSaludo;
    }
        
    @GetMapping("/suma/{numero}/{numero2}")
    public String getSuma(@PathVariable("numero") int numero, @PathVariable("numero2") int numero2) {
        return "la suma es: " + (numero + numero2);
    }
    @GetMapping("/resta/{numero}/{numero2}")
    public String getResta(@PathVariable("numero") int numero, @PathVariable("numero2") int numero2) {
        return "la resta es: " + (numero - numero2);
    }
    @GetMapping("/multiplicacion/{numero}/{numero2}")
    public String getMultiplicacion(@PathVariable("numero") int numero, @PathVariable("numero2") int numero2) {
        return "la multiplicacion es: " + (numero * numero2);
    }
    @GetMapping("/division/{numero}/{numero2}")
    public String getDivision(@PathVariable("numero") int numero, @PathVariable("numero2") int numero2) {
        return "la division es: " + (numero / numero2);
    }
    

}


