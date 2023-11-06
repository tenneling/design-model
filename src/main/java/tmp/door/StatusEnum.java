package tmp.door;

public enum StatusEnum {
    CLOSED(1,"关闭"),
    OPENING(2,"打开中"),
    OPEN(3,"打开"),
    CLOSING(4,"关闭中"),
    STAYOPEN(5,"保持打开")
    ;

    StatusEnum(int value, String desc) {
    }
}
