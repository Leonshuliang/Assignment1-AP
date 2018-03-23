package assignment1;
public class Menu {
 //MainMenu
 public void mainMenu() {
  System.out.println("MiniNet Menu");
  System.out.println("===================================");
  System.out.println("1. List everyone");
  System.out.println("2. Search a person");
  System.out.println("3. Are these two direct friends?");
  System.out.println("4. Add a person");
  System.out.println("5. Modify a person");
  System.out.println("6. Delete a person");
  System.out.println("7. Exit");
  System.out.println("===================================");
  System.out.println("Enter an option: _");
 }
 
 //Add menu
 public void addMenu () {
  System.out.println("===================================");
  System.out.println("1.Add a new person");
  System.out.println("2.List all people");
  System.out.println("3.return to the previous menu");
  System.out.println("===================================");
 }
 
 //Search menu
 public void searchMenu () {
  System.out.println("===================================");
  System.out.println("1.Search by name");
  System.out.println("2.Search by age");
  System.out.println("3.Search by gender");
  //System.out.println("4.Search by mobile");
  System.out.println("4.Search by status");
  System.out.println("5.List all people");
  System.out.println("6.Return to the previous menu");
  System.out.println("===================================");
 }
 
 //Modify menu
 public void modifyMenu () {
  System.out.println("===================================");
  System.out.println("1.List all people");
  System.out.println("2.Modify a person");
  System.out.println("3.Return to the previous menu");
  System.out.println("===================================");
 }
 //Modify sub-menu
 public void subModifyMenu () {
  System.out.println("===================================");
  System.out.println("1.Change name");
  System.out.println("2.Change age");
  System.out.println("3.Change gender");
  System.out.println("4.Change pic");
  System.out.println("5.Change status");
  System.out.println("6.Return to the previous menu");
  System.out.println("===================================");
 }
 
 //Delete menu
 public void deleteMenu () {
  System.out.println("===================================");
  System.out.println("1.List all people");
  System.out.println("2.Delete one person");
  System.out.println("3.Delete all the people");
  System.out.println("4.Return to the previous menu");
  System.out.println("===================================");
 }
 
}
