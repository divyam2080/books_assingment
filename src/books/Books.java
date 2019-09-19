package books;

import java.util.Scanner;

public class Books {
    public void display() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("N/A");
        } else {
            sc.nextLine();
        }
    }
}