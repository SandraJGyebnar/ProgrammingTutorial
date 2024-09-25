package oop_v1;

public class Student extends Persoana implements StudentInterface{

    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String sex,
                   String adresa, String faculta, String domeniu,
                   int an, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.faculta = faculta;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea la care studiaza este " + faculta);
        System.out.println("Domeniul pe care il studiaza este " + domeniu);
        System.out.println("Este bursier? " + bursa);
        System.out.println("In ce an este studentul? " + an);
        System.out.println("Are restante? " + restante);

    }

    public void mananca(){
        System.out.println("Studentul mananca in pauza.");
    }

    public String getFaculta() {
        return faculta;
    }

    public void setFaculta(String faculta) {
        this.faculta = faculta;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public boolean isRestante() {
        return restante;
    }

    public void setRestante(boolean restante) {
        this.restante = restante;
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul trebuie sa mearga la cursuri.");
    }

    @Override
    public void trebuieSaInvata() {
        System.out.println("Studentul trebuie sa invete.");

    }

    @Override
    public void saNuMeargaInRestanta() {
        System.out.println("Studentul nu trebuie sa mearga in restante.");

    }

    @Override
    public void saStieSaCopieeze() {
        System.out.println("Studentul trebuie sa stie sa copieze");

    }
}
