package obiectConstructor.hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public int numarEtaje;
    public boolean micDejun;
    public List<String> facilitati;
    public int pretPornire;

    public Hotel() {
        nume = "Imperial House";
        adresa = "Constanta";
        tara = "Romania";
        oras = "Constanta";
        stele = "*****";
        numarCamere = 40;
        numarEtaje = 4;
        micDejun = true;
        facilitati = Arrays.asList("SPA", "Sala de fitness", "Piscina", "Parking");
        pretPornire = 1000;
    }

    public void prezentareHotel() {

        System.out.println("Numele hotelului este " + nume);
        System.out.println("Adresa hotelului este" + adresa);
        System.out.println("Tara in care se afla este " + tara);
        System.out.println("Hotelul are " + stele + " stele.");
        System.out.println("Hotelul are " + numarCamere + " de camere");
        System.out.println("Hotelul are " + numarEtaje + " etaje.");


    }

    public void pretOferta(Map<String, String> oferta) {
        System.out.println("Pretul de pornire este: " + pretPornire);

        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //clientul are dorinta de a avea oferta cu valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 5) {
                    pretPornire = pretPornire + 800;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 1500;

                } else {
                    pretPornire = pretPornire + 2000;
                }
            }
        }

        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Perioada sedere")) {
                //clientul are dorinta de a avea oferta cu valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 7) {
                    pretPornire = pretPornire + 2000;
                }
                if (number > 7 && number < 15) {
                    pretPornire = pretPornire + 4000;

                } else {
                    pretPornire = pretPornire + 5000;


                }
            }
        }

        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Numar persoane")) {
                //clientul are dorinta de a avea oferta cu valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 7) {
                    pretPornire = pretPornire + 2000;
                }
                if (number > 7 && number < 15) {
                    pretPornire = pretPornire + 4000;

                } else {
                    pretPornire = pretPornire + 5000;


                }
            }
        }

        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Offseaseon")) {
                //clientul are dorinta de a avea oferta cu valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 7) {
                    pretPornire = pretPornire + 2000;
                }
                if (number > 7 && number < 15) {
                    pretPornire = pretPornire + 4000;

                } else {
                    pretPornire = pretPornire + 5000;


                }
            }
        }


    }
}