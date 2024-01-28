public class Main {
    public static void main(String[] args) {
       Task8();

    }

    public static void Task1() {
        for (int i = 1; i < 56; i += 2) {
            System.out.println(i);
        }
    }

    public static void Task2() {
        for (int i = 90; i > -1; i -= 5) {
            System.out.println(i);
        }
    }

    public static void Task3() {
        int b = 0;
        for (int i = 2; b < 21; i += i) {
            System.out.println(i);
            b += 1;
        }
    }

    public static void Task4() {
        for (int i = -29; i < 11; i += 1) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void Task5() {
        int sum = 0;
        int sum2 = 0;
        for (int i = 50; i < 151; i += 1) {
            sum += i;
            if (i % 2 == 0) {
                sum2 += 1;
            }
        }
        System.out.println(sum);
        System.out.println(sum2);
    }

    public static void Task6(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i += 1) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void Task7(int[] arr) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] > 0) {
                sum += arr[i];
                sum2 += 1;
            }
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
    public static void Task8(){
        int b = 1;
        int s = 0;
        int f = 0;
        for (int i=1; i < 12; i++){
            System.out.println(b);
            f = s;
            s = b;
            b = s+f;

        }
    }
}