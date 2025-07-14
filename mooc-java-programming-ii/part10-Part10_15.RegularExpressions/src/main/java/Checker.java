public class Checker {
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches("((a)*|(i)*|(u)*|(e)*|(o)*)+")) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string) {
        if (string.matches("[0-2][0-9]" + ":" + "[0-5][0-9]" + ":" + "[0-5][0-9]")) {
            if (string.matches("2[4-9]*" + ":" + "[0-5][0-9]" + ":" + "[0-5][0-9]")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
