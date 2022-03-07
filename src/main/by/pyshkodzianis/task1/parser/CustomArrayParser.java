package by.pyshkodzianis.task1.parser;

public class CustomArrayParser {
    private static final String SPACE = "\\s";

    public int[] parse(String arrayData) {
        int[] array = null;

        if (arrayData != null) {
            array = new int[arrayData.split(SPACE).length];
           int i = 0;
            for (String element : arrayData.split(SPACE)) {
                array[i] = Integer.parseInt(element);
                ++i;
            }
        }
        return array;
    }
}