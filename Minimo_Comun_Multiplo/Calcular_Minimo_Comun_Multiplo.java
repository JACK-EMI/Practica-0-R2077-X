public class Calcular_Minimo_Comun_Multiplo {
public static int calcular_MCD(int n, int m){
    while (m!=0) {
        int x=m;
        m=n%m;
        n=x;
    }
    return n;
}
    public static long calcular_MCM(int n, int m){
        return (long) (n*m)/calcular_MCD(n, m);
    }
}