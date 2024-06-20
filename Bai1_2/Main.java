public class Main {

    static void bai1() {
        String str = "aabbc";
        int detect = -1;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && j != i) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(str.charAt(i));
                detect = 1;
                break;
            }
        }
        if (detect != 1)
            System.out.println("Not character repeat !");
    }

    static void bai2() {
        String[] arr = {"Aed", "Dreen", "Crange", "Bhite"};
        System.out.print("List before sort: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("List after sort: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        bai1();
        bai2();
    }
}

