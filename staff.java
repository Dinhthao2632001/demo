package ba1OOP;

public class staff extends officer{
    private String task;
    public staff(String name, int age , String gender, String address, String task){
        super(name, age, gender, address);
        this.task=task;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public String toString(){
        return "staff={" +
                "name="+ name+" "+
                "age="+age+" "+
                "gender="+gender+" "+
                "address="+address+"}";
    }
}
