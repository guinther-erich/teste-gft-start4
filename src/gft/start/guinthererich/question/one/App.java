package gft.start.guinthererich.question.one;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int n = sc.nextInt();

        /*
        int i = 2;
        int n = 13; (caso de teste rápido)
        */

        for (; i <= n; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
