//11. Write a program to define a class Employee to accept emp_id, emp _name, basic_salary from the user and display the gross_salary.

import java.util.Scanner;
class Employee {
 int emp_id;
 String emp_name;
 double basic_salary;
 Employee(int emp_id, String emp_name, double basic_salary) {
 this.emp_id = emp_id;
 this.emp_name = emp_name;
 this.basic_salary = basic_salary;
 }
 double grossSalary() {
 double da = 0.1 * basic_salary;
 double hra = 0.15 * basic_salary;
 return basic_salary + da + hra;
 }
 void display() {
 System.out.println("Emp ID: " + emp_id + ", Name: " +
emp_name + ", Gross Salary: " + grossSalary());
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter emp ID, Name, and Basic Salary: ");
 int id = sc.nextInt();
 sc.nextLine();
 String name = sc.nextLine();
 double salary = sc.nextDouble();
 Employee emp = new Employee(id, name, salary);
 emp.display();
 }
}