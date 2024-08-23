package siswa;

import java.util.Scanner;

//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa");
        String nama = input.nextLine();
        System.out.println("Masukkan ID Siswa");
        int id = input.nextInt();
        System.out.println("Masukkan IPK");
        double ipk = input.nextDouble();

        Siswa azam = new Siswa(id, nama, ipk);
        azam.print();

     //object
     //Class object = new Constructor
     Siswa Burhan = new Siswa(26,"Burhan",90);
     Siswa Ibra = new Siswa(29,"Ibra",90);
     Siswa Bintang = new Siswa(25,"Bintang",90);
     Siswa Gilam = new Siswa(19,"Gilam",90);
     Siswa Kinza = new Siswa(15,"Kinza",90);



     System.out.println("ID : " + Burhan.id);
     System.out.println("Nama : " + Burhan.nama);
     System.out.println("IPK : " + Burhan.ipk);
     System.out.println("    ");
     System.out.println("ID : " + Ibra.id);
     System.out.println("Nama : " + Ibra.nama);
     System.out.println("IPK : " + Ibra.ipk);
     System.out.println("    ");
     System.out.println("ID : " + Bintang.id);
     System.out.println("Nama : " + Bintang.nama);
     System.out.println("IPK : " + Bintang.ipk);
     System.out.println("    ");
     System.out.println("ID : " + Gilam.id);
     System.out.println("Nama : " + Gilam.nama);
     System.out.println("IPK : " + Gilam.ipk);
     System.out.println("    ");
     System.out.println("ID : " + Kinza.id);
     System.out.println("Nama : " + Kinza.nama);
     System.out.println("IPK : " + Kinza.ipk);

     input.close();
    }
}