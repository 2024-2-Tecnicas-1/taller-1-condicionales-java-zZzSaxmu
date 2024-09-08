package ejercicios;

import java.util.Scanner;

public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // Verificar si el número de victorias es negativo
        if (numVictoriasA < 0 || numVictoriasB < 0) {
            return "Inválido";
        }
        
        // Verificar si los puntajes son posibles
        if (numVictoriasA > 7 || numVictoriasB > 7 || Math.abs(numVictoriasA - numVictoriasB) > 2) {
            return "Inválido";
        }

        // Verificar el desempate (7-6)
        if (numVictoriasA == 7 && numVictoriasB == 6) {
            return "Ganó A";
        }
        if (numVictoriasB == 7 && numVictoriasA == 6) {
            return "Ganó B";
        }

        // Verificar condiciones de victoria
        if (numVictoriasA >= 6 && numVictoriasA >= numVictoriasB + 2) {
            return "Ganó A";
        }
        if (numVictoriasB >= 6 && numVictoriasB >= numVictoriasA + 2) {
            return "Ganó B";
        }

        // Verificar si hay una condición inválida de juegos para un set aún no terminado
        if ((numVictoriasA >= 6 && numVictoriasB >= 6) || (numVictoriasA < 6 && numVictoriasB < 6)) {
            return "Aún no termina";
        }
        
        // Si no se cumple ninguna de las condiciones anteriores, el set aún no termina
        return "Aún no termina";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Juegos ganados por A: ");
        int numVictoriasA = lector.nextInt();
        System.out.print("Juegos ganados por B: ");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
