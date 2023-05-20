package pkgame;

/**
 * 可攻击接口 —— 只要实现了本接口，就相当于具备了可实施攻击对象的基本特征
 */
public interface Assailable {
    String getName();         //可攻击的名字
    int getX();
    void setX(int x);
    int getY();
    void setY(int y);
    int getHp();
    void setHp(int hp);

    /**
     * 根据距离判断，是否能够成功攻击另一个具备攻击能力的对象
     * @param assa
     * @return
     */
    boolean canFightDistance(Assailable assa);      //可攻击对象

    /**
     * 攻击另一个具备攻击能力的对象（也可以理解成军事单位）
     * @param assa
     */
    void fight(Assailable assa);

}
