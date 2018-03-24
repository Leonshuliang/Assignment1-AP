package assignment1;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
public class Driver{
	
 private List<Adult> listAdult=new ArrayList<Adult>();
 private List<Teenager> listTeenager=new ArrayList<Teenager>();
 private List<Baby> listBaby=new ArrayList<Baby>();
 //put some persons in listAdult
 public void putPersons()
 {
	 Adult p1=new Adult(1, "Tom", "30", "M", "tom.pic", "doctor","Lily,Alice");
	 Adult p2=new Adult(1, "Lily", "30", "F", "lily.pic", "engineer","Tom,Alice");
	 Adult p3=new Adult(2, "Jack", "40", "M", "jack.pic", "chef","Vivi");
	 Adult p4=new Adult(2, "Vivi","40", "F", "vivi.pic", "looking job","Jack");
	 Adult p5=new Adult(3, "John", "45", "M", "john.pic", "CEO","Jessy");
	 Adult p6=new Adult(3, "Jessy", "45", "F", "jessy.pic", "cafe","John");
	 Adult p7=new Adult(1, "Alice", "35", "F", "alice.pic", "Teacher","Tom,Lily");
	 Teenager p8=new Teenager(1, "Sam", "14", "M", "sam.pic", "school","Tom,Lily");
	 Teenager p9=new Teenager(2, "Alay", "15", "F","alsy.pic", "school", "Jack,Vivi");
	 Baby p10=new Baby(3, "Ellen", "1", "F", "ellen.pic", "home", "John,Jessy");
	 
	 listAdult.add(p1);
	 listAdult.add(p2);
	 listAdult.add(p3);
	 listAdult.add(p4);
	 listAdult.add(p5);
	 listAdult.add(p6);
	 listAdult.add(p7);
	 listTeenager.add(p8);
	 listTeenager.add(p9);
	 listBaby.add(p10);
	 
	 
 }
 //add a person
 public void addPerson(){
  Menu m=new Menu();//instance of menu
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
  Menu m=new Menu();//instance of menu
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
    searchByGender();
    break;
   case 4:
    searchByStatus();
    break;
   case 5:
    showAll();//show all the people
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
  Menu m=new Menu();//instance of menu
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.subModifyMenu();//show sub menu of modify ledge
   int key=reg.menuRegex(1, 6);
   switch(key){
   case 1:
    nameModify();
    break;
   case 2:
    ageModify();
    break;
   case 3:
    genderModify();
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
   System.out.println("Enter the person's Name:");
   String name=sc.nextLine();
   name=reg.nameRegex(name);
   System.out.println("Enter the person's Age:");
   String age=sc.nextLine();
   age=reg.ageRegex(age);
   System.out.println("Enger the person's Gender:");
   String gender=sc.nextLine();
   gender=reg.sexRegex(gender);
   System.out.println("Uplode the person's Pic :");
   String pic=sc.nextLine();
   System.out.println("Enter the person's Status:");
   String status=sc.nextLine();
   System.out.println("Enter the person's Friends:");
   String friends=sc.nextLine();
   int personId=Integer.parseInt(id);
   Adult p=new Adult(personId,name,age,gender,pic,status,friends);
   listAdult.add(p);
 }
 catch (Exception e) {
	 System.out.println("Add a person faild, Please try again");
 }
 }
 
 

 //List all the information of all people 
 public void showAll(){
  System.out.println("ID\t\t"+"Name\t\t"+"Age\t\t"+"Gender\t\t"+"Pic\t\t"+"Status\t\t"+"Friends"+"\n");
  
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
  }
 }

 //Search people by name
 @SuppressWarnings("resource")
 public void searchByName(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the name you want to search:");
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  name=reg.nameRegex(name);
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(name.equals(p.getName())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
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
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(age.equals(p.getAge())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
   }
  }
 }
 //Search people by gender
 public void searchByGender(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the gender you want to search:");
  Scanner sc=new Scanner(System.in);
  String gender=sc.nextLine();
  gender=reg.sexRegex(gender);
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(gender.equals(p.getGender())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
   }
  }
 }

 //search a person by his/her status
 public void searchByStatus(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter the status you need to search:");
  Scanner sc=new Scanner(System.in);
  String address=sc.nextLine();
 // address=reg.addressRegex(address);
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(address.equals(p.getStatus())){
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
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
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setName(name);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
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
  int id=Integer.parseInt(num);//cast string num to int id
  System.out.println("Enter the age of the person you are searching:");
  String age=sc.nextLine();
  age=reg.ageRegex(age);
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setAge(age);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
   }else{
    System.out.println("Modify Failed,Please try again!");
   }
  }
 }
 //change gender information
 @SuppressWarnings("resource")
 public void genderModify(){
  OptionNoRegex reg=new OptionNoRegex();
  System.out.println("Enter an option:");
  Scanner sc=new Scanner(System.in);
  String num=sc.nextLine();
  int id=Integer.parseInt(num);//cast string num to int id;
  System.out.println("Enter the gender you want to change:");
  String gender=sc.nextLine();
  gender=reg.sexRegex(gender);
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setGender(gender);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
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
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setPic(pic);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
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
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext()){
   Adult p=(Adult)it.next();
   if(id==p.getId()){
    p.setStatus(status);
    System.out.println(p.getId()+"#"+"\t\t"+p.getName()+"\t\t"+p.getAge()+"\t\t"+p.getGender()+"\t\t"+p.getPic()+"\t\t"+p.getStatus()+"\t\t"+p.getFriends());
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
  Iterator<Adult> it=listAdult.iterator();
  while(it.hasNext())
  {
   Adult p=(Adult)it.next();
    if(num==p.getName()){
     listAdult.remove(num);
     System.out.println("DeleteSuccess");
    }else{
     System.out.println("Deleted Failed");
    }
  }
  System.out.println("There is no any person");
 
 }
 //Delete all the information of all the people
 public void deleteAll(){
  listAdult.clear();
  System.out.println("DeleteSuccess");
 }
 //check two people given are friends or not 
 public void checkFriends(){
	 int id1 = 0,id2 = 0;
	 int age1 = 0,age2 = 0;
	 OptionNoRegex reg=new OptionNoRegex();
	  System.out.println("Enter the first name:");
	  Scanner sc1=new Scanner(System.in);
	  String name1=sc1.nextLine();
	  name1=reg.nameRegex(name1);
	  System.out.println("Enter the second name:");
	  Scanner sc2=new Scanner(System.in);
	  String name2=sc2.nextLine();
	  name2=reg.nameRegex(name2);
	  Iterator<Adult> it=listAdult.iterator();
	  while(it.hasNext())
	  {
	   Adult p=(Adult)it.next();
	   if(name1.equals(p.getName()))
	   {
		   id1=p.getId();
		   age1=Integer.parseInt(p.getAge());
		  }
	  if(name2.equals(p.getName()))
	   {
		   id2=p.getId();
		   age2=Integer.parseInt(p.getAge());
	   }
	  }
	  findFriendsByID(id1, id2, age1, age2);
	  
	 }
 public void findFriendsByID(int personID1,int personID2,int personAge1,int personAge2)
	{
		int id1=personID1;
	    int id2=personID2;
	    int age1=personAge1;
	    int age2=personAge2;
	    if(age1<=16 && age1 >16 && id1==id2)
	    {
	        	System.out.println("person1 is dependent of person2");
	    }
	    else if(age1>=16 && age2<16 && id1==id2)
		 {
			 System.out.println("person2 is dependent of person1");
		 }
	    else if(age1>16 && age2 >16 && id1==id2)
	    {
	         System.out.println("person1 and person2 are friends");
	    }
	    else if (age1<=16 && age2<=16 && age1-age2 <=3 && id1==id2)
	    {
	    		System.out.println("person1 and person2 are all independs, they are  friends");
	    }
	    else if (age1<=16 && age2<=16 && age1-age2 >3)
	    {
	    	    if(age1 <= 2)
	    	    {
	    	    	System.out.println("person1's age lower than 3,so she/he has no friend");
	    	    }
	    	    if(age2 <= 2){
	    	    	System.out.println("person1 and person2 are all independs, they are not friends");
	    	    	}
	    	    else {
	    	    	System.out.println("person1 and person2 are all independs, they are not friends");
	    	    }
	    }
	    else {
	    	System.out.println("person1 and person2 are not friends");
	    }
	}
	
}