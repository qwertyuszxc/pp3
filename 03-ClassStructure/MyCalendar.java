public class MyCalendar {
    static int year = 2023;
    static int month = 9;
    static int day = 4;

    static String MyDate(){
        return year+"-"+month+"-"+day;
    }

    static int days(){
        int[] months = {31, 28, 31, 30 ,31 ,30 ,31 ,30 ,31 , 30 ,31 ,30};
        int day_passed = 0;
        int index = 0;
        for (int i : months){
            index+=1;
            day_passed+=i;
            if (index == month - 1){
                break;
            }}
        day_passed+=day;
        return day_passed;
        }
    
    static String monthname(){
        String[] monthnames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String name = monthnames[month-1];
        return name;
        }
    public static void main(String[] args){
        System.out.println(MyDate());
        System.out.println(days());
        System.out.println(monthname());
    }
    
}
