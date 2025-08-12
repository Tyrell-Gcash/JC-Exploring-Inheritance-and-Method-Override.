package org.example;

public class Exercise3 {
}

class Editor {
    public void openFile() {
        System.out.println("Opening a generic file.");
    }
}

class CodeEditor extends Editor {
    @Override
    public void openFile() {
        System.out.println("Applying syntax highlighting...");
        super.openFile(); // Call the parent's method
    }
}

class GameCharacter{
    private int health = 100;

    public void takeDamage(int Amount){
        this.health -=Amount;
    }

    public void announceDamage(int Amount){
        System.out.printf("Regular character takes %d damage. New health: %d",Amount,getHealth());
    }

    public int getHealth(){
        return this.health;
    }
}

class ArmoredCharacter extends GameCharacter{

    public void takeDamage(int Amount){
        super.takeDamage(Amount/2);
    }

    public void announceDamage(int Amount){
        System.out.printf("\nArmored character takes %d damage. New health: %d",Amount,getHealth());
    }

}