package tmp.restaurant;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:56$
 */
public class ClientTest {
    public static void main(String[] args) {
        Watched customer = new ConcreteWatched();
        //财务
        Watcher financeman = new ConcreteWatcher();
        //出纳
        Watcher resolver = new ConcreteWatcher();
        //配送员
        Watcher postman = new ConcreteWatcher();
        customer.addWatcher(financeman);
        customer.addWatcher(resolver);
        customer.addWatcher(postman);

        customer.notifyWatchers("------------下单了-----------");
    }
}

    