package tema;

import org.testng.annotations.Test;

public class ProfesorTema1 {

    public String nume;
    public String prenume;
    public String materiePredata;
    public float notaExamenTitularizare;
    public int numarClase;
    public boolean diriginte;

    @Test

    public void prezentareProfesor(){

        nume = "Popescu";
        prenume = "Aurel";
        materiePredata = "Geografie";
        notaExamenTitularizare = 9.50f;
        numarClase = 5;
        diriginte = true;

        System.out.println("Profesorul " + nume + " " + prenume + " " + "este profesor de " +materiePredata + ". A luat nota " + notaExamenTitularizare + " la examenul de titularizare" + " si preda la " + numarClase + " clase." + " Domnul profesor " + nume + " este dirigitele clasei a X-a?" + diriginte + ".");

    }


}
