package oop_mostenire;

public class SportivStudent extends Persoana implements SportivInterface,StudentInterface{

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

    public SportivStudent(String nume, String prenume, int varsta, String sex, String adresa, String faculta, String domeniu,
                          int an, boolean bursa, boolean restante, String sport, boolean sportEchipa, int experienta1, boolean performanta, int medali) {
        super(nume, prenume, varsta, sex, adresa);
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
