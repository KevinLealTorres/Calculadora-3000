public class Calc {

    /*
    * Constructor
    * No le pongo nada, porque al final el método que calcula es estatico,
    * y es lo único que necesito
    * */
    public Calc() {
        System.out.println("Calculadora Cazio 3000 iniciada");
    }

    public static void operar(double n1, double n2) {

        double  sum = n1 + n2,
                res = n1 - n2,
                div = n1 / n2,
                mul = n1 * n2,
                mod = n1 % n2;

        System.out.printf("""
                X = %.2f
                Y = %.2f
                Suma: %.2f suma %.2f %.2f
                Resta: %.2f resta %.2f %.2f
                Multiplicación: %.2f multiplicación %.2f %.2f
                División: %.2f división %.2f %.2f
                Módulo: %.2f módulo %.2f %.2f
                """,
                n1, n2, sum, n1, n2, res, n1, n2, mul, n1, n2, div, n1, n2, mod, n1, n2);
    }
}