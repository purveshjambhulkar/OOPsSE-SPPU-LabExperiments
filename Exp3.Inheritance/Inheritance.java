/*Design and develop inheritance for a given case study,
 identify objects and relationships and implement inheritance wherever applicable. 
 Employee class has Emp_name, Emp_id, Address, Mail_id, and Mobile_no as members.
  Inherit the classes: Programmer, Team Lead, Assistant Project Manager 
  and Project Manager from employee class. 
  Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 
  10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund.
   Generate pay slips for the employees with their gross
and net salary.
 */

class Employee {

   String Emp_name;
   int Emp_id;
   String Address;
   String Mail_id;
   int Mobile_no;

   float Basic_pay;

   void salary() {
      float hra, da, pf, cf;
      float gross, net;
      da = (Basic_pay * 97 / 100);
      hra = (Basic_pay * 10 / 100);
      pf = (Basic_pay * 12 / 100);
      cf = (Basic_pay * (float) 0.1 / 100);

      gross = Basic_pay + da + hra - pf - cf;

      net = gross - (pf + cf);

      System.out.println("Gross Salary : " + gross);
      System.out.println("Net Salary : " + net);

   }

   void displayPaySlips() {
      System.out.println("Employee Name : " + Emp_name);
      System.out.println("Employee ID : " + Emp_id);
      salary();
      System.out.println();

   }

}

class Programmer extends Employee {

   Programmer(String Emp_name, int Emp_id, float Basic_pay) {
      this.Emp_name = Emp_name;
      this.Emp_id = Emp_id;
      this.Basic_pay = Basic_pay;
   }

}

class Team_Lead extends Employee {
   Team_Lead(String Emp_name, int Emp_id, float Basic_pay) {
      this.Emp_name = Emp_name;
      this.Emp_id = Emp_id;
      this.Basic_pay = Basic_pay;
   }
}

class Assistant_Project_Manager extends Employee {
   Assistant_Project_Manager(String Emp_name, int Emp_id, float Basic_pay) {
      this.Emp_name = Emp_name;
      this.Emp_id = Emp_id;
      this.Basic_pay = Basic_pay;
   }
}

class Project_Manager extends Employee {
   Project_Manager(String Emp_name, int Emp_id, float Basic_pay) {
      this.Emp_name = Emp_name;
      this.Emp_id = Emp_id;
      this.Basic_pay = Basic_pay;
   }
}

public class Inheritance {
   public static void main(String[] args) {
      Programmer programmer = new Programmer("Purvesh", 59, 100000);
      Team_Lead team_Lead = new Team_Lead("Viraj", 46, 15000);
      Assistant_Project_Manager assistant_Project_Manager = new Assistant_Project_Manager("OM", 27, 500);
      Project_Manager project_Manager = new Project_Manager("Sahil", 58, 100);

      programmer.displayPaySlips();
      team_Lead.displayPaySlips();
      assistant_Project_Manager.displayPaySlips();
      project_Manager.displayPaySlips();
   }

}
