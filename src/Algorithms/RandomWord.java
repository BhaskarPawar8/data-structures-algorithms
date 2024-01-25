package src.Algorithms;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.*;

public class RandomWord {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ben","car","cycle","bike","scooter");
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your inputs");
        while(scanner.hasNextLine()) {
            String readLine = scanner.nextLine();
            list.add(readLine);
            if(readLine == null)
                break;
        }*/

        int n = list.size();
        String champion = list.get(n-1);
        Random random = new Random();
        for(int i = n-1;i > 0; i--){
            int pick =  random.nextInt(0,i);
            champion = list.get(pick);
        }
        System.out.println(champion);

    }
}
