package com.alura.ConversorDeMoneda;



public class Main {
    public static void main(String[] args) {

        SolicitudMonedaBase solicitud = new SolicitudMonedaBase();

        Moneda monedaBase = solicitud.solicitud("USD");

        System.out.println(monedaBase);


    }
}