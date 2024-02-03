import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = new int[10];
        // boolean x = true;
        int j = 0;

        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter the number of arr[%d]: ",i);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        while(true){
            if(num == arr[j]){
                System.out.println("Data found!");
                break;
            }else {
                j+=4;
                if(num == arr[j]){
                    System.out.println("Data found!");
                    break;
                }else {
                    if (num > arr[j]) {
                        j += 4;
                        if(num == arr[j]) {
                            System.out.println("Data found!");
                            break;
                        }else{
                            if (num > arr[j]){
                                j+=1;
                                if(num == arr[j]) {
                                    System.out.println("Data found!");
                                    break;
                                }else {
                                    System.out.println("Data not found!");
                                    break;
                                }
                            }else {
                               j-=2;
                                if (num == arr[j]){
                                    System.out.println("Data found!");
                                    break;
                                }else {
                                    if (num > arr[j]){
                                        j+=1;
                                        if (num == arr[j]){
                                            System.out.println("Data found!");
                                            break;
                                        }else {
                                            j-=1;
                                            if (num == arr[j]){
                                                System.out.println("Data found!");
                                                break;
                                            }else {
                                                System.out.println("Data  not found!");
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    } else {
                        j -= 2;
                        if(num == arr[j]){
                            System.out.println("Data found!");
                            break;
                        }else {
                            if (num > arr[j]){
                                j+=1;
                                if(num == arr[j]) {
                                    System.out.println("Data found!");
                                    break;
                                }else {
                                    System.out.println("Data not found!");
                                    break;
                                }
                            }else {
                                j-=1;
                                if(num == arr[j]) {
                                    System.out.println("Data found!");
                                    break;
                                }else {
                                    System.out.println("Data not found!");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
