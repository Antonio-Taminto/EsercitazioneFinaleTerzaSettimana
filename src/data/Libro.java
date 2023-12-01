package data;

public abstract class Libro{
    private String titolo;
    private String autore;
    private int annoPublicazione;
    protected int usi;
    private StatoLibroEnum disponibilita;


    public Libro(String titolo,String autore,int annoPublicazione){
        this.titolo = titolo;
        this.autore = autore;
        this.annoPublicazione =annoPublicazione;
        disponibilita = StatoLibroEnum.DISPONIBILE;
        usi = 0;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    public StatoLibroEnum getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(StatoLibroEnum disponibilita) {
        this.disponibilita = disponibilita;
    }

    public int getUsi() {
        return usi;
    }

    public void setUsi(int usi) {
        this.usi = usi;
    }


}
