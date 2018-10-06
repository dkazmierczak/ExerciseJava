package Exercise3;

import java.util.Scanner;

public class NumberIn {

    public void start() {
        int number;

        System.out.println("Podaj liczbê ca³kowit¹: ");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        Squared squared = new Squared();
        squared.count(number);
    }
}
