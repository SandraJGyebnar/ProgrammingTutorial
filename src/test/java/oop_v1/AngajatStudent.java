package oop_v1;

public class AngajatStudent extends Persoana implements AngajatInterface,StudentInterface {
    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public AngajatStudent(String nume, String prenume, int varsta, String sex, String adresa, String firma,
                          String pozitie, int salar, String experienta, String faculta, String domeniu, int an, boolean bursa, boolean restante) {
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
