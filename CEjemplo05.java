package Aplicaciones;
import java.util.Scanner;
public class CEjemplo05 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("La base del rectangulo: ");
        double base = scanner.nextDouble();

        System.out.print("La altura del rectangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

System.out.println("---- Reporte ----"); 
        System.out.println("-----------------");

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("-----------------");
    }

}
