package tmp.window;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/28 16:59$
 */
public class Maintenance {

    public Borrower createBorrow(String a,String b){
        Borrower borrower = new Borrower();
        borrower.create(a,b);
        return borrower;
    }
}

    