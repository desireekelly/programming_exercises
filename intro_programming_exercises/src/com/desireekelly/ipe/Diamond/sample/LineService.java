package com.desireekelly.ipe.Diamond.sample;

public class LineService {

    private int diamondSize;

    public LineService(int diamondSize) {
        this.diamondSize = diamondSize;
    }

    public String getLine(int lineNumber) {
        int lineSize = getLineSize(lineNumber);
        return getLineSpaces(lineNumber)  + generateRepeatString(lineSize, "*") + getLineSpaces(lineNumber);
    }

    private String getLineSpaces(int lineNumber) {
        int spaceSize = (getLineSize(diamondSize) - getLineSize(lineNumber))/2;
        return generateRepeatString(spaceSize, " ");
    }

    private String generateRepeatString(int stringSize, String replacement) {
        return new String(new char[stringSize]).replace("\0", replacement);
    }

    private int getLineSize(int lineNumber) {
        return 2 * lineNumber - 1;
    }
}
