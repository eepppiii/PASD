public class stackSurat23 {
    Surat23[] data;
    int top;
    int size;

    public stackSurat23(int size) {
        this.size = size;
        data = new Surat23[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat23 s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat23 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses");
            return null;
        }
    }

    public Surat23 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampil();
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}