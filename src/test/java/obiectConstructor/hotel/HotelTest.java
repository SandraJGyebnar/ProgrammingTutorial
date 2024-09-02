package obiectConstructor.hotel;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HotelTest {

    @Test

    public void testMethod(){

        Map<String,String> oferta = new HashMap<>();
        oferta.put("Durata oferta", "15 zile" );
        oferta.put("Perioada sedere", "14 nopti");
        oferta.put("Numar persoane","4 persoane");
        oferta.put("Offseaseon", "Yes");
        oferta.put("Pret oferta","2345 euro");
        Hotel imperial = new Hotel();
        imperial.prezentareHotel();
        imperial.pretOferta(oferta);

    }

}
