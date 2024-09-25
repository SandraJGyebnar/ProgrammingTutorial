package oop_v2;

public abstract class Persoana {

    //o clasa abstracta functioneaza aproape la fel ca o clasa normala
    //o clasa abstracta poate sau nu sa contina metode abstrracte
    // diferenta dintre o interfata si o clasa abstracta este ca contine metode abstracta
    //putem mosteni o singura clasa abstracta
    //pentru a deni ometoda abstracta folosim cuvantul abstract
    // intr o clasa abstracta putem avea metode care au diferit access control(public, private, protected etc)
    //o clasa abstracta poate avea un constructor -> nu putem face un obiect
    //o clasa abstracta poate implementa o interfara
    //pentru exemple din viata reala nu sunt bune Abstractele, Pentru exemplele din viata reala folosim Interface
    //principiile SOLID daca vrem sa citim despre asta
    //loadeble component - concept care merge manan in manan cu page object model. Este in trei feluri. 1.clasic.
    // 2. Slow loadable component - asteapta sa se incarce pagina respectiva. ne recomanda sa nu l folosim. ne forteaza
    // sa stam mai mult decat trebuie. la 10 oageuri sa se aduna. 3. custom loadable component. ii spcificam noi cat vrem
    // sa stea sa astepte sau ce sa astepte. Ne recomanda sa folosim 1 sau 3
    //dece sau cum pot sa folosim abstractizarea(Exemplu cu loadable cu pagina de new page cand trebuie sa faca wait sa se faca loadul)


    private String nume;
    private String prenume;
    private int varsta;
    private String sex;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    //defininm in aceasta clasa abstracta toate metodele abstracte din cele 3 interfete din pachetul v1
    public abstract void ajungeLaTimpLaBirou();
    public abstract void munceste();
    public abstract void nuAreAbsente();
    public abstract void respectaConduita();

    public abstract void seAntreneaza();
    public abstract void nuLipsesteDeLaAntrenament();
    public abstract void manancaSanatos();
    public abstract void iaSuplimente();

    public abstract void mergeLaCursuri();
    public abstract void trebuieSaInvata();
    public abstract void saNuMeargaInRestanta();
    public abstract void saStieSaCopieeze();


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
