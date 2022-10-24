import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base length.");
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle.");
        float height = sc.nextFloat();

        float area = (float) 1/2*base*height;
        System.out.println("Area of triangle is " + area);

    }
}
