import java.util.Scanner;
public class TemaLab3ex2{
    public static void main (String[] args){
        int[] array = new int [7];
        Scanner in = new Scanner (System.in);

        System.out.println("Introdu elementele listei: ");
        for(int i=0; i<7; i++)
        {
            array[i] = in.nextInt();
        }

        for(int i=0; i<array.length; i++){
            boolean isPrime = true;


            for (int j=2; j<array[i]; j++){

                if(array[i]%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)

                System.out.println(array[i] + " este numer prime al listei");
        }
    }
}
