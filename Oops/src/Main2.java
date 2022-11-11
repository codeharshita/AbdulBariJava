import jdk.swing.interop.SwingInterOpUtils;

public class Main2 {


    public static void main(String[] args) {
        Product p = new Product("Vaseline Body Lotion", 5, 1);
        Product p2 = new Product("FaceGuard", 2, 2);
        Product p3 = new Product("Patanjali Wheat Flour", 4, 3);

        System.out.println(p.itemName + " " + p.qty + " " + " " + p.itemNumber);
        System.out.println(p2.itemName + " " + p2.qty + " " + " " + p2.itemNumber);
        System.out.println(p3.itemName + " " + p3.qty + " " + " " + p3.itemNumber);

        System.out.println(p.getItemNumber());
        System.out.println(p.getItemName());
        p.setPrice(250.76);
        System.out.println(p.getPrice());
        System.out.println(p.getQty());

        System.out.println();

        System.out.println(p2.getItemNumber());
        System.out.println(p2.getItemName());
        p2.setPrice(130.65);
        System.out.println(p2.getPrice());
        System.out.println(p2.getQty());

        System.out.println();
        System.out.println(p3.getItemNumber());
        System.out.println(p3.getItemName());
        p3.setPrice(350);
        System.out.println(p3.getPrice());
        System.out.println(p3.getQty());

        Customer c1 = new Customer("Smriti Jha", "Global-TownA-503,Bandra(East)", 965253617);
        Customer c2 = new Customer("Rakesh Kumar", "Global-TownB-1104,Borivali(East)", 964702617);
        System.out.println(c1.name + " " + c1.address + " " + c1.phoneNumber);
        System.out.println(c2.name + " " + c2.address + " " + c2.phoneNumber);
        c1.setCustId(1);
        c2.setCustId(2);
        System.out.println(c1.getCustId());
        System.out.println(c2.getCustId());

    }
}
