package com.company;

public class Main {

    public static void main(String[] args) {
	byte x, z ;
    int y;

    x = 5;
    y = x * x;    // все правлильно, результат операции
                 // имеет тип int
    z = (byte) (x * x);   //чтобы записать результат
                          //в переменную типа byte
                       //требуется явное преоброзование
                        //типа результата
    } // main(String[] ) method
} // GradualCastDemo class
