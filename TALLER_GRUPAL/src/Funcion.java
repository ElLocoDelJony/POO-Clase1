public class Funcion {

    public static int sumar(int a, int b){
        return a + b;
    }

    // El main se suele poner en otra clase
    // solo son pruebas
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("La suma es: "+resultado);
    }
}
