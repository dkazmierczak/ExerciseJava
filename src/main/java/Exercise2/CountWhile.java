package Exercise2;

public class CountWhile {

    public void sumWhile(int a, int b) {

        int whileSum = 0;
        int a1 = a;
        int b1 = b;

        while(a1<=b1){
            whileSum += a1;
            a1++;
        }
        System.out.println("Results while loop: " + whileSum);
        CountDoWhile countDoWhile = new CountDoWhile();
        countDoWhile.sumDoWhile(a, b);
    }
}
