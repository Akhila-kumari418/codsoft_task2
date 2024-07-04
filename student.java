import java.util.*;
class student{
public static void main(String args[]){
int n;
float avg=0.0f,total=0.0f;
System.out.println("enter number of subjects");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter all subjects marks");
int subjects[]=new int[n];
for(int i=0;i<n;i++){
subjects[i]=sc.nextInt();
total=total+subjects[i];
avg=total/n;
}
System.out.println("total marks are:"+total);
System.out.println("average percentage of marks is:"+avg+"%");
if(avg>=90)
System.out.println("you got O grade");
else if(avg>=80&&avg<90)
System.out.println("you got A+ grade");
else if(avg>=70&&avg<80)
System.out.println("you got A grade");
else if(avg>=60&&avg<70)
System.out.println("you got B+ grade");
else if(avg>=50&&avg<60)
System.out.println("you got B grade");
else if(avg>=40&&avg<50)
System.out.println("you got C grade");
else
System.out.println("you are failed");
}}


