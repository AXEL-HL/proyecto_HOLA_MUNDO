import java.util.Scanner;

public class Sumas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este es un programa para sumar dos digitos");
        System.out.println("Introduce el primer numero:");
        int num1 = entrada.nextInt();

        System.out.println("Ingresa el sigiente numero:");
        int num2 = entrada.nextInt();

        int resultado = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
        entrada.close();
    }
}