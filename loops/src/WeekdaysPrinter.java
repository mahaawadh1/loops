public class WeekdaysPrinter {
    public static void main(String[] args) throws Exception {



        String[] Weekdays  = {"sat" , "sun" , "mon" , "tue" , "wed" , "thu" , "fri" };
        


        for (int i = 0; i < Weekdays.length; i++) {
            if (i>4) {
                break;
            }
            System.out.println(Weekdays[i]); // Prints numbers from 1 to 7
        }


    }
}
