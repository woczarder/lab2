package dev.hdstudio.wat.lab2;

public class Anchor {

    private Element first;

    public void insertAtTheFront(int i) {
        Element e = new Element(i);
        e.addNext(this.first);
        first = e;
    }

    public void insertAtTheEnd(int i) {
        Element e = new Element(i);
        Element temp = this.first;

        // if there is no "root"
        if (temp.next == null) {
            this.first = e;
        }
        // if there is "root"
        else {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = e;
        }

    }

    public void removeFirst() {
        Element temp = first.next;
        if (this.first != null) {
            this.first = temp;
        }
    }

    public void removeLast() {
        Element temp = this.first;
        Element temp2 = this.first.next;
        while (temp2.next != null) {
            temp = temp2;
            temp2 = temp2.next;
        }
        temp.next = null;
    }

    @Override
    public String toString() {
        Element temp = this.first;
        String printing = "[";

        while (temp.next != null) {
            printing = printing + temp.val + ", ";
            temp = temp.next;
        }
        printing = printing + temp.val + "]";
        return printing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        // if it's the same class
        if (o instanceof Anchor == false) {
            return false;
        }
        // yeah? Good, now we check attributes
        Anchor temp = (Anchor) o;
        Element x = this.first;
        Element y = temp.first;

        // if there are elements and they are the same elements
        while ((x.next != null) && (y.next != null) && (x.val == y.val)) {
            // iterate
            x = x.next;
            y = y.next;
        }

        // if they are the same length, they are the same
        if ((x.next == null) && (y.next == null)) {
            return true; // because they have the same previous elements
        }
        else
            return false;
    }

    public Anchor clone() {
        Anchor kopia = new Anchor();
        Element temp = this.first;

        while(temp != null){
            kopia.insertAtTheEnd(temp.val);
            temp = temp.next;
        }

        return kopia;
    }

    public Anchor revert() {
        Anchor kopia = new Anchor();
        Element temp = this.first;

        while(temp != null){
            kopia.insertAtTheFront(temp.val);
            temp = temp.next;
        }

        return kopia;
    }
}
