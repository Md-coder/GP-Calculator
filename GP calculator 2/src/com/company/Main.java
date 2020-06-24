package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("________GP CALCULATOR________");
        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.print("Department:");
        String department=scanner.nextLine();
        System.out.print("No.of Courses:");
        int courses=scanner.nextInt();

        String grade="";
        int number=0;
        double totalUnit=0;
        double QP=0;
        double GP;

        for (int i=0;i<courses;i++){
            System.out.println("Courses Grade:");
            grade=scanner.next();
            System.out.print("Unit Load:");
            int unit=scanner.nextInt();

            if (grade.equalsIgnoreCase("A"))
                number=5;
            else if (grade.equalsIgnoreCase("B"))
                number=4;
            else if (grade.equalsIgnoreCase("C"))
                number=3;
            else if (grade.equalsIgnoreCase("D"))
                number=2;
            else if (grade.equalsIgnoreCase("E"))
                number=1;
            else if (grade.equalsIgnoreCase("F"))
                number=0;
            else
                System.out.println("invalid grade");

            totalUnit+=unit;
            QP += (number*unit);
        }
        GP= QP/totalUnit;
        System.out.println("______________________");
        System.out.println("Name:"+ name);
        System.out.println("Department:"+ department);
        System.out.println("GPA:"+  GP);
    }
}
