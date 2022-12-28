enum Size {
    SMALL, LARGE, MEDIUM, EXTRALARGE;
}

class TestPizza {
    Size PizzaSize;

    public TestPizza(Size PizzaSize) {
        this.PizzaSize = PizzaSize;
    }

    public void order() {
        switch (PizzaSize) {
            case SMALL:
                System.out.println("This is a small pizza.");
            case LARGE:
                System.out.println("This is a Large Pizza.");
            case MEDIUM:
                System.out.println("This is a medium size pizza.");
            case EXTRALARGE:
                System.out.println("This is an ExtraLarge size pizza.");
        }

    }
}


public class OrderPizza {
    public static void main(String[] args) {
        TestPizza t1 = new TestPizza(Size.EXTRALARGE);
        t1.order();

    }
}
