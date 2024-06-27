import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•\n\n" +
                    "•  Bienvenido a su conversor de monedas  •\n\n" +
                    "Ingrese el número de la opción que desea realizar:\n\n" +
                    "1. Dolar => Peso Argentino\n" +
                    "2. Peso Argentino => Dolar\n" +
                    "3. Dolar => Real Brasileño\n" +
                    "4. Real Brasileño => Dolar\n" +
                    "5. Dolar => Peso Mexicano\n" +
                    "6. Peso Mexicano => Dolar\n" +
                    "7. Convertir una moneda distinta\n" +
                    "8. Salir\n\n" +
                    "•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•♦•\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}