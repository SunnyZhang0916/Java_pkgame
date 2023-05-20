package pkgame;

public class AppMain {
    public static void main(String[] args){
        Hero hero1 = new Warrior(1,"曹操",0,0);
        Castle castle = new Castle("温莎古堡", 10,10,750);

        hero1.Pk(castle);

    }
}
