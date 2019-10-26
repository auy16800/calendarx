import org.junit.Test;

import java.util.Scanner;

public class TestFB {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输出斐波那契数列第n个数（注意n是从0开始的）：");
        int n = sc.nextInt();
        if(n<2) {
            System.out.println(n);
        }
        else {
            //利用单循环来实现斐波那契数列
            int f1=0;
            int f2=1;
            int f3=0;
            for(int i=1;i<n;i++) {
                f3=f1+f2;
                f1=f2;
                f2=f3;
            }
            System.out.println("F（n）="+f3);
        }
    }


    @Test
    public void test1(){


//			System.out.println("打印几个费式数？\t");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(compute(number));

    }
    //递归调用

    public static int compute(int number)
    {
        if(number<2)
        {
            return number;
        }
        else
        {
            return compute(number-1)+compute(number-2);
        }
    }


}
