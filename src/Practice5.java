/*
    先将n-1个从src移动到的other
    再将src移动到dest
    再将other移动到dest

 */
public class Practice5 {
    public static void hannoi(int n,int src,int dest){
        if(n == 1){
            System.out.printf("从%d移动到%d%n",src,dest);
        }else {
            int other = 3 - src - dest;
            hannoi(n - 1,src,other);
            System.out.printf("从%d移动到%d%n",src,dest);
            hannoi(n-1,other,dest);
        }
    }
    public static void main(String[] args) {
        hannoi(6,0,1);

    }
}
