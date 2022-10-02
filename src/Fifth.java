interface I1 {
    default void display() {
        System.out.println("Default method 1");
    }

    void print();
}

public class Fifth implements I1 {
    @Override
    public void print(){
        System.out.println("printing");
    }

    public static void main(String[] args) {
        Fifth f1=new Fifth();
        f1.print();
        //f1.display();
    }
    }

