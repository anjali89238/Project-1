 import java.util.Scanner;
class method{
   public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     System.out.println("----- PERCENTAGE CALCULATOR ----- ");
     System.out.print("Enter the Student Name:- ");
     String Name=sc.nextLine();
     System.out.print("Marks per Subject= ");
          int Marks=sc.nextInt();
     int Total_Marks= 5 * Marks;
     System.out.println(" the Total Marks of all Subject: "+ Total_Marks);
     System.out.print("English Marks: ");
     int English=sc.nextInt();
     System.out.print("Mathematics Marks: ");
     int Mathematics=sc.nextInt();
     System.out.print("Physics Marks: ");
     int Physics=sc.nextInt();
     System.out.print("Chemistry Marks: ");
     int Chemistry=sc.nextInt();
     System.out.print("Physical Education Marks: ");
     int PhE=sc.nextInt();

     int Percentage= ((English+ Mathematics + Physics + Chemistry + PhE ) * 100) / Total_Marks;
     System.out.println("Student Percentage:- " + Percentage + "%");  
      if(Percentage >=60 ){

            System.out.println(   "Congratulation !" +Name + " You got First Divison :) ");
      }
      else if(Percentage<60 && Percentage>=50){
            System.out.println(    Name + "! You got Second Divison. ");
      }
      else if(Percentage<50 && Percentage>=40){
         System.out.println(Name + " ! You are Passed.");
      }
      else{
         System.out.println(Name+" ! You are Failed. Better Luck Next Time .");
      }
      }}
      

   
   