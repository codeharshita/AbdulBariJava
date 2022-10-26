/***
 * Method overloading means writing more than one
 * method having same name.
 * Java allows method overloading which allows us to
 * write more than one method with same name but different parameters list.
 */

public class MethodPractise {
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float m, float n) {
        if (m > n) return m;
        else return n;
    }

    static int max(int k, int j, int l) {
        if (k > j && k > l) return k;
        else if (j > l) {
            return j;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 2));
        System.out.println();
        System.out.println(max(4.6f, 3.6f));
        System.out.println(max(3, 2, 1));
    }
}
