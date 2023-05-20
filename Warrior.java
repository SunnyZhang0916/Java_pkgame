package pkgame;

public class Warrior extends Hero {
    public Warrior() {
        super();
        setName("默认英雄");
    }

    public Warrior(long id, String name, int x, int y) {
        super(id, name);
        setX(x);
        setY(y);
    }

    /**
     * @param assa
     * @return
     */
    @Override
    public boolean canFightDistance(Assailable assa) {
        double distance = getDistance(getX(),getY(), assa.getX(), assa.getY());

        //假设战士的攻击距离固定为100
        return distance <= 100;  //假如小于等于100，return true
    }

    /**
     * @param assa
     */
    @Override
    public void fight(Assailable assa) {
        //1.生成随机的攻击力

        int attack = ((int)(Math.random() * 10000)) % 51 + 20; //攻击力是0到50 + 20， 即20到70之间

        setAttack(attack);

        //2.减掉传入英雄对象的hp
        assa.setHp(assa.getHp() - attack);

        System.out.println(getName() + "成功地实现了一次近战攻击");

    }
}
