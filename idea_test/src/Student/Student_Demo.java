package Student;

public class Student_Demo {
    public static void main(String[] args) {
        Student s=new Student();
        Student stu=new Student("孩子",17);
        Student stu2=new Student("孩子",17);
            System.out.println(stu.equals(stu2));
    }
}
