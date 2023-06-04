package homeworks_completed;
public class Box {
    public int Breite;
    public int Hohe;
    public int lange;
    public Box(int B, int H, int l) {
        Breite = B;
        Hohe = H;
        lange = l;
    }
    public void print() {
        String result = "ширина = " + Breite + ", высота =" + Hohe + ", длина = "+ lange;
        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.println("Добро пожаловать Роман");
        System.out.println();
        Box box2 = new Box(10, 20, 30);
        box2.print();
    }
}
