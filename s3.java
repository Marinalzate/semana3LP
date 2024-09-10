import java.util.Scanner;

public class SistemaFidelizacion {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double cantidadCompra;
        int puntosAcumulados;
        String nivelFidelizacion;
        double descuento = 0;
        String regalo = "";

      
        System.out.println("Ingrese la cantidad total de la compra (en pesos): ");
        cantidadCompra = scanner.nextDouble();

   
        puntosAcumulados = (int) (cantidadCompra / 10);
        System.out.println("Puntos acumulados: " + puntosAcumulados);


        if (puntosAcumulados >= 0 && puntosAcumulados <= 100) {
            nivelFidelizacion = "Bronce";
        } else if (puntosAcumulados >= 101 && puntosAcumulados <= 500) {
            nivelFidelizacion = "Plata";
        } else if (puntosAcumulados >= 501 && puntosAcumulados <= 1000) {
            nivelFidelizacion = "Oro";
        } else {
            nivelFidelizacion = "Platino";
        }

        System.out.println("Nivel de fidelización: " + nivelFidelizacion);

        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            descuento = cantidadCompra * 0.10; // 10% de descuento
            System.out.println("Has recibido un descuento del 10%: " + descuento + " pesos.");
        }

        if (nivelFidelizacion.equals("Platino")) {
            regalo = "Cupón para un producto gratis";
            System.out.println("¡Felicidades! Has recibido un regalo especial: " + regalo);
        }

        scanner.close();
    }
}
