package tmp.door;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 18:00$
 */
public class DoorClosed extends DoorStatus{
    public DoorClosed(Door door) {
        super(door);
    }

    public void click(Door door){
        door.click();
    }

}

    