package oop_v2;

public class Angajat extends Persoana{
    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    public Angajat(String nume, String prenume, int varsta, String sex, String adresa,
                   String firma, String pozitie, int salar, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salar = salar;
        this.experienta = experienta;
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
