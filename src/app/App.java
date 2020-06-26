package app;

import app.model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setAge(18);
        student.setGender("男");
        student.setName("name");
        student.setIDNO("333");
        System.out.println(student);
    }
}