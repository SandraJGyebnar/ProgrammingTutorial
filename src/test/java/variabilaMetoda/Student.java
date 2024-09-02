package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //o clasa este ca un sablon, care defineste un anumit comportament in functie de ceea ce discutam de exemplu "Student"
    //Exemplu Stundet: Nume, Prenume, fete, baieti, cod numeric personal, facultate etc - PROPRIETATI
    //VALORIILE Proprietatiilor ii diferentiaza
    //descrierea studentului se face intre cele 2 acolade

    // in functie de fisier Comentariul se noteaza altfel
    //acesta este un comentariu

    //DEFINITII

    //CLASA:este un SABLON care defineste comportamentul unei entitati din viata reala
    //Intr-un fisier JAVA recunoastem o clasa dupa cuvantul cheie "class"
    //Este Obligatoriu ca o clasa sa aiba NUME
    //Intr-un fisier JAVA putem avea mai multe Classe diferentiate prin numele acestora (!!!nu se face asa ceva niciodata)
    //O clasa contine VARIABILE SI METODE
    //variabila = proprietatea unei clase
    //variabila este de doua feluri: globala si locala
    //variabila globala = variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    //variabila locala = variabila pe care o definesti intr-o metoda ce are vizibilitate doar in metoda respectiva
    //variabila globala trebuie sa contina un excess control (public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpusstore

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //metoda = actiunea unei clase
    //o clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //metodele pot sa fie de doua feluri: void si return
    //o metoda cu void are ca rol sa execute actiunea si s-o afiseze
    //o metoda cu void trebuie sa contina: access control (public) void numeMetoda () {}

    @Test

    public void prezentareStudent() {
        nume = "Gyebnar";
        prenume = "Sandra";
        varsta = 28;
        inaltime = 1.60;
        greutate = 56.8f;
        adresa = "Sacalaz,449";
        sex = 'f';


        //CONCATENARE = lipirea a unui sau mai multe stringuri
        //print = afisaeaza valoarea si ramane pe randul curent
        //println = afiseaza valoarea si sare la randul 2

        //System.out.print(nume+ " ");
        System.out.println("Numele Studentului este" + " " + nume + ".");
        System.out.println("Prenumele Studentului este" + " " + prenume + ".");
        System.out.println("Varsta Studentului este" + " " + varsta);
        System.out.println("Inaltimea Studentului este" + " " + inaltime);
        System.out.println("Greutatea Studentului este" + " " + greutate);
        System.out.println("Adresa Studentului este" + " " + adresa);
        System.out.println("Studentul are restante?" + " " + areRestante);
        System.out.println(prenume + " ");
        System.out.println(nume + prenume);
        System.out.println(nume + " " + prenume + " " + varsta + " " + adresa);
    }

}
