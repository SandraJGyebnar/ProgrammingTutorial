package obiectConstructor;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.List;

public class Masina {

    // un constructor = are ca rol sa intializeze variabilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constructori care se diferentiaza prin numarul/tipul de parametri
    //o clasa contine intotdeuna un constructor DEFAULT (Nu are parametri)
    //exista 2 tipuri de constructori cu parametrii si fara parametri

    //Obiect = instanta unei clase
    //dintr-o clasa putem sa definim mai multe obiecte care sa aiba valori diferite pentru proprietati
    //in momentul cand avem un obiect de tipul unei clase putem accesa variabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantu cheie "new"
    // structura: tipObiect numeObiect = new tipObiect()(Masina Dacia = new Masina(); )

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;


    public Masina(String marca, int an, String model, String culoare, List<String> dotariInterioare, String motorizare) {
        this.marca = marca;
        this.an = an;
        this.model = model;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Anul masinii este " + an);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Dotarile interioase sunt: " );
        for (int index=0; index<dotariInterioare.size();index++){
        System.out.println(dotariInterioare.get(index));
        }
        System.out.println("Motorizare: " + motorizare);

    }


    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    //determinam depozitul in functie de anul de fabricatie

    //1. < 2000 = 500 Ron
    //2. 2005<2015 = 300 Ron
    //3. >=2000 = 100 Ron


    public void calculImpozit(){

        if (an<=2000){
            System.out.println("Impozitul pe masina este 500 ron");
        }
        else if (an>=2005 && an<=2015){
            System.out.println("Impozitul este 300ron");
        }
        else if (an>=2020){
            System.out.println("Impozitul este 100 ron");
        }

    }

    //determinam pretul standard si pretul final in functie de dotari
    public void calculPret(){
        if (pret!=0){
            System.out.println("Pretul de pornire este: " + pret);
        }
        if (dotariInterioare.isEmpty()){
                System.out.println("Pretul final este" + pret);


        }
        else {
            int dotari = 0;
            for (int i=0;i<dotariInterioare.size();i++){
                switch (dotariInterioare.get(i)){
                    case "Aer Conditionat":
                    dotari=pret+1000;
                        break;
                    case "Geamuri electrice":
                    dotari=pret+2000;
                        break;
                    case "Airbag":
                    dotari=pret+4000;
                    break;
                    case "Navigatie":
                    dotari=pret+1200;
                    break;
                }


            }
            System.out.println("Pretul dotarilor este este:" + dotari);
            pretFinal=pret+dotari;
            System.out.println("Pret final este: " + pretFinal);
        }


    }
    public void calculReducere(int procentReducere){
        pretFinal=((100*procentReducere)*pretFinal)/100;
//        int reducere = (pretFinal*procentReducere)/100;
//        pretFinal=pretFinal-reducere;
        System.out.println("S-a aplicat o reducere de " + procentReducere + " % din pretul final.");
        System.out.println("Pretul final cu reducere este: " +pretFinal);




    }
}
