package main;

public class FizzBuzz {

    public String printFizzBuzz(int number) {
        StringBuffer resultString = new StringBuffer("");

        for (int i = 1; i <= number; i++) {
            if( i % 3 == 0 && i % 5 == 0){
                resultString.append("FizzBuzz\n");
            }else if(i % 5 == 0){
                resultString.append("Buzz\n");
            }else if(i % 3 == 0){
                resultString.append("Fizz\n");
            }else{

                resultString.append(i).append("\n");
            }
        }
        return resultString.substring(0,resultString.length()-1);
    }
}
