import java.time.LocalDate;



class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
       String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        LocalDate date = LocalDate.of(year,month,day);
        return week[date.getDayOfWeek().getValue()-1];
    }
}