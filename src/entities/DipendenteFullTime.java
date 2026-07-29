package entities;

import exceptions.DatiDipendenteNonValidiException;

public class DipendenteFullTime extends Dipendente {
    private int anniAnzianita;

    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, int anniAnzianita) {
        super(matricola, stipendio, dipartimento);
        if (stipendio <= 0 || matricola == null || matricola == " ") throw new DatiDipendenteNonValidiException("Ehhh voleeeevi!!");
        this.anniAnzianita = anniAnzianita;
    }

    @Override
    public double calcolaStipendio() {
      return getStipendio() + (getStipendio() * 0.02 * anniAnzianita);
    }
}
