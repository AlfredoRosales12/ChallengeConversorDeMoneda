package com.alura.ConversorDeMoneda;



public class Main {
    public static void main(String[] args) {

        SolicitudMonedaBase solicitud = new SolicitudMonedaBase();
        Convertidor convertidor = new Convertidor();

        Moneda monedaBase = solicitud.solicitudBase("USD");

        double valor=convertidor.convertir(monedaBase,"MXN",1258.6);

        System.out.println(valor);


    }
}