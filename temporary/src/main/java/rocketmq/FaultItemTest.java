package rocketmq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * FaultItemTest
 *
 * @author kq
 * @date 2021/7/6 23:27
 * @since 1.0.0
 */
public class FaultItemTest {

    public static void main(String[] args) {

        FaultItem f3 = new FaultItem("a");
        f3.setCurrentLatency(2000);
        f3.setStartTimestamp(1000);

        FaultItem f4 = new FaultItem("a");
        f4.setCurrentLatency(2000);
        f4.setStartTimestamp(500);

        FaultItem f2 = new FaultItem("a");
        f2.setCurrentLatency(2000);
        f2.setStartTimestamp(2000);

        FaultItem f = new FaultItem("a");
        f.setCurrentLatency(1000);
        f.setStartTimestamp(1000);

        FaultItem f1 = new FaultItem("a");
        f1.setCurrentLatency(500);
        f1.setStartTimestamp(500);

        List<FaultItem> list = new ArrayList<>();
        list.add(f2);
        list.add(f);
        list.add(f4);
        list.add(f1);
        list.add(f3);

        Collections.sort(list);

        System.out.println(list);

    }

}
