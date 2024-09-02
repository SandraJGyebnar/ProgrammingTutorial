package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {

    @Test

    public void testMasinaMethod(){
//        Masina Dacia = new Masina("Dacia",1970,"Duster","verde",
//                Arrays.asList("Aer Conditionat","Geamuri electrice", "Airbag"),"Motorina");
//        Dacia.prezentareMasina();
//        Dacia.calculImpozit();
//        System.out.println();
//
//        Masina Audi = new Masina("Audi",2009,"A5","negru",
//                Arrays.asList("Aer Conditionat","Geamuri electrice", "Airbag","Navigatie"),"Motorina");
//        Audi.prezentareMasina();
//        Audi.calculImpozit();
//        System.out.println();

        //sa mai creeam cateva obiecte ca si tema

        Masina BMW = new Masina("BMW","x6",2026,"negru",
                Arrays.asList("Aer Conditionat","Geamuri electrice", "Airbag","Navigatie"),"Motorina",30000);
        BMW.prezentareMasina();
        BMW.calculImpozit();
        BMW.calculReducere(10);


        // Tema: sa definim un sportiv (din viata reala) (trei sportivi)



    }
}
