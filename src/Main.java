public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[8];
        for (int i = 0; i < 8; i++) {
            myArray[i] = 8 - i;
        }
        for (int num : myArray) {
            System.out.print(num);
        }
    }
}
//int[] myArray = new int[8];
//
//
//        for (int i = 7; i >= 0; i--) {
//            myArray[i] = i + 1;  
//        }
//
//        System.out.println("Убывающая последовательность:");
//        for (int num : myArray) {
//            System.out.print(num + " ");
//        }
//    }
//}