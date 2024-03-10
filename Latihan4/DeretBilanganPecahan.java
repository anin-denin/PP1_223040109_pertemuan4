package Latihan4;

public class DeretBilanganPecahan {

    public static void main(String[] args) {
        StrukturListPecahan list = new StrukturListPecahan();

        // Menambahkan data
        list.addFirst(2.1);
        list.addLast(4.5);
        list.addMiddle(3.4, 2);

        // Menampilkan elemen
        list.displayElement();
    }
}
