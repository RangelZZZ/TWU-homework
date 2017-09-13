package test;

import static org.junit.Assert.*;

public class VerticalLineTest {
    public String printVerticalLine(int number){
        String verticalLine = "";

        for(int i = 0;i < number; i++){
            verticalLine += "*\n";
        }

        return verticalLine;
    }
}