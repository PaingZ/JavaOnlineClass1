public class Program3 {
    public static void main(String[] args) {
        // int english = 50;
        // int math = 80;
        // int science = 70;

        // int total = english + math + science;//0.6667 => 0
        //                         //0
        // float percentage = ((float)total/300)*100;

        float english = 50;
        float math = 80;
        float science = 70;

        float total = english + math + science;//0.6667 => 0
                                //0
        float percentage = (total/300)*100;//66.67

        //over 80 => best
        //over 60 and under 80 => good
        //over 40 and under 60 => fine
        //under 40 => bad

        // System.out.println(percentage);
        // if(percentage >= 80){
        //     System.out.println("best");
        // }else if(percentage >= 60 && percentage < 80){
        //     System.out.println("good");
        // }else if(percentage >= 40 && percentage < 60){
        //     System.out.println("fine");
        // }else {
        //     System.out.println("bad");
        // }

        boolean result = (percentage >= 60 && percentage < 80);

        System.out.println(result);


    }
}
