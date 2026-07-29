package entities;
import exceptions.DatiDipendenteNonValidiException;
import interfaces.CheckIn;

public abstract class Dipendente implements CheckIn {
    private final String matricola;
    private final double stipendio;
    private Dipartimento dipartimento;

    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        if (stipendio <= 0 || matricola == null || matricola == " ") throw new DatiDipendenteNonValidiException("Ehhh voleeeevi!!");
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calcolaStipendio();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + this.matricola + '\'' +
                ", stipendio=" + this.stipendio +
                ", dipartimento=" + this.dipartimento +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println("Il dipendente: " + getMatricola() + " " + "inizia il turno alle ore: 08.00");
    }
}

