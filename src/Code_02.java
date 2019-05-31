/**
 * @author wangchong
 * @date 2019/5/31 16:55
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < B.length; i++) {
            B[i] = A[i - 1] * B[i - 1];
        }
        int temp = 1;
        for (int i = B.length - 2; i >= 0; i--) {
            temp = temp * A[i + 1];
            B[i] = temp * B[i];
        }
        return B;
    }
}
