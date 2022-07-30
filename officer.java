package ba1OOP;

public class officer {
    protected String name;
    protected  int age;
    protected String gender;
    protected  String address;
    public officer(String name, int age, String gender,String address){
        this.name=name;
        this.age= age;
        this.gender= gender;
        this.address= address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
