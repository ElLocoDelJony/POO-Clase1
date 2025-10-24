public class Paso_por_valor {

    public static void cambiarValor(int x) {
        x = 99;
    }

    public static void main(String[] args) {
        int numero = 10;
        cambiarValor(numero);
        System.out.println(numero);  // Imprime 10
    }
}
