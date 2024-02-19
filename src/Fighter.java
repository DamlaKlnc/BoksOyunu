public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    int age;
    int dodge;

    Fighter(String name,int weight,int health,int age,int damage,int dodge){
        this.name=name;
        this.weight=weight;
        this.health=health;
        this.age=age;
        this.damage=damage;
        this.dodge=dodge;
    }

    int hit(Fighter foe){

        System.out.println(this.name+" "+foe.name+" "+ this.damage+" hasar verdi.");
        if(foe.health-this.damage<0)
            return 0;
        if(foe.dodge()){
            System.out.println(foe.name+" gelen hasarı blockladı.");
            return foe.health;
        }
        return foe.health-=this.damage;
    }

    void printCase(){
        System.out.println(this.name+" oyunucunun kalan hp=\t"+this.health);
    }

    boolean dodge(){
        return dodge>=Math.random()*100;
    }



}
