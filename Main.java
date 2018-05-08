package dev.hdstudio.wat.lab2;

public class Main {

    public static void main(String[] args) {

        Anchor anchor = new Anchor();
        anchor.insertAtTheFront(666);
        anchor.insertAtTheFront(420);
        anchor.insertAtTheFront(69);
        anchor.insertAtTheEnd(1337);
        System.out.println(anchor.toString());

    }
}

/*
W końcu firma ta zdecydowała się użyć tylko najczęściej występujących imion swoich
pracowników do nazwania produktów. Policzono ilu pracowników posiada dane imię. Trzeba
przygotować listę imion. Map
 */
