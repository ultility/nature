import fauna.prototype;
public class Environment {
    public static void main(String[] args) {
        prototype p1 = new prototype(2, 0.6, 0.2);
        for (int i = 1; i <= 10; i++) {
            System.out.println(p1);
            p1.update();
        }
    }
}
