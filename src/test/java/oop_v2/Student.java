package oop_v2;

public class Student extends Persoana {
    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String sex, String adresa, String faculta, String domeniu, int an, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
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
