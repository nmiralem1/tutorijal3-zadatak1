package ba.unsa.etf.rpr;

import java.util.Objects;

public class MedjunarodniBroj extends TelefonskiBroj{
    protected String drzava;
    protected String broj;
    public MedjunarodniBroj(String drzava, String broj){
        drzava=this.drzava;
        broj=this.broj;
    }
    @Override
    public String ispisi() {
        return drzava+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava,broj);
    }
}
