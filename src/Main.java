interface Greater{
    boolean greater(int a,int b);
}

interface increment{
    int increment(int a);
}

interface concat{
    String concat(String a, String b);
}
interface convert{
    String covert(String s);
}

public class Main {
    public static void main(String[] args) {

        Greater g=(a,b)->{
            if(a>b) return true;
            else return false;
        };

        increment i=(a)->a+1;
        concat c=(a,b)->a+b;
        convert str=(s)->s.toUpperCase();

        System.out.println(g.greater(5,3));
        System.out.println(i.increment(70));
        System.out.println(c.concat("Shipra", "Sharma"));
        System.out.println(str.covert("shipra"));

    }
}