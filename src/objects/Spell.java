package objects;

public class Spell {
    private int Level;
    private int[] Class = {10, 10, 10, 10, 10, 10, 10, 10, 10};
    private String Name;
    private String Description;

    public Spell(String name){
        Level = 0;
        Name = name;
        Description = "";
    }
    public void setLevel(int l){
        this.Level = l;
    }
    public void setClass(int c){
        int i = 0;
        while(this.Class[i] != 10 && i < this.Class.length){
            i++;
        }
        this.Class[i] = c;
    }
    public void setName(String n){
        this.Name = n;
    }
    public void setDescription(String d){
        this.Description = d;
    }
    public String getName(){
        return this.Name;
    }
    public String getDescr(){
        return this.Description;
    }
    public int getLevel(){
        return this.Level;
    }
    public int[] getClassLevel(){
        return this.Class;
    }
}
