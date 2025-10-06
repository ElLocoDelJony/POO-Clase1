import java.util.Scanner;

// Crear clase Jugador
public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numero_c;
    Scanner sc = new Scanner(System.in);
// Crear metodo constructor para asignar tipo de valor a los atributos
    public Jugador(String nombre, int edad, String posicion, int numero_c) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero_c = numero_c;
    }
// Metodo propio para pedir datos
    public void datosJugador(){
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Posicion: ");
        posicion = sc.nextLine();
        System.out.print("Numero de Camiseta: ");
        numero_c = sc.nextInt();
    }
// Metodo propio para mostrar datos
    public void mostrar(){
        System.out.println("Jugadores:\nNombre: " + nombre+"\nPosicion: "+posicion+"\nEdad: "+edad+"\nNumero de C: "+numero_c);
    }
// Main para crear los objetos, ejecutar el programa con sus metodos
    public static void main(String [ ] args) {

        Jugador j1 = new Jugador("",0,"",0);
        Jugador j2 = new Jugador("",0,"",0);
        Jugador j3 = new Jugador("",0,"",0);

        j1.datosJugador();
        j2.datosJugador();
        j3.datosJugador();


        j1.mostrar();
        j2.mostrar();
        j3.mostrar();
    }
}
