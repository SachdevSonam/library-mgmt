package com.example.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Book\n2. View Books\n3. Delete All Books\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    books.add(new Book(title, author));
                    break;
                case 2:
                    if (books.isEmpty()) {
                        System.out.println("Library is empty.");
                    } else {
                        books.forEach(System.out::println);
                    }
                    break;
                case 3:
                    books.clear();
                    System.out.println("All books deleted.");
                    break;
                case 4:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

