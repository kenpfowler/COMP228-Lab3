package Excercise2;

public class Program {
    public static void main(String[] args) {
        PartTimeDeveloper employee = new PartTimeDeveloper("JIM", 20);
        FullTimeDeveloper employee2 = new FullTimeDeveloper("Ken");

        System.out.println(employee.toString());
        System.out.println(employee2.toString());
    }
}
