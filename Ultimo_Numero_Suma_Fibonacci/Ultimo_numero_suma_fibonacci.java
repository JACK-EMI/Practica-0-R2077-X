public class Ultimo_numero_suma_fibonacci {
public static int fibonaccimod(int x, int mod){
    if(x==0){
        return 0;
    }else if(x==1){
        return 1;
    }
    int n=0;
    int m=1;
    for(int i=2; i <=x; i++){
        int temporal= (n+m)%mod;
        n=m;
        m=temporal;
    }
    return m;
}
     // Función para calcular el último dígito de la suma de Fibonacci
     public static int ultimonumerosumafibonacci(long u){
        if(u==0){
            return 0;
        }
             // Calcular F(n + 2) % 10
             int fncci=fibonaccimod((int) (u+2),10);
              // Último dígito de la suma
              return (fncci -1 +10)%10; // Asegurarse de que sea positivo
        }
    }
    
