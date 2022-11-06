package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {
    @Test
    void dodaj() {
        Imenik i = new Imenik();
        FiksniBroj a = new FiksniBroj(Grad.SARAJEVO,"111111");
        i.dodaj("Nadina", (TelefonskiBroj) a);
        assertEquals("Nadina",i.dajIme((TelefonskiBroj) a));
    }

    @Test
    void dajBroj() {
        Imenik i = new Imenik();
        FiksniBroj a = new FiksniBroj(Grad.SARAJEVO,"111111"), b = new FiksniBroj(Grad.SARAJEVO,"033111111");
        i.dodaj("Nadina", (TelefonskiBroj) a);
        assertEquals("033/111111",i.dajBroj("Nadina"));
    }
}
