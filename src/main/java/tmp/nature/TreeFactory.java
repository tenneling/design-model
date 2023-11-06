package tmp.nature;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:24$
 */
public class TreeFactory implements NatureFactory{
    @Override
    public Fruit createFruit() {
        return new TreeFruit();
    }

    @Override
    public Leaf createLeaf() {
        return new TreeLeaf();
    }
}

    