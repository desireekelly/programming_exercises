package com.desireekelly.ipe.Diamond.sample;

public class Diamond {

    private  LineService lineService;

    public Diamond(LineService lineService) {
        this.lineService = lineService;
    }

    public String getDiamond(int maxLineSize) {
        String triangle = "";

        for (int line = 1; line <= maxLineSize; line++) {
            triangle = triangle + lineService.getLine(line) + "\n";
        }

        return triangle;
    }
}
