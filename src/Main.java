import entities.Dipendente;


public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("088755", 23000, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("088655", 45000, Dipendente.Dipartimento.VENDITE);
        Dipendente dipendente3 = new Dipendente("088955", 230000, Dipendente.Dipartimento.AMMINISTRAZIONE);

        System.out.println(dipendente1);
        System.out.println(dipendente2);
        System.out.println(dipendente3);

    }
}