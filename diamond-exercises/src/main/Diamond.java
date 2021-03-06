package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Diamond {

    public String printDiamond(int number) {
        StringBuffer Diamond = new StringBuffer("");
        List<StringBuffer> tempDiamond = new ArrayList<StringBuffer>();

        for (int i = 0; i < number; i++) {
            StringBuffer DiamondLine = getWhiteSpace(i, number)
                    .append(getEveryTriangleLine(i))
                    .append(getWhiteSpace(i, number));
            DiamondLine.append("\n");
            tempDiamond.add(DiamondLine);
            Diamond.append(DiamondLine);
        }

        tempDiamond.remove(number - 1);
        Collections.reverse(tempDiamond);
        tempDiamond.stream().forEach(s -> Diamond.append(s));
        return Diamond.toString().substring(0, Diamond.length() - 1);
    }

    private StringBuffer getWhiteSpace(int index, int number) {
        StringBuffer whiteSpace = new StringBuffer("");
        for (int i = 1; i < number - index; i++) {
            whiteSpace.append(" ");
        }
        return whiteSpace;
    }

    private StringBuffer getEveryTriangleLine(int number) {
        StringBuffer triangleLine = new StringBuffer("");

        for (int i = 0; i < number * 2 + 1; i++) {
            triangleLine.append("*");
        }
        return triangleLine;
    }
}
