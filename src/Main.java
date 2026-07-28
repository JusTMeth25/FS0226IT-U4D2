import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;


public class Main {
    public static void main(String[] args) {
        System.out.println("***********Esercizio 1***********");
        Dipendente dipendente1 = new Dipendente("088755", 23000, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("088655", 45000, Dipendente.Dipartimento.VENDITE);
        Dipendente dipendente3 = new Dipendente("088955", 230000, Dipendente.Dipartimento.AMMINISTRAZIONE);

        System.out.println(dipendente1);
        System.out.println(dipendente2);
        System.out.println(dipendente3);


        System.out.println("***********Esercizio 2 ***********");
        DipendenteFullTime dipendente4 = new DipendenteFullTime("088355", 34000, Dipendente.Dipartimento.VENDITE, 10);
        DipendentePartTime dipendente5 = new DipendentePartTime("088255", 55000, Dipendente.Dipartimento.AMMINISTRAZIONE, 300, 175.5);
        Dirigente dirigente = new Dirigente("00100", 340000, Dipendente.Dipartimento.AMMINISTRAZIONE, 200);

        System.out.println("Calcolo stipendio di un dipendente full-time: " + dipendente4.calcolaStipendio());
        System.out.println("Calcolo stipendio di un dipendente part-time: " + dipendente5.calcolaStipendio());
        System.out.println("Calcolo stipendio di un dirigente: " + dirigente.calcolaStipendio());


    }
}