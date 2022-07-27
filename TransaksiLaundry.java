package laundry_ukl;
import java.util.ArrayList;
import java.util.Scanner;

public class TransaksiLaundry {
    
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); 
    
    public TransaksiLaundry() {
    this.idClient.add(0);
    this.idJenisLaundry.add(0);
    this.banyak.add(2);
    
    this.idClient.add(0);
    this.idJenisLaundry.add(1);
    this.banyak.add(3);
    
    this.idClient.add(1);
    this.idJenisLaundry.add(0);
    this.banyak.add(1);
    
    this.idClient.add(1);
    this.idJenisLaundry.add(2);
    this.banyak.add(2);
   }
   public void prosesTransaksiLaundry(ClientLaundry clientlaundry, TransaksiLaundry transaksilaundry, JenisLaundry jenislaundry){  
     
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Silahkan Melakukan Laundry");
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt(); 
        
        System.out.println("Selamat datang "+clientlaundry.getNama(idClient));
        ArrayList<Integer> idjenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int temp=0;
        
        do{
            System.out.print("Masukkan Kode Jenis Laundry : ");
            temp=myObj.nextInt();
            if (temp!=99){
            idjenisLaundry.add(temp);
            System.out.print(jenislaundry.getNamaJenisLaundry(idjenisLaundry.get(i))+ " sebanyak : ");
            
            banyak.add(myObj.nextInt());
            i++;
          }
        }while (temp!=99); 
        
        System.out.println("Transaksi Laundry "+clientlaundry.getNama(idClient)+" sebagai berikut");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
        
        int total=0;
        int x = idjenisLaundry.size();
        for (int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * jenislaundry.getHarga(idjenisLaundry.get(j));
            total+=jumlah;
            System.out.println(jenislaundry.getNamaJenisLaundry(idjenisLaundry.get(j))+"\t"+idjenisLaundry.get(j)+"\t"+jenislaundry.getHarga(idjenisLaundry.get(j))+"\t"+jumlah);
            transaksilaundry.setTransaksiLaundry(jenislaundry, idClient, idjenisLaundry.get(j), banyak.get(j));
        }

        System.out.println("Total Transaksi : "+total);
        clientlaundry.editsaldo(idClient, clientlaundry.getSaldo(idClient)-total);
        
    }
    public void setTransaksiLaundry(JenisLaundry  jenislaundry, int idClient, int idjenisLaundry, int banyaknya){
    this.idClient.add(idClient);
    this.idJenisLaundry.add(idjenisLaundry);
    this.banyak.add(banyaknya);
    jenislaundry.editDurasi(idjenisLaundry, jenislaundry.getDurasi(idjenisLaundry)-banyaknya);
    }
    
    public int getIdjenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    } 
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdClient(int id){
        return this.idJenisLaundry.get(id);
    }
    public int getJmlTransaksiLaundry(){
        return this.idJenisLaundry.size();
    }

    

    
  }
