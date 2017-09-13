package main;

import java.util.ArrayList;
import java.util.List;

public class RightTriangle {

    public String printRightTriangle(Integer number) {
        String rightTriangle = "";

        for (int i = 0; i < number; i++) {
            rightTriangle += getEveryTriangleLine(i) + "\n";
        }
        return rightTriangle.trim();
    }

    private String getEveryTriangleLine(int number) {
        String triangleLine = "*";

        for (int i = 0; i < number; i++) {
            triangleLine += "*";
        }
        return triangleLine;
    }
}
