import java.util.Arrays;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args){
        welcoming();
        starting();
        entry();
    }

    static void welcoming(){
        System.out.println("Welcome to a fun text adventure game called Vagabond Treasurer!");
        System.out.println("In this game, the goal is to find hidden treasure!");
    }

    static void starting(){
        System.out.println("Type 'start' to begin!");
        java.util.Scanner scan = new Scanner(System.in);
        String start = scan.nextLine();
        while(true){
            if(!start.equals("start")){
                System.out.println("Wrong! Please enter the phrase 'start'.");
                start = scan.nextLine();
            }
            else{
                System.out.println("Game now starting...");
                System.out.println("*************************\n");
                break;
            }
        }
    }

    static void entry(){
        System.out.println("The year is 1629, and you are lost in the forests of southwest Mexico.");
        System.out.println("You use your machete to cut the foliage that blocks your path. There is a clearing ahead.");
        System.out.println("At the clearing the path splits into two.");
        System.out.println("To the left, the path appears open. The sunlight is strong and birds are chirping.");
        System.out.println("To the right, the path darkens with shade. It appears sinister and hard to breathe in there.");
        System.out.println("Press 1 for left, or 2 for right.");
        java.util.Scanner scan = new Scanner(System.in);
        int decision1 = scan.nextInt();
        if(decision1 == 1){
            lightPath();
        }
        else if(decision1 == 2){
            darkPath();
        }
    }

    public static void lightPath(){
        java.util.Scanner scan = new Scanner(System.in);
        String[] lightInventory = new String[3];
        System.out.println("*************************\n");
        System.out.println("This path is nice! Nothing but the sounds of nature around you.");
        System.out.println("Wait! Someone is in the distance!");
        System.out.println("A vagabond vendor approaches you. She tells you that she has a few items you could take off her hands.");
        System.out.println("An old key, a bag of poison, and a ration of bread.");
        System.out.println("Do you take these items into your inventory? Type 'yes' or 'no'.");
        String decision = scan.nextLine();
        if(decision.equals("yes")){
            lightInventory[0] = "Old key";
            lightInventory[1] = "Bag of poison";
            lightInventory[2] = "Ration of bread";
            System.out.println("These items are now in your inventory!");
            System.out.println("You continue to walk forward...");
            monsterFightLight(lightInventory);
            monsterFightLight2(lightInventory);
        }
        else if(decision.equals("no")){
            System.out.println("You chose to not take the items.");
            System.out.println("You continue to walk forward...");
            monsterFightNoItemDeath();
        }
    }

    public static void darkPath(){
        java.util.Scanner scan = new Scanner(System.in);
        String[] darkInventory = new String[3];
        System.out.println("*************************\n");
        System.out.println("This path is scary! Crows fly by screeching, and you feel a shiver down your spine.");
        System.out.println("Wait! Someone is in the distance!");
        System.out.println("It's a witch! She tells you that she has a few items you could take off her hands.");
        System.out.println("A new key, a magical wand, and a mystery bag.");
        System.out.println("Do you take these items into your inventory? Type 'yes' or 'no'.");
        String decision = scan.nextLine();
        if(decision.equals("yes")){
            darkInventory[0] = "New key";
            darkInventory[1] = "Magical wand";
            darkInventory[2] = "Mystery bag";
            System.out.println("These items are now in your inventory!");
            System.out.println("You continue to walk forward...");
            monsterFightDark(darkInventory);
            monsterFightDark2(darkInventory);
        }
        else if(decision.equals("no")){
            System.out.println("You chose to not take the items.");
            System.out.print("You continue to walk forward...");
            monsterFightNoItemDeath();
        }
    }

    static void monsterFightNoItemDeath(){
        System.out.println("*************************\n");
        System.out.println("You come across an open clearing... it's silent... a little too silent...");
        System.out.println("A giant dragon appears! It descends and crashes down on the ground, letting out a loud roar!");
        System.out.println("You look in your inventory for items, but realize you have none!");
        System.out.println("The dragon lets out a hot breathe of flames, converting you into a flurry of ashes.");
        System.out.print("GAME OVER! YOU LOSE!");
    }

    public static String monsterFightLight(String[] items){
        System.out.println("*************************\n");
        System.out.println("You come across an open clearing... it's silent... a little too silent...");
        System.out.println("A giant dragon appears! It descends and crashes down on the ground, letting out a loud roar!");
        System.out.println("You look in your inventory and recall that you have: ");
        for(int i = 0; i < 1; i++){
            System.out.print(Arrays.toString(items));
        }
        System.out.println("\nWhich item will you use against the dragon? (Please type the item below)");
        return "Done";
    }

    public static String monsterFightDark(String[] items){
        System.out.println("*************************\n");
        System.out.println("You come across an open clearing... it's silent... a little too silent...");
        System.out.println("A giant dragon appears! It descends and crashes down on the ground, letting out a loud roar!");
        System.out.println("You look in your inventory and recall that you have: ");
        for(int i = 0; i < 1; i++){
            System.out.print(Arrays.toString(items));
        }
        System.out.println("\nWhich item will you use against the dragon? (Please type the item below)");
        return "Done";
    }

    public static String monsterFightLight2(String[] items){
        java.util.Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if(choice.equals("Old key")){
            System.out.println("What is a key supposed to do against that thing?!");
            System.out.println("The dragon lets out a hot breathe of flames, converting you into a flurry of ashes.");
            System.out.print("GAME OVER! YOU LOSE!");
        }
        else if(choice.equals("Bag of poison")){
            System.out.println("You throw the bag of poison at the dragons head!");
            System.out.println("The bag explodes on its face, burning it slowly and painfully. The dragon dies!");
            items[1] = "[ ]";
            System.out.println("You move forward...");
            monsterFightLight3(items);
        }
        else if(choice.equals("Ration of bread")){
            System.out.println("You toss the ration of bread in front of you.");
            System.out.println("The dragon sniffs the bread, and quickly eats it!");
            System.out.println("You wonder if it may obey you...");
            System.out.println("The dragon lets out a hot breathe of flames, converting you into a flurry of ashes.");
            System.out.print("GAME OVER! YOU LOSE!");
        }
        return "Done!";
    }

    public static String monsterFightDark2(String[] items){
        java.util.Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if(choice.equals("New key")){
            System.out.println("What is a key supposed to do against that thing?!");
            System.out.println("The dragon lets out a hot breathe of flames, converting you into a flurry of ashes.");
            System.out.print("GAME OVER! YOU LOSE!");
        }
        else if(choice.equals("Magical wand")){
            System.out.println("You wave the magical wand in front of you.");
            System.out.println("Bursts of yellow light hit the dragons head! The dragon dies!");
            items[1] = "[ ]";
            System.out.println("You move forward...");
            monsterFightDark3(items);
        }
        else if(choice.equals("Mystery bag")){
            System.out.println("You open the mystery bag.");
            System.out.println("The bag explodes in your face!");
            System.out.print("GAME OVER! YOU LOSE!");
        }
        return "Done!";
    }

    public static String monsterFightLight3(String[] stuff){
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("*************************\n");
        System.out.println("You enter a large field with flowers and mountain ranges.");
        System.out.println("Oh wow! There is a large, old chest at the center.");
        System.out.println("You approach the old chest in front of you.");
        for(int i = 0; i < 1; i++){
            System.out.print(Arrays.toString(stuff));
        }
        System.out.println("\nWhich item will you use to open the chest? (Please type the item below)");
        String decide = scan.nextLine();
        if(decide.equals("Old key")){
            System.out.println("You insert the key into the chest. Click! It opens!");
            System.out.println("There are piles of gold coins and jewels!");
            System.out.println("YOU WIN THE GAME!");
        }
        else if(decide.equals("Ration of bread")){
            System.out.println("What is bread supposed to do?");
            System.out.println("Use the 'Old key'!");
            decide = scan.nextLine();
            if(decide.equals("Old key")){
                System.out.println("You insert the key into the chest. Click! It opens!");
                System.out.println("There are piles of gold coins and jewels!");
                System.out.println("YOU WIN THE GAME!");
            }
        }
        return "Done!";
    }

    public static String monsterFightDark3(String[] stuff){
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("*************************\n");
        System.out.println("You enter a large field with flowers and mountain ranges.");
        System.out.println("Oh wow! There is a large, new chest at the center.");
        System.out.println("You approach the new chest in front of you.");
        for(int i = 0; i < 1; i++){
            System.out.print(Arrays.toString(stuff));
        }
        System.out.println("\nWhich item will you use to open the chest? (Please type the item below)");
        String decide = scan.nextLine();
        if(decide.equals("New key")){
            System.out.println("You insert the key into the chest. Click! It opens!");
            System.out.println("There are piles of gold coins and jewels!");
            System.out.println("YOU WIN THE GAME!");
        }
        else if(decide.equals("Mystery bag")){
            System.out.println("You open the mystery bag.");
            System.out.println("The bag explodes in your face!");
            System.out.print("GAME OVER! YOU LOSE!");
        }
        return "Done!";
    }
}