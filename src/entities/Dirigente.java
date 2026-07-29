package entities;

import exceptions.DatiDipendenteNonValidiException;

public class Dirigente extends Dipendente {
    private int numeroDipendentiGestiti;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, int numeroDipendentiGestiti) {
        super(matricola, stipendio, dipartimento);
        this.numeroDipendentiGestiti = numeroDipendentiGestiti;
    }
    @Override
    public double calcolaStipendio() {
        return getStipendio() + numeroDipendentiGestiti * 20.0;
    }
}
