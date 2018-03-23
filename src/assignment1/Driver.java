package assignment1;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
public class Driver{
	
 private List<Adult> list=new ArrayList<Adult>();
 //put some persons in list
 public void putPersons()
 {
//	 Adult p1=new Adult(1, Nick, null, null, null, null);
//	 Adult p2=new Adult(1, null, null, null, null, null);
//	 Adult p3=new Adult(0, null, null, null, null, null);
//	 Adult p4=new Adult(0, null, null, null, null, null);
//	 Adult p5=new Adult(0, null, null, null, null, null);
//	 Adult p1=new Adult(0, null, null, null, null, null);
//	 Adult p1=new Adult(0, null, null, null, null, null);
//	 Adult p1=new Adult(0, null, null, null, null, null);
 }
 //add a person
 public void addPerson(){
  Menu m=new Menu();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.addMenu();
   int key=reg.menuRegex(1, 3);// min is 1, max is 3
   switch(key){
   case 1:
    addOperation ();
    break;
   case 2:
    showAll();
    break;
   case 3:
    return;
   }
  }
 }
 
 //Search a person by information
 public void searchLogic(){
  Menu m=new Menu();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.searchMenu();
   int key=reg.menuRegex(1, 7);//min is 1 max is 7
   switch(key){
   case 1:
    searchByName();
    break;
   case 2:
    searchByAge();
    break;
   case 3:
    searchBySex();
    break;
   case 4:
    searchByAdd();
    break;
   case 5:
    showAll();
    break;
   case 6:
    return;
   }
  }
 }
 //modify information  
 public void modifyLogicLogic(){
  Menu m=new Menu();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.modifyMenu();
   int key=reg.menuRegex(1, 3);
   switch(key){
   case 1:
    showAll();
    break;
   case 2:
    modifyLogicLogic1();
    break;
   case 3:
    return;
   }
  }
 }
 //modify sub operation
 public void modifyLogicLogic1(){
  Menu m=new Menu();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.subModifyMenu();
   int key=reg.menuRegex(1, 6);
   switch(key){
   case 1:
    nameModify();
    break;
   case 2:
    ageModify();
    break;
   case 3:
    sexModify();
    break;
   case 4:
    picModify();
    break;
   case 5:
    statusModify();
    break;
   case 6:
    return;
   }
  }
 }
 //Delete an item or a person
 public void deleteLogic(){
  Menu m=new Menu();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.deleteMenu();
   int key=reg.menuRegex(1, 4);
   switch(key){
   case 1:
    showAll();
    break;
   case 2:
    deleteByName();
    break;
   case 3:
    deleteAll();
    break;
   case 4:
    return;
   }
  }
 }
 
 
 //Add a person
 public void addOperation (){
 try {
   OptionNoRegex reg=new OptionNoRegex();
   Scanner sc=new Scanner(System.in); 
   System.out.println("Enter the person's ID:");
   String id=sc.nextLine();
   id=Integer.toString(reg.menuRegex(1, 4));//1,2,3,4 is a symbol of friends
   //System.out.println("Enter the person's FriendID:");
  // String friendID=sc.nextLine();
   //friendID=reg.friendIDRegex(friendID);
   System.out.println("Enter the person's Name:");
   String name=sc.nextLine();
   name=reg.nameRegex(name);
   System.out.println("Enter the person's Age:");
   String age=sc.nextLine();
   age=reg.ageRegex(age);
   System.out.println("Enger the person's Gender:");
   String sex=sc.nextLine();
   sex=reg.sexRegex(sex);
   System.out.println("Uplode the person's Pic :");
   String telNum=sc.nextLine();
   //telNum=reg.telNumRegex(telNum);
   System.out.println("Enter the person's Status:");
   String address=sc.nextLine();
   //address=reg.addressRegex(address);
   int personId=Integer.parseInt(id);
   Adult p=new Adult(personId,name,age,sex,telNum,address);
   list.add(p);
 }
 catch (Exception e) {
	 System.out.println("Add a person faild, Please try again");
 }
 }
 
 
// //判断序号是否已经存在插入成功失败
//   @SuppressWarnings("resource")
//   public String judgeId(String id){
//    Scanner sc=new Scanner(System.in);
//    Iterator<Person> it=list.iterator();
//    String newId=id;
//    while(it.hasNext()){
//     Person p=(Person)it.next();
//     if(newId.equals(p.getId())){
//      System.out.println("此序号已经存在,请重新输入序号");
//      newId=sc.nextLine();
//      continue;
//     }else{
//      return newId;
//     }
//    }
//    return id;
//   }
 
 //List all the information of all people 
 public void showAll(){
  System.out.println("ID\n"+"Name\n"+"Age\n"+"Gender\n"+"Pic\n"+"Status");
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
  }
 }
// public void showAll(){
//	 // System.out.println("ID\n"+"Name\n"+"Age\n"+"Gender\n"+"Pic\n"+"Status");
//	  Iterator<Person> it=list.iterator();
//	  if(it.hasNext())
//	  {
//	   Person p=(Person)it.next();
//	   System.out.println("ID"+p.getId()+"\n"+"Name"+p.getName()+"\nAge"+p.getAge()+"Gender\n"+p.getGender()+"\nPic"+p.getPic()+"\nStatus"+p.getStatus());
//	  }
//	  else {
//		  System.out.println("ID\n"+"Name\n"+"Age\n"+"Gender\n"+"Pic\n"+"Status");
//	  }
//	  
//	 }
 //Search people by name
 @SuppressWarnings("resource")
 public void searchByName(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the name you want to search:");
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  name=reg.nameRegex(name);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(name.equals(p.getName())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }
  }
 }
 //Search people by age
 @SuppressWarnings("resource")
 public void searchByAge(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the age you want to search:");
  Scanner sc=new Scanner(System.in);
  String age=sc.nextLine();
  age=reg.ageRegex(age);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(age.equals(p.getAge())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }
  }
 }
 //Search people by gender
 
 public void searchBySex(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the gender you want to search:");
  Scanner sc=new Scanner(System.in);
  String sex=sc.nextLine();
  sex=reg.sexRegex(sex);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(sex.equals(p.getGender())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }
  }
 }
// //按电话号码查询用户信息
// @SuppressWarnings("resource")
// public void searchByTelNum(){
//  TelNoteRegex reg=new TelNoteRegex();
//  System.out.println("输入你要查询的电话号码:");
//  Scanner sc=new Scanner(System.in);
//  String telNum=sc.nextLine();
//  telNum=reg.telNumRegex(telNum);
//  Iterator<Person> it=list.iterator();
//  while(it.hasNext()){
//   Person p=(Person)it.next();
//   if(telNum.equals(p.getPic())){
//    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
//   }
//  }
// }
 //search a person by his/her status

 public void searchByAdd(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the status you need to search:");
  Scanner sc=new Scanner(System.in);
  String address=sc.nextLine();
 // address=reg.addressRegex(address);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(address.equals(p.getStatus())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }
  }
 }
//Modify name
 public void nameModify(){
	
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter an option:");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  int id=Integer.parseInt(num);
  System.out.println("Enter the name you want to modify:");
  String name=sc.nextLine();
  name=reg.nameRegex(name);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setName(name);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }else{
    System.out.println(" Failed to modify!");
   }
  }
 
 }
 //modify age
 @SuppressWarnings("resource")
 public void ageModify(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter an option:");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  int id=Integer.parseInt(num);
  System.out.println("Enter the age of the person you are searching:");
  String age=sc.nextLine();
  age=reg.ageRegex(age);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setAge(age);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }else{
    System.out.println("Modify Failed,Please try again!");
   }
  }
 }
 //修改性别信息
 @SuppressWarnings("resource")
 public void sexModify(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter an option:");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  int id=Integer.parseInt(num);//cast string num to int id;
  System.out.println("Enter the gender you want to change:");
  String sex=sc.nextLine();
  sex=reg.sexRegex(sex);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setGender(sex);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }else{
    System.out.println("Modify Failed,Please try again!");
   }
  }
 }
 //Modify the picture 
 @SuppressWarnings("resource")
 public void picModify(){
  System.out.println("Enter an option:");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  int id=Integer.parseInt(num);
  System.out.println("Please uplode the picture you want to upload:");
  String pic=sc.nextLine();
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setPic(pic);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }else{
    System.out.println("Modify Failed,Please try again!");
   }
  }
 }
 //modify the status
 @SuppressWarnings("resource")
 public void statusModify(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter an option:");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  int id=Integer.parseInt(num);//cast string to integer
  System.out.println("Please enter the status you want to change:");
  String status=sc.nextLine();
  //address=reg.addressRegex(address);
  Iterator<Adult> it=list.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setStatus(status);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
   }else{
    System.out.println("Modify Failed,Please try again!");
   }
  }
 }
 
 //Delete one person
 public void deleteByName(){
  System.out.println("Enter the name of the person you want to delete：");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  Iterator<Adult> it=list.iterator();
  while(it.hasNext())
  {
   Adult p=(Adult)it.next();
    if(num==p.getName()){
     list.remove(num);
     System.out.println("DeleteSuccess");
    }else{
     System.out.println("Deleted Failed");
    }
  }
  System.out.println("There is no any person");
 
 }
 //Delete all the information of all the people
 public void deleteAll(){
  list.clear();
  System.out.println("DeleteSuccess");
 }
 //check two people given are friends or not 
 public void checkFriends(){
	 int id1 = 0,id2 = 0;
	 int age1 = 0,age2 = 0;
	 Relation relation=new Relation();
	 OptionNoRegex reg=new OptionNoRegex();
	  System.out.println("Enter the first name:");
	  Scanner sc1=new Scanner(System.in);
	  String name1=sc1.nextLine();
	  name1=reg.nameRegex(name1);
	  System.out.println("Enter the second name:");
	  Scanner sc2=new Scanner(System.in);
	  String name2=sc2.nextLine();
	  name2=reg.nameRegex(name2);
	  Iterator<Adult> it=list.iterator();
	  while(it.hasNext())
	  {
	   Adult p=(Adult)it.next();
	   if(name1.equals(p.getName()))
	   {
		   id1=p.getId();
		   age1=Integer.parseInt(p.getAge());
		   // System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus());
	   }
	  if(name2.equals(p.getName()))
	   {
		   id2=p.getId();
		   age2=Integer.parseInt(p.getAge());
	   }
	   else {
		   System.out.println("plese check the names, and try later ");
	   }
	   relation.checkFiends(id1, id2, age1, age2);
	  }
	  System.out.println("plese check the names, and try later ");
	 }

}