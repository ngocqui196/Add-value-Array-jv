public class Main {
    public static void main(String[] args) {
        int Array[] = new int[10];
        int x = 5;
        int index = 3;
        for (int i = 0; i < Array.length; i++) {
            if (i == index) {
                Array[i] = x;
            }
            System.out.println(Array[i]);
        }
    }
}
