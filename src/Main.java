import data.*;

public class Main {
    public static void main(String[] args) {

        Libro romanzo1 = new Romanzo("Guerra e pace","Lev Nikolaevic Tolstoj",1867,1400);
        Libro fantasy1 = new Fantasy("Signore degli anelli","John R. R. Tolkien",1954);
        Libro storia1 = new Storia("Seconda guerra mondiale","Mario Rossi",1946);


        Libreria libreria1 = new Libreria(20);

        libreria1.aggiungiLibro(romanzo1);
        libreria1.aggiungiLibro(fantasy1);
        libreria1.aggiungiLibro(storia1);







    }
}