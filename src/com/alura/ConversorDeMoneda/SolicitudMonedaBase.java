package com.alura.ConversorDeMoneda;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitudMonedaBase {

    public Moneda solicitudBase (String monedaBase){
        final String APIKEY= "2d924bbba4ebc87a3327e1dd";
        final String URL ="https://v6.exchangerate-api.com/v6/"+APIKEY+"/latest/"+monedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(URL))
            .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            return gson.fromJson(json, Moneda.class);

        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al realizar la solicitud.");
            return null;
        }
    }
}
