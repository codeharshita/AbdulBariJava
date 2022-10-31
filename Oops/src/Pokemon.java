public class Pokemon {
    //LOCAL VARIABLES
    String name;
    int numberOfEyes;
    String color;

    void speak() {
        System.out.println(name + " is Speaking. ");
    }

    void run() {
        System.out.println(name + " is running. ");
    }

    void attack() {
        System.out.println(name + " is attacking. ");
    }

    public static void main(String[] args) {


        Pokemon p = new Pokemon();
        p.name = " PIKACHU ";
        p.numberOfEyes = 2;

        p.color = "YellowishOrange";
        System.out.println("The name of my Pokemon is " + p.name);
        p.run();
        p.speak();
        p.attack();
    }
}
