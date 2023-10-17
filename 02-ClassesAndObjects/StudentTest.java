public class StudentTest {
    String name;
    int age;
    void sayHello(){
        System.out.println("Hello from " + name);   
    }
    void displayName(){
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }
    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Nikita";
        s.age = 19;
    }   
}

