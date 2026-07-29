import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;
import entities.Volontario;
import interfaces.CheckIn;


public class Main {
    public static void main(String[] args) {
//        System.out.println("***********Esercizio 1***********");
////        Dipendente dipendente1 = new Dipendente("088755", 23000, Dipendente.Dipartimento.PRODUZIONE);
////        Dipendente dipendente2 = new Dipendente("088655", 45000, Dipendente.Dipartimento.VENDITE);
////        Dipendente dipendente3 = new Dipendente("088955", 230000, Dipendente.Dipartimento.AMMINISTRAZIONE);
//
//        System.out.println(dipendente1);
//        System.out.println(dipendente2);
//        System.out.println(dipendente3);
//
//
//        System.out.println("***********Esercizio 2 ***********");
//        DipendenteFullTime dipendente4 = new DipendenteFullTime("088355", 34000, Dipendente.Dipartimento.VENDITE, 10);
//        DipendentePartTime dipendente5 = new DipendentePartTime("088255", 55000, Dipendente.Dipartimento.AMMINISTRAZIONE, 300, 175.5);
//        Dirigente dirigente = new Dirigente("00100", 340000, Dipendente.Dipartimento.AMMINISTRAZIONE, 200);
//
//        System.out.println("Calcolo stipendio di un dipendente full-time: " + dipendente4.calcolaStipendio());
//        System.out.println("Calcolo stipendio di un dipendente part-time: " + dipendente5.calcolaStipendio());
//        System.out.println("Calcolo stipendio di un dirigente: " + dirigente.calcolaStipendio());

        Dipendente [] dipendenti = {new DipendenteFullTime("088355", 34000, Dipendente.Dipartimento.VENDITE, 10), new DipendentePartTime("088255", 55000, Dipendente.Dipartimento.AMMINISTRAZIONE, 500, 175.5), new Dirigente("00100", 340000, Dipendente.Dipartimento.AMMINISTRAZIONE, 200)};

        double totale = 0;
        for (Dipendente dipendente: dipendenti) {
            System.out.println(dipendente.getMatricola());
            System.out.println(dipendente.calcolaStipendio());
           totale = totale + dipendente.calcolaStipendio();
        }

        System.out.println("Totale degli stipendi di tutti i dipendenti e': " + totale);

        CheckIn [] checkIns = {new DipendenteFullTime("02333", 19000, Dipendente.Dipartimento.VENDITE, 2), new DipendentePartTime("01223", 21000, Dipendente.Dipartimento.PRODUZIONE, 230, 200), new Dirigente("1111", 89000, Dipendente.Dipartimento.AMMINISTRAZIONE, 25), new Volontario("Mario", 25, "FullStack Coder") };

        for (CheckIn checkIn: checkIns ) {
           checkIn.checkIn();
        }
    }
}