public class UocChungLN {

    public int findGreatestCommonDivisor(int a, int b) {
        if (a == b || a != 0 && b == 0) {
            return Math.abs(a);
        }
        if (a == 0 && b != 0) {
            return Math.abs(b);
        }
        int temp = 0;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}