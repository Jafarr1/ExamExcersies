package inovicemaster;

public class Fakturaudsteder {
    private String virksomhed;
    private String email;
    private int cvr;
    private int momsNr;
    private int euMomsNr;


public Fakturaudsteder() {
    this.virksomhed = virksomhed;
    this.email = email;
    this.cvr = cvr;
    this.momsNr = momsNr;
    this.euMomsNr = euMomsNr;

}

    public String getEmail() {
        return email;
    }
    public String getVirksomhed() {
    return virksomhed;
    }

    public int getCvr() {
        return cvr;
    }

    public int getMomsNr() {
        return momsNr;
    }

    public int getEuMomsNr() {
        return euMomsNr;
    }
}
