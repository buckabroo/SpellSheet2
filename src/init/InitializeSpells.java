/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package init;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import objects.*;
//import org.json.*;

public class InitializeSpells {

    ArrayList<Spell> allSpells;
    int numOfSpells = 24;

    public InitializeSpells() {
        this.allSpells = new ArrayList<>();
    }

    //create a bunch of spell objects 
    void initialSpells() {
        for (int i = 0; i < numOfSpells; i++) {
            this.allSpells.add(new Spell("Spell " + i));
            this.allSpells.get(i).setClass(1);
        }
        Spell currSpell = allSpells.get(0);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("Dancing Lights");
        currSpell.setDescription("Casting Time: 1 action\n"
                + "Range: 120 feet\n"
                + "Components: V, S, M (a bit of phosphorus or wychwood, or a glowworm)\n"
                + "Duration: Concentration, up to 1 minute\n"
                + "You create up to four torch-sized lights within range, making them appear as torches, lanterns, \n"
                + "or glowing orbs that hover in the air for the duration. You can also combine the four lights into\n"
                + "one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10-foot radius.\n"
                + "\n"
                + "As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. \n"
                + "A light must be within 20 feet of another light created by this spell, and a light winks out if it exceeds the spell’s range.");
        currSpell = allSpells.get(1);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("Light");
        currSpell.setDescription("Evocation cantrip\n" + "\n"
                + "Casting Time: 1 action\n"
                + "Range: Touch\n"
                + "Components: V, M (a firefly or phosphorescent moss)\n"
                + "Duration: 1 hour\n"
                + "\n"
                + "You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in \n"
                + "a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object\n"
                + "with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.\n"
                + "\n"
                + "If you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid the spell.");
        currSpell = allSpells.get(2);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("Mage Hand");
        currSpell.setDescription("Conjuration cantrip\n"
                + "\n"
                + "Casting Time: 1 action\n"
                + "Range: 30 feet\n"
                + "Components: V, S\n"
                + "Duration: 1 minute\n"
                + "\n"
                + "A spectral, floating hand appears at a point you choose within range. The hand lasts for the duration or until you dismiss it as \n"
                + "an action. The hand vanishes if it is ever more than 30 feet away from you or if you cast this spell again.\n"
                + "\n"
                + "You can use your action to control the hand. You can use the hand to manipulate an object, open an unlocked door or container, \n"
                + "stow or retrieve an item from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each\n"
                + "time you use it.\n"
                + "\n"
                + "The hand can’t attack, activate magic items, or carry more than 10 pounds.");
        currSpell = allSpells.get(3);
        currSpell.setLevel(0);currSpell.setLevel(2);
        currSpell.setClass(0);currSpell.setClass(2);
        currSpell.setName("Mending");
        currSpell.setDescription("Transmutation cantrip\n"
                + "\n"
                + "Casting Time: 1 minute\n"
                + "Range: Touch\n"
                + "Components: V, S, M (two lodestones)\n"
                + "Duration: Instantaneous\n"
                + "\n"
                + "This spell repairs a single break or tear in an object you touch, such as a broken chain link, two halves of a broken key, a torn cloak,\n"
                + "or a leaking wineskin. As long as the break or tear is no larger than 1 foot in any dimension, you mend it, leaving no trace of the former damage.\n"
                + "\n"
                + "This spell can physically repair a magic item or construct, but the spell can’t restore magic to such an object.");
        currSpell = allSpells.get(4);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(5);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(6);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(7);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(8);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(9);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(10);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(11);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(12);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(13);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(14);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(15);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(16);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(17);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(18);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(19);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(20);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(21);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(22);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
        currSpell = allSpells.get(23);
        currSpell.setLevel(0);currSpell.setLevel(1);
        currSpell.setClass(0);currSpell.setClass(1);
        currSpell.setName("");
        currSpell.setDescription("");
    }

    //combine both methods here
    public void initialspellsListView(ListView<String> allspellslistView) {
        initialSpells();
        for (int i = 0; i < numOfSpells; i++) {
            String spell = this.allSpells.get(i).getName();
            allspellslistView.getItems().add(spell);
        }
    }

    public void initialdescrListView(ListView<String> allspellslistView) {
        for (int i = 0; i < numOfSpells; i++) {
            String descr = this.allSpells.get(i).getDescr();
            allspellslistView.getItems().add(descr);
        }
    }

    public ObservableList<String> ClassandLevelListView(int c, int l) {
        ObservableList<String> listview = FXCollections.observableArrayList();
        for (int i = 0; i < numOfSpells; i++) {
            int[] spellclass = this.allSpells.get(i).getClassLevel();
            int level = this.allSpells.get(i).getLevel();
            
            for (int j = 0; j < 9; j++) {
                if (spellclass[j] == c) {
                    if (level == l) {
                        listview.add(this.allSpells.get(i).getName());
                    }
                }
            }
        }
        return listview;
    }
}
