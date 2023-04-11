package game1;
public class test2 {
    public static void main(String[] args) {
        test a = new test("奥特曼", 120,"非人");
        test b = new test("怪兽", 150,"非人");
        while (true) {
            a.attack(b);
            if (a.getBlood() == 0) {
                System.out.println(a.getName() + "击败了" + b.getName()+"  "+"怪兽没了");
                break;
            }
            b.attack(a);
            if (a.getBlood() == 0) {
                System.out.println(b.getName() + "击败了" + a.getName()+"  "+"奥特曼没了");
                break;
            }
        }

    }
}
