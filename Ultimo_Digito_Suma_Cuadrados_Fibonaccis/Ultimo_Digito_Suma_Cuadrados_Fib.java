public class Ultimo_Digito_Suma_Cuadrados_Fib {
 // Función para calcular F(n) % mod usando el método iterativo
 public static int fibonacciMod(long n, int mod) {
    if (n == 0){
         return 0;
    }
     else if (n == 1) {
        return 1;
     }

    int a = 0, b = 1;
    for (long i = 2; i <= n; i++) {
        int temp = (a + b) % mod;
        a = b;
        b = temp;
    }
    return b;
}

// Función para calcular el último dígito de la suma de cuadrados de Fibonacci
public static int ultimodigito(long n) {
    // Calcular F(n) % 10 y F(n+1) % 10
    int fn = fibonacciMod(n, 10);
    int fnPlus1 = fibonacciMod(n + 1, 10);
    
    // Último dígito de la suma de cuadrados
    return (fn * fnPlus1) % 10;
}
}
    
