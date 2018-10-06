package Exercise2;

import java.util.Scanner;

public class Numbers {

    public void start(){

        int A, B;

        System.out.println("Podaj 2 liczby ca³kowite A i B (A<B): ");
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        CountWhile countWhile = new CountWhile();
        countWhile.sumWhile(A, B);
    }
}
