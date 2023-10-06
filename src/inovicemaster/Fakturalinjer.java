package inovicemaster;

public class Fakturalinjer {
    private String beskrivelse;
    private int antal;
    private String enhed;
    private double pris;


    public Fakturalinjer(String beskrivelse, int antal, String enhed, double pris) {
        this.beskrivelse = beskrivelse;
        this.antal = antal;
        this.enhed = enhed;
        this.pris = pris;
    }

    public double getBeløb() {
        return antal * pris;
    }

    @Override
    public String toString() {
        return "Fakturalinjer{" +
                "beskrivelse='" + beskrivelse + '\'' +
                ", antal=" + antal +
                ", enhed='" + enhed + '\'' +
                ", pris=" + pris +
                '}';
    }
}
