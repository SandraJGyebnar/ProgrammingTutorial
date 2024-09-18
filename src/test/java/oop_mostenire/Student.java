package oop_mostenire;

public class Student extends Persoana{

    private String faculta;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String sex, String adresa,
                   String faculta, String domeniu, boolean bursa, int an, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.faculta = faculta;
        this.domeniu = domeniu;
        this.bursa = bursa;
        this.an = an;
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
}
