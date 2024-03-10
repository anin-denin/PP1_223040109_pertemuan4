package Latihan4;

public class StrukturListTest {
    public static void main(String[] args) {

        StrukturList LL = new StrukturList();

        // 1. Create list dengan keyword new
        LL.addMid(3, 1); // Menambahkan Node dengan data 3 di awal list

        // 2. Tambah elemen 3 di akhir list
        LL.addTail(new Node(3));

        // 3. Tambah elemen 4 di akhir list
        LL.addTail(new Node(4));

        // 4. Tambah elemen 7 di index 2
        LL.addMid(7, 2);

        // 5. Tambah elemen 8 di index 2
        LL.addMid(8, 2);

        // 6. Tambah elemen 5 di awal list
        LL.addMid(5, 1);

        // 7. Tampilkan elemen list
        LL.displayElement();
    }
}
