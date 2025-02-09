package src.StringAlgorithms;

public class ReverseStringDemo {

    public String reverseString(String s){

        char[] charArray = s.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = charArray.length -1; i >= 0; i--){
            stringBuilder.append(charArray[i]);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {


        String str = new String("Bhaskar");

        ReverseStringDemo reverseStringDemo = new ReverseStringDemo();

        System.out.println("Reversed String: " + reverseStringDemo.reverseString(str));

    }
}
