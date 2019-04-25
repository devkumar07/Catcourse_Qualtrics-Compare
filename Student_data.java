public class Student_data{
  private String name;
  private String email;
  public Student_data(String name, String email){
    this.name=name;
    this.email=email;
  }
  public Student_data(String firstName, String lastName, String email){
    name=firstName+" "+lastName;
    this.email=email;
  }
  public String toString(){
    return name+"; "+email;
  }
  public String get_name(){
    return name;
  }
  public String get_email(){
    return email;
  }
}
