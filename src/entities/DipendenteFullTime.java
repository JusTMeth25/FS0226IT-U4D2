package entities;

import exceptions.DatiDipendenteNonValidiException;

public class DipendenteFullTime extends Dipendente {
    private int anniAnzianita;

    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, int anniAnzianita) {
        super(matricola, stipendio, dipartimento);
        this.anniAnzianita = anniAnzianita;
    }

    @Override
    public double calcolaStipendio() {
      return getStipendio() + (getStipendio() * 0.02 * anniAnzianita);
    }
}
