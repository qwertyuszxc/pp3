public class Student {
    String name;
    int   age;
    int StudentID;
    Boolean IDvalid;
    int Semester;
    float AvgGrade;

    void sayHello(){
        System.out.println("Hello from " + name);   
    }
    void displayName(){
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }
    void displayInfo(){
        System.out.println("Name: "+name + " semester: " + Semester + " average grade: "+ AvgGrade);
    }
    void changeStatus(){
        IDvalid = !IDvalid;
    }
    public static void main(String[] args) {
        
        // object creation
        Student stud = new Student();
        Student s = new Student();
        
        // object manipulation
        stud.StudentID = 267800;
        stud.IDvalid = false;
        stud.Semester = 4;
        stud.AvgGrade = 3;
        stud.name = "Alex";
        stud.age = 21;

        s.StudentID = 225270;
        s.IDvalid = true;
        s.Semester = 3;
        s.AvgGrade = 4;
        s.name = "Nikita";
        s.age = 19;
    }   
}


