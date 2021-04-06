import java.util.ArrayList;

public class Roti extends Item{
    public Roti(String nama){
        super.setNama(nama);
    }

    @Override
    public void prosesAksi(int pil) {
        //pilihan user untuk aksi yang akan diambil
        //urutan harus sama dengan isi arrAksi
        if (pil==1) {
            System.out.println(super.getDeskripsi());
        } else  if (pil==2) {  //bisa ambil atau buang
            if (super.getObjRuangan()==null) {
                //dipegang player, buang ke ruangan
                super.dibuang();
            } else {
                //ada di ruangan, diambil player
                super.diambil();
                super.getObjGameInfo().getObjPlayer().setKesehatan(20);
            }
        }
    }

    @Override
    public ArrayList<String> getAksi() {
        //aksi dinamik tergantung ada di ruangan atau dipegang player/npc
        ArrayList<String> arrOut = new ArrayList<>();
        if (super.getObjRuangan()==null) {
            //ada di player, ada opsi buang
            arrOut.add("Deskripsi Item");
            arrOut.add("Buang item");
        } else {
            //ada di ruangan ada opsi ambil
            arrOut.add("Deskripsi Item");
            arrOut.add("Ambil item");
        }
        return(arrOut);
    }

}
