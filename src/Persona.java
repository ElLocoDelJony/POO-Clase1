

public class Persona {
    String nombre;
    int edad;
    String correo;
    int cedula;

    public Persona(String nombre, int edad, String correo, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.cedula = cedula;
    }

    public void saludar(){
        System.out.println("Nombre: " + nombre+"\nEdad: " + edad+"\nCorreo: " + correo);
    }

    public static void main(String[] args){
        Persona obj1 = new Persona("Kaav",22,"kevin.amagua02@gmail.com",23);
        obj1.saludar();
    }
}


