package builder;

import java.security.InvalidParameterException;

class StudentHelper {
    String name;
    int age;
    String phone;
    String batch;
    String email;
    String password;
}
public class Student {
    private String name;
    private int age;
    private String phone;
    private String batch;
    private String email;
    private String password;

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }     // this is alternative for new keyword in client (object).

    private Student() {
        //this is the constructor for below
    }
   public static class StudentBuilder {
       private Student student= new Student();
//        void build() {
//           Student s= new Student();
//           s.name="Tamilvanan";
//           s.age=18;
//        }

        public StudentBuilder setName(String name) {
            student.name= name;
            return this;
        }
       public StudentBuilder setAge(int age) {
          student.age=age;
          return this;
       }
       public StudentBuilder setPhone(String phone) {
           student.phone=phone;
           return this;
       }
       public StudentBuilder setBatch(String batch) {
          student.batch=batch;
          return this;
       }
       public Student build() {
            if(student.age<18) {
                throw new InvalidParameterException();
            }
            if(student.name==null) {
                throw new NullPointerException();
            }
            return student;
       }
    }

    //constructor

//    public Student(String name, int age, String phone, String batch, String email, String password) {
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.batch = batch;
//        this.email = email;
//        this.password = password;
//    }
     //Bad for readability


    //Mapper function
//    public Student (Map<ParameterValues,Object>parameters) {
//        this.name=(String) parameters.get(ParameterValues.name);
//        this.age=(int) parameters.get(ParameterValues.age);
//    }//  Type casting could be same and also we encounters typo errors in client class


    public Student (StudentHelper helper) {
        if (helper.age<18) {
            throw new InvalidParameterException();
        }
        if(helper.name==null) {
            throw new NullPointerException();
        }
        this.name= helper.name;
        this.age= helper.age;
    }

}
