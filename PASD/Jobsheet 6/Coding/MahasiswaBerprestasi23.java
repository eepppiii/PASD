import java.util.Scanner;

public class MahasiswaBerprestasi23 {
    Mahasiswa23[] listMhs = new Mahasiswa23[5];
    int idx = 0;

    void tambah(Mahasiswa23 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilinformasi();
            System.out.println("-----------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != 1) {
            System.out.println("Data Mahasiswa Dengan IPK :" + x + "Ditemukan Pada Indeks" + pos);
        } else {
            System.out.println("Data" + x + "Tidak Ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != 1) {
            System.out.println("nim\t :" + listMhs[pos].nim);
            System.out.println("nama\t :" + listMhs[pos].nama);
            System.out.println("kelas\t :" + listMhs[pos].kelas);
            System.out.println("IPK\t :" + x);
        } else {
            System.out.println("Data Mahasiswa Dengan IPK " + x + "Tidak Ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return(mid);                
            }else if(listMhs[mid].ipk>cari){
                return findBinarySearch(cari, left, mid-1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
}