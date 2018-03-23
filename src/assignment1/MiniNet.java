package assignment1;
public class MiniNet {
 public static void main(String[] args) 
 {
  Menu m=new Menu();
  Driven o=new Driven();
  OptionNoRegex reg=new OptionNoRegex();
  while(true){
   m.mainMenu();
   int key=reg.menuRegex(1, 6);
   switch(key){
   case 1:
   // o.addLogic();
	  o.showAll();
    break;
   case 2:
    o.searchLogic();
    break;
   case 3:
     o.checkFriends();
    break;
   case 4:
   // o.deleteLogic();
	   o.addLogic();
    break;
   case 5:
   // o.orderLogic();
	  o.modifyLogicLogic();
    break;
   case 6:
	   // o.orderLogic();
	   o.deleteLogic();
	    break;
   case 7:
    System.exit(0);
    break;
   }
  }
 }
}