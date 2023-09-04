
package Lab1;
import Lab1.Teacher;
import java.util.*;
public class TestTeacher {
    public static void main(String[] args) {
        Teacher t =new Teacher();    //instanstation
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter Teacherid,fullname,email,salary");
        int teacherId=ob.nextInt();
        String fullname =ob.next();
        String email =ob.next();
        Double salary=ob.nextDouble();
        
        t.setTeacherId(teacherId);
        t.setFullname(fullname);
        t.setEmail(email);
        t.setSalary(salary);
        
        System.out.println("Id="+ t.getTeacherId());
        System.out.println("Fullname="+ t.getFullname());
        System.out.println("Email="+ t.getEmail());
        System.out.println("Salary="+ t.getSalary());
        
        
        
    }
    
}
