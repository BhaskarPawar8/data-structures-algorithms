package src.MathAlgorithms;

public class PrimeNumberDemo {

    public boolean isPrimeNumber(int i){

        for(int a = 2; a < i/2; a++){
            if(i%a == 0){
                return false;
            }
        }
        return true;
    }
//You can write a program to divide the given number n, by a number from 2 to n/2 and check the remainder. If the remainder is 0, then it’s not a prime number
    public static void main(String[] args) {

        int i = 13;

        PrimeNumberDemo primeNumberDemo = new PrimeNumberDemo();

        System.out.println(i + "Is it Prime number? :  " + primeNumberDemo.isPrimeNumber(i));

    }
}
