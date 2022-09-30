public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(5, 7, 3);
        System.out.println(resultado);

        Coche objCoche = new Coche();
        objCoche.IncrementarPuertas();
        System.out.println(objCoche.puertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {
        public int puertas = 4;

        public void IncrementarPuertas() {
            this.puertas++;
        }
    }

}
