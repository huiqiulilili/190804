//import java.util.Scanner;

public class Practice3 {

    public static void foreach(int[] array){
        for(int item:array){
            System.out.println(item);
        }
    }

    public static void printColor(String color){
        switch (color){
            case "Red":
                System.out.println("红色");
                break;
            case "Yellow":
                System.out.println("黄色");
                break;
                default:
                    System.out.println("你猜哈哈哈......");
        }
    }
    public static void main(String[] args) {
        foreach(new int[]{1,2,3,4,5});
//        String a = "中国";
//        String b = "\u4e2d\u56fd";
//
//        System.out.println(a);
////        System.out.println(b);
//        System.out.println("byte 型的范围");
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);


    }
}
