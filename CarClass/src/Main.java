public class Main {
    public static void main(String[] args) throws Exception {
        
        Auto auto1 = new Auto("Ford", "RS", 20);
        auto1.naytaTiedot();
        auto1.kiihdyta();
        auto1.naytaTiedot();

        Auto auto2 = new Auto("Audi", "A4", 15);
        auto2.naytaTiedot();
        auto2.kiihdyta();
        auto2.jarruta();
        auto2.tankkaa(5);

    }
}