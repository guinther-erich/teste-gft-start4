package gft.start.guinthererich.question.one;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int n = 5; (caso de teste rápido)

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
