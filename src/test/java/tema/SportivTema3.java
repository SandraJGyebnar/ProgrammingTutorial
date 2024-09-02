package tema;

import java.util.List;

public class SportivTema3 {

    public String nume;
    public String prenume;
    public int varsta;
    public String tara;
    public List<String> caracterisitci;
    public String sport;
    public String echipa;
    public String pozitieTeren;
    public int goluriMarcate2024;
    public int goluriMarcateTotal;
    public int pretSportiv;
    public int pretPranz;

    public SportivTema3(String nume, String prenume, int varsta, List<String> caracterisitici, String tara,
                        String echipa, String sport, String pozitieTeren, int goluriMarcate2024, int goluriMarcateTotal) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.caracterisitci = caracterisitici;
        this.tara = tara;
        this.echipa = echipa;
        this.sport = sport;
        this.pozitieTeren = pozitieTeren;
        this.goluriMarcate2024 = goluriMarcate2024;
        this.goluriMarcateTotal = goluriMarcateTotal;
    }

    public SportivTema3(String nume, String prenume, int varsta, String tara, List<String> caracterisitci, String sport,
                        String echipa, String pozitieTeren, int goluriMarcate2024, int goluriMarcateTotal, int pretSportiv) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.tara = tara;
        this.caracterisitci = caracterisitci;
        this.sport = sport;
        this.echipa = echipa;
        this.pozitieTeren = pozitieTeren;
        this.goluriMarcate2024 = goluriMarcate2024;
        this.goluriMarcateTotal = goluriMarcateTotal;
        this.pretSportiv = pretSportiv;
    }

    public SportivTema3(String nume, int pretPranz, String prenume, int varsta, String tara, List<String> caracterisitci, String sport, String pozitieTeren,
                        String echipa, int goluriMarcate2024, int goluriMarcateTotal, int pretSportiv) {
        this.nume = nume;
        this.pretPranz = pretPranz;
        this.prenume = prenume;
        this.varsta = varsta;
        this.tara = tara;
        this.caracterisitci = caracterisitci;
        this.sport = sport;
        this.pozitieTeren = pozitieTeren;
        this.echipa = echipa;
        this.goluriMarcate2024 = goluriMarcate2024;
        this.goluriMarcateTotal = goluriMarcateTotal;
        this.pretSportiv = pretSportiv;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este " + nume + ".");
        System.out.println("Prenumele sportivului este " + prenume + ".");
        System.out.println("Varsta sportivului este " + varsta + " ani.");
        System.out.println("Caracteristicele sportivului sunt: " + caracterisitci + ".");
        for (int index = 0; index < caracterisitci.size(); index++) {
            System.out.println(caracterisitci.get(index));
        }
        System.out.println("Sportivul este din " + tara + ".");
        System.out.println("Sportul pe care il practica este " + sport + ".");
        System.out.println("Sportivul face parte din echipa " + echipa + ".");
        System.out.println("Pozitia sportivului pe teren este de " + pozitieTeren + ".");
        System.out.println("Goluri marcare in anul 2024: " + goluriMarcate2024 + ".");
        System.out.println("Goluri totale marcate: " + goluriMarcateTotal + ".");
        if (pretSportiv > 0) {
            System.out.println("Pretul sportivului este: " + pretSportiv + " euro.");
        }

    }

    //calculam pretul preanzului
    //felul I 20 lei -
    //felul II 25 lei
    //desert III 15 lei

    public void calculPretPranz() {
        if (pretPranz == 15) {
            System.out.println("Sportivul mananca doar desert, pretul pranzului este 15 lei.");
        } else if (pretPranz >= 20 && pretPranz <= 45) {
            System.out.println("Sportivul mananca felul I si felul II, iar pretul pranzului este 45 lei.");
        } else if (pretPranz >= 35) {
            System.out.println("Sportivul mananca felul I si desert, iar pretul pranzului este 35 lei.");
        } else if (pretPranz > 45) {
            System.out.println("Sportivul mananca toate cele 3 feluri de mancare, iar pretul este 50 lei.");
        }

        //calculam pretul pranzului
        //pret standard 35 lei

    }

}



