package tema;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SportivRestaurantTema3Test {
    @Test

    public void testSportivRestaurantMethod(){
        SportivRestaurantTema3 Fotbalist = new SportivRestaurantTema3("Gyebnar", "Adalbert","Fotbal", Arrays.asList("FelulI","FelulII"),45);
        Fotbalist.prezentareSportivRestaurant();
        System.out.println();

        SportivRestaurantTema3 Handbalist = new SportivRestaurantTema3("Gyebnar","Sandra","Squash",Arrays.asList("FelulI","Desert"),35);
        Handbalist.prezentareSportivRestaurant();
        Handbalist.calculPret();
        System.out.println();


    }
}
