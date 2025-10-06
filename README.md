Taller 2 Kevin Amagua
Ejercicio 1

Problema: Jugadores de un equipo de fútbol. Cada jugador tiene un nombre, una posición en el 
campo, una edad y un número de camiseta. 
Objetivo: Desarrollar una clase en Java llamada Jugador que tenga los atributos y un método 
para mostrar la información del jugador. Luego, crear tres objetos de esta clase, cada uno 
representando un jugador diferente. 
Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar

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
<img width="306" height="622" alt="image" src="https://github.com/user-attachments/assets/39b1dd3b-fc30-4a14-a34b-b48e442cb1e9" />


Ejercicio 2 
Problema: Sistema de gestión de empleados en una empresa. Cada empleado tiene un nombre, 
un cargo, un salario y una fecha de ingreso a la empresa. 
Objetivo: Desarrollar una clase en Java llamada Empleado que tenga los atributos mencionados 
anteriormente y un método para mostrar la información del empleado. Luego, crearemos tres 
objetos de esta clase, cada uno representando un empleado diferente, y solicitaremos al usuario 
que ingrese los detalles de cada empleado a través del teclado. 

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

<img width="479" height="739" alt="image" src="https://github.com/user-attachments/assets/3b52805e-5251-43a1-aacb-d7ecd84a2173" />


