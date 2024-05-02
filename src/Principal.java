/*@Carolina Bernal Challenger Alura G6 Backend*/
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {        Scanner lectura = new Scanner(System.in);
        String menu = """
                \n*********************************************************
                Sea Bienvenido/a al Conversor de Moneda\n
                1) Dólar ==>> Peso argentino
                2) Peso argentino ==>> Dólar
                3) Dólar ==>> Real brasileño
                4) Real brasileño ==>> Dólar
                5) Dólar ==>> Peso colombiano
                6) Peso colombiano ==>> Dólar
                7) Salir
                Elja una opción válida:
                *********************************************************\n
                """;
        int opcionMenu = 0;

        while (opcionMenu != 7) {
            System.out.println(menu);
            opcionMenu = lectura.nextInt();
            ConsultaMoneda consultaMoneda = new ConsultaMoneda();
            ConversorDivisas resultadoObtenido = new ConversorDivisas();
            Double montoDeDineroConvertir;
            Double tasaDeCambio;


            switch (opcionMenu) {
                case 1:
                    System.out.println("** Dólar ==>> Peso argentino **\n");
                    System.out.println("Ingrese el monto de dinero que desea convertir: ");
                    montoDeDineroConvertir = lectura.nextDouble();
                    Divisa opcionUsd = consultaMoneda.buscarMoneda("USD","ARS");
                    tasaDeCambio = opcionUsd.conversion_rate();
                    resultadoObtenido.conversorMoneda("USD","ARS",montoDeDineroConvertir,tasaDeCambio);
                    break;
                case 2:
                    System.out.println("** Peso argentino ==>> Dólar **\n");
                    System.out.println("Ingrese el monto de dinero que desea convertir: ");
                    montoDeDineroConvertir = lectura.nextDouble();
                    Divisa opcionArs = consultaMoneda.buscarMoneda("ARS","USD");
                    tasaDeCambio = opcionArs.conversion_rate();
                    resultadoObtenido.conversorMoneda("ARS","USD",montoDeDineroConvertir,tasaDeCambio);
                    break;
                case 3:
                    System.out.println("** Dólar ==>> Real brasileño **\n");
                    System.out.println("Ingrese el monto de dinero que desea convertir: ");
                    montoDeDineroConvertir = lectura.nextDouble();
                    Divisa opcionUsd2 = consultaMoneda.buscarMoneda("USD","BRL");
                    tasaDeCambio = opcionUsd2.conversion_rate();
                    resultadoObtenido.conversorMoneda("USD","BRL",montoDeDineroConvertir,tasaDeCambio);
                    break;
                case 4:
                    System.out.println("** Real brasileño ==>> Dólar **\n");
                    System.out.println("Ingrese el monto de dinero que desea convertir: ");
                    montoDeDineroConvertir = lectura.nextDouble();
                    Divisa opcionBrl = consultaMoneda.buscarMoneda("BRL","USD");
                    tasaDeCambio = opcionBrl.conversion_rate();
                    resultadoObtenido.conversorMoneda("BRL","USD",montoDeDineroConvertir,tasaDeCambio);
                    break;
                case 5:
                    System.out.println("** Dólar ==>> Peso colombiano **\n");
                    System.out.println("Ingrese el monto de dinero que desea convertir: ");
                    montoDeDineroConvertir = lectura.nextDouble();
                    Divisa opcionUsd3 = consultaMoneda.buscarMoneda("USD","COP");
                    tasaDeCambio = opcionUsd3.conversion_rate();
                    resultadoObtenido.conversorMoneda("USD","COP",montoDeDineroConvertir,tasaDeCambio);
                    break;
                case 6:
                    System.out.println("** Peso colombiano ==>> Dólar **\n");
                    System.out.println("Ingrese el monto de dinero que desea convertir: ");
                    montoDeDineroConvertir = lectura.nextDouble();
                    Divisa opcionCop = consultaMoneda.buscarMoneda("COP","USD");
                    tasaDeCambio = opcionCop.conversion_rate();
                    resultadoObtenido.conversorMoneda("COP","USD",montoDeDineroConvertir,tasaDeCambio);
                    break;
                case 7:
                    System.out.println("Saliendo del programa, muchas gracias por usar nuestro conversor de moneda.");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        }
    }
}