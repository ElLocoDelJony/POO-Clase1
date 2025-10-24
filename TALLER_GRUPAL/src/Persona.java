public class Persona {
    public String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.print("Hola "+nombre);
    }

    public static void main(String[] args){
        Persona p1 = new Persona("Kevin");
        p1.saludar();
    }
}
