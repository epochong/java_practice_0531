import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/31 16:43
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            arr[Integer.valueOf(str.charAt(i)) - 48]++;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                System.out.println(i + ":" + arr[i]);
            }
        }
    }
}
