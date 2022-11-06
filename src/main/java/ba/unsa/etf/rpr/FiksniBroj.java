package ba.unsa.etf.rpr;
import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {
    protected Grad grad;
    protected String broj;
    public FiksniBroj(Grad grad, String broj){
        grad=this.grad;
        broj=this.broj;}
        public Grad dajGrad(){
            return grad;
        }



    @Override
    public String ispisi() {
        if(grad==Grad.SARAJEVO) return "033/"+broj;
        else if(grad==Grad.MOSTAR) return "059/"+broj;
        else if(grad==Grad.ZENICA) return "032/"+broj;
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }
}
