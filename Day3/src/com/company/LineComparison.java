package com.company;

import java.util.Scanner;

public class LineComparison {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter four different co-ordinate");
            Double firstLine = calculateDistanceBetweenCoordinate(sc.nextLine().split(" "));
            System.out.println("Enter four different co-ordinate");
            Double secondLine = calculateDistanceBetweenCoordinate(sc.nextLine().split(" "));

            if (firstLine.compareTo(secondLine) > 0)
                System.out.println("first line is greater");
            else if (firstLine.compareTo(secondLine) < 0)
                System.out.println("second line is greater");
            else
                System.out.println("Both are equal");
        }

        public static double calculateDistanceBetweenCoordinate(String[] data) {
            double[] value = new double[4];
            for (int i = 0; i < data.length; i++)
                value[i] = Double.parseDouble(data[i]);
            return Math.sqrt(Math.pow((value[1] - value[0]), 2) + Math.pow((value[3] - value[2]), 2));
        }
}
