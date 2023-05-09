/**
 * File         : Manajer.java
 * Deskripsi    : representasi dari objek Manajer
 *                
 */
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    Manajer(String nama){
        super.setNama(nama);
    }

    @Override
    public void tampilData() {
        // TODO Auto-generated method stub
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}
