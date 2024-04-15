package Aplicaciones;import java.util.Scanner;

public class CEjemplo04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        System.out.print("Ingrese la longitud del terreno en metros: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese la anchura del terreno en metros: ");
        double ancho = scanner.nextDouble();

        System.out.print("Ingrese el costo por metro cuadrado en S/: ");
        double costoPorMetroCuadrado = scanner.nextDouble();

        double area = calcularArea(longitud, ancho);
        double precio = calcularPrecio(area, costoPorMetroCuadrado);
         System.out.println("---- Reporte ----"); 
        System.out.println("-----------------");

        System.out.println("El area del terreno es: " + area + " metros cuadrados");
        System.out.println("El precio del terreno es: S/." + precio);
      System.out.println("-----------------");
     }

    public static double calcularArea(double longitud, double ancho) {
        return longitud * ancho;
    }

    public static double calcularPrecio(double area, double costoPorMetroCuadrado) {
        return area * costoPorMetroCuadrado;
    }
       
} 
