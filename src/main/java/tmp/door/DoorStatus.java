package tmp.door;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:57$
 */
public abstract class DoorStatus {
    protected Door door;

    public DoorStatus(Door door){
        this.door = door;
    }

    public void click(){
        System.out.println("-----------click-----------");
    }

    public void complete(){
        System.out.println("-----------complete-----------");
    }

    public void timeout(){
        System.out.println("-----------timeout-----------");
    }
}

    