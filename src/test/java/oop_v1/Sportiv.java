package oop_v1;

public class Sportiv extends Persoana implements SportivInterface{

    private String sport;
    private boolean sportEchipa;
    private int experienta1;
    private boolean performanta;
    private int medali;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa,
                   String sport, boolean sportEchipa, int experienta, int medali, boolean performanta) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta1 = experienta;
        this.medali = medali;
        this.performanta = performanta;
    }

    public void infoSportiv(){
        infoPersoana();
        System.out.println("Sportul pe care il practica este " + sport);
        System.out.println("Sportivul face parte dintr-o echipa?  " + sportEchipa);
        System.out.println("De cati ani practica sportul? " + experienta1);
        System.out.println(" Practica sport de performanta? " + performanta );
        System.out.println("Cate medalii a castigat sportivul " + medali);
    }

    public void mananca(){
        System.out.println("Sportivul mananca dupa antrenament");
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public int getExperienta() {
        return experienta1;
    }

    public void setExperienta(int experienta) {
        this.experienta1 = experienta;
    }

    public boolean isPerformanta() {
        return performanta;
    }

    public void setPerformanta(boolean performanta) {
        this.performanta = performanta;
    }

    public int getMedali() {
        return medali;
    }

    public void setMedali(int medali) {
        this.medali = medali;
    }

    @Override
    public void seAntreneaza() {
        System.out.println("Sportivul Se antreneaza zilnic");

    }

    @Override
    public void nuLipsesteDeLaAntrenament() {
        System.out.println("Sportivul nu lipseste de la antrenament.");

    }

    @Override
    public void manancaSanatos() {
        System.out.println("Sportivul mananca sanatos");

    }

    @Override
    public void iaSuplimente() {
        System.out.println("Sportivul ia suplimente");

    }
}

