import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la posicion del arreglo, con los parametros 0<=n<=10^7");
        n= sc.nextInt();
        if(0<=n && n<=Math.pow(10, 7)){
            int ultimo_digito = Calculo_De_El_Ultimo_Digito_De_Un_Fibonacci.ultimo_digito_de_fibonacci(n);
            System.out.println("El ultimo digito del fibonaci en la posicion: " + n  + " que ingreso es : " +ultimo_digito) ;
            sc.close();
        }else{
            System.out.println("Debe ingresar parametros validos");
        }
    }
    
}
