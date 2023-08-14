public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Khabib", 10,120,100,100);
        Fighter f2 = new Fighter("MacGroger",20,85,90,50);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }
}