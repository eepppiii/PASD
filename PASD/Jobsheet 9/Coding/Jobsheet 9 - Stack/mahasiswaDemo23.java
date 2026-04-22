import java.util.Scanner;

public class mahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackTugasMahasiswa23 stack = new stackTugasMahasiswa23(5);
        int pilih; 
        
        do {
            System.out.println("\nmenu");
            System.out.println("1. Menumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar");
            System.out.print("Pilih :");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama :");
                    String nama = sc.nextLine();
                    System.out.print("NIM :");
                    String nim = sc.nextLine();
                    System.out.print("Kelas :");
                    String kelas = sc.nextLine();
                    mahasiswa23 mhs = new mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari" + dinilai.nama);
                        System.out.println("Masukkan nilai (0-100) : ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas teakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("nama\tNIM\tkelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Sistem tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
