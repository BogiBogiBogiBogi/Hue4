package hue4git;

public class NumericFinder {

    public boolean isNumeric(String n) {
        try {
            Integer.parseInt(n);
        } catch (NumberFormatException o) {
            return false;
        }

        return true;
    }

}