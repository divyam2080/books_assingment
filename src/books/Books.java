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
        while (n > 0) {
            String bookName = sc.nextLine();
            String authorName = sc.nextLine();
            String ISBN = sc.nextLine();
            System.out.println("-----------------------------");
            System.out.println("Book Name:\t" + bookName);
            System.out.println("Author Name:\t" + authorName);
            System.out.println("ISBN:\t" + ISBN);
            System.out.println("-----------------------------");
            n = n - 1;

        }
    }
}