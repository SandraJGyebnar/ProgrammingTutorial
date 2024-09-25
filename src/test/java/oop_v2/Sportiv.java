package oop_v2;

public class Sportiv extends Persoana{
    private String sport;
    private boolean sportEchipa;
    private int experienta1;
    private boolean performanta;
    private int medali;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa, String sport, boolean sportEchipa, int experienta1, boolean performanta, int medali) {
        super(nume, prenume, varsta, sex, adresa);
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

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaInvata() {

    }

    @Override
    public void saNuMeargaInRestanta() {

    }

    @Override
    public void saStieSaCopieeze() {

    }
}
