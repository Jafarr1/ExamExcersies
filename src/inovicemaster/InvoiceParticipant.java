package inovicemaster;

public class InvoiceParticipant {
    private String name;
    private String adress;

    public InvoiceParticipant(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "InvoiceParticipant{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

