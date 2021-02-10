package Menu;

public class Siparis {

   private Yemek    yemek;
   private Icecek   icecek;
   private Tatli tatli;
   private Salata   salata;

   public Siparis() {

   }

   public Siparis(Yemek yemek, Icecek icecek, Tatli tatli, Salata salata) {
      this.yemek = yemek;
      this.icecek = icecek;
      this.tatli = tatli;
      this.salata = salata;
   }

   public Yemek getYemek() {
      return yemek;
   }

   public void setYemek(Yemek yemek) {
      this.yemek = yemek;
   }

   public Icecek getIcecek() {
      return icecek;
   }

   public void setIcecek(Icecek icecek) {
      this.icecek = icecek;
   }

   public Tatli getTatli() {
      return tatli;
   }

   public void setTatli(Tatli tatli) {
      this.tatli = tatli;
   }

   public Salata getSalata() {
      return salata;
   }

   public void setSalata(Salata salata) {
      this.salata = salata;
   }
}