import java.util.stream.Stream;
import java.util.stream.Collectors;
class Employee{
    String fullName;
    long salary;
    String city;

    public Employee(String  fullName,long salary,String city)
    {
        this.fullName=fullName;
        this.salary=salary;
        this.city=city;
    }
}

public class Fourth2 {
    public static void main(String[] args) {
        Employee[] employees=new Employee[5];
        employees[0]=new Employee("Shipra manoj sharma",2000,"SGNR");
        employees[1]=new Employee("Alia bhatt kapoor",30000,"Chandigarh");
        employees[2]=new Employee("kareena kapoor khan",2000,"Delhi");
        employees[3]=new Employee("Kishore Kumar",4000,"Delhi");
        employees[4]=new Employee("Asha krishna bhosle",10000,"Delhi");

        System.out.println(Stream.of(employees)
                .filter(e-> e.salary<5000 && e.city.equals("Delhi") )
                .map(e->e.fullName.split(" ")[0]).collect(Collectors.toSet()));;

    }
}
