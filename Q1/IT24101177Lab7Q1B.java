import java.util.Scanner;

  public class IT24101177Lab7Q1B {

public static void main(String[]args){

    Scanner input=new Scanner(System.in);

int StudentCount;
for(StudentCount=1;StudentCount<=3;StudentCount++){ // student count loop
System.out.println("Student"+StudentCount);

  int count;
  double average,total=0;
 

   System.out.print("Enter Marks :");
   double no01=input.nextDouble();
   double no02=input.nextDouble();
   double no03=input.nextDouble();
   double no04=input.nextDouble();

  total=no01+no02+no03+no04;
 
                                    
average=total/4;
System.out.println("Average is :"+average);
                                               
if(average>=0 && average<50)
{System.out.println("Overall Grade is :Fail");}
else if(average<75 && average>=50)
{System.out.println("Overall Grade is :Credit");}
else if(average<=100 && average>=75)
{System.out.println("Overall Grade is :Distinction");}
else
{System.out.println("Invalid Marks");}

System.out.println("");
 
      }
    }
}