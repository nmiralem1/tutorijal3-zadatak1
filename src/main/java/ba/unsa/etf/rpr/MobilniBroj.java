package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    protected int MobilnaMreza;
    protected String broj;
    public MobilniBroj(int MobilnaMreza, String broj){
        if(MobilnaMreza>68) throw new Izuzetak("Pogrešna mobilna mreža");
        MobilnaMreza=this.MobilnaMreza;
        broj=this.broj;
    }
    @Override
    public String ispisi() {

        if (MobilnaMreza == 60)
            return "060/" + broj;
        else if (MobilnaMreza == 61)
            return "061/" + broj;
        else if (MobilnaMreza == 62)
            return "062/" + broj;
        else if (MobilnaMreza == 63)
            return "063/" + broj;
        else if (MobilnaMreza == 64)
            return "064/" + broj;
        else if (MobilnaMreza == 65)
            return "065/" + broj;
        else if (MobilnaMreza == 66)
            return "066/" + broj;
        return "067/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MobilnaMreza,broj);

    }
}
