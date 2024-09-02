package tema;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SportivTema3ObiecteTest {
    @Test

    public void testSportivMethod(){

        SportivTema3 Fotbalist = new SportivTema3("Bloj","Erwin",27, Arrays.asList("-Viteza","-Agilitate","-Rezistenta","-Forta"),
                "Romania","FK Miercirea Ciuc","Fotbal","RWB/LWB", 0, 0);
        Fotbalist.prezentareSportiv();
        System.out.println();

        SportivTema3 Baschetbalist = new SportivTema3("Stanescu","Virgil",47, Arrays.asList("-Viteza","-Saritura","-Aparare"),"Romania",
                "Steaua CSM","Baschet","Centru",15,120);
        Baschetbalist.prezentareSportiv();
        System.out.println();

        SportivTema3 Volleyballlist = new SportivTema3("Fromm", "Christian", 34, Arrays.asList("-Aparare", "Serva","Atac"),"Germania",
                "Rapid Bucuresti","Volley", "Atacant",170,1456);
        Volleyballlist.prezentareSportiv();

        System.out.println();

        SportivTema3 Handbalist = new SportivTema3("Neagu","Irina-Cristina",35,Arrays.asList("-Forta", "-Detenta", "-Precizie") ,"Romania","CSM Bucuresti","Handball",
                "Inter stanga",103,830);
        Handbalist.prezentareSportiv();
        System.out.println();

        SportivTema3 Fotbalist2 = new SportivTema3("Bloj2","Erwin2",27,"Romania",Arrays.asList("-Viteza","Putere"),"FK Miercuria Cius",
                "Fotball","Mijlocas",3,3,35000);
        Fotbalist2.prezentareSportiv();
        System.out.println();

        SportivTema3 Baschetbalist2 = new SportivTema3("Popescu",15,"Ion",20,"Romania",Arrays.asList("-Viteza","Saritura"),"Baschet","Atacant","CSM Timisoara",4,30,76000);
        Baschetbalist2.calculPretPranz();
        System.out.println();








    }



}
