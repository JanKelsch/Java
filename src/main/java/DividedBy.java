public class DividedBy {
    public static void main(String[] args) {
        dividedBy(33);
    }

    public static void dividedBy(int n) {
        if (n % 3 == 0) {
            System.out.println("Number " + n + " divided by 3");
        } else {
            if (n % 5 == 0) {
                System.out.println("Number " + n + " divided by 5");
            } else {
                System.out.println("Number " + n + " divided not by 3 and 5");
            }
        }
    }
}
