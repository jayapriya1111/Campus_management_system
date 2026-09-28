package com.campus.serices;

import java.util.List;
import java.util.ArrayList;

public class StudentService {
    private static final List<String> students = new ArrayList<>();

    //get student
    public StudentService(){
        students.add("101"- Bill - java);
        students.add("102"- steve - python);
        students.add("103"-john - c++); 
    }

    public List<String> getStudents(){
        return students;
          

        students = new ArrayList<>();
}
//add student
public void addStudent(String name,String course){
    student.add( String.valueOf(students.size() +1) + "-" +name + "-" + course);

}
    
}