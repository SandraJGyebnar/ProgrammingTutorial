package oop_mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest(){
        Angajat angajat = new Angajat("Popescu","Andrei",20,
                "masculin","Timisoara","adesso","tester",
                10000,"2 ani");
        angajat.infoAngajat();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());
        angajat.mananca();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("Inginer");
        angajat.marire("Inginer", 10);

        angajat.ajungeLaTimpLaBirou();
        angajat.respectaConduita();
        angajat.nuAreAbsente();
        angajat.munceste();

        System.out.println();

        //        Sportiv sportiv = new Sportiv("Ionescu","Ion",10,"masculin",
//                "Timisoara","fotbal",true,2,2,
//                true);
//        sportiv.infoSportiv();
//
//        System.out.println();
//
        Student student = new Student("Ionescu","Alina",21,"feminin",
                "Timisoara","Politehnica","IT",false,3,true);
        student.infoStudent();

        student.saNuMeargaInRestanta();
        student.mergeLaCursuri();
        student.trebuieSaInvata();
        student.saStieSaCopieeze();

        System.out.println();

        Sportiv sportiv = new Sportiv("Paulescu","Paul",25,"masculin","Timisoara","Tenis",
                false,10,30,true);
        sportiv.infoSportiv();

        sportiv.seAntreneaza();
        sportiv.manancaSanatos();
        sportiv.iaSuplimente();
        sportiv.nuLipsesteDeLaAntrenament();

        AngajatSportivStudent angajatSportivStudent = new AngajatSportivStudent("Gybnar","Sandra",31,"feminin","Sacalaz","adesso","Tester",10000,
                "Da","FEAA","Management",2,true,false,"Tenis",false,15,false,3);


        angajatSportivStudent.iaSuplimente();
        angajatSportivStudent.manancaSanatos();
        angajatSportivStudent.nuLipsesteDeLaAntrenament();
        angajatSportivStudent.seAntreneaza();
        angajatSportivStudent.ajungeLaTimpLaBirou();
        angajatSportivStudent.mananca();
        angajatSportivStudent.munceste();
        angajatSportivStudent.mergeLaCursuri();
        angajatSportivStudent.respectaConduita();
    }
}
