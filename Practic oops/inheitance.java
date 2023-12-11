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

    public String Emp_name;
    public int Emp_id;
    public String Address;
    public String Email_id;
    public int Mobile_no;

    public float Basic_pay;

    public void Salary() {
        float da, hra, pf, cf;
        float net, gross;

        da = Basic_pay * (97 / 100);
        hra = Basic_pay * (10 / 100);
        pf = Basic_pay * (12 / 100);
        cf = Basic_pay * (1 / 1000);

        gross = Basic_pay + da + hra - pf - cf;
        net = gross - (pf + cf);

        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);

    }

    public void DisplaySlips() {
        System.out.println("Name : " + Emp_name);
        System.out.println("ID : " + Emp_id);
        System.out.println("Basic Pay : " + Basic_pay);
        Salary();

    }

}

class Programmer extends Employee {
    Programmer(String name, int id, int bp) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Basic_pay = bp;
    }

}
class TeamLead extends Employee {
    TeamLead(String name, int id, int bp) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Basic_pay = bp;
    }

}

public class inheitance {

    public static void main(String args[]){
        Programmer p2 = new Programmer("fdswe", 345, 345);
        TeamLead t2 = new TeamLead("fdswe", 345, 345);

        p2.DisplaySlips();
        t2.DisplaySlips();
    }
}
