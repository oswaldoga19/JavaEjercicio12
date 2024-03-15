/*
 * Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas semanales trabajadas en una empresa, 
sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera horas extras y se pagan al doble de una hora normal, 
cuando no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga una hora normal y el 
resto al triple. Del trabajador se conocen los siguientes datos: nombres, número de horas trabajadas en la semana y valor recibido 
por una hora normal de trabajo. Análisis Datos de entrada • Nombres del trabajador. • Número de horas trabajadas. • Valor hora de 
trabajo. Datos de salida • Nombre del trabajador. • Salario devengado. Proceso Se compara el valor de las horas trabajadas con 40 
que es la jornada normal. SI horas trabajadas > 40 Se calculan las horas extras trabajadas como horas trabajadas - 40. Como los 
costos de horas extras son distintos para la cantidad de horas superiores a 8, se debe comparar el valor obtenido en horas extras 
con 8. SI horas extras > 8 ENTONCES Las horas extras excedentes de 8 serían: horas extras - 8. En este caso lo percibido por el 
trabajador por concepto de horas extras sería: Pago por horas 
extras = Pago por hora normal * 2 * 8 + pago por hora normal * 3 * horas extras excedentes de 8. SINO Pago por horas 
extras = Pago por horas normal *2*horas extras. El salario devengado en este caso sería: 
Salario = Pago por hora normal * 40 + Pago por horas extras. SINO En este caso las horas trabajadas durante la semana son
menores o iguales a 40 (no existen horas extras). Por lo tanto, lo devengado sería: Salario = Horas trabajadas * valor hora normal. 
Definición de variables NOM: Nombre del trabajador. NHT: Número de horas trabajadas. VHN: Valor hora normal trabajada. 
HET: Horas extras trabajadas. HEE8: Horas extras que exceden de 8. SALARIO: Pago total que recibe el trabajador.
 */

package javaejercicio12;

import java.util.Scanner;

public class JavaEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el nombre del trabajador:");
        String NOM = scanner.nextLine();

        System.out.println("Ingrese el número de horas trabajadas:");
        int NHT = scanner.nextInt();

        System.out.println("Ingrese el valor de una hora normal de trabajo:");
        double VHN = scanner.nextDouble();

        // Cálculo del salario
        double SALARIO;

        if (NHT > 40) {
            int HET = NHT - 40;

            if (HET > 8) {
                int HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }

        // Mostrar resultados
        System.out.println("\nEL TRABAJADOR " + NOM + " DEVENGÓ: $" + SALARIO);

    }
    
}
