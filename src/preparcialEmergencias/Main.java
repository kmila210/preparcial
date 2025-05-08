package preparcialEmergencias;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Crear recursos
        Ambulancia a1 = new Ambulancia(5000, 40);
        Ambulancia a2 = new Ambulancia(5000, 80);
        Policia p1 = new Policia(500, 55);
        Bombero b1 = new Bombero(600, 90);

        // Crear lista de recursos
        ArrayList<Recurso> recurso = new ArrayList<>();
        recurso.add(b1);
        recurso.add(p1);
        recurso.add(a1);
        recurso.add(a2);
        ArrayList<Recurso> recurso2 = new ArrayList<>();
        recurso2.add(b1);
        recurso2.add(a2);

        // Crear usuarios con recursos
        Usuario u1 = new Usuario("Juan", "Perez", 67894344, "Galeno", recurso,0);
        Usuario u2 = new Usuario("Victor", "Perez", 67894344, null, recurso2,0);

        // Mostrar los recursos del usuario y precio unitario para u1
        System.out.println("Nombre: " + u1.getNombre() + " " + u1.getApellido());
        for (Recurso r : u1.getRecurso()) {
            System.out.println("Recurso: " + r.getClass().getSimpleName() + " costo: " + r.calcularCosto());
        }
        // Calcular facturación del usuario u1
        double precio1 = u1.getFacturaUsuario();
        System.out.println("Precio: " + precio1);

        System.out.println("------------------------------------------------------------");

        // Mostrar los recursos del usuario y precio unitario para u2
        System.out.println("Nombre: " + u2.getNombre() + " " + u2.getApellido());
        for (Recurso r : u2.getRecurso()) {
            System.out.println("Recurso: " + r.getClass().getSimpleName() + " costo: " + r.calcularCosto());
        }
        // Calcular facturación del usuario u2
        double precio2 = u2.getFacturaUsuario();
        System.out.println("Precio: " + precio2);

        System.out.println("------------------------------------------------------------");

        // Crear Supervisor
        Supervisor supervisor = new Supervisor("Carlos", "Garcia", 11223344L, 0, 0);
        Set<Recurso> recursosUnicos = new HashSet<>();
        recursosUnicos.add(b1);
        recursosUnicos.add(p1);
        recursosUnicos.add(a1);
        recursosUnicos.add(a2);

        // Calcular y mostrar el tiempo total excedido
        
        // Imprimir el costo total de todos los usuarios
        double costoTotalUsuarios = precio1 + precio2;
        System.out.println("El costo total acumulado de todos los usuarios es: " + costoTotalUsuarios);
        supervisor.tiemposAltos(recursosUnicos);
        System.out.println("El tiempo total excedido fue de " + supervisor.getResultadoAuditoriaTiempos());

    }
}
