
import java.util.Scanner;

public class madLibs {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MAD LIBS ");
        System.out.println();
        System.out.println("Mad Libs is a fun word game where you fill in blanks in a story with random words without knowing the full story. The result is usually silly, funny, or totally weird!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
         String place;
         System.out.print("ENTER A PLACE: ");
         place = sc.nextLine();

         String adjective;
         System.out.print("ENTER A ADJECTIVE (describes something, like funny, blue, weird): ");
         adjective = sc.nextLine();

         String person_Name;
         System.out.print("ENTER A PERSON NAME :"); 
         person_Name =sc.nextLine();

         String random_Object;
         System.out.print("ENTER AN OBJECT :");
          random_Object = sc.nextLine();

         String plural_Noun;
         System.out.print("ENTER A PLURAL NOUN (more than one thing, like dogs, books): ");
         plural_Noun = sc.nextLine();

         String verb;
         System.out.print("ENTER A VERB (action words):");
         verb = sc.nextLine();

         String celebrity;
         System.out.print("ENTER A FAMOUS PERSON :");
         celebrity =sc.nextLine();

         String animal;
         System.out.print("ENTER A ANIMAL :");
          animal = sc.nextLine();

         String shout;
         System.out.print("ENTER A SOUND :");
         shout = sc.nextLine();      

         System.out.println();
         System.out.println(" ### choose one from below stories :} ### ");
         System.out.println("1) Fantasy Adventure");
         System.out.println("2) Sci-Fi Space Mission");
         System.out.println("3) School Day Chaos");
         System.out.println("4) Party Disaster");
         System.out.println("5) Romantic Comedy");
         System.out.println("6) Shinchan Chaos");
         System.out.println();
         System.out.print("Write a STORY NAME from above( that you have chosen ):");
         String Story = sc.nextLine();
         switch (Story.toLowerCase()) {
            case "fantasy adventure":
                System.out.println("In the land of " +place +", a "+ adjective +" knight named "+person_Name+" carried only a "+ random_Object +".\n" +
                                        "With the help of enchanted "+ plural_Noun +", they began "+verb+" across the cursed valley.\n" +
                                        "Suddenly , "+ celebrity +" appeared riding a giant "+animal+" and shouted, \""+shout+"!\"");
                break;
            case "sci-fi space mission":
            System.out.println("On planet " + place + ", the air was thick with " + adjective + " fog.\nCommander " +
                person_Name + " adjusted their " + random_Object + ", avoiding the swarm of " + plural_Noun + ".\nWhile " +
                verb + ", they were contacted by " + celebrity + ", who warned of a wild " + animal +
                " approaching.\n\"" + shout + "!\" they yelled.");
                break;
            case "school day chaos":
              System.out.println("It was a regular day at " + place + " until a " + adjective + " teacher named " + person_Name +
                " dropped a " + random_Object + " on the floor.\nThe class burst into laughter, throwing " + plural_Noun +
                " and " + verb + " across the room.\nSuddenly, " + celebrity + " ran in, riding a " + animal +
                ", and shouted, \"" + shout + "!\"");
                break;
            case "party disaster":
             System.out.println("The party at " + place + " started with a " + adjective + " vibe.\nHost " + person_Name +
                " showed up late carrying a " + random_Object + " and passed around some weird " + plural_Noun +
                ".\nPeople were " + verb + " when " + celebrity + " burst in on a dancing " + animal +
                " yelling, \"" + shout + "!\"");
                break;
            case "romantic comedy":
            System.out.println("They first met at " + place + ", during a " + adjective + " afternoon.\n" + person_Name +
                " was holding a " + random_Object + ", tripping over " + plural_Noun + ", and " + verb +
                " like no one was watching.\nThen " + celebrity + " appeared, handed over a " + animal +
                ", and whispered, \"" + shout + ".\"");
                break;
            case "shinchan chaos":
             System.out.println("Misae sent Shinchan to " + place + ", but the " + adjective + " boy named " + person_Name +
                " had other plans.\nHe took a " + random_Object + ", gathered some " + plural_Noun + ", and started " +
                verb + " in the street.\n" + celebrity + " saw him riding a " + animal +
                " and yelled, \"" + shout + "!\"");
                break;
            default:
            System.out.println("Story not found");
                break;
         }




 sc.close();
   }
}
