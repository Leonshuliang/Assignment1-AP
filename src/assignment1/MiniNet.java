package assignment1;
public class MiniNet {
 public static void main(String[] args) 
 {
  Menu m=new Menu();
  Driver o=new Driver();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.mainMenu();
   int key=reg.menuRegex(1, 6);
   switch(key){
   case 1:
	  o.showAll();//show all the people in this social net 
    break;
   case 2:
    o.searchLogic();// search a person by name 
    break;
   case 3:
     o.checkFriends();// check two people are friends or not 
    break;
   case 4:
	   o.addPerson();//add a person 
    break;
   case 5:
	  o.modifyLogicLogic();
    break;
   case 6:
	   o.deleteLogic();
	    break;
   case 7:
    System.exit(0);
    break;
   }
  }
 }
}