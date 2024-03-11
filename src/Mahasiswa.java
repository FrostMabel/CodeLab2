import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String jurusan;
    Scanner scanner = new Scanner(System.in);

    public void tampilDataMahasiswa() {
        int choice;
        boolean tf = false;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    nama = scanner.nextLine();
                    do {
                        System.out.print("Masukkan NIM mahasiswa: ");
                        nim = scanner.nextLine();
                        if (nim.length() == 15 && nim.matches("\\d+")) {
                            tf = true;
                        } else {
                            System.out.println("Nim Harus 15 Digit");
                        }
                    } while (!tf);
                    System.out.print("Masukkan Jurusan mahasiswa: ");
                    jurusan = scanner.nextLine();
                    System.out.println("Data mahasiswa berhasil ditambahkan");
                    break;
                case 2:
                    tampilUniversitas();
                    break;
            }
        } while (choice != 3);
        System.out.println("GoodBye");
    }

    public  void tampilUniversitas() {
        System.out.println("Data Mahasiswa:");
        System.out.println("Universitas Muhammadiyah Malang");
        System.out.print("Nama: " + nama);
        System.out.print(", Nim: " + nim);
        System.out.println(", Jurusan: " + jurusan);
    }
}
