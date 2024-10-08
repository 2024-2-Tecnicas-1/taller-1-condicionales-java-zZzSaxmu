
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
        double imc = calcularIMC(peso, estatura);
        return determinarRiesgo(imc, edad);
    }

    private static double calcularIMC(int peso, double estatura) {
        return peso / (estatura * estatura);
    }

    private static String determinarRiesgo(double imc, int edad) {
        if (imc < 25 && edad < 30) {
            return "bajo";
        } else if ((imc >= 25 && imc <= 30) || (edad >= 30 && edad <= 50)) {
            return "medio";
        } else {
            return "alto";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
