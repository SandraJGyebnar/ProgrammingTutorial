package tema;

import org.testng.annotations.Test;

public class MasinaParametriTema2 {

    public String marca;
    public String model;
    public String caroserie;
    public int anDeFabricatie;
    public int capacitateMotor;
    public float consum;
    public boolean inmatriculata;
    public char culoare;

    @Test

    public void metodaTest(){

        prezentareMasina("Audi","A3","Berlina",2023,1998,8.60f,true,'V');
        prezentareMasina("Mercedes","C-Class","Combi",2022,2199,8.20f,true,'G');
        prezentareMasina("Skoda","Octavia","Berlina",2020,1898,6.2f,true,'R');

    }

    public void prezentareMasina(String param1, String param2, String param3,int param4,int param5,float param6,boolean param7,char param8){

        System.out.println("Modelul masinii este" + " " + param1 + ".");
        System.out.println(param2+ " " + "este o masina" + " " + param3 + ".");
        System.out.println("A fost fabricata in anul"+ " "  +  param4 + ".");
        System.out.println("Capacitatea motorului este de" + " " + param5 + " "+ "centrimetri cubi.");
        System.out.println("Consumul masinii este de" + " " + param6 + "l/km.");
        System.out.println("Masina este inmatriculata?" + " " + param7 + " .");
        System.out.println();

    }

}
