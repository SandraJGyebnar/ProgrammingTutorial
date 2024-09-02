package tema;

import org.testng.annotations.Test;

public class MasinaTema1 {

    public String marca;
    public String model;
    public String caroserie;
    public int anDeFabricatie;
    public int capacitateMotor;
    public float consum;
    public boolean inmatriculata;
    public char culoare;

    @Test

    public void metodaTest() {

        marca = "Nissan";
        model = "Navara";
        caroserie = "pickup";
        anDeFabricatie = 2010;
        capacitateMotor = 2488;
        consum = 10.2f;
        inmatriculata = true;

        System.out.println("Marca masinii este" + " " + marca + ".");
        System.out.println("Modelul masinii este" + " " + model + ".");
        System.out.println(model + " " + "este o masina" + " " + caroserie + ".");
        System.out.println("A fost fabricata in anul" + " " + anDeFabricatie + ".");
        System.out.println("Capacitatea motorului este de" + " " + capacitateMotor + " " + "centrimetri cubi.");
        System.out.println("Consumul masinii este de" + " " + consum + "l/km.");
        System.out.println("Masina este inmatriculata?" + " " + inmatriculata + " .");


    }
}
