package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //In programare exista doua tipuri de structuri: alternative si repetitive
    // Structuri alternative: if... then... else.../ switch... case...

    @Test

    public void metodaTest() {

//        verificaPersoanaMajora(15);
//        verificaPersoanaMajora(23);
//        verificaPersoanaMajora(18);

//        verificaNrPar(6);
//        verificaNrPar(21);
//        verificaNrPar(0);
//        verificaNrPar(-2);
//        verificaNrPar(-3);
//        verificNrDivizibil(33);
//        verificNrDivizibil(25);
//        verificNrDivizibil(-7);
        zileleSaptamanii(8);


    }

    // facem o metoda care verifica daca o persoana este majora

    public void verificaPersoanaMajora(int varsta) {

        if (varsta >= 18) {
            System.out.println("Persoana cu varsta de " + varsta + " este majora.");
        } else ;
        {
            System.out.println("Persona cu varsta de " + varsta + " este minora.");
        }
    }

    //verificam daca un numar este par si pozitiv
    // daca vrem catul unei impartiri => / (div)
    //daca vrem restul unei impartiri => % (mod)
    //putem avea un singur if
    //putem avea cate else if vrem
    //putem avea un singur else

    public void verificaNrPar(int nr) {
        if (nr > 0)
        {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este pozitiv si par.");
            }
            else {
                System.out.println("Numarul " + nr + " este pozitiv si impar.");
            }
        }
        else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este pozitiv si par.");
            } else {
                System.out.println("Numarul " + nr + " este pozitiv si impar.");
            }
        } else {
            System.out.println("Numarul " + nr + " este egal cu 0");
        }
    }

    //verificam daca un numar este pozitiv si divizibil cu 5

    public void verificNrDivizibil(int nrDiv){
        if (nrDiv % 5 == 0 &&  nrDiv > 0){

            System.out.println("Numarul e divizibil si pozitiv");}

            else {
                System.out.println("Numarul nu este divizibil");
            }
        }


        //Afisam zilele saptamanii
    public void zileleSaptamanii(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi ii luni.");
                break;
            case 2:
                System.out.println("Astazi ii marti.");
                break;
            case 3:
                System.out.println("Astazi ii miercuri.");
                break;
            case 4:
                System.out.println("Astazi ii joi.");
                break;
            case 5:
                System.out.println("Astazi ii vineri.");
                break;
            case 6:
                System.out.println("Astazi ii sambata.");
                break;
            case 7:
                System.out.println("Astazi ii duminica.");
                break;
            default:
                System.out.println("Nu mai exista zile.");

        }

    }
    }

