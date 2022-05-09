public class App {
    public static void main(String[] args) throws Exception {
        int[] numeri = new int[3]; //arriva fino a 2
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;
        //int[] numeri2 = {10,20,30,40};

        for (int i=0; i < numeri.length; i++)
        {
            System.out.println(numeri[i]);
        }

        for(int numero: numeri){
            System.out.println(numero);
        }

        System.out.println(numeri.length); //gli indici partono da 0 ma gli elementi da 1
    }
}
