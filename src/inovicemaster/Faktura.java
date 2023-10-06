package inovicemaster;

import java.util.ArrayList;
import java.util.Date;

public class Faktura {
    private int Fakturanr;
    private Date Fakturadato;
    private Date Forfaldsdato;
    private InvoiceParticipant fakturaudsteder;
    private InvoiceParticipant fakturamodtager;
    private ArrayList<Fakturalinjer> fakturaLinjer;
    private double subtotal;
    private double mums;

    public Faktura(int Fakturanr,InvoiceParticipant fakturaudsteder, InvoiceParticipant fakturamodtager) {
        this.Fakturanr = Fakturanr;
        this.fakturaudsteder = fakturaudsteder;
        this.fakturamodtager = fakturamodtager;

        this.fakturaLinjer = new ArrayList<>();

    }



    public Date getFakturadato() {
        return Fakturadato;
    }

    public int getFakturanr() {
        return Fakturanr;
    }

    public Date getForfaldsdato() {
        return Forfaldsdato;
    }

    public void setFakturadato(Date fakturadato) {
        Fakturadato = fakturadato;
    }

    public void setFakturanr(int fakturanr) {
        Fakturanr = fakturanr;
    }

    public void setForfaldsdato(Date forfaldsdato) {
        Forfaldsdato = forfaldsdato;
    }

    public void tilføjFakturaLinje(Fakturalinjer fakturaLinje) {
        fakturaLinjer.add(fakturaLinje);

    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public double moms() {
        double mums = subtotal * 0.25;
        return mums;
    }

    public double Fakturatotal() {
        double subtotal1 = subtotal + mums;
        return subtotal1;

    }

    @Override
    public String toString() {
        return "Faktura{" +
                "Fakturanr=" + Fakturanr +
                ", Fakturadato=" + Fakturadato +
                ", Forfaldsdato=" + Forfaldsdato +
                ", fakturaudsteder=" + fakturaudsteder +
                ", fakturamodtager=" + fakturamodtager +
                ", fakturaLinjer=" + fakturaLinjer +
                ", subtotal=" + subtotal +
                ", mums=" + mums +
                '}';
    }
}
