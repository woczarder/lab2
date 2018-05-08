package dev.hdstudio.wat.lab2;

public class Element {
    int val;
    Element next;

    public Element(int x) {
        this.val = x;
        this.next = null;
    }

    void addNext(Element next) {
        this.next = next;
    }
}
