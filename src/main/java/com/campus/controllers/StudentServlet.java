package com.campus.controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@webservlet("/students")
public class StudentServlet extends HttpServlet{



    private final StudentService StudentService = new StudentService();
    @Override 
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        response.setContentType("text/html");
        printWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>student list</title></head>");
        out.println("<body>");
        out.println("<h1>all students list</h1>");
        out.println("<ul>");
        for (String student:studentservice.getstudents()){
            out.println("<li>" + student + "</li>");
        }
        out.println("</ul");
        out.print("<a href=\"addstudent.html\">add student</a>");
        out.println("</body>");
        out.println("</html>");
    }
    @Override 
    public void doPost(HttpServletRequest request,Http,HttpServletResponse response)throws IOException{
        String name=request.getparameter("name");
        String course=request.getparameter("course");
        studentService.addStudent(name,course);
        response.sendRedirect("/Students");
    }


}
