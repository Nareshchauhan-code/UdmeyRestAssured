package com.rest;

public class MethodChaining {

    static MethodChaining fristMethod(){

        System.out.println("Frist Method");
        //return this;

        return new MethodChaining();
    }

    MethodChaining secondMethod(){

        System.out.println("Second Method");

        return this;
    }

    MethodChaining thirdMethod(){

        System.out.println("Third Method");
        return this;
    }

    public static void main(String[] args) {

       // MethodChaining ob= new MethodChaining();
      // ob.fristMethod().secondMethod().thirdMethod();


        fristMethod().
                secondMethod().
                thirdMethod();


    }
}
