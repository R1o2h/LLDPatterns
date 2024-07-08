package builder;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<ParameterValues,Object>map=new HashMap<>();
        map.put(ParameterValues.name,"Tamil");
        map.put(ParameterValues.age,"24");

        StudentHelper helper= new StudentHelper();
        helper.name="Tamilvanan";
        helper.age=18;
        Student student= new Student(helper);

        Student s= Student.getBuilder()
                .setAge(13)
                .setName("Tamilvanan")
                .setPhone("1234")
                .setBatch("Aug21")
                .build();
    }
}

//Journey
// We had a lot of parameters
//Instead of constructor, we passed a Map
// Issues: Type casting , Typos
//Solve Typos: Enums
//TypeCasting
// Seperate class
//Code Duplication
//Inner Class
