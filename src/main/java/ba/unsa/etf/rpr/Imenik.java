package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Imenik {
    private String ime;
    private TelefonskiBroj broj;
    private HashMap<String,TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj>clan:imenik.entrySet()){
            if(clan.getValue().equals(broj)) return clan.getKey();
        }
        return null;
    }
    public String naSlovo(char s){
        String povratni = "";
        int index = 1;
        for(Map.Entry<String, TelefonskiBroj> clan: imenik.entrySet()) {
            if(clan.getKey().charAt(0) == s) {
                povratni = povratni + index + ". " + clan.getKey() + " - " + clan.getValue().ispisi() + "\n";
            }
        } return null;
    }
    Set<String>izGrada(Grad g){
      Set<String>imena=new TreeSet<String>();
      for(Map.Entry<String, TelefonskiBroj> clan:imenik.entrySet()){
          if(clan.getValue() instanceof FiksniBroj){
              if(((FiksniBroj) clan.getValue()).dajGrad()==g) imena.add(clan.getKey());
          }
      } return imena;
    }
    Set<TelefonskiBroj>izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> brojevi=new LinkedHashSet<>();
        for(Map.Entry<String,TelefonskiBroj> clan:imenik.entrySet()){
            if(clan.getValue() instanceof FiksniBroj){
                if(((FiksniBroj) clan.getValue()).dajGrad()==g){
                    brojevi.add(clan.getValue());
                }
            }
        }
        return brojevi;
    }

}
