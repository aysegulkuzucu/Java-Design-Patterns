import Build.KucukMenuBuilder;

import Menu.Icecek;
import Menu.Salata;
import Menu.Siparis;
import Menu.Tatli;
import Menu.Yemek;

public class Garson {

   private Build.SiparisBuilder builder;

   public Siparis makeSiparis(Yemek yemek, Icecek icecek, Tatli tatli, Salata salata) {
      if (yemek.getYemek().equals("Iskender") && icecek.getIcecek().equals("Kola") && 
    	    tatli.getTatli().equals("Kunefe") && salata.getSalata().equals("Coban Salata"))
      {
         builder = new KucukMenuBuilder();
      }

      builder.setYemek(yemek);
      builder.setIcecek(icecek);
      builder.setTatli(tatli);
      builder.setSalata(salata);
      return builder.getSiparis();
   }

   public static void main(String[] args) {

      Yemek yemek = new Yemek("Iskender");
      Icecek icecek = new Icecek("Kola");
      Tatli tatli = new Tatli("Kunefe");
      Salata salata = new Salata("Coban Salata");

      Garson garson = new Garson();
      Siparis kucukMenu = garson.makeSiparis(yemek, icecek, tatli, salata);

      System.out.println("Yemek:" + kucukMenu.getYemek().getYemek());
      System.out.println("Icecek:" + kucukMenu.getIcecek().getIcecek());
      System.out.println("Tatli:" + kucukMenu.getTatli().getTatli());
      System.out.println("Salata:" + kucukMenu.getSalata().getSalata());
   }
}