public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Naim Süleymanoğlu",90,100,25,30,50);
        Fighter f2=new Fighter("George Bsug",95,100,45,25,30);

        Match match=new Match(100,85,16,45,f1,f2);

        match.run();

    }
}