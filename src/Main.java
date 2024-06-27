import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

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
        }
    }
}