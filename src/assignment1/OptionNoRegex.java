package assignment1;
import java.util.Scanner;
public class OptionNoRegex {
 //verify the option number 

 public int menuRegex(int min,int max)
 {
  String regex="[0-9]{1}";
  Scanner sc=new Scanner(System.in);
  while(true)
  {
   String input=sc.nextLine();
   if(input.matches(regex))
   {
    int key=Integer.parseInt(input);
    if(key>=min && key<=max){
     return key;
    }else
    {
     System.out.println("The number you are entering is uncorrect!");
    }
   }else
   {
    System.out.println("Please input a number!");
   }
  }
 
 }
// //verify friendID
// public String friendIDRegex(String friendID)
// {
//  String regex="[1-4]{1}";
//  Scanner sc=new Scanner(System.in);
//  while(true)
//  {
//   String input=sc.nextLine();
//   if(input.matches(regex))
//   {
//    int key=Integer.parseInt(input);
//   
//     return key;
//    }else
//    {
//     System.out.println("Please input a number between 1-4 as friendID!");
//    }
//   }else
//   {
//    System.out.println("Please input a number!");
//   }
//  }
 
// }
 //verify name
 @SuppressWarnings("resource")
 public String nameRegex(String name){
  String pattern ="[A-Za-z]+";
  String str=name;
  Scanner sc=new Scanner(System.in);
  while(true){
   if(str.matches(pattern)){
    return str;
   }else{
    System.out.println("Please Enter valid name");
    str=sc.nextLine();
    continue;
   }
  }
 }
 //verify age
 
 public String ageRegex(String age){
  String pattern ="^([0-9]|[0-9]{2}|100)$";
  String str=age;
  Scanner sc=new Scanner(System.in);
  while(true){
   if(str.matches(pattern)){
    return str;
   }else{
    System.out.println("Invalid age,Please enter again");
    str=sc.nextLine();
    continue;
   }
  }
 }
 //verify of gender 
 @SuppressWarnings("resource")
 public String sexRegex(String sex){
  String pattern ="[FM]";
  String str=sex;
  Scanner sc=new Scanner(System.in);
  while(true){
   if(str.matches(pattern)){
    return str;
   }else{
    System.out.println("Please Enter M on behalf of Male,F on behalf Female");
    str=sc.nextLine();
    continue;
   }
  }
 }
// //用户输入电话号码的验证
// @SuppressWarnings("resource")
// public String telNumRegex(String telNum){
//  String pattern ="[0-9]{11}";
//  String str=telNum;
//  Scanner sc=new Scanner(System.in);
//  while(true){
//   if(str.matches(pattern)){
//    return str;
//   }else{
//    System.out.println("输入不合法字符,请重新输入11位的手机号码");
//    str=sc.nextLine();
//    continue;
//   }
//  }
// }
 //用户输入地址的验证
 //@SuppressWarnings("resource")
// public String addressRegex(String address)
// {
//  String pattern ="[a-zA-Z[0-9]]{1,15}";
//  String str=address;
//  Scanner sc=new Scanner(System.in);
//  while(true){
//   if(str.matches(pattern)){
//    return str;
//   }else{
//    System.out.println("输入不合法字符,请重新输入1到15个英文大小写或是数字");
//    str=sc.nextLine();
//    continue;
//   }
//  }
// }
}
