package dev.hdstudio.wat.lab2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        FrequentNames names = new FrequentNames();
        names.insert("Tomasz");
        names.insert("Tomasz");
        names.insert("Rafal");
        names.insert("Rafal");
        names.insert("Rafal");
        names.insert("Wojtek");
        names.insert("Zuza");
        names.insert("Zuza");

        names.choose();


        Set set = names.frequentNames.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}

/*
W końcu firma ta zdecydowała się użyć tylko najczęściej występujących imion swoich
pracowników do nazwania produktów. Policzono ilu pracowników posiada dane imię. Trzeba
przygotować listę imion. Map
 */
