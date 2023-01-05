package controller;

import modal.Employee;
import services.Employservice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "createServlet", value = "/createServlet")
public class createServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phonenumber = request.getParameter("phonenumber");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String department = request.getParameter("department");

        Employservice.save(new Employee(name,email,address,phonenumber,salary,department));
        response.sendRedirect("/employees");
    }
}
