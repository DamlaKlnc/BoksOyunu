import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int minAge;
    int maxAge;
    boolean isRun;

    Match(int maxWeight, int minWeight, int minAge, int maxAge, Fighter f1, Fighter f2) {
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.f1 = f1;
        this.f2 = f2;

    }

    void run() {
        isRun();
        if ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight)) {
            if ((f1.age >= minAge && f1.age <= maxAge) && (f2.age <= maxAge && f2.age >= minAge)) {
                while (true) {
                    System.out.println("=========YENİ ROUND=======");
                    if (isRun) {
                        f2.health = f1.hit(f2);
                        if (isWin())
                            break;
                        f1.health = f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        printCase();
                    } else {

                        f1.health = f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        f2.health = f1.hit(f2);
                        if (isWin())
                            break;
                        printCase();

                    }
                }


            } else {
                System.out.println("Siklet yaş uyuşmazlığı problemi oluştu.");
            }

        } else {
            System.out.println("Siklet ağırlık uyuşmazlığı oluştu.");
        }

    }

    void isRun() {
        double possibility = Math.random() * 100;
        this.isRun=possibility>49;
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı kazanan boksör " + f2.name + " !!!");
            return true;
        }
        if (f2.health == 0) {
            System.out.println("Maçı kazanan boksör " + f1.name + " !!!");
            return true;
        }
        return false;
    }

    void printCase(){
        System.out.println("****************");
        System.out.println(f1.name+" oyuncunun kalan canı: "+f1.health);
        System.out.println(f2.name+" oyuncunun kalan canı: "+f2.health);
    }

}

