package Exercise2;

public class CountFor {


    public void sumFor(int a, int b) {

        int forSum = 0;

        for(int i = a; i <= b ; i++){
            forSum += i;
        }
        System.out.println("Results for loop: " + forSum);
    }
}
