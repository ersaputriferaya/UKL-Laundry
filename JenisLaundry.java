package laundry_ukl;
import java.util.ArrayList;

public class JenisLaundry {
    
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
 
    public JenisLaundry() {
        this.jenisLaundry.add("Laundry Kiloan     ");
        this.harga.add(9000);
        this.durasi.add(3);
        
        this.jenisLaundry.add("Dry Cleaning       ");
        this.harga.add(22500);
        this.durasi.add(3);
        
        this.jenisLaundry.add("Laundry Self Service");
        this.harga.add(6000);
        this.durasi.add(2);
        
        this.jenisLaundry.add("Laundry On Demand");
        this.harga.add(16000);
        this.durasi.add(2);
        
    }
    public int getJmlJenisLaundry(){
        return this.jenisLaundry.size();
    }
    public void setNamaJenisLaundry(String jenisLaundry ){
        this.jenisLaundry.add(jenisLaundry);
    }
    public String getNamaJenisLaundry(int idJenisLaundry){
        return this.jenisLaundry.get(idJenisLaundry);
    } 
    
    public void setDurasi(int durasi ){
        this.durasi.add(durasi);
    }
    public int getDurasi(int idjenisLaundry){
        return this.durasi.get(idjenisLaundry);
    } 
    public void editDurasi(int idJenisLaundry, int durasi){
        this.durasi.set(idJenisLaundry, durasi);;
    } 
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idJenis){
        return this.harga.get(idJenis);
    } 
    
}
   
