import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        a= sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        b=sc.nextInt();
        if (1<=a && b<=Math.pow(10, 7)) {
            long mcm= Calcular_Minimo_Comun_Multiplo.calcular_MCM(a, b);
            System.out.println("El minimo comun multiplo de: " + a + " y " + b + " es " +mcm);
        }
        sc.close();
    }
}
