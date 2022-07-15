package clases;

public class Ejecutable {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Carlos Perez", 36, 'H', "Cirujano plastico");
        Deportista deportista = new Deportista("Cristiano Ronaldo", 32, 'H', "Futbol");

        System.out.println("*** SALIDA objeto 1 ***");
        System.out.println("Información del Doctor");
        System.out.println(doctor.toString());
        doctor.RealizaUnaAccion();
        System.out.println("");
        System.out.println("*** SALIDA objeto 2 ***");
        System.out.println("Información del Deportista");
        System.out.println(deportista.toString());
        deportista.RealizaUnaAccion();
    }
}
