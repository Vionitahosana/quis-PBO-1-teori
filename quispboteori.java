import java.util.Scanner;
public class quispboteori {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama;
		int totalharga,kembali,harga,tipe,jumlahmeteran,bayar;
		
		System.out.println("=====Tipe Pesawat=====");
		System.out.println("Tipe Rumah 31 : Rp 100,000");
		System.out.println("Tipe Rumah 32 : Rp 125,000");
		System.out.println("Tipe Rumah 33 : Rp 450,000");
		System.out.println("Tipe Rumah 34 : Rp 480,000");
		System.out.println("Tipe Rumah 35 : Rp 500,000");
		System.out.println("Tipe Rumah 40 : Rp 550,000");
		
		System.out.print("Masukkan Nama Anda: ");
		nama = input.nextLine();

		System.out.print("Pilih Tipe Rumah: ");
		tipe = input.nextInt();
		
		System.out.print("Masukkan Jumlah Meteran: ");
		jumlahmeteran = input.nextInt();
		
		System.out.print("Total Harga : ");
		totalharga = input.nextInt();
		
		System.out.print("Bayar : ");
		bayar = input.nextInt();
		
		System.out.println("___________");
		
		if (tipe == 31){
			harga = 100000;
		} else if (tipe == 32){
			harga = 125000;
		} else if (tipe == 33){
			harga = 450000;
		} else if (tipe == 34){
			harga = 480000;
		} else if (tipe == 35){
			harga = 500000;
		} else {
			harga = 550000;
		}
		
		totalharga = jumlahmeteran * harga;
		kembali = totalharga - bayar;
		
		System.out.println("Nama : " +nama);
		System.out.println("Total Harga : "+totalharga);
		System.out.println("Total yang dibayar: "+bayar);
		System.out.println("Kembalian : " +kembali);
		
		
	}
}