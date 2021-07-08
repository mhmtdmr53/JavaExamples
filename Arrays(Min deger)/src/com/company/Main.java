package com.company;

import com.sun.jdi.request.BreakpointRequest;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

    int number=readInteger();
    int [] array=readElements(number);
    int min=findMin(array);
        System.out.println("Min Value: "+min);
    }
    public static int readInteger()
    {
        System.out.println("Enter Count: ");
        int number=scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    public static int [] readElements(int number)
    {
        int [] array=new int[number];
        for (int i=0;i<number;i++)
        {
            System.out.println("Enter"+i+". Element: ");
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array)
    {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]<min)
                min=array[i];
        }
        return min;

    }
}
