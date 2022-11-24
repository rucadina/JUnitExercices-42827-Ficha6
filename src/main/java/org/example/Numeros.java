package org.example;

public class Numeros {

    public boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public boolean isEven(int number){
        if(number%2!=0){
            return false;
        }
        return true;
    }

    public boolean isMultiple(int number,int divisor){
        if(number%divisor!=0){
            return false;
        }
        return true;
    }
}
