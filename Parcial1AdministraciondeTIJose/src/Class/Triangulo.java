/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class Triangulo {
  
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        // Pedir la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área del triángulo
        double area = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}


