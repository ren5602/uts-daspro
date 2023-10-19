import java.util.Scanner;
public class mesinKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jenisBarang, namaPelanggan;
        double disc=0.05, ppn=0.07 ;
        int jumlahBarang, jumlahKeseluruhan, bayarMakanan=0,hargaBarang,  bayarMinuman=0, potMinuman, totalBayar=0, kantongPlastik=0;
        System.out.println("Program Mesin Kasir");
        
        System.out.print("Masukkan Nama Pelanggan: ");
        namaPelanggan = input.nextLine();
        while (true) {
            System.out.print("Masukkan jenis barang (makanan/minuman/kantong/selesai): ");
            jenisBarang = input.next();
            if(jenisBarang.equalsIgnoreCase("makanan")){
                System.out.println("Masukkan harga barang: ");
                hargaBarang = input.nextInt();
                System.out.println("Masukkan jumlah barang: ");
                jumlahBarang = input.nextInt();
                bayarMakanan = hargaBarang * jumlahBarang;
                System.out.println("bayar makanan:" + bayarMakanan);
                continue;
            }
            else if(jenisBarang.equalsIgnoreCase( "minuman")){
                System.out.println("Masukkan harga barang: ");
                hargaBarang = input.nextInt();
                System.out.println("Masukkan jumlah barang: ");
                jumlahBarang = input.nextInt();
                bayarMinuman = hargaBarang * jumlahBarang;
                if(jumlahBarang >= 3){
                    bayarMinuman =  (int)((hargaBarang * jumlahBarang) - (hargaBarang * jumlahBarang * disc));
                }//else
                   // bayarMinuman = hargaBarang * jumlahBarang;
                
                System.out.println("bayar minuman:" + bayarMinuman);
                continue;
            }
            else if(!jenisBarang.equalsIgnoreCase("makanan") && !jenisBarang.equalsIgnoreCase( "minuman") && !jenisBarang.equalsIgnoreCase("selesai") && !jenisBarang.equalsIgnoreCase("kantong")){ 
                System.out.println("Barang tidak tersedia");
                continue;
            }
            else if(jenisBarang.equalsIgnoreCase("kantong")){
                System.out.println("anda dikenakan biaya Rp200");
                kantongPlastik=200;
                continue;
            }
            else if(jenisBarang.equalsIgnoreCase("selesai"))
            
            totalBayar = bayarMakanan + bayarMinuman +kantongPlastik;
            System.out.println("Total bayar: " + totalBayar);
            if(totalBayar >= 1000000){
                totalBayar = (int) (totalBayar - ppn*totalBayar);
                                System.out.println("Anda dikenakan PPN 7% :" + totalBayar);
            }
            break;
        }
    }
}
