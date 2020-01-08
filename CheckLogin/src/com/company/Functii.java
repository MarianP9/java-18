package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Functii {
    Set<Account> conturi;

    public void AddInList(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Set<Account> listaConturi = new LinkedHashSet<>();
            String linie;
            while ((linie = br.readLine()) != null) {
                String[] s = linie.split(" ");
                listaConturi.add(new Account(s[0], s[1]));
            }
            br.close();
            conturi = listaConturi;
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void Afiseaza() {
        for (Account a : conturi) {
            System.out.println(a);
        }
    }
}
