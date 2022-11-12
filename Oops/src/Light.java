public class Light {

    String name = "Syska LED";
    int itemId = 4435;

    public void glow() {
        System.out.println("The bulb is glowing.");
    }

    public static void burn() {
        System.out.println("The wire is burning");
    }

    public static void main(String[] args) {
        Light l = new Light();
        System.out.println(l.name);
        System.out.println(l.itemId);
        l.glow();
        Light.burn();

    }
}
