package tr.com.mustafa.uygulama11sirazsizde;

public class Arkadaslar {
    String OgrenciAdi;
    int OkulNO;
    String Sinifi;
    int siraNo;
    int foto;

    public Arkadaslar(String ogrenciAdi, int okulNO, String sinifi, int siraNo, int foto) {
        OgrenciAdi = ogrenciAdi;
        OkulNO = okulNO;
        Sinifi = sinifi;
        this.siraNo = siraNo;
        this.foto = foto;
    }
}
