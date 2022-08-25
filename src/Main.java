public class Main {
    public static void main(String[] args) {
        int total = suma(3,5, 7);
        System.out.println("El total es = " + total);

        Coche miCoche  = new Coche();
        miCoche .agregaPuerta();
        System.out.println("El numero de puertas que tiene el coche es: " + miCoche .mostrarPuertas());
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

