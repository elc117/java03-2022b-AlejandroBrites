import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfTeamMates {

  private static final int MAX_COLEGAS = 6;

  public static void main(String[] args) {
    
    ArrayList<TeamMate> lcolegas = new ArrayList<TeamMate>(); 
    
    List<String> lnames = Arrays.asList("A", "B", "C", "D", "E", "F"); 
    
    List<String> luserId = Arrays.asList("a", "b", "c", "d", "e", "f"); 
    
    TeamMate t = new TeamMate("AleB", "Alejandro", true);
    
    lcolegas.add(t);

    for (int i = 0; i < MAX_COLEGAS; i++) {
    
    	TeamMate a = new TeamMate(luserId.get(i), lnames.get(i) , i%2 == 0);
      	lcolegas.add(a);
      	
    }
    
    System.out.println("Nomes: Team Mates");
    
    for (int i = 0; i < lcolegas.size(); i++) {
      
      System.out.println(lcolegas.get(i).getName());
      
    }
    
    System.out.println("");
    
    for (TeamMate item : lcolegas) {
    
      System.out.println(item.getName());
      
    }

    System.out.println("\nTeam Mates Online");
    
    for (int i = 0; i < lcolegas.size(); i++) {

      if (lcolegas.get(i).getOnline() == true) {

        System.out.println(lcolegas.get(i).getUserId());
        
      }
      
    }
    
    System.out.println("");
    
    for (TeamMate item : lcolegas) {
    
      if (item.getOnline() == true) {

        System.out.println(item.getUserId());
        
      }
      
    }
    
  }
  
}
