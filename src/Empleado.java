import java.util.Scanner;

// Crear clase Empleado
public class Empleado {
    String nombre;
    double salario;
    String cargo;
    String fecha_ingreso;
    Scanner sc = new Scanner(System.in);
// Crear metodo constructor para asignar valores a los atributos
    public Empleado(String nombre, double salario,String cargo, String fecha_ingreso) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.fecha_ingreso = fecha_ingreso;

    }
// Metodo propio para pedir datos
    public void pedirDatos() {
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        salario = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el cargo: ");
        cargo = sc.nextLine();
        System.out.println("Ingrese el fecha ingreso del empleado: ");
        fecha_ingreso = sc.nextLine();
    }
// Metodo propio para mostrar datos
    public void MostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre+"\nSalario del empleado" +"\nCargo del empleado" +
                ": " + cargo+
                ": " + salario+"\nFecha ingreso: " + fecha_ingreso);
    }
// Main para crea objetos y ejecutar los metodos
    public static void main(String [ ] args) {
        Empleado e1 = new Empleado("",0.0,"","");
        Empleado e2 = new Empleado("",0.0,"","");
        Empleado e3 = new Empleado("",0.0,"","");

        e1.pedirDatos();
        e2.pedirDatos();
        e3.pedirDatos();

        e1.MostrarDatos();
        e2.MostrarDatos();
        e3.MostrarDatos();
    }
}
