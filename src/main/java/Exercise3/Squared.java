package Exercise3;

public class Squared {

    public void count(int number) {

        int a = 2;
        int results = 2;

        for(int i = 1; results<number; i++){

            results = (int) Math.pow(a, i);
            if(results < number)
                System.out.println(results);
        }
    }
}
