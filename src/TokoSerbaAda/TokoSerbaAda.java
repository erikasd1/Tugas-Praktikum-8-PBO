package TokoSerbaAda;

import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args){
        int jumlahBarang = 5;
        Scanner input = new Scanner(System.in);
        
        String[] kodeBarang = {"001", "002", "003", "004", "005"};
        String[] namaBarang = {"Penghapus", "Pensil", "Pulpen", "Spidol", "Buku"};
        int[] hargaBarang = {2000, 3000, 5000, 10000, 13500};
        
        System.out.println("====== TOKO SERBA ADA ======");
        System.out.println("******************************");
        
        System.out.print("Masukkan item barang: ");
        int item = input.nextInt();
        
        String[] kodeBeli = new String[item];
        int[] jumlahBeli = new int[item];
        int[] totalBeli = new int[item];
        
        int totalBayar = 0;
        
        for(int i = 0; i < item; i++){
            System.out.println("Data ke-" +(i+1));
            boolean kodeValid = false;
            
            while(!kodeValid){
                System.out.print("Masukkan kode         : ");
                kodeBeli[i] = input.next();
                
                for(int j = 0; j < jumlahBarang; j++){
                    if(kodeBarang[j].equals(kodeBeli[i])){
                        kodeValid= true;
                        break;
                    }
                }
                
                if(!kodeValid){
                    System.out.println("KODE TIDAK VALID, MASUKKAN KODE YANG SESUAI!");
                }
            }
            
            System.out.print("Masukkan jumlah beli  : ");
            jumlahBeli[i] = input.nextInt();
            
            for(int j = 0; j < jumlahBarang; j++){
                if(kodeBarang[j].equals(kodeBeli[i])){
                    totalBeli[i] = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += totalBeli[i];
                    break;
                }
            }
        }
        System.out.println("\n====== TOKO SERBA ADA ======");
        System.out.println("******************************");
        System.out.println("===================================================================");
        System.out.println("No  Kode Barang   Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("===================================================================");
        
        for(int i =0; i < item; i++){
            for(int j = 0; j < 5; j++){
                if(kodeBarang[j].equals(kodeBeli[i])){
                    System.out.printf("%-6d %-10s %-13s %-12d %-11d %-13d\n", (i+1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], totalBeli[i]);
                    break;
                }
            }
        }
        System.out.println("===================================================================");
        System.out.println("Total bayar                                              " +totalBayar);
        System.out.println("===================================================================");
    }
}
