public class Hero {
    //属性の定義
    String name;
    int hp;
    //操作の定義
    public void attack() {}
    public void sleep() {
        this.hp = 100;//自分自身のインスタンスのhpフィールドに100を代入する
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {}
    public void slip() {}
    public void run() {}
}
