import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultaMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión el dia de hoy es\n 1 " + monedaBase+ " = " +moneda.conversion_rate()+ " " +monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+ " " +monedaBase+ " = " +cantidadConvertida + " " +moneda.target_code());
    }
    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el codigo de la moneda base (Ejemplo: USD):");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo (Ejemplo: USD):");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
