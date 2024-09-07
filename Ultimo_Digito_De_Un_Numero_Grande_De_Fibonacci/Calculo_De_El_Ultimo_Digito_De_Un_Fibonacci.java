public class Calculo_De_El_Ultimo_Digito_De_Un_Fibonacci {
public static int ultimo_digito_de_fibonacci(int n){
    if (n==0)
    {
      return 0;
    }else if(n==1)
     {
        return 1;
     }
     int x=0;
     int y=1;
    
    for(int i = 2; i <= n; i++)
    {
       int c;
       c= (x+y)%10;
       x=y;
       y=c;
    }

     return y;



}
    
}