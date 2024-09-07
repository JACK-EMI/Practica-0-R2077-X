public class Ultimo_Digito_Suma_Fibonacci {
    public static int fibonacciMod(long n, int mod) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (long i = 2; i <= n; i++) {
            int temp = (a + b) % mod;
            a = b;
            b = temp;
        }
        return b;
    }

    // Función para calcular el último dígito de la suma de Fibonacci desde F(m) hasta F(n)
    public static int lastDigitOfFibonacciSum(long m, long n) {
        if (m == 0) {
            return fibonacciMod(n, 10);
        }

        // Calcular F(n) % 10 y F(m-1) % 10
        int fn = fibonacciMod(n, 10);
        int fmMinus1 = fibonacciMod(m - 1, 10);
        
        // Último dígito de la suma
        return (fn - fmMinus1 + 10) % 10; // Asegurarse de que sea positivo
    }
}
