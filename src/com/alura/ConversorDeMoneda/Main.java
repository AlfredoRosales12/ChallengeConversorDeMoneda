package com.alura.ConversorDeMoneda;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SolicitudMonedaBase solicitud = new SolicitudMonedaBase();
        Convertidor convertidor = new Convertidor();
        Scanner scanner = new Scanner(System.in);
        int opc=0;

        String textoDeBienvenida = """
**************************************************************************************************************************************************
    Bienvenido al menú del Conversor de Monedas
      
    ¿Comó funciona?
           • Cada que el programa te pida el código de la moneda deberás colocar el código ISO 4217 de las monedas internacionales
            Por ejemplo el código ISO 4217 del dólar es -> USD y el del peso mexicano es -> MXN y así sucesivamente.
           
           NOTA: no importa si colocas mayúsculas o minúsculas o espacios solamente verifica que el código de tres letras sea el correcto.
**************************************************************************************************************************************************
""";
        System.out.println(textoDeBienvenida);
        do {

            System.out.println("\n¿ Deseas convertir una moneda?");
            System.out.println("1. Si");
            System.out.println("2. Salir");
            System.out.println("Respuesta: ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\nIntroduce el monto a convertir: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Ingresa el código de la moneda de Origen (ejemplo. USD para Dolar) :");
                    String monedaBase = scanner.nextLine().trim().toUpperCase();

                    System.out.println("Ingresa el código de la moneda a la que quieres convertir (ejemplo. EUR para euro) :");
                    String monedaDestino = scanner.nextLine().trim().toUpperCase();

                    Moneda moneda = solicitud.solicitudBase(monedaBase);

                    try{
                        double resultado = convertidor.convertir(moneda, monedaDestino, valor);
                        System.out.println("\n$" + valor + " " + monedaBase + " equivalen a $" + resultado + " " + monedaDestino);

                    }catch(NullPointerException e){
                        System.out.println("No se encontró una moneda");
                    }




                    break;

                case 2:
                    System.out.println("Gracias por usar el conversor :) . ");
                    break;
                default:
                    System.out.println("Opción No válida Intentelo nuevamente ");
                    break;
            }

        }while(opc!=2);


    }
}