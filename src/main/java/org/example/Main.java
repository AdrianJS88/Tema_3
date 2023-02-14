package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean Exit = false;

        int Options;

        while (!Exit) {

            System.out.println("1. LIST OF CONTACTS ");
            System.out.println("2. ADD CONTACT");
            System.out.println("3. REMOVE CONTACT");
            System.out.println("4. REPLACE CONTACT");
            System.out.println("5. SEARCH CONTACT");
            System.out.println("6. EXIT");

            try {
                System.out.println(" PLEASE CHOOSE A OPTION");
                Options = sc.nextInt();

                switch (Options) {
                    case 1:

                        contacts.forEach((k, v) -> System.out.println("Name: " + k + " Number:" + v));
                        break;
                    case 2:
                        String sc1 = new Scanner(System.in).nextLine();
                        Integer sc2 = new Scanner(System.in).nextInt();
                        contacts.put(sc1,sc2);

                        break;
                    case 3:
                        String sc3 = new Scanner(System.in).nextLine();
                        contacts.remove(sc3);
                        break;
                    case 4:
                        String sc4 = new Scanner(System.in).nextLine();
                        String sc5 = new Scanner(System.in).nextLine();
                        contacts.replace(sc4, Integer.valueOf(sc5));

                        break;
                    case 5:
                        String sc6 = new Scanner(System.in).nextLine();
                        if (contacts.containsKey(sc6))
                            System.out.println(sc6.toString());
                        break;
                    case 6:
                        Exit = true;
                        System.out.println("YOU HAVE EXIT DE PROGRAM");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}