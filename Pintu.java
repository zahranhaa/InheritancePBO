import java.util.ArrayList;

public class Pintu extends Item{
    public Pintu(){
        ArrayList<String> arrAksi = new ArrayList<>();
        arrAksi.add("Deskripsikan pintu");
        arrAksi.add("Coba buka pintu");

        super.setArrAksi(arrAksi);
   
    }

    @Override
    public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println("Pintu berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (super.getObjGameInfo().getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                super.getObjGameInfo().setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencboa membuka pintu. TERKUNCI!");
            }
        }
    }

    @Override
    public ArrayList<String> getAksi() {
        return(super.getArrAksi());
    }
}