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


    public void setForfaldsdato(Date forfaldsdato) {
        Forfaldsdato = forfaldsdato;
    }

    public void tilføjFakturaLinje(Fakturalinjer fakturaLinje) {
        fakturaLinjer.add(fakturaLinje);

    }

    public double getSubtotal() {
        subtotal = 0;
        for (int i = 0; i < fakturaLinjer.size(); i++) {
            subtotal += fakturaLinjer.get(i).getBeløb();

        }

        return subtotal;
    }


    public double getMoms() {
      return getSubtotal()* 0.25;
    }

    public double getFakturatotal() {
        double subtotal1 = subtotal + getMoms();
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
                ", subtotal=" + getSubtotal() +
                ", mums=" + getMoms() +
                '}';
    }
}

