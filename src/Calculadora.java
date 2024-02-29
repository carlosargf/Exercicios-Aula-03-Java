public class Calculadora {
    int n1, n2, total;
    public int  somar (int x, int y) {
        total = x + y;
        return total;
    }

    public int  diminuir (int x, int y) {
        total = x - y;
        return total;
    }

    public int  multiplicar (int x, int y) {
        total = x * y;
        return total;
    }

    public int  dividir (int x, int y) {
        total = x / y;
        return total;
    }
}