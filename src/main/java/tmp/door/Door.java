package tmp.door;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:39$
 */
public class Door {

    private int state = StatusEnum.CLOSED;

    private void setState(int state){
        this.state = state;
    }

    private int getStatus(){
        return state;
    }

    public void click(){
        if(state == StatusEnum.CLOSED || state == StatusEnum.CLOSING){
            setState(StatusEnum.OPENING);
        }else if(state == StatusEnum.OPENING || state == state == StatusEnum.OPEN){
            setState(StatusEnum.CLOSING);
        }else if (state == StatusEnum.OPEN){
            setState(state == StatusEnum.OPEN);
        }
    }

    public void timeout(){
        if(state == StatusEnum.OPEN){
            setState(StatusEnum.CLOSING);
        }
    }

    public void complete(){
        if(state == StatusEnum.OPENING){
            setState(StatusEnum.OPEN);
        }else if(state ==StatusEnum.CLOSING)) {
            setState(StatusEnum.CLOSED);
        }
    }

    public static void main(String[] args) {
        Door door = new Door();
        door.getStatus();
        door.click();
        door.getStatus();
        door.complete();
        door.getStatus();
        door.click();
        door.getStatus();
        door.click();
        door.getStatus();
    }
}

    