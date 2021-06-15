/* A program to check by the symptoms of a person if he is at a risk of contracting COVID-19 or not*/
import java.util.*;
public class covid19_check
{//start of class
    public static void main(String args[])
    {//start of method main()
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter your name..");
        String name=sc.nextLine();
        System.out.println("Enter your age..");
        int age=sc.nextInt();
        System.out.println("We will now be checking if you have any COVID-19 related symptoms..");

        System.out.println("Do you have fever..(1 for yes and 2 for no)");
        int s1=sc.nextInt();
        System.out.println("Are you experiencing difficulty in breathing (1 for yes and 2 for no)");
        int s2=sc.nextInt();
        System.out.println("Do you have cold/cough (1 for yes and 2 for no)");
        int s3=sc.nextInt();
        System.out.println("Do you feel tired very often (1 for yes and 2 for no)");
        int s4=sc.nextInt();
        System.out.println("Do you get a vomiting sensation a couple of times in a day (1 for yes and 2 for no)");
        int s5=sc.nextInt();
        System.out.println("Do you feel chilly/sweaty (1 for yes and 2 for no)");
        int s6=sc.nextInt();
        System.out.println("Have you travelled internationally in the last 40 days (1 for yes and 2 for no)");
        int s7=sc.nextInt();
        System.out.println("Do you live in a high risk/containment zone (1 for yes and 2 for no)");
        int s8=sc.nextInt();
        
        if(s1==1 && s2==1 && s3==1 && s4==1 && s5==1 && s6==1 && s7==1 && s8==1)
        {
            System.out.println("YOU ARE AT A HIGH RISK OF CONTRACTING THE VIRUS,YOU SHOULD GET YOURSELF TESTED");
        }
        else
        {
            System.out.println("DEAR "+name+ " YOU SHOULD GET YOURSELF CHECKED ONLY IF YOU FEEL ILL");
        }
        
        System.out.println("According to https://www.who.int");
        
        if(age>0 && age<=9)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 0.0%");
        }
        else if(age>10 && age<=19)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 0.2%");
        }
        else if(age>20 && age<=29)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 0.4%");
        }
        else if(age>30 && age<=39)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 0.6%");
        }
        else if(age>40 && age<=49)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 1.67%");
        }
        else if(age>50 && age<=69)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 14.65%");
        }
        else if(age>70)
        {
            System.out.println("THE FATALITY RATE FOR YOUR AGE GROUP IS 36.67%");
        }
        else
        {
            System.out.println("invalid age");
        }
        
        System.out.println("REGARDLESS OF THESE SYMPTOMS..");
        System.out.println("WEAR A MASK");
        System.out.println("MAINTAIN SOCIAL DISTANCING");
        System.out.println("AND FOLLOW PROTOCOLS");
                
        System.out.println("THANK YOU :)");
    }//end of method main ()
}//end of class
