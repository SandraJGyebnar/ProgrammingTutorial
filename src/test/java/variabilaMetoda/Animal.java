package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    public String rasa;
    public Boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test

    public void metodaTest (){

        prezentareAnimal("caine",true,"alb",4,5.5);
        prezentareAnimal("pisica",true,"neagra",6,3);
        prezentareAnimal("soarec",true,"gri",1,1);
        prezentareAnimal("crocodil",true,"verde",3,70);

    }

    public void prezentareAnimal(String param1,boolean param2,String param3,int param4,double param5){

       int pret = 500;
        System.out.println("Pretul animalului este " + pret);
        System.out.println("Alina are un " + param1 + ".");
        System.out.println("Animalul este un mamifer " + param2);
        System.out.println("Culoarea animalului este " + param3);
        System.out.println("Animalul are " + param4 + " ani.");
        System.out.println("Animalul are " + param5 + " kilograme.");
        System.out.println();
    }




}
