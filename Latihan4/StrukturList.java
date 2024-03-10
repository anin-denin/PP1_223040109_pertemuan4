package Latihan4;

public class StrukturList {
    private Node HEAD;

    // Konstruktor untuk inisialisasi
    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk menambahkan node baru di akhir/tail list
    public void addTail(Node data) {
        if (HEAD == null) {
            HEAD = data;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(data);
        }
    }

    // Fungsi untuk menambahkan node baru di posisi tengah list
    public void addMid(int data, int position) {
        if (HEAD == null || position == 0) {
            return; // Tidak melakukan apa-apa jika list kosong atau posisi 0
        }

        Node newNode = new Node(data);
        Node current = HEAD;
        Node prev = null;
        int count = 1;

        while (current != null && count < position) {
            prev = current;
            current = current.getNext();
            count++;
        }

        if (current == null) {
            return; // Tidak melakukan apa-apa jika posisi melebihi ukuran list
        }

        // Sisipkan node baru di posisi tengah
        newNode.setNext(current);
        if (prev != null) {
            prev.setNext(newNode);
        } else {
            HEAD = newNode; // Node baru menjadi HEAD jika posisi awal
        }
    }

    // Getter untuk mengembalikan HEAD aktual
    public Node getHEAD() {
        return HEAD;
    }

    // Menampilkan elemen-elemen dalam list
    public void displayElement() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
