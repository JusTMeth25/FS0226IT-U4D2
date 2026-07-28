package entities;

public class DipendentePartTime extends Dipendente {
    private int oreContratto;
    private double tariffaOraria;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, int oreContratto, double tariffaOraria) {
        super(matricola, stipendio, dipartimento);
        this.oreContratto = oreContratto;
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public double calcolaStipendio() {
        return oreContratto * tariffaOraria;
    }
}

