public class Main {
    public static void main(String[] args) {
        //1.勇者を生成
        Hero h = new Hero();//Heroクラスからインスタンスを生成し、変数hに入れる
        //2.フィールドに初期値をセット
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();//お化けキノコAを生成し、初期化
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();//お化けキノコBを生成し、初期化
        m2.hp = 48;
        m2.suffix = 'B';

        //冒険の始まり
        h.slip();
        m1.run();
        m2.run();
        h.run();
        // System.out.println("勇者" + h.name + "を生み出しました！");
        // //3.勇者のメソッドを呼び出していく
        // h.sit(5);
        // h.slip();
        // h.sit(25);
        // h.run();
    }
}