package main;

public class HorizontalLine {
    public String printHorizontalLine(int number){
        String horizontalLine = "";

        for(int i = 0;i < number; i++){
            horizontalLine += "*";
        }

        return horizontalLine;
    }
}

