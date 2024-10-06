import Hotel.Hotel;
import Hotel.kamar;
import User.Admin;
import User.Customer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel();
        kamar kmt = new kamar();


        System.out.println("Pilih sebagai: ");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.print("Pilih sebagai: ");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan username: ");
                String userName = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();

                if (!userName.equals("admin") || !password.equals("admin123")) {
                    System.out.println("Username atau password salah");
                    return;
                }

                System.out.println("Pilih opsi admin:");
                System.out.println("1. Tambah data costumer");
                System.out.println("2. Tampilkan data");
                System.out.println("3. hapus data");
                System.out.print("Pilih sebagai: ");
                int pilihadmin = input.nextInt();
                input.nextLine();

                switch (pilihadmin) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        String name = input.nextLine();
                        System.out.print("Masukkan phone: ");
                        String phone = input.nextLine();
                        System.out.print("Masukkan umur: ");
                        int age = input.nextInt();
                        Admin admin = new Admin(name, phone, age);
                        break;

                    case 2:
                        hotel.detail();
                        kmt.detail();
                        break;

                    case 3:
                        hotel.hapusData();

                    default:
                        System.out.println("Opsi tidak valid.");
                        break;
                }
                break;

            case 2:
                System.out.println("Pilih opsi admin:");
                System.out.println("1. Tambah data costumer");
                System.out.println("2. Tampilkan data");
                System.out.print("Pilih sebagai: ");
                int pilihcustomer = input.nextInt();
                input.nextLine();
                switch (pilihcustomer) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        String name = input.nextLine();
                        System.out.print("Masukkan phone: ");
                        String phone = input.nextLine();
                        System.out.print("Masukkan umur: ");
                        int age = input.nextInt();
                        Customer customer = new Admin(name, phone, age);
                        break;
                    case 2:
                        hotel.detail();
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                        break;
                }
                break;

            default:
                System.out.println("Opsi tidak valid.");
                break;
        }

        input.close();
    }
}
