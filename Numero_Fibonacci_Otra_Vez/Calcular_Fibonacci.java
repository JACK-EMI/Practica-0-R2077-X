public class Calcular_Fibonacci {
public static long periodo_pisano(int x){
    long anterior=0;
    long actual=1;
    for(long i=0; i< x*x ; i++){
        long temporal= actual;
        actual= (anterior+actual)% x ;
        anterior=temporal;
        if(anterior==0 && actual==1){
            return i+1;
        }
        
    }
    
    return 0;
        
    
}
public static long calcular_fibonacci(long n, int m){
    if(n==0){
        return 0;
    }else if(m==1){
        return 1;
    }
    long anterior =0;
    long actual=1;
    for(long i=2; i<=n; i++){
         long temporal=actual;
         actual=(anterior+actual)%m;
         anterior=temporal;
    }
    return actual;
}
    
}