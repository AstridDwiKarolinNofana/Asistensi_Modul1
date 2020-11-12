package astrid07221_rentalcamera;
import java.util.Date;
public class Astrid07221_pelangganEntity {
    String Astrid07221_id_pelanggan,Astrid07221_nama,Astrid07221_alamat,Astrid07221_noIdentitas,Astrid07221_notelp,Astrid07221_harga;
    Date Astrid07221_Tanggal_Sewa;
    Date Astrid07221_Tanggal_pengembalian;
    int Astrid07221_indexcamera;
    int Astrid07221_indexAnggota;
    
public Astrid07221_pelangganEntity(String Astrid07221_id_pelanggan,String Astrid07221_nama,String Astrid07221_alamat,String Astrid07221_noIdentitas,String Astrid07221_notelp,String Astrid07221_harga,
        Date Astrid07221_Tanggal_Sewa,Date Astrid07221_Tanggal_pengembalian,
        int Astrid07221_indexcamera,int Astrid07221_indexAnggota){
        this.Astrid07221_id_pelanggan=Astrid07221_id_pelanggan;
        this.Astrid07221_nama=Astrid07221_nama;
        this.Astrid07221_alamat=Astrid07221_alamat;
        this.Astrid07221_noIdentitas=Astrid07221_noIdentitas;
        this.Astrid07221_notelp=Astrid07221_notelp;
        this.Astrid07221_harga=Astrid07221_harga;
        this.Astrid07221_Tanggal_Sewa=Astrid07221_Tanggal_Sewa;
        this.Astrid07221_Tanggal_pengembalian=Astrid07221_Tanggal_pengembalian;
        this.Astrid07221_indexcamera= Astrid07221_indexcamera;
        this.Astrid07221_indexAnggota= Astrid07221_indexAnggota;
    }
    String getAstrid07221_id_pelanggan
        (){
        return this.Astrid07221_id_pelanggan;
    }
    String getAstrid07221_nama(){
        return this.Astrid07221_nama;
    }
    String getAstrid07221_alamat(){
        return this.Astrid07221_alamat;
    }
    String getAstrid07221_noIdentitas(){
        return this.Astrid07221_noIdentitas;
    }
    String getAstrid07221_notelp(){
        return this.Astrid07221_notelp;
    }
    String getAstrid07221_harga(){
        return this.Astrid07221_harga;
    }
    Date getAstrid07221_Date_sewa(){
        return this.Astrid07221_Tanggal_Sewa;
    }
    Date getAstrid07221_Date_kembali(){
        return this.Astrid07221_Tanggal_pengembalian;
    }
    int getAstrid07221_indexcamera(){
        return Astrid07221_indexcamera;
    }
    int getAstrid07221_indexAnggota(){
        return Astrid07221_indexAnggota;
    }
}
