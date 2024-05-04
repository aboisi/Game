//Heroクラスを継承
public class SuperHero extends Hero {
    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run() { //オーバーライド(親クラスにも定義してあるが、子クラスでも再定義)
        System.out.println(this.name + "は撤退した");
    }
    public void attack() { //親クラスのattackを呼び出す
        super.attack();
        if (this.flying) {
            super.attack();
        }
    }
}
