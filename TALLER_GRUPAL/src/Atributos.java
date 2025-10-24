public class Atributos {

    // Atributos privados (ocultos)
    private String nombre;
    private int edad;

    // Método Constructor
    public Atributos(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para validar
    }

    // Método público para obtener el nombre o Getter
    public String getNombre() {
        return nombre;
    }

    // Método público para cambiar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter con validación
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
