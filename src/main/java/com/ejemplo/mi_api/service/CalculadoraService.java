package com.ejemplo.mi_api.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double calcular(double a, double b, String operacion){

        switch (operacion){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0){
                    throw new IllegalArgumentException("No se puede dividir entre cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operacion no soportada: " + operacion);
        }
    }
}