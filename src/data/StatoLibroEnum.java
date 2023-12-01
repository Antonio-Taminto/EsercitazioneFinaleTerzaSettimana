package data;

public enum StatoLibroEnum {
    DISPONIBILE("Il libro è disponibile"),

    NONDISPONIBILE("Il libro non è disponibile"),
    INRESTAURO("Il libro non è disponibile per restauro");


    private String disponibilita;

    StatoLibroEnum(String disponibilita){
        this.disponibilita = disponibilita;
    }

    public String getDisponibilita() {
        return disponibilita;
    }
}
