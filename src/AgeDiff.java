public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (birth == yearTo) {
            return "You were born this very year!";
        }
        else if (birth < yearTo) {
            int year = yearTo - birth;
            return "You are " +  year  + (year == 1 ? " year old." : " years old.");
        }
        else {
            int birthpast = birth - yearTo;
            return "You will be born in " + birthpast + ( birthpast == 1 ? " year." : " years.");
        }
    }
}