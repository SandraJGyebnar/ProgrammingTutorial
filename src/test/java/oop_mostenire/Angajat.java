package oop_mostenire;

public class Angajat extends Persoana {

    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    public Angajat(String nume, String prenume, int varsta, String sex,
                   String adresa, String firma, String pozitie, int salar, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salar = salar;
        this.experienta = experienta;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este " + firma);
        System.out.println("Pozitia angajatului in firma este " + pozitie);
        System.out.println("Salarul angajatului este " + salar);
        System.out.println("Experienta angajatului este de " + experienta);
    }



    public void mananca(){
        super.mananca();
        System.out.println("Angajatul mananca cand are pauza.");
    }

    //polimorfism static

    public void marire(){
        System.out.println("Angajatul primeste marirea anuala standard");
    }

    public void marire(int procent){
        System.out.println("Angajatul primeste marirea anuala de " + procent + "%");
    }

    public void marire(String grad){
        System.out.println("Angajatul primeste gradul " + grad);
    }

    public void marire(String grad, int procent){
        System.out.println("Angajatul primeste gradul " + grad + "procentul de" + procent);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }
}
