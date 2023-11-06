package tmp.nature;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:23$
 */
public class ClientTest {
    public static void main(String[] args) {
        NatureFactory natureFactory = new TreeFactory();
        Fruit fruit = natureFactory.createFruit();
        System.out.println(fruit.product());

        Leaf leaf = natureFactory.createLeaf();
        System.out.println(leaf.product());

        natureFactory = new GroundFactory();
        Fruit fruitGround = natureFactory.createFruit();
        System.out.println(fruitGround.product());

        Leaf leafGround = natureFactory.createLeaf();
        System.out.println(leafGround.product());
    }
}

    