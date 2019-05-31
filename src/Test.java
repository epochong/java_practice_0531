import java.util.Collection;
import java.util.List;

/**
 * @author wangchong
 * @date 2019/5/31 17:46
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void  run() {
                pong();
            }
        };
        t.run();
        System.out.println("ping");
        List
    }
    static void pong() {
        System.out.println("pong");
    }
}
