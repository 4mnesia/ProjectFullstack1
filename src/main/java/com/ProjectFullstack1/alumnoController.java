package com.ProjectFullstack1;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class alumnoController {
    @GetMapping("/api/v1/alumnos")
    public String getAlumnos() {
        return "listado de alumnos";
    }

}
