import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true) {
            System.out.println("Bienvenido a la App Calculadora");
            //Mostrar el menú de opciones
            mostraMenu();
            try{
                var opcion = new Scanner(System.in).nextInt();
                //Validar la opción
                if (opcion >= 1 && opcion <= 4) {
                    ejecutarOperacion(opcion, consola);
                }else if (opcion == 5) {
                    System.out.println("hasta luego...");
                    break;
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una opción del menú. " + opcion);
                }
                //Imprimir un salto de línea para mejorar la legibilidad
                System.out.println();
            } //Fin del try
            catch (Exception e){
                System.out.println("Error: Entrada no válida. Por favor, ingresa un número entero." + e.getMessage());
            }
            //Imprimir un salto de línea para mejorar la legibilidad
            System.out.println();
        }//Fin del while
    }//Fin del main

    private static void mostraMenu(){
        //System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir");   // Opciones de la calculadora \n# = salto de línea
        System.out.println("""
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    """);
        System.out.println("Selecciona una opción: ");
    }

    private static void ejecutarOperacion(int opcion, Scanner consola){
        System.out.println("Proporciona valor operando 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona valor operando 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        //var resultado = operando1 + operando2;
        //System.out.println("El resultado de la suma es: " + resultado);
        double resultado;
        switch (opcion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
            }
            case 4 -> {
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
            }
            default -> System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
        }
    }
}// Fin de la clase CalculadoraApp
