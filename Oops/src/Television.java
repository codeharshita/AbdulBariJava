public class Television {
    int channel;
    String name;
    String color;

    void changeChannel() {
        System.out.println("The channel is changed.");
    }

    public static void main(String[] args) {
        Television sony = new Television();
        sony.changeChannel();
        sony.channel = 56;
        sony.color = "Black";
        sony.name = "XYz";

        System.out.println(sony.channel);
        System.out.println(sony.color);
        System.out.println(sony.name);

    }
}
