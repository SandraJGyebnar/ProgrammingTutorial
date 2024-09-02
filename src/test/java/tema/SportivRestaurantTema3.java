package tema;

import java.util.List;

public class SportivRestaurantTema3 {

    public String nume;
    public String prenume;
    public String sport;
    public List<String> feluriDeMancare;
    public int pretPranz;
    public int pretFinal;

    public SportivRestaurantTema3(String nume, String prenume, String sport, List<String> feluriDeMancare, int pretPranz) {
        this.nume = nume;
        this.prenume = prenume;
        this.sport = sport;
        this.feluriDeMancare = feluriDeMancare;
        this.pretPranz = pretPranz;
    }

    public void prezentareSportivRestaurant() {
        System.out.println("Numele sportivului este " + nume + ".");
        System.out.println("Prenumele sportivului este " + prenume + ".");
        System.out.println("Sportul pe care il practica este" + sport + ".");
        System.out.println("Sportivul mananca:  " + feluriDeMancare + ".");
        for (int index = 0; index < feluriDeMancare.size(); index++) {
            System.out.println(feluriDeMancare.get(index));
        }
        System.out.println("Pretul pranzului este " + pretPranz);
    }

    //determinam pretul standard si pretul final in functie de ce comanda sportivul

    public void calculPret(){
        if (pretPranz != 0){
            System.out.println("Pretul de pornire al meniului este " + pretPranz);
        }
        if (feluriDeMancare.isEmpty()){
            System.out.println("Sportivul nu isi comanda mancare.");
        }
        else{
            int pranz=0;
            for (int index=0; index<feluriDeMancare.size(); index++){
                switch (feluriDeMancare.get(index)){
                    case "FelulI":
                        pranz=pretPranz;
                        break;
                    case "FelulII":
                        pranz=pretPranz+25;
                        break;
                    case "Desert":
                        pranz=pretPranz+15;
                        break;
                }

            }
            System.out.println("Pretul Final este: " + pretPranz);
            pretFinal=pretPranz + pranz;
            System.out.println("Pretul este: "+ pretFinal);


        }
    }


}
