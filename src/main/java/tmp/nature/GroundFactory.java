package tmp.nature;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:23$
 */
public class GroundFactory implements NatureFactory{
    @Override
    public Fruit createFruit() {
        return new GroundFruit();
    }

    @Override
    public Leaf createLeaf() {
        return new GroundLeaf();
    }
}

    