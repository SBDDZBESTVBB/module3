package controller;

import modal.Employee;
import services.Employservice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreatServlet1", value = "/CreatServlet1")
public class CreatServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phonenumber = request.getParameter("phonenumber");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String department = request.getParameter("department");

        Employservice.edit(new Employee(id,name,email,address,phonenumber,salary,department));
    }
}
