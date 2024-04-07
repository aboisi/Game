public class Main {
    public static void main(String[] args) {
        //剣を生成
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        //勇者を生成
        Hero h1 = new Hero();//Heroクラスからインスタンスを生成し、変数hに入れる
        //フィールドに初期値をセット
        h1.name = "ミナト";
        h1.hp = 100;
        h1.sword = s;//swordフィールドに生成済みの剣インスタンスを代入
        System.out.println("現在の武器は" + h1.sword.name);//h.sword.name→s.nameにもできる？
        System.out.println(h1.name + "は" + s.name + "で攻撃した！");//(名前)は(武器)で攻撃した！

        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);//ミナトを回復させる (HP:100→110)
        w.heal(h2);//アサカを回復させる (HP:100→110)
        w.heal(h2);//アサカを回復させる (HP: 110→120)

        Matango m1 = new Matango();//お化けキノコAを生成し、初期化
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();//お化けキノコBを生成し、初期化
        m2.hp = 48;
        m2.suffix = 'B';

        //冒険の始まり
        h1.slip();
        m1.run();
        m2.run();
        h1.run();
        // System.out.println("勇者" + h.name + "を生み出しました！");
        // //3.勇者のメソッドを呼び出していく
        // h.sit(5);
        // h.slip();
        // h.sit(25);
        // h.run();
    }
}