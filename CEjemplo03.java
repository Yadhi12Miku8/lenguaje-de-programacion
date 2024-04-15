package Aplicaciones;import java.util.Scanner;
public class CEjemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.print("Ingrese su peso: ");
        double peso = scanner.nextDouble();
        
        // Solicitar al usuario que ingrese su altura en metros
        System.out.print("Ingrese su altura: ");
        double altura = scanner.nextDouble();
        
        // IMC
        double imc = peso / (altura * altura);
        
        System.out.println("---- Reporte ----"); 
        System.out.println("-----------------"); 

        
        //El resultado
        System.out.println("Su masa corporal es de: " + imc);
        
        System.out.println("-----------------"); 

    }
}
