package java_test01;

import java.util.ArrayList;
import java.util.Scanner;

public class test_demo_01 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            add_student(arr);
        }
//        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            Student s= arr.get(i);
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
    public static void add_student(ArrayList<Student> arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=sc.nextLine();
        System.out.println("请输入年龄：");
        String age=sc.nextLine();
        Student stu=new Student();
        stu.setName(name);
        stu.setAge(age);
        arr.add(stu);
    }
}
