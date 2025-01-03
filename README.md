# Challenge Conversor de Moneda
![Static Badge](https://img.shields.io/badge/release_date-January-green)
![Static Badge](https://img.shields.io/badge/Status-Under_review-purple)

## Descripción

Este proyecto consiste en desarrollar un Conversor de Monedas utilizando el lenguaje de programación Java, con el propósito de fortalecer tus habilidades en programación, manipulación de datos y consumo de servicios web. 
Para lograr el objetivo del Challenge se utilizarón las solicitudes a una API de tasas de cambio (Exchange Rate API) para obtener información actualizada sobre las cotizaciones de diversas monedas. 
Del mismo modo se hizo uso de la biblioteca HttpClient y HttpRequest y se trabajaró con datos en formato JSON los cuales se modificaron con Gson.


## :pencil: Características

- -**Conversor de Moneda:** Convierte una cantidad dada por el usuario a la moneda que escoga el usuario.
- - **Encriptación de Texto:** El conversor pide el código ISO 4217, el cúal nos ayuda a identificar las monedas.
- -**Código ISO 4217:** Este estándar internacional define códigos de tres letras que representan las distintas monedas del mundo. Por ejemplo el código Iso 4217 del Dolar es "USD"


## :hammer_and_wrench: Desarrollo

Para completar el challenge del Conversor de Monedas en Java, se desarrolló una aplicación que consume una API de tasas de cambio y procesa la información obtenida para convertir diferentes monedas. 
**Clase -> SolicitudMonedaBase:**
  La primera etapa consistió en crear una clase llamada SolicitudMonedaBase, cuya función principal es manejar las solicitudes a la API. 
  En esta clase, se utilizó la biblioteca estándar de Java, HttpClient, para realizar la llamada HTTP de manera eficiente. 
  Mediante el uso de HttpRequest, se configuró la solicitud incluyendo la URL de la API y una API key generada específicamente para acceder al servicio de Exchange Rates. 
  La respuesta de la API, en formato JSON, se gestionó mediante un objeto HttpResponse<String>, el cual almacena el contenido recibido como una cadena de texto.

**Clase -> Moneda:**
  Para representar las monedas y sus tasas de cambio, se definió una clase de tipo Record llamada Moneda. 
  Este tipo de clase, introducido en versiones recientes de Java, es ideal para modelar datos inmutables de manera concisa. 
  La clase Moneda consta de dos campos: base, que indica la moneda base de la conversión, y rates, un mapa que contiene las monedas disponibles junto con sus respectivas tasas de cambio. 
  Esta estructura permitió un acceso sencillo y directo a los datos proporcionados por la API.

**Clase -> Convertidor:**
  La clase Convertidor fue diseñada para encapsular la lógica principal del conversor de monedas, proporcionando un método central llamado convertir. 
  Este método es responsable de realizar la conversión de una cantidad específica de dinero entre dos monedas, utilizando las tasas de cambio obtenidas previamente desde la API.

  El método convertir recibe tres parámetros importantes:
    - Moneda monedaBase: Este parámetro es un objeto de la clase Moneda (definida como un Record), que contiene la moneda base y un mapa con las tasas de cambio para otras monedas.
    - String monedaAConvertir: Corresponde al código de la moneda a la que se desea convertir el dinero, por ejemplo, "USD" o "EUR".
    - double cantidad: Es el monto que se desea convertir desde la moneda base hacia la moneda de destino.

**Clase -> Main:**

  La clase Main es el punto de entrada de la aplicación y tiene como propósito brindar al usuario una interfaz de consola que permita realizar múltiples conversiones de monedas de manera interactiva. 
  Se implementó un menú utilizando un ciclo que permanece activo hasta que el usuario decida salir, permitiéndole realizar tantas conversiones como necesite.



## :iphone: Contact

Te puedes comunicar conmigo a través de los siguientes canales de comunicación:

- [Discord](https://discord.com):
  - `@Alfredo Rosales` Nombre de Usuario
- [LinkedIn][@Alfredo Rosales](https://www.linkedin.com/in/alfredo-rosales-aguilar-5048b0264/)
- [GitHub][@AlfredoRosales12](https://github.com/AlfredoRosales12)
- [Correo Electronico][rosales.alfredo.goo@gmail.com]
