public class Program3 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 20;
        int result = 0;
        char operator = '-';
        //+,-,*,/
        // if (operator == '+') {
        //     result = number1 + number2;
        // }else if(operator == '-'){
        //     result = number1 - number2;
        // }else if(operator == '*'){
        //     result = number1 * number2;
        // }else if(operator == '/'){
        //     result = number1 / number2;
        // }else{
        //     System.out.println("Invalid operator");
        //     System.exit(0);
        // }
        switch(operator){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Inavlid operator");
        }

        System.out.println(result);
    }
}
