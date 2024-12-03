public class Auto {
    String merkki;
    String malli;
    int bensanMaara;
    int vuosiMalli; // auton vuosimalli
    double rengasPaine; // rengaspaine (bar)
    
    public Auto() {
        merkki = "";
        malli = "";
        bensanMaara = 0;
        vuosiMalli = 0;
        rengasPaine = 0;
    }

    public Auto(String x, String y, int i, int j, double r){
        merkki = x;
        malli = y;
        this.bensanMaara = i;
        this.vuosiMalli = j;
        this.rengasPaine = r;
    }

    public void jarruta() {
        System.out.println("Auto jarruttaa");
    }

    public void kiihdyta() {
        if (bensanMaara <= 0){
            System.out.println("Ei bensaa");
        }
        System.out.println("Auto kiihtyy");
        bensanMaara -= 1;
    }
    // Näyttää tiedot -metodi
    public void naytaTiedot(){
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Vuosimalli: " + vuosiMalli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }
    // Tankkaus-metodi
    public void tankkaa(int tankkaus){
        System.out.println("Tankissa bensaa ennen tankkausta: " + bensanMaara);
        System.out.println("Tankkaus: " + tankkaus);
        System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (bensanMaara + tankkaus));
    }
    // Tarkistaa renkaiden ilmanpaineen
    public void rengasPaineenTarkistus() {
        if (rengasPaine < 2.0) {
            System.out.println("Rengaspaine on liian matala. Tarkista rengaspaine!");
        }
        else {
            System.out.println("Rengaspaine on normaali.");
        }
    }
}
