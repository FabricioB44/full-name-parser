package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fullName = myScanner.nextLine().strip();
        String[] words = fullName.split("\\s+");
        String firstName = words[0];
        String middleName = "(None)";
        String lastName;

        if (words.length == 2){
            lastName = words[1];
        } else {
            middleName = words[1];
            lastName = words[2];
        }

        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }
}
