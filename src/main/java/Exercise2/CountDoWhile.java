package Exercise2;

public class CountDoWhile {


    public void sumDoWhile(int a, int b) {

        int doWhileSum = 0;

        int a1 = a;
        int b1 = b;

        do {
            doWhileSum += a1;
            a1++;
        }while(a1<=b1);

        System.out.println("Results do while loop: " + doWhileSum);
        CountFor countFor = new CountFor();

        countFor.sumFor(a, b);
    }
}
