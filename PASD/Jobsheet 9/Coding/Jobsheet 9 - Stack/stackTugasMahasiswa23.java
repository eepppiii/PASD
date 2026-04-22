public class stackTugasMahasiswa23 {
    mahasiswa23[] stack;
    int top, size;

    public stackTugasMahasiswa23(int size) {
        this.size = size;
        stack = new mahasiswa23[size];
        top = -1;
    }

    public boolean isfull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(mahasiswa23 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi");
        }
    }

    public mahasiswa23 pop() {
        if (!isEmpty()) {
            mahasiswa23 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public mahasiswa23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang di tampilkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);    
        }
        System.out.println("");
    }

    public mahasiswa23 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    public String konversiDesimalkeBiner(int nilai){
        stackKonversi23 stack = new stackKonversi23();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);   
            nilai = nilai/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}