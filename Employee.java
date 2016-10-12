/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeexample;

/**
 *
 * @author user2
 */
abstract class Employee {

    /**
     * @param args the command line arguments
     */
    int empId;
    String empName;
    int total_leaves;
    double total_salary;
    
    
    abstract void calculate_balance_leaves();
    abstract boolean avail_leave(int no_of_leaves,char type_of_leave);
    abstract void calculate_salary();
    
    public static void main(String[] args) {
        // TODO code application logic here
        PermanentEmployee P1 = new PermanentEmployee();
        P1.calculate_balance_leaves();
        P1.calculate_salary();
        PermanentEmployee P2 = new PermanentEmployee();
        P2.avail_leave( 0 , ' ');
        P2.print_leave_details();
        
        TemporaryEmployee T1 = new TemporaryEmployee();
        T1.calculate_balance_leaves();
        T1.calculate_salary();
        TemporaryEmployee T2 = new TemporaryEmployee();
        T2.avail_leave( 0 , ' ');
        
        
    }
    
}

class PermanentEmployee extends Employee{
    
    int paid_leave,sick_leave,casual_leave;
    double basic,hra,pfa;
    int total_leaves=30;
    @Override
    void calculate_balance_leaves() {
        int paid_leave = 7;
        int sick_leave = 5;
        int casual_leave = 6;
        
        int total_leaves_taken = paid_leave+sick_leave+casual_leave;
        int balance_leaves = total_leaves-total_leaves_taken;
       
        System.out.println("Balance Leaves remaining Are : " +balance_leaves);
        
    }
    
      @Override
    void calculate_salary() {
        double basic = 1500;
        double hra = 250;
        double pf = 150;
        double total_sal;
        
        //Pf is 12% of basic salary
        double Pf = 0.12*basic;
        System.out.println("Total Pf : "+Pf);
        //Hra is 50% of basic salary
        double Hra = 0.5*basic;
        System.out.println("Total Hra : "+Hra);
        //Total Salary is
        total_sal = basic+hra-pf;
        System.out.println("Total Salary : "+total_sal);
        
    }

    @Override
    boolean avail_leave(int no_of_leaves, char type_of_leave) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        char typeof_paid_leave = 'P';
        char typeof_sick_leave = 'S';
        char typeof_casual_leave = 'C';
        //Total leaves assignied for paid_leave,sick_leave,casual_leave
        int total_paid_leave = 10;
        int total_sick_leave = 10;
        int total_casual_leave = 10;
        int paid_leave_taken = 7;
        int sick_leave_taken = 5;
        int casual_leave_taken = 3;
        
        if(paid_leave_taken < total_paid_leave){
            no_of_leaves = total_paid_leave - paid_leave_taken;
            System.out.println("You Can Avail : "+no_of_leaves+ " of Paid Leaves : "+typeof_paid_leave);
        }
        if(sick_leave_taken < total_paid_leave){
            no_of_leaves = total_paid_leave - sick_leave_taken;
            System.out.println("You Can Avail : "+no_of_leaves+ " of Sick Leaves : "+typeof_sick_leave);
        }
        if(casual_leave_taken < total_paid_leave){
            no_of_leaves = total_paid_leave - casual_leave_taken;
            System.out.println("You Can Avail : "+no_of_leaves+ " of Paid Leaves : "+typeof_casual_leave);
        }   
        return true;
    }

    //This is not a method defines from abstract class its a method defined in the Permanent Class
    void print_leave_details(){
        
    int paid_leave=15,sick_leave=5,casual_leave=5;
    int no_of_leaves=30;
    
        int total_leaves=paid_leave+sick_leave+casual_leave;
        System.out.println("Total Leaves: " +total_leaves);
        System.out.println("Paid Leave: " +paid_leave);
        System.out.println("Sick Leave: " +sick_leave);
        System.out.println("Casual Leave: " +casual_leave);
    }
    
    }

class TemporaryEmployee extends Employee{
    
    @Override
    void calculate_balance_leaves() {
        int paid_leave = 5;
        int sick_leave = 3;
        int casual_leave = 8;
        int total_leaves=20;
        int total_leaves_taken = paid_leave+sick_leave+casual_leave;
        int balance_leaves = total_leaves-total_leaves_taken;
       
        System.out.println("Balance Leaves remaining Are : " +balance_leaves);
        
    }
    @Override
    void calculate_salary() {
        double basic = 750;
        double hra = 250;
        double pf = 150;
        double total_sal;
        
        //Pf is 12% of basic salary
        double Pf = 0.12*basic;
        System.out.println("Total Pf : "+Pf);
        //Hra is 50% of basic salary
        double Hra = 0.5*basic;
        System.out.println("Total Hra : "+Hra);
        //Total Salary is
        total_sal = basic+hra-pf;
        System.out.println("Total Salary : "+total_sal);
        
    }
    
    @Override
    boolean avail_leave(int no_of_leaves, char type_of_leave) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        char typeof_paid_leave = 'P';
        char typeof_sick_leave = 'S';
        char typeof_casual_leave = 'C';
        //Total leaves assignied for paid_leave,sick_leave,casual_leave
        int total_paid_leave = 5;
        int total_sick_leave = 5;
        int total_casual_leave = 5;
        int paid_leave_taken = 4;
        int sick_leave_taken = 2;
        int casual_leave_taken = 3;
        
        if(paid_leave_taken < total_paid_leave){
            no_of_leaves = total_paid_leave - paid_leave_taken;
            System.out.println("You Can Avail : "+no_of_leaves+ " of Paid Leaves : "+typeof_paid_leave);
        }
        if(sick_leave_taken < total_paid_leave){
            no_of_leaves = total_paid_leave - sick_leave_taken;
            System.out.println("You Can Avail : "+no_of_leaves+ " of Sick Leaves : "+typeof_sick_leave);
        }
        if(casual_leave_taken < total_paid_leave){
            no_of_leaves = total_paid_leave - casual_leave_taken;
            System.out.println("You Can Avail : "+no_of_leaves+ " of Paid Leaves : "+typeof_casual_leave);
        }   
        return true;
    }

    }

    

    

   
    


  
    

