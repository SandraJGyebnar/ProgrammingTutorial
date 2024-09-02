package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //multimi: array, list, set, map

    @Test
    public void metodaTest() {

        //cursantiArray();
        // cursantiList();
        //  listaMasimi();
        // mapExample();
        //tariOrase();
        retetaSupaDePui();

    }

    //afisam cursantii de la cursul de automation

    public void cursantiArray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Sandra";
        cursanti[1] = "Cristina";
        cursanti[2] = "Magda";
        cursanti[3] = "Radu";
        cursanti[4] = "Razvan";
        cursanti[5] = "Andrei";

        for (int index = 0; index <= cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);
        }
    }

    //v2-list

    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();

        cursanti.add("Sandra");
        cursanti.add("Cristina");
        cursanti.add("Magda");
        cursanti.add("Radu");
        cursanti.add("Razvan");
        cursanti.add("Andrei");

        for (int index = 0; index <= cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));

        }
    }

    //afisam o multime de masini

    public void listaMasimi() {
        List<String> masini = new ArrayList<>();
        masini.add("Dacia");
        masini.add("Audi");
        masini.add("Porsche");
        masini.add("BMW");
        masini.add("Ford");
        masini.add("Opel");

        for (int index = 0; index <= masini.size(); index++) {

            if (index % 2 != 1) {
                System.out.println("Numele masinii este " + masini.get(index));
            }

        }
    }

    //map: key=value
    //parcurgerea se face pe baza cheiilor (folosind un set)

    public void mapExample() {
        Map<String, String> elemente = new HashMap<>();
        elemente.put("Masina", "Nissan");
        elemente.put("Telefon", "Samsung");
        elemente.put("Persoana", "Rares");

        for (String key : elemente.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + elemente.get(key));
        }
    }

    //afisam o tara cu diferite orase

    public void tariOrase() {

        Map<String, List<String>> obiecte = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Timisoara", "Oradea");
        List<String> oraseItalia = Arrays.asList("Roma", "Napoli", "Venice");
        List<String> oraseGermania = Arrays.asList("Berlin", "Frankfurt", "Munich");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Germania", oraseGermania);

        for (String key : obiecte.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + obiecte.get(key));
        }

    }

    //ingriedente pentru retete, pentru supa de pui

    public void retetaSupaDePui() {

        Map<String, List<String>> ingriendente = new HashMap<>();
        List<String> ingriedienteSupa = Arrays.asList("Morcovi", "Ceapa", "Telina", "Patrunjel", "Pui", "Apa");
        List<String> ingriedientePilaf = Arrays.asList("Orez", "morcovi", "Ceapa", "apa");
        List<String> ingriedienteClatite = Arrays.asList("Faina", "Apa", "apa");

        ingriendente.put("supaPui", ingriedienteSupa);
        ingriendente.put("Pilaf", ingriedientePilaf);
        ingriendente.put("Clatite", ingriedienteClatite);

        for (String key : ingriendente.keySet()) {
            System.out.println("Reteta este " + key);
            System.out.println("Ingriedientele sunt " + ingriendente.get(key));
        }

    }
}


