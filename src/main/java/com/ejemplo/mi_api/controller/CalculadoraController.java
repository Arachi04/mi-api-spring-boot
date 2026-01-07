package com.ejemplo.mi_api.controller;

import com.ejemplo.mi_api.model.OperacionRequest;
import com.ejemplo.mi_api.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcular")
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @PostMapping
    public double calcular(@RequestBody OperacionRequest request){
        return calculadoraService.calcular(
                request.getA(),
                request.getB(),
                request.getOperacion()
        );
    }
}
