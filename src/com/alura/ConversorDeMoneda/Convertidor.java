package com.alura.ConversorDeMoneda;

public class Convertidor {
    public double convertir (Moneda monedaBase, String monedaAConvertir, double cantidad){
        double tazaDeConversion = monedaBase.conversion_rates().get(monedaAConvertir);
        return tazaDeConversion * cantidad;
    }
}
