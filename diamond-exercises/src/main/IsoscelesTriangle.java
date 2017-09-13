package main;

public class IsoscelesTriangle {
    public String printIsoscelesTriangle(Integer number) {
        StringBuffer isoscelesTriangle = new StringBuffer("");
        for (int i = 0; i < number; i++) {
            isoscelesTriangle.append(getWhiteSpace(i, number));
            isoscelesTriangle.append(getEveryTriangleLine(i));
            isoscelesTriangle.append(getWhiteSpace(i, number));

            if( i != number){
                isoscelesTriangle.append("\n");
            }
        }
        return isoscelesTriangle.toString();
    }

    private StringBuffer getWhiteSpace(int index, int number) {
        StringBuffer whiteSpace = new StringBuffer("");
        for (int i = 1; i < number - index; i++) {
            whiteSpace .append(" ");
        }
        return whiteSpace;
    }

    private StringBuffer getEveryTriangleLine(int number) {
        StringBuffer triangleLine = new StringBuffer("");

        for (int i = 0; i < number * 2 + 1; i++) {
            triangleLine .append("*");
        }
        return triangleLine;
    }
}
