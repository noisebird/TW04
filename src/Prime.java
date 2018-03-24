package src;

/**
 * Created by wangjie on 2018/3/24.
 */
public class Prime {
    public void calculatePrime() {
        int count=0;
        for (int i = 101; i <=200; i++) {
            boolean flag=false;
            if (i == 200) {
                System.out.println("\n素数的个数为："+count+"个");
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag=true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(i+" ");
                count++;
            }
            if (!flag && count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
