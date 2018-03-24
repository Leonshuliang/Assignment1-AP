package assignment1;
public class Dependent implements Person {
 private int id;//id of the people in this social network
 private String name;//name of the people in this social network
 private String age;//age of the people in this social network
 private String gender;//gender of the people in this social network
 private String pic;//picture on profile
 private String status;//status of person, like work 
 private String parents;//children's parents
 
 public Dependent(int id,String name,String age,String gender,String pic,String status,String parents){
  this.id=id;
  this.id=id;
  this.name=name;
  this.age=age;
  this.gender=gender;
  this.pic=pic;
  this.status=status;
  this.parents=parents;
 }
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id=id;
 }

 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getAge() {
  return age;
 }
 public void setAge(String age) {
  this.age = age;
 }
 public String getGender() {
  return gender;
 }
 public void setGender(String gender) {
  this.gender = gender;
 }
 public String getPic() {
  return pic;
 }
 public void setPic(String pic) {
  this.pic = pic;
 }
 public String getStatus() {
  return status;
 }
 public void setStatus(String status) {
  this.status = status;
 }
 public String getParents() {
	  return status;
	 }
 public void setParents(String parents) 
 {
	  this.parents = parents;
 }
}