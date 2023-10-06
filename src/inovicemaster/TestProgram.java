package inovicemaster;

import java.util.Date;

public class TestProgram {

    public static void main(String[] args) {
       new TestProgram().run();
    }

    private void run() {
        // Create faktura udsteder and modtager
        InvoiceParticipant udsteder = new InvoiceParticipant("Udsteder Navn", "Udsteder Adresse");
        InvoiceParticipant modtager = new InvoiceParticipant("Modtager Navn", "Modtager Adresse");

        // Create a faktura
        Faktura faktura = new Faktura(123, udsteder, modtager);
        faktura.setFakturadato(new Date());
        faktura.setForfaldsdato(new Date());

        // Create faktura linjer
        Fakturalinjer linje1 = new Fakturalinjer("Vare 1", 2, "stk", 100);
        Fakturalinjer linje2 = new Fakturalinjer("Vare 2", 1, "stk", 200);
        faktura.tilføjFakturaLinje(linje1);
        faktura.tilføjFakturaLinje(linje2);

        // Calculate totals
        faktura.getSubtotal();

        // Print faktura information
        System.out.println(faktura);
    }
}
