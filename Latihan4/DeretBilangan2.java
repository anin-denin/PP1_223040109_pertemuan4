package Latihan4;

public class DeretBilangan2 {

    public static void main(String[] args) {
        StrukturListPecahan list = new StrukturListPecahan();

        // Menambahkan data
        list.addLast(3.4);
        list.addFirst(2.1);
        list.addFirst(1.1);
        list.addLast(4.5);
        list.addLast(5.5);

        // Menampilkan elemen
        list.displayElement();
    }
}
