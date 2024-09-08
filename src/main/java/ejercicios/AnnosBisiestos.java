package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {

    // Método para determinar si un año es bisiesto y devolver el resultado como una cadena
    public static String evaluar(int anno) {
        if (anno < 1582) {
            // Regla del calendario juliano
            if (anno % 4 == 0) {
                return anno + " es bisiesto";
            } else {
                return anno + " no es bisiesto";
            }
        } else {
            // Regla del calendario gregoriano
            if (anno % 4 == 0) {
                if (anno % 100 == 0) {
                    if (anno % 400 == 0) {
                        return anno + " es bisiesto";
                    } else {
                        return anno + " no es bisiesto";
                    }
                } else {
                    return anno + " es bisiesto";
                }
            } else {
                return anno + " no es bisiesto";
            }
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año: ");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(anno);
        System.out.println(respuesta);
        }
    }