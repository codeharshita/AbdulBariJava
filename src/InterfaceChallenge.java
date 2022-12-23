interface Member {
    void callback();
}

class Customer implements Member {

    String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("OK I will visit!" + name);
    }
}

class Store {
    Member m[] = new Member[100];
    int count = 0;

    void register(Member mem) {
        m[count++] = mem;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            m[i].callback();
        }
    }

}

public class InterfaceChallenge {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Vijay");
        Customer c2 = new Customer("Leena");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
