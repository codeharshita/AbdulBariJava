public class WrapperClassConcept {


    public static void main(String[] args) {
        String n = "1344579509";
        String k = "122.32f";
        int i = 20;

        System.out.println(n + i);

        //Data conversion from String to int
        int j = Integer.parseInt(n);
        System.out.println(j + 20);

        //Data Conversion from String to double.
        double d = Double.parseDouble(k);
        System.out.println(d + 20);

        //Data conversion from String to long;
        long f = Long.parseLong(n);
        System.out.println(f);

        //String to boolean
        String l = "true";
        boolean v = Boolean.parseBoolean(l);
        System.out.println(v);

        //String to float
        float x = Float.parseFloat(k);
        System.out.println(x);
        //int to string

        int q = 7;
        String h = String.valueOf(q);
        System.out.println(h + 34);

        String b = "400AD";
        //Exception will be thrown -> For input string.
        int g = Integer.parseInt(b);
        System.out.println(g);


    }
}
