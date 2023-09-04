
package Lab1;


public class Teacher {
    private int teacherId;
    private String fullname,email;
    private Double salary;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

   

//    public Teacher(int teacherId, String fullname, String email, Double salary) {
//        this.teacherId = teacherId;
//        this.fullname = fullname;
//        this.email = email;
//        this.salary = salary;
//    }
//    
   public Teacher() {
    }    
   //lab2
    public void setInfo(int teacherId,String fullname,Double salary){
        this.teacherId=teacherId;
        this.fullname=fullname;
        this.email=email;
        this.salary=salary;
                
    }
    public void showInfo(){
        System.out.println("Id: " + teacherId);
        System.out.println("Fullname: " + fullname);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
        
}
    //Constructor
     Teacher(int id, String fName, String em, Double sa) {
        teacherId = id;
        fullname = fName;
        email = em;
        salary = sa;
   }
}
