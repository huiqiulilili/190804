public class Practice2 {
    public static void main(String[] args) {
//        if(args.length == 0 || args[0].equals("-h")){
//            System.out.print("Hello,");
//        }else if(args[0].equals("-g")){
//            System.out.print("Goodbye,");
//        }
//        for(int i = 0;i < args.length;i ++){
//            System.out.print(" "+ args[i]);
//        }
//        System.out.print("!");
        int[] array = new int[10];
        for (int r:array
             ) {
//            System.out.println("hehe");
            array[r] = r + 1;
            System.out.print(array[r]);
        }

    }
}
