package Latihan4;

public class StrukturListPecahan {
    private NodePecahan HEAD;

    // Konstruktor untuk inisialisasi
    public StrukturListPecahan() {
        this.HEAD = null;
    }

    // Fungsi untuk menambahkan node baru di awal/head list
    public void addFirst(double data) {
        NodePecahan newNode = new NodePecahan(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Fungsi untuk menambahkan node baru di akhir/tail list
    public void addLast(double data) {
        NodePecahan newNode = new NodePecahan(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            NodePecahan current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Fungsi untuk menambahkan node baru di tengah list
    public void addMiddle(double data, int position) {
        NodePecahan newNode = new NodePecahan(data);
        NodePecahan current = HEAD;
        NodePecahan previous = null;

        // Mencari posisi yang ingin disisipkan
        for (int i = 1; i < position && current != null; i++) {
            previous = current;
            current = current.getNext();
        }

        // Jika posisi di awal list
        if (position == 1) {
            addFirst(data);
        } else if (current != null) {
            // Sisipkan node baru di tengah list
            newNode.setNext(current);
            previous.setNext(newNode);
        } else {
            // Posisi di luar list, tambahkan di akhir
            addLast(data);
        }
    }

    // Getter untuk mengembalikan HEAD aktual
    public NodePecahan getHEAD() {
        return HEAD;
    }

    // Menampilkan elemen-elemen dalam list
    public void displayElement() {
        NodePecahan current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

class NodePecahan {
    private double data;
    private NodePecahan next;

    public NodePecahan(double data) {
        this.data = data;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodePecahan getNext() {
        return next;
    }

    public void setNext(NodePecahan next) {
        this.next = next;
    }
}


