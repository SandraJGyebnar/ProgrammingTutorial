package oop_v1;

public class AngajatSportiv extends Persoana implements AngajatInterface,SportivInterface{
    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    private String sport;
    private boolean sportEchipa;
    private int experienta1;
    private boolean performanta;
    private int medali;

    public AngajatSportiv(String nume, String prenume, int varsta, String sex, String adresa, String firma, String pozitie,
                          int salar, String experienta, String sport, boolean sportEchipa, int experienta1, boolean performanta, int medali) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salar = salar;
        this.experienta = experienta;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta1 = experienta1;
        this.performanta = performanta;
        this.medali = medali;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConduita() {

    }

    @Override
    public void seAntreneaza() {

    }

    @Override
    public void nuLipsesteDeLaAntrenament() {

    }

    @Override
    public void manancaSanatos() {

    }

    @Override
    public void iaSuplimente() {

    }
}
