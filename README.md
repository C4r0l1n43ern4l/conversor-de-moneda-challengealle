# conversor-de-moneda-challengealle
Este es un programa que fue desarrollado como un Challenge propuesto por Alura - G6 en la especialización de Backend. El programa consiste en un conversor de moneda en donde el usuario a través de un menú de opciones selecciona una moneda Base, una moneda de conversión y un monto de dinero. Por medio del consumo de la API API Exchangerate se obtendrán los datos necesesarios para realizar dicha conversión.
## Funcionalidades del proyecto
- `Funcionalidad 1:` Mostrar al usuario un menú de opciones.
- `Funcionalidad 2:` Leer tanto la opción de selección como el valor de dinero ingresado por el usuario para poder realizar la conversión.
- `Funcionalidad 3:` Realizar varias consultas con diferentes tipos de divisas sin salir del programa.
- `Funcionalidad 4:` Mostrar la fecha y hora de la consulta realizada.
- `Funcionalidad 5:` Salir del programa cuando el usuario lo desee.
## Cómo acceder al proyecto
Para poder acceder al proyecto se deben seguir los siguientes paso:
- Dirigise a la opción Code y posteriormente pulsar click en Download.zip
- Una vez descargado el proyecto se extrae la carpeta la cual se debe abrir con el IDE IntelliJ.
- Para que el programa funcione correctamente se recomienda importar la biblioteca GSON que debe ser descargada como un archivo .jar.
## Abre y ejecuta el proyecto
- Una vez este abierto el proyecto en el IDE recomendado se debe ejecutar la clase Principal.java para poder usar la aplicación. Seguidamente empezará a visualizar el menú de opciones en donde podrá digitar la opción que desea como se muestra a continuación:
  ![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://myoctocat.com/assets/images/base-octocat.svg)
- Una vez seleccionada la opción el programa le mostrá un mensaje para que el usuario ingrese el monto de dinero a convertir:
- Seguidamente el programa mostrará el resultado obtenido de la conversión y la fecha y hora de la consulta.
- Si el usuario ingresa una opción no válida el programa le mostrará un mensaje de error y le mostrará nuevamente el menú de opciones.
- Si selecciona la opción de salir el programa le mostrará un ensaje de despedida.
## Tecnología Usada
- La aplicación fue desarrollada con el lenguaje de programación JavaSE17.
- Se utilizo el IDE IntelliJ.
- Se utilizo la biblioteca GSON versión 2.10.1 para poder deserializar los datos optenidos de la API Exchangerate.
- Para hacer uso de la API Exchangerate fue necesario crear una clave.
- Se utilizaron las clases HttpClient, HttpRequest y la interfaz HttpResponse, para crear el cliente, realizar la solicitud y obtener los datos necesarios para realizar una conversión.
## Autor
- Alba Carolina Bernal Carreño
