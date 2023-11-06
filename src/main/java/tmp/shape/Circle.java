package tmp.shape;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:44$
 */
public class Circle implements Shape{

    private XCircle pxc;

    public Circle(){
        pxc = new XCircle();
    }

    @Override
    public void display() {
        pxc.display();
    }
}

    