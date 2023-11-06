package tmp.shape;

import javafx.scene.shape.Line;

import java.awt.*;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/28 16:00$
 */
public class Factory {

    private Shape getShapeInstance(int type){
        switch (type){
            case 0:return new Point();
            case 1:return new Rectangle();
            case 2:return new Line();
            case 3:return new Circle();
            default:return null;
        }
    }
}

    