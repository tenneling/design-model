package tmp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:32$
 */
public class OrderList<Order> implements Iterable<Order>{

    private List<Order> orders;

    public OrderList(){
        this.orders = new ArrayList<>();
    }

    public void addOther(Order order){
        this.orders.add(order);
    }

    @Override
    public Iterator<Order> iterator() {
        // 返回Iterator<Order>迭代器
        return this.orders.iterator();
    }

    public int getNumberOfOrders(){
        return this.orders.size();
    }
}

    