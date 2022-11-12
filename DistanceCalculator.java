import java.util.Scanner;

public class DistanceCalculator
{
    
    public static void DistanceCalculate()
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("\n==================> Distance Calculator <============\n");
      float kilometre;
      float metre;
      float centimetre;
      float inches;
      float feet;
      int choice;
      byte value;
      do{
      System.out.println("ENTER VALUE OF DISTANCE IN ANY ONE UNIT .\n\nPRESS BUTTON FOR CORRESSPONDING OPERATION\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\nKILOMETRE(km) ---> 1 \nMETRE(m) --------> 2 \nCENTIMETRE(cm) --> 3 \nINCHES(Ich.) ----> 4 \nFEET(feet) ------> 5 \n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
      System.out.println("ENTER YOUR CHOICE : ");
      choice=scanner.nextInt();
      switch(choice)
      {
        case 1:
        System.out.println("ENTER DISTANCE IN KILOMETRE(km)");
        kilometre=scanner.nextFloat();
        metre=kilometre*1000;
        centimetre=kilometre*1000*100;
        inches=(kilometre*1000*100)/2.54F;
        feet=(kilometre*1000*100)/(2.54F*12);
        System.out.println("WHEN KILOMETRE(km)==> 1"+kilometre+" km  THEN \nMETRE ==> "+metre+" m \nCENTIMETRE ==> "+centimetre+" cm\nINCHES ==> "+inches+" inc\nFEET ==>"+feet+" feet");
        System.out.println("==============================================\n\n");
        break;
        case 2:
        System.out.println("ENTER DISTANCE IN METRE(m)");
        metre=scanner.nextFloat();
        kilometre=metre/1000;
        centimetre=metre*100;
        inches=(metre*100)/2.54F;
        feet=(metre*100)/(2.54F*12);
        System.out.println("WHEN METRE(m)==> "+metre+" m  THEN \nKILOMETRE ==> "+kilometre+" km \nCENTIMETRE ==> "+centimetre+" cm\nINCHES ==> "+inches+" inc\nFEET ==>"+feet+" feet");
        System.out.println("=================================================\n\n");
        break;
        case 3:
        System.out.println("ENTER DISTANCE IN CENTIMETRE(cm)");
        centimetre=scanner.nextFloat();
        kilometre=centimetre/100000;
        metre=centimetre/1000;
        inches=(centimetre)/2.54F;
        feet=(centimetre)/(2.54F*12);
        System.out.println("WHEN CENTIMETRE(cm)==> "+centimetre+" cm  THEN \nKILOMETRE ==> "+kilometre+" km \nMETRE ==> "+metre+" m\nINCHES ==> "+inches+" inc\nFEET ==>"+feet+" feet");
        System.out.println("====================================================\n\n");
        break;
        case 4:
        System.out.println("ENTER DISTANCE IN INCHES(inc.)");
        inches=scanner.nextFloat();
        kilometre=inches/(100000*2.54f);
        metre=inches/(1000*2.54f);
        centimetre=2.54f*inches;
        feet=(inches)/(12);
        System.out.println("WHEN INCHES(inc)==> "+inches+" inc  THEN \nKILOMETRE ==> "+kilometre+" km \nMETRE ==> "+metre+" m\nCENTIMETRE ==> "+centimetre+" cm\nFEET ==>"+feet+" feet");
        System.out.println("======================================================\n\n");
        break;
        case 5:
        System.out.println("ENTER DISTANCE IN FEET(feet.)");
        feet=scanner.nextFloat();
        kilometre=feet*2.54f*12/(100000);
        metre=feet*12*2.54f/(100);
        centimetre=(2.54f*feet*12);
        inches=12*feet;
        System.out.println("WHEN INCHES(inc)==> "+inches+" inc  THEN \nKILOMETRE ==> "+kilometre+" km \nMETRE ==> "+metre+" m\nCENTIMETRE ==> "+centimetre+" cm\nINCHES ==>"+inches+" inc.");
        System.out.println("========================================================\n\n");
        break;
        default:
        System.out.println("CHOOSE VALID CHOICE !!!!\nERROR!");

      }
      System.out.println("DO YOU WANT TO CONTINUE THIS PROGRAM THEN PRESS 1 ELSE PRESS 0 !!!");
      value=scanner.nextByte();
      System.out.println("\n");
      System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>\n");
    }while(value!=0);
    System.out.println("PROGRAM END !!!!\nTHANKS");
    }
    public static void main(String[] args) {
        DistanceCalculate();
    }
}