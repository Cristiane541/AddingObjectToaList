package br.com.practice;

public class Main {

    public static void main(String[] args) {

        Employees emp1 = new Employees(1, "Jhon", 2000.00);
        EmployeesFuncions empFunctions = new EmployeesFuncions();
        empFunctions.addEmployees(emp1);
        empFunctions.showEmployeesList();

    }
}
