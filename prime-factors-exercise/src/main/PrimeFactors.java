package main;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List generateFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        if(number == 1){
            return factors;
        }
        
        for(int i = 2;i <=number; i++){
            if(number % i == 0){
                factors.add(i);
                number = number / i;
                i = 2;
            }

        }

        return  factors;
    };
}
