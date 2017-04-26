/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellsheet;

/**
 *
 * @author emmab
 */
public class Spell {
    private int Level;
    private int[] Class = {10, 10, 10, 10, 10, 10, 10, 10, 10};
    private String Name;
    private String Description;
    public Spell(){
        Level = 0;
        Name = "";
        Description = "";
    }
    public Spell(String name){
        Level = 0;
        Name = name;
        Description = "";
    }
    void setLevel(int l){
        this.Level = l;
    }
    void setClass(int c){
        int i = 0;
        while(this.Class[i] != 10 && i < this.Class.length){
            i++;
        }
        this.Class[i] = c;
    }
    void setName(String n){
        this.Name = n;
    }
    void setDescription(String d){
        this.Description = d;
    }
    String getName(){
        return this.Name;
    }
    String getDescr(){
        return this.Description;
    }
    int getLevel(){
        return this.Level;
    }
    int[] getClassLevel(){
        return this.Class;
    }
}
