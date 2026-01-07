package com.ejemplo.mi_api.model;

public class OperacionRequest {

    private double a;
    private double b;
    private String operacion;

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b = b;
    }

    public String getOperacion(){
        return operacion;
    }

    public void setOperacion(String operacion){
        this.operacion = operacion;
    }

}
