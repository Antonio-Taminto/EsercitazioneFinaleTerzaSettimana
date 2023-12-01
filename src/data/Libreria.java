package data;

public class Libreria{
    private int libri;
    private Libro[] libroArray;

    public Libreria(int maxlibri) {
        libroArray = new Libro[maxlibri];
        libri = 0;
    }
    public Libro[] getLibroArray() {
        return libroArray;
    }

    public void setLibroArray(Libro[] libroArray) {
        this.libroArray = libroArray;
    }

    public int getLibri() {
        return libri;
    }
    public void setLibri(int libri) {
        this.libri = libri;
    }
    public void aggiungiLibro(Libro libro){
        if(libri< libroArray.length) {
            libroArray[libri] = libro;
            libri++;
        }else{
            System.out.println("la libreria è piena");
        }

    }
    public void prestaLibro(Libro libro) {
        boolean nonPresente = true;
            for (int i = 0; i < libri; i++) {
                if (libro.getTitolo().equals(libroArray[i].getTitolo())) {
                    if (libro.getDisponibilita() == StatoLibroEnum.DISPONIBILE) {
                        System.out.println("ecco il libro");
                        libro.setDisponibilita(StatoLibroEnum.NONDISPONIBILE);
                        nonPresente = false;
                    } else {
                        System.out.println("libro non disponibile");
                        nonPresente = false;
                    }
                    break;
                }

            }
            if(nonPresente){
                System.out.println("libro non presente in libreria");
            }
    }
    public void restituisciLibro(Libro libro) {
        libro.setDisponibilita(StatoLibroEnum.DISPONIBILE);
        libro.setUsi(+1);
        //una volta restituito controlliamo se è neccessario un restauro del libro
        if (libro.getUsi() > 2) {
            libro.setDisponibilita(StatoLibroEnum.INRESTAURO);
            System.out.println("necessario restauro del libro");
        }
    }

    public void restauroLibro (Libro libro) {
        if (libro.getDisponibilita() == StatoLibroEnum.INRESTAURO) {
            System.out.println("libro restaurato");
            libro.setDisponibilita(StatoLibroEnum.DISPONIBILE);
            libro.setUsi(0);
        }
    }
    public void listaLibri(){
        for(int i = 0; i < libri; i++){
            System.out.println(libroArray[i].getTitolo());
        }
    }

    public void stessoAutore(String autore){
        String autoreUguale = null;
        for(int i = 0; i < libri; i++) {
            if (autore == libroArray[i].getAutore()) {
                autoreUguale = libroArray[i].getTitolo();
                System.out.println(libroArray[i].getTitolo());
            }
        }
    }

    public String getLibro(String titolo){
        String check = "non presente";
        for(int i = 0; i < libri; i++) {
            if (titolo == libroArray[i].getTitolo()) {
                check = "è presente";
            }
        }
        return check;
    }

    public void stessoAnnoPublicazione(int anno){
        String stessoAnno = null;
        for(int i = 0; i < libri; i++) {
            if (anno == libroArray[i].getAnnoPublicazione()) {
                stessoAnno = libroArray[i].getTitolo();
                System.out.println(libroArray[i].getTitolo());
            }
        }

    }


}
