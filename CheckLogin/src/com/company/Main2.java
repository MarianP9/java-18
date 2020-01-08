package company;

import com.company.Account;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String user = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();

        String accounts = null;
        int counter = 0;
        int passAttempts = 0, userAttempts = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("parole.txt"));
            Set<Account> listaConturi = new LinkedHashSet<>();

            while ((accounts = br.readLine()) != null) {
                String[] s = accounts.split(" ", 0);
                listaConturi.add(new Account(s[0], s[1]));
            }
/*            for (Account a: listaConturi) {
                System.out.print(a);
            }*/
            whileLoop:
            while (userAttempts < 5) {
                for (Account acc : listaConturi) {
                    if (acc.getUser().equals(user)) {
                        while (passAttempts < 3) {
                            if (acc.getPass().equals(pass)) {
                                System.out.println("Acces permis!");
                                userAttempts = 5;
                                break whileLoop;
                            } else {
                                System.out.println("Parola gresita, reintroduceti parola!");
                                System.out.print("Password: ");
                                pass = input.nextLine();
                                passAttempts++;
                                if (passAttempts == 3) {
                                    System.out.println("Cont blocat!");
                                    userAttempts = 5;
                                    break whileLoop;
                                }
                            }
                        }
                    }
                }
                System.out.println("Username gresit, reintroduceti username!");
                System.out.print("Username: ");
                user = input.nextLine();
                System.out.print("Password: ");
                pass = input.nextLine();
                userAttempts++;
                if (userAttempts == 5) {
                    System.out.println("Nu ai cont. Inregistreaza-te.");
                    break whileLoop;
                }
            }
        } catch (
                IOException e) {
            System.out.println(e.getStackTrace());
        }

    }
}