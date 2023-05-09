/**
 * File         : Programmer.java
 * Deskripsi    : representasi dari objek Programmer
 */
public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        super.setNama(nama);
    }

    @Override
    public void tampilData() {
        // TODO Auto-generated method stub
        super.tampilData();
        System.out.println("Bonus : "+bonus);
    }
}
