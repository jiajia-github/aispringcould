package com.southwind.entity;

import java.util.Base64;

public class demo {
    public static void main(String[] args) {

    }
}
abstract class  test1{
    public abstract  int fun( );

    public  void fun1(){

        }
}

 interface DefaultTest2{
     default void defaultTest1(){
         System.out.print("2121");
        }
}

class a extends  test1{
    @Override
    public int fun() {
        Base64.getEncoder();
        return 0;
    }
}



