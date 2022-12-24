class OuterSofa {
    int legs = 4;
    static int u = 43;

    static class InnerSofa {
        public void show() {
            System.out.println("New Furniture." + u);
        }
    }
}

public class NewOuter {
    public static void main(String[] args) {
        OuterSofa.InnerSofa obj1 = new OuterSofa.InnerSofa();
        obj1.show();
    }
}
