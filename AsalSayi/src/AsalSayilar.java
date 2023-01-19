public class AsalSayilar {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if (asal(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean asal(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
