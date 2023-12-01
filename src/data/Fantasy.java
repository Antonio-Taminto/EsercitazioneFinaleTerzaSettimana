package data;

public class Fantasy extends Libro implements Prezzo {
    protected int usi;
    public Fantasy(String titolo,String autore, int annoPublicazione) {
        super(titolo, autore, annoPublicazione);
        usi = 0;
    }

    public int getUsi() {
        return usi;
    }

    public void setUsi(int usi) {
        this.usi = usi;
    }


    @Override
    public double prezzo() {
        double prezzo;
        if (getAnnoPublicazione()>1900){
            prezzo = 10;
        }else{
            prezzo = 15;
        }
        return prezzo;
    }

}
