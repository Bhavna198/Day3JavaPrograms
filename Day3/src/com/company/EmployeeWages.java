package com.company;

public class EmployeeWages {
        public static final int Part_Time = 1;
        public static final int Full_Time = 2;
        public static final int Rate_Per_Hrs = 20;
        public static final int Working_Days = 20;
        public static final int Max_Hrs = 100;

        public static void main(String[] args) {
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            int empPresentCheck = (int) Math.floor(Math.random() * 10) % 2;
            if (empPresentCheck == 1)
                System.out.println("Employee Is present");

            else
                System.out.println("employee Is present");
            while (totalEmpHrs <= Max_Hrs && totalWorkingDays < Working_Days) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case Part_Time:
                        empHrs = 4;
                        break;
                    case Full_Time:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day:"   + totalWorkingDays +    "Emp Hr :"   +empHrs);
            }
            int totalEmpWage = totalEmpHrs * Rate_Per_Hrs;
            System.out.println("Total Emp Wage :" + totalEmpWage);
        }
    }


