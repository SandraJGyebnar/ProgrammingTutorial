package oop_v1;

public class AngajatSportivStudent extends Persoana implements AngajatInterface,StudentInterface,SportivInterface {
    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;
    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;
    private String sport;
    private boolean sportEchipa;
    private int experienta1;
    private boolean performanta;
    private int medali;

    public AngajatSportivStudent(String nume, String prenume, int varsta, String sex, String adresa, String firma,
                                 String pozitie, int salar, String experienta, String faculta, String domeniu, int an,
                                 boolean bursa, boolean restante, String sport, boolean sportEchipa, int experienta1, boolean performanta, int medali) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salar = salar;
        this.experienta = experienta;
        this.faculta = faculta;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
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
