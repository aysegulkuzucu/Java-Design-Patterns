package Build;

import Menu.Tatli;
import Menu.Icecek;
import Menu.Yemek;
import Menu.Siparis;
import Menu.Salata;

public abstract class SiparisBuilder {

   private Siparis siparis;

   public SiparisBuilder() {

   }

   public Siparis getSiparis() {
      if (siparis == null) {
         siparis = new Siparis();
      }
      return siparis;
   }

   public abstract void setYemek(Yemek yemek);

   public abstract void setIcecek(Icecek icecek);

   public abstract void setTatli(Tatli tatli);

   public abstract void setSalata(Salata salata);
}