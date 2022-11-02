import java.util.Scanner;

/**
 * Write a description of class Status here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Status
{
    Scanner s;
       
    String woonplaats;
    String straatnaam; 
    String status;
     
    public Status(){
        s = new Scanner(System.in);
        waarWoonJe();
        geefStraatnaam();
        hoeGaatHet();
    }
    
    public void waarWoonJe(){
        String vraag = "Waar woon je?";
        String antwoord = vraagTekst(vraag);
        antwoord = antwoord.toLowerCase();
        if(antwoord.contains("den haag")){
            print("Dat is ver weg. Daar worden alle belangrijke beslissingen gemaakt");
            woonplaats = "Den Haag";
        } else if(antwoord.contains("'s hertogenbosch")||(antwoord.contains("den bosch"))){
            print("Deze stad telt bijna 17.000 bedrijven!");
            woonplaats = "'s Hertogenbosch";
        } else if (antwoord.contains("utrecht")){
            print("Cool, daar staat de Dom Toren.");
            woonplaats = "Utrecht";
        } 
    }
    
    public void geefStraatnaam(){
        String vraag = "Wat is de Straatnaam?";
        String antwoord = vraagTekst(vraag);
        antwoord = antwoord.toLowerCase();
        if(antwoord.contains("steenstraat")){
            print("Dat is een mooie straat."); 
            straatnaam = "Steenstraat";
        } else if(antwoord.contains("zandstraat")){
            print("Die straat is vast zanderig :)");
            straatnaam = "Zandstraat";
        } else if(antwoord.contains("markt")){
            print("Coole straatnaam!");
            straatnaam = "Markt";
        }
    }
    
    public void hoeGaatHet(){
        String vraag = "Hoe gaat het?";
        String antwoord = vraagTekst(vraag);
        antwoord = antwoord.toLowerCase();
        if(antwoord.contains("heel goed")){
            print("Fijn! :)");
            status = "Heel goed";
        } else if(antwoord.contains("hoed") || (antwoord.contains("niet slecht"))){
            print("Dat is mooi :)");
            status = "Goed";
        } else if(antwoord.contains("niet goed") || (antwoord.contains("slecht"))){
            print("Dat is niet zo goed, ik hoop dat het snel beter gaat :)");
            status = "Slecht";
        } else if(antwoord.contains("heel slecht")){
            print("Oh nee! Ik hoop dat het heel snel, heel veel beter gaat :)");
            status = "Heel slecht";
        }
    }
    
    private String vraagTekst(String vraag){
        print(vraag);
        return s.nextLine();
    } 
    
    private void print(String melding){
        System.out.println(melding);
    }
}
