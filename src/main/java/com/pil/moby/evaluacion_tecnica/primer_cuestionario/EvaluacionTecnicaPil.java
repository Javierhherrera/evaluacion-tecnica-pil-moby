package main.java.com.pil.moby.evaluacion_tecnica.primer_cuestionario;

import java.util.Objects;
import java.util.Scanner;

public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         ****/

        //--------------------------------------------------------------------------------------------------------------//
        imprimirConsigna(1);

        // Desarrollo de la consigna 1.
        // * 1. Declará al menos tres variables con tipos de datos primitivos.

        int variableInt1;
        System.out.println("variableInt1");

        int variableInt2;
        System.out.println("variableInt2");

        float variableFloat1;
        System.out.println("variableFloat1");
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------//
        imprimirConsigna(2);

        // Desarrollo de la consigna 2.
        // * 2. A las variables declaradas anteriormente asignales un valor
        // *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.

        variableInt1 = 50;
        variableInt2 = 200;
        variableFloat1 = 30.28f;

        System.out.println("Multiplicación de " + variableInt1 + " X " + variableInt2 + " es : " + variableInt1 * variableInt2);
        System.out.println("División de " + variableInt2 + " y " + variableInt1 + " es : " + variableInt2 / variableInt1);
        System.out.println("El " + variableFloat1 + " porciento de " + variableInt2 + " es: " + (variableInt2 * variableFloat1 /100));
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------//
        imprimirConsigna(3);

        // Desarrollo de la consigna 3.
        /* 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:

         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
        */


        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese T (true) para observar resultados o F (false) para obtener mensaje de Error");
        String respuesta = s.next();


        if(Objects.equals(respuesta, "T")){
            System.out.println("Multiplicación de " + variableInt1 + " X " + variableInt2 + " es : " + variableInt1 * variableInt2);
            System.out.println("División de " + variableInt2 + " y " + variableInt1 + " es : " + variableInt2 / variableInt1);
            System.out.println("El " + variableFloat1 + " porciento de " + variableInt2 + " es: " + (variableInt2 * variableFloat1 /100));

        }else{
            System.out.println("Error...");
        }
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------//
        System.out.println("Ingrese un Número como Valor Inicial: ");
        int valor = s.nextInt();
        int valor2 = valor*2;

        System.out.println("El valor inicial es: " + valor);
        System.out.println();

        while (valor < valor2) {
            System.out.println("El valor actual es: " + valor);
            valor++;
        }
        System.out.println("El valor final es: " + valor);
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------//
        for(int i = 1; i <= ((valor/2)/3); i++){
            System.out.println("Impresión Número " + i);
        }

    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
