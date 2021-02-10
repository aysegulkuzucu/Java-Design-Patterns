package Build;

import Menu.Tatli;
import Menu.Icecek;
import Menu.Yemek;
import Menu.Salata;

public class KucukMenuBuilder extends SiparisBuilder {

   @Override
   public void setYemek(Yemek yemek) {
      getSiparis().setYemek(yemek);
   }

   @Override
   public void setIcecek(Icecek icecek) {
      getSiparis().setIcecek(icecek);
      
   }

   @Override
   public void setTatli(Tatli icecek) {
      getSiparis().setTatli(icecek);
      
   }

   @Override
   public void setSalata(Salata salata) {
      getSiparis().setSalata(salata);
      
   }
}