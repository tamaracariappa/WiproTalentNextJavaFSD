/*
 * Given the following table containing information about employees of an organization, develop a
 * small java application, which accepts employee id from the command prompt and displays the
 * following details as output:
 *
 * EmpNo   EmpName   Department   Designation   Salary
 *
 * In your program, you must initialize an array with the following details.
 *
 * Emp No | Emp Name | Join Date  | Designation Code | Department   | Basic | HRA   | IT
 * ------------------------------------------------------------------------------------------
 * 1001   | Ashish   | 01/04/2009 | e                | R&D          | 20000 | 8000  | 3000
 * 1002   | Sushma   | 23/08/2012 | c                | PM           | 30000 | 12000 | 9000
 * 1003   | Rahul    | 12/11/2008 | k                | Acct         | 10000 | 8000  | 1000
 * 1004   | Chahat   | 29/01/2013 | r                | Front Desk   | 12000 | 6000  | 2000
 * 1005   | Ranjan   | 16/07/2005 | m                | Engg         | 50000 | 20000 | 20000
 * 1006   | Suman    | 1/1/2000   | e                | Manufacturing| 23000 | 9000  | 4400
 * 1007   | Tanmay   | 12/06/2006 | c                | PM           | 29000 | 12000 | 10000
 *
 * DA (Dearness Allowance) details are given in the below "Designation" table.
 *
 * Designation Code | Designation   | DA
 * -----------------------------------------
 * e                | Engineer      | 20000
 * c                | Consultant    | 32000
 * k                | Clerk         | 12000
 * r                | Receptionist  | 15000
 * m                | Manager       | 40000
 *
 * Note 1: Salary should be calculated as (Basic + HRA + DA - IT).
 *
 * Note 2: Use switch-case to print Designation and to find the value of DA for a particular employee.
 *
 *
 * Expected Output format: (assuming that your class name is Project1)
 *
 * If you execute the command java Project1 1003, the output should be -
 *
 * Emp No.   Emp Name   Department   Designation   Salary
 * 1003      Rahul      Acct         Clerk         29000
 *
 * If you execute the command java Project1 123, the output should be -
 *
 * There is no employee with empid : 123
 */

public class MiniProject{
    public static void main(String args[]){
        String[][] data = { {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000" , "3000"},
                        {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"}, 
                        {"1003", "Rahul ", "12/11/2008", "k", "Acct", "10000", "8000" , "1000"}, 
                        {"1004", "Chahat", "29/01/2013", "r", "Front Desk","12000", "6000" , "2000"}, 
                        {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"}, 
                        {"1006", "Suman ", "1/1/2000", "e", "Manufacturing", "23000", "9000" , "4400"}, 
                        {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}};
        String[] headers = {"Emp No", "Emp Name", "Department", "Designation", "Salary"};

        String search = args[0];
        String Designation = "";
        int DA = 0;

        for(String[] a : data){
            if(a[0].equals(search)){
                switch(a[3]){
                    case "e":
                        Designation = "Engineer";
                        DA = 20000;
                    break;
                    case "c":
                        Designation = "Consultant";
                        DA = 32000;
                    break;
                    case "k":
                        Designation = "Clerk";
                        DA = 12000;
                    break;
                    case "r":
                        Designation = "Receptionist";
                        DA = 15000;
                    break;
                    case "m":
                        Designation = "Manager";
                        DA = 40000;
                    break;
                }
                int salary = Integer.parseInt(a[5]) + Integer.parseInt(a[6]) + DA - Integer.parseInt(a[7]);
                for (String head : headers)
                    System.out.print(head+"\t");
                System.out.print("\n"+a[0]+"\t"+a[1]+"\t\t"+a[4]+"\t\t"+Designation+"\t\t"+salary);

                System.exit(0);
            }
        }
        
        System.out.println("There is no employee with empid : "+search);
    }
}