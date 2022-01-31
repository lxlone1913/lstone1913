package Demo001;
class Teacher{
  private String  Name;
      private int   Age;
      private  String Gender;

    public Teacher() {
    }

    public Teacher(String name, int age, String gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
    public void ShowInfo(){
        System.out.println("name:"+getName());
        System.out.println("name:"+getAge());
        System.out.println("name:"+getGender());

    }




}
public class Test {
    public static void main(String[] args) {

        Teacher t= new Teacher();
        t.setAge(78);
        t.getAge();
        t.setName("ddd");
         t.getName();
         t.setGender("man");
         t.getGender();
t.ShowInfo();
    }












}
