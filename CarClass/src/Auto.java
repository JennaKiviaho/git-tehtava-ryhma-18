public class Auto {
    String merkki;
    String malli;
    int bensanMaara;  
    
    public Auto() {
        merkki = "";
        malli = "";
        bensanMaara = 0;
    }

    public Auto(String x, String y, int i){
        merkki = x;
        malli = y;
        this.bensanMaara = i;
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

    public void naytaTiedot(){
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }

    public void tankkaa(int tankkaus){
        System.out.println("Tankissa bensaa ennen tankkausta: " + bensanMaara);
        System.out.println("Tankkaus: " + tankkaus);
        System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (bensanMaara + tankkaus));
    }
}
