
package astrid07221_rentalcamera;
import java.util.Date;
public class Astrid07221_AnggotaEntity {
     String Astrid07221_id,Astrid07221_nama,Astrid07221_alamat,Astrid07221_noIdentitas,Astrid07221_notelp;
     
    public Astrid07221_AnggotaEntity(String Astrid07221_id,String Astrid07221_nama,
    String Astrid07221_alamat, String Astrid07221_noIdentitas,String Astrid07221_notelp){
    this.Astrid07221_id=Astrid07221_id;
    this.Astrid07221_nama=Astrid07221_nama;
    this.Astrid07221_alamat=Astrid07221_alamat;
    this.Astrid07221_noIdentitas=Astrid07221_noIdentitas;
    this.Astrid07221_notelp=Astrid07221_notelp;
}
    String getAstrid07221_id_Petugas(){
        return this.Astrid07221_id;
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
}