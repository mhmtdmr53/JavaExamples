package com.company;

public class Main {

    public static void main(String[] args) {

        Carpet carpet=new Carpet(3.5);
        Floor floor=new Floor(2.75,4.0);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println("total= "+ calculator.getTotalCost());
        carpet=new Carpet(1.5);
        floor=new Floor(5.4,4.5);
        calculator=new Calculator(floor,carpet);
        System.out.println("total= "+ calculator.getTotalCost());








     /*  Point first=new Point(6,5);
       Point second= new Point(3,1);
       System.out.println("distance(0,0)= "+ first.distance());
       System.out.println("distance(second)=" + first.distance(second));
       System.out.println("distance(2,2)= "+ first.distance(2,2));

       Point point=new Point();
       System.out.println("distance()= "+point.distance());

*/

        /* Wall wall=new Wall(5,4);
        System.out.println("area= "+ wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " +wall.getWidth());
        System.out.println("height=" +wall.getHeight());
        System.out.println("area= "+wall.getArea());

*/



        /*VipCustomer mali=new VipCustomer();
        System.out.println(mali.getCreditLimit());
        System.out.println(mali.getEmailAddress());

        VipCustomer meco=new VipCustomer("meco","meco@hotmail.com");
        System.out.println(meco.getCreditLimit());
        System.out.println(meco.getCustomerName());

        VipCustomer elif=new VipCustomer("elif",1500,"elif@hotmail.com");
        System.out.println(elif.getCustomerName());
        System.out.println(elif.getEmailAddress());

*/





        /*Person person=new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= "+ person.getFullName());
        System.out.println("teen= "+ person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= "+ person.getFullName());

*/







        /* SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide= "+calculator.getDivisionResult());
    */
    }
}
