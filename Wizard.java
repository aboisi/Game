public class Wizard {
    String name;
    int hp;
    public void heal(Hero h) {//勇者が2人以上生み出されている可能性もあるので「どの勇者を回復するのか」を引数hとして受け取る
        h.hp += 10;
        System.out.println(h.name + "のHPを10回復した！");
    }
}
