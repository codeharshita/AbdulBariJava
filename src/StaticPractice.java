class New {
    int x = 10;
    static int y = 4;

    static void show() {
        System.out.println(y);
    }

    void display() {
        System.out.println(x + " " + y);
    }
}

public class StaticPractice {
    public static void main(String[] args) {
        System.out.println(New.y);
        New n = new New();
        System.out.println(n.y);
        n.display();
        New.show();
    }
}
