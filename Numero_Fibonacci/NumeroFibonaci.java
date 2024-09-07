public class NumeroFibonaci {

    public static int fibonacci(int x){
        if (x==0)
        {
          return 0;
        }else if(x==1)
         {
            return 1;
         }
         int[] almacenarfibonaci= new int[x + 1];
         almacenarfibonaci[0]=0;
         almacenarfibonaci[1]=1;
        for(int i = 2; i <= x; i++)
        {
            almacenarfibonaci[i]= almacenarfibonaci[i - 1] + almacenarfibonaci[ i - 2];
        }

         return almacenarfibonaci[x];

    }
}