package objects;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Character {
    private ObservableList<String> charlist = FXCollections.observableArrayList();
    private ObservableList<String> descrlist = FXCollections.observableArrayList();
    private String nickname = new String();


    public Character(String s){
        this.nickname = s;
    }

    public void setName(String n){
        nickname = n;
    }
    public String getName(){
        return nickname;
    }
    public ObservableList<String> getCharList(){
        return charlist;
    }
    public void addCharList(String setItem){
        charlist.add(setItem);
    }
    public ObservableList<String> getDescrList(){
        return descrlist;
    }
    public void addDescrList(String setItem){
        descrlist.add(setItem);
    }
    public String getDescr(int d){
        return descrlist.get(d);
    }
}
