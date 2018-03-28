package assignment1;
/**
* mininet is start class   call menu driver and optioNoRege
*
* @author  Shuliang Xi3647666
* @version 1.0
* @since   2018-03-23 
*/
public class MiniNet {
 public static void main(String[] args) 
 {
  Menu m=new Menu();
  Driver o=new Driver();
  OptionNoRegex reg=new OptionNoRegex();
  o.putPersons();
  while(true){
   m.mainMenu();
  
   int key=reg.menuRegex(1, 8);
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
	  o.modifyLogic();//edit a person by 
    break;
   case 6:
	   o.deleteLogic();//delete a person by attribute
	    break;
   case 7:
       o.makeFriends();// make 2 people as friends 
       break;
   case 8:
       System.exit(0);//exit this system
       break;
   }
  }
 }
}