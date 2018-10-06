package Exercise1;

import java.util.Scanner;

public class Number {

    public void start(){
        int number;

        System.out.println("Podaj liczbê ca³kowit¹: ");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        PrintNumbers printNumbers = new PrintNumbers();

        printNumbers.print(number);
    }
}
