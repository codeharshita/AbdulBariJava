public class Customer {
    private int custId;
    String name;
    String address;
    long phoneNumber;

    public int getCustId() {
        return this.custId;
    }

    public void setCustId(int custId) {
        if (custId < 0) {
            throw new IllegalArgumentException("Invalid-ID - Permission NOT-GRANTED!");
        } else {
            System.out.println("Permission Granted.");
        }
        this.custId = custId;
    }


    public Customer(String name, String address, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

}
