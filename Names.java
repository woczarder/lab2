package dev.hdstudio.wat.lab2;

import java.util.LinkedList;
import java.util.Random;

public class Names {

    private LinkedList<String> names;

    public Names() {

        this.names = new LinkedList<>();
        
        names.add("Janek");
        names.add("Zuza");
        names.add("Wojtek");
        names.add("Sebek");
        names.add("Rafal");
        names.add("Kossut");
        names.add("Kossutek");
    }

    public void choose() {
        Random indexGenerator = new Random();
        int x = indexGenerator.nextInt(names.size());
        System.out.println("I chose "+ x + ": " + names.get(x));
        names.remove(x);
    }
}
