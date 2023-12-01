package data;

import data.Libro;
import data.Prezzo;

public class Romanzo extends Libro implements Prezzo {
    private final int pagine;
    public Romanzo(String titolo,String autore, int annoPublicazione,int pagine) {
        super(titolo, autore, annoPublicazione);
        this.pagine = pagine;
    }
    int getPagine() {
        return pagine;
    }
    @Override
    public double prezzo() {
        double prezzo;
        if(pagine < 250){
            prezzo = 10;
        } else if (pagine < 350) {
            prezzo = 15;
        }else{
            prezzo = 20;
        }
        return prezzo;
    }

        }
