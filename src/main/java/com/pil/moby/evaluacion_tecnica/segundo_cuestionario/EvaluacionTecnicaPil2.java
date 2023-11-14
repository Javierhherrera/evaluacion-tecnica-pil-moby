package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;

import main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo.Candidato;
import main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo.Tecnologia;

import java.util.*;

public class EvaluacionTecnicaPil2 {
    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prÃ¡cticas + UtilizaciÃ³n del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional
     * Interfaces</i>).<p>
     */
    public static void main(String[] args) {
        imprimirBienvenidaEvaluacionTecnica();
        imprimirMensajePunto(1);

        // Desarrollo de la consigna 1.
        //inicializarCandidatos();
        List<Candidato> listaCandidatos = inicializarCandidatos();
        resolverPunto1(listaCandidatos);

        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        resolverPunto2(listaCandidatos);
        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3(listaCandidatos);
        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4(listaCandidatos);
        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5(listaCandidatos);
    }

    private static void resolverPunto1(List<Candidato> listaCandidatos) {
    // TODO: Realizar implementaciÃ³n.
        System.out.println("*********** LISTADO DE CANDIDATOS Y DETALLES ****************");
        listaCandidatos.forEach(System.out::println);
    }

    private static void resolverPunto2(List<Candidato> listaCandidatos) {
// TODO: Realizar implementaciÃ³n.
        System.out.println("*********** CANDIDATOS ORDENADOS POR ID ****************");
        listaCandidatos.sort(Candidato::compareTo);
        listaCandidatos.forEach(e -> {
            System.out.println("ID: " + e.getId() + " " + e.getNombre() + " " + e.getApellido());
        });
    }

    private static void resolverPunto3(List<Candidato> listaCandidatos) {
// TODO: Realizar implementaciÃ³n.
        System.out.println("*********** CANDIDATOS ORDENADOS POR PRETENSION SALARIAL ****************");
        listaCandidatos.sort(Comparator.comparingDouble(Candidato::getPretensionSalarial));
        listaCandidatos.forEach(e -> {
            System.out.println(" Pretencion Salarial: " + e.getPretensionSalarial() + " " + e.getId() + " " + e.getNombre() + " " + e.getApellido());
        });

    }

    private static void resolverPunto4(List<Candidato> listaCandidatos) {
// TODO: Realizar implementaciÃ³n.
        System.out.println("*********** TECNOLOGIAS ORDENADAS PARA MAYOR EXPERIENTE ****************");

        Candidato personaMayorExperiencia = listaCandidatos.stream()
                .max(Comparator.comparing(Candidato::getAniosExperiencia))
                .get();

        personaMayorExperiencia.ordenarTecnologia(personaMayorExperiencia.getTecnologias());

        System.out.println("La persona de mayor Experiencia es: ");
        System.out.println(personaMayorExperiencia.toString());

    }

    private static void resolverPunto5(List<Candidato> listaCandidatos) {
// TODO: Realizar implementaciÃ³n.
        System.out.println("*********** CANDIDATO CON MAS TECNOLOGIAS ****************");
        Candidato cantidadTecnologia = listaCandidatos.stream()
                .max(Comparator.comparing(Candidato::getCantidadTecnologias))
                .get();
                System.out.println(cantidadTecnologia.toString());


        // Comprobamos si tiene alguna tecnología par
        if (cantidadTecnologia.getTecnologias().stream()
                .anyMatch(tecnologia -> tecnologia.esIdPar())) {

            // Si tiene alguna tecnología par, imprimimos los datos de la tecnología
            cantidadTecnologia.getTecnologias().stream()
                    .filter(tecnologia -> tecnologia.esIdPar())
                    .findFirst()
                    .ifPresent(tecnologia -> {
                        System.out.println("La tecnología par es: \n\t* ID: " + tecnologia.getId() + " - NOMBRE: " + tecnologia.getNombre());
                    });
        } else {
            // Si no tiene ninguna tecnología par, imprimimos un mensaje
            System.out.println("El empleado con más tecnologías no tiene ninguna tecnología par");
        }



    }

    //private static String inicializarCandidatos() {
    private static List<Candidato> inicializarCandidatos () {
        //------------------------------------------------------------------------------------------//
        Tecnologia tecnologia1 = new Tecnologia(1L,"JAVA");
        Tecnologia tecnologia2 = new Tecnologia(2L,"Angular");
        Tecnologia tecnologia3 = new Tecnologia(3L,"SQL");

        Candidato candidato1 = new Candidato(3,"Jhon","Doe",2,5000.00);
        candidato1.agregarTecnologia(tecnologia1);
        candidato1.agregarTecnologia(tecnologia2);
        candidato1.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(8L,"NodeJS");
        tecnologia2 = new Tecnologia(1L,"JAVA");
        tecnologia3 = new Tecnologia(3L,"SQL");

        Candidato candidato2 = new Candidato(7,"Matías","Otamendi", 9,3000.00);
        candidato2.agregarTecnologia(tecnologia1);
        candidato2.agregarTecnologia(tecnologia2);
        candidato2.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(7L,"MongoDB");
        tecnologia2 = new Tecnologia(4L,"NoSQL");

        Candidato candidato3 = new Candidato(1,"Joaquin","Tagliafico", 6,2000.00);
        candidato3.agregarTecnologia(tecnologia1);
        candidato3.agregarTecnologia(tecnologia2);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(5L, "Vue");
        tecnologia2 = new Tecnologia(3L, "SQL");
        tecnologia3 = new Tecnologia(1L, "Java");

        Candidato candidato4 = new Candidato(4,"Gastón","Mac Allister", 1,5000.50);
        candidato4.agregarTecnologia(tecnologia1);
        candidato4.agregarTecnologia(tecnologia2);
        candidato4.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(1L, "JAVA");

        Candidato candidato5 = new Candidato(5,"Pablo","De Paul", 4,9000.50);
        candidato5.agregarTecnologia(tecnologia1);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(1L, "JAVA");
        tecnologia2 = new Tecnologia(2L, "Angular");
        tecnologia3 = new Tecnologia(3L, "SQL");

        Candidato candidato6 = new Candidato(2,"Lucas","Di María", 7,6000.00);
        candidato6.agregarTecnologia(tecnologia1);
        candidato6.agregarTecnologia(tecnologia2);
        candidato6.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(3L, "SQL");
        tecnologia2 = new Tecnologia(5L, "Vue");
        tecnologia3 = new Tecnologia(1L, "JAVA");

        Candidato candidato7 = new Candidato(10,"Lionel","Messi", 10,10000.10);
        candidato7.agregarTecnologia(tecnologia1);
        candidato7.agregarTecnologia(tecnologia2);
        candidato7.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(4L, "NoSQL");
        tecnologia2 = new Tecnologia(7L, "MongoDB");
        tecnologia3 = new Tecnologia(3L, "SQL");
        Tecnologia tecnologia4 = new Tecnologia(1L, "JAVA");

        Candidato candidato8 = new Candidato(9,"Julián","Álvarez", 3,5000.00);
        candidato8.agregarTecnologia(tecnologia1);
        candidato8.agregarTecnologia(tecnologia2);
        candidato8.agregarTecnologia(tecnologia3);
        candidato8.agregarTecnologia(tecnologia4);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(6L,".NET");
        tecnologia2 = new Tecnologia(1L,"JAVA");
        tecnologia3 = new Tecnologia(2L,"Angular");

        Candidato candidato9 = new Candidato(8,"Lula","Martinez",2,1000.00);
        candidato9.agregarTecnologia(tecnologia1);
        candidato9.agregarTecnologia(tecnologia2);
        candidato9.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        tecnologia1 = new Tecnologia(1L,"JAVA");
        tecnologia2 = new Tecnologia(6L,".NET");
        tecnologia3 = new Tecnologia(2L,"Angular");

        Candidato candidato10 = new Candidato(6,"Agustin","Dybala",2,1000.00);
        candidato10.agregarTecnologia(tecnologia1);
        candidato10.agregarTecnologia(tecnologia2);
        candidato10.agregarTecnologia(tecnologia3);

        //------------------------------------------------------------------------------------------//
        List<Candidato> listaCandidatos = new ArrayList<>();
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
        listaCandidatos.add(candidato5);
        listaCandidatos.add(candidato6);
        listaCandidatos.add(candidato7);
        listaCandidatos.add(candidato8);
        listaCandidatos.add(candidato9);
        listaCandidatos.add(candidato10);


        return listaCandidatos;
    }

    {
// TODO: Realizar implementaciÃ³n.
    }

    /**
     * Saludo de bienvenida, ignore el mÃ©todo.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda EvaluaciÃ³n TÃ©cnica." + "\n" +
                "Les deseamos muchos Ã©xitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el mÃ©todo.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}
