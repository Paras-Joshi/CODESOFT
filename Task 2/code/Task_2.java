
import java.util.*;
class Task_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tot_sub, sum = 0,marks;
    float avg;
    System.out.println("\n Enter Total Subjects : ");
    tot_sub = sc.nextInt();
        for(int i=0; i<tot_sub;i++)
        {
            System.out.println("\n Enter Marks : ");
            marks = sc.nextInt();
            sum = sum+marks;
        }
        System.out.println("\n\t SUM OF MARKS : "+sum);
        avg = sum/tot_sub;
        System.out.println("\n\t AVERAGE OF MARKS : "+avg);
        if(avg<35.00)
        {
            System.out.println("\n\t GRADE : Fail !!");
        }
        else if(avg>=35.00 && avg<=59.99)
        {
            System.out.println("\n\t GRADE : D");
        }
        else if(avg>=60.00 && avg<=69.99)
        {
            System.out.println("\n\t GRADE : C");
        }
        else if(avg>=70.00 && avg<=79.99)
        {
            System.out.println("\n\t GRADE : B");
        }
        else if(avg>=80.00 && avg<=89.99)
        {
            System.out.println("\n\t GRADE : A");
        }
        else if(avg>=90.00)
        {
            System.out.println("\t GRADE : A+");
        }

    }
}