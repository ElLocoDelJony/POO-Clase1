public class Paso_por_referencia {
    String nombre;

    public static void cambiarNombre(Persona p) {
        p.nombre = "Kevin";
    }

    public static void main(String[] args) {
        Persona persona = new Persona("");
        persona.nombre = "Luis";
        cambiarNombre(persona);
        System.out.println(persona.nombre);  // Imprime "Kevin"
    }
}
