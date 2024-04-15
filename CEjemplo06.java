package Aplicaciones;
import java.util.Scanner;
public class CEjemplo06 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double areaTotal = calcularAreaTotal(radio, altura);
        double volumen = calcularVolumen(radio, altura);
System.out.println("---- Reporte ----"); 
        System.out.println("-----------------");

        System.out.println("El area total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);
       System.out.println("-----------------");
}
    public static double calcularAreaTotal(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public static double calcularVolumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }
}
