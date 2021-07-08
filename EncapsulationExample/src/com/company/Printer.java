package com.company;

public class Printer {
    private int tonerLevel, pagesPrinted=0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel<0 || tonerLevel>100)?-1:tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount)
    {
        if (tonerAmount>0&& tonerAmount<=100)
        {
            if (this.tonerLevel+tonerAmount>100)
                return -1;

            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }
        else
            return -1;


    }
    public int printPages(int pages)
    {
        int print=pages;
        if (this.duplex)
        {
            print=(pages/2)+(pages%2);
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted +=print;
        return print;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
