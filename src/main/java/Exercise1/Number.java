package Exercise1;

import java.util.Scanner;

public class Number {

    public void start(){
        int number;

        System.out.println("Podaj liczb� ca�kowit�: ");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        PrintNumbers printNumbers = new PrintNumbers();

        printNumbers.print(number);
    }
}
