package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String user = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();

        String accounts = null;
        int passwordAttempts = 0;
        int userAttempts = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("parole.txt"));
            Set<Account> listaConturi = new LinkedHashSet<>();

            while ((accounts = br.readLine()) != null) {
                String[] s = accounts.split(" ", 0);
                listaConturi.add(new Account(s[0], s[1]));
            }

            accountsLoop:
            while (userAttempts < 5) {
                for (Account acc : listaConturi) {
                    if (acc.getUser().equals(user)) {
                        while (passwordAttempts < 3) {
                            if (acc.getPass().equals(pass)) {
                                System.out.println("Acces permis!");
                                break accountsLoop;
                            } else {
                                passwordAttempts++;
                                if (passwordAttempts == 3) {
                                    System.out.println("Cont blocat!");
                                    break accountsLoop;
                                }
                                System.out.print("Parola incorecta! Introdu alta parola: ");
                                pass = input.nextLine();
                            }
                        }
                    }
                }
                userAttempts++;
                if (userAttempts == 5) {
                    System.out.println("Nu ai cont. Inregistreaza-te");
                    break accountsLoop;
                }
                System.out.println("Utilizatorul nu a fost gasit. Introduceti datele din nou");
                System.out.print("Username: ");
                user = input.nextLine();
                System.out.print("Password: ");
                pass = input.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}

