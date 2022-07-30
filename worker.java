package ba1OOP;

public class worker extends officer {
    private int level;
    public worker(String name, int age, String gender, String address,int level){
        super(name, age, gender, address);
        this.level=level;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String toString(){
        return "worker={"+
                "level="+ level+
                ",name="+ name+
                ",age="+age+
                ",gender="+gender+
                ",address="+address;
    }
}
