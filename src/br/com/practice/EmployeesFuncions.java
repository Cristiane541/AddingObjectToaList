package br.com.practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeesFuncions {
    private final List<Employees> employeesList;

    public EmployeesFuncions() {
        this.employeesList = new ArrayList<>();
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }
    
    public void addEmployees(Employees employees){
        employeesList.add(employees);
    }

    public void removeById(int id){
        for (int i = 0, employeesListSize = employeesList.size(); i < employeesListSize; i++) {
            Employees emp = employeesList.get(i);
            if (emp.getId() == id) {
                employeesList.remove(emp);
            }
        }
    }

    public void searchEmployeeByName(String name){
        for (Employees emp: employeesList) {
            if (emp.getName().equalsIgnoreCase(name)){
                System.out.println("Employee ID: " +emp.getId()+
                                   "Name: "        +emp.getName()+
                                   "Salario $: "   +emp.getSalary());
            }
        }
    }

    public void showEmployeesList(){
        for (Employees emp: employeesList) {
            System.out.println("Employee ID: " +emp.getId()+
                               "Name: "        +emp.getName()+
                               "Salario $: "   +emp.getSalary());
        }
    }

}
