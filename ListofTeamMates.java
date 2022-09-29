import java.util.ArrayList;

public class Main {

  private static final int MAX_COLEGAS = 6;

  public static void main(String[] args) {
    
    ArrayList<TeamMate> lcolegas = new ArrayList<TeamMate>(); 
    
    TeamMate t = new TeamMate("AleB", "Alejandro", true);
    
    lcolegas.add(t);

    for (int i = 0; i < MAX_COLEGAS; i++) {

      TeamMate a = new TeamMate("A", "a", true);
      
      lcolegas.add(a);
      
    }
    
    System.out.println("Nomes: Team Mates");
    
    for (int i = 0; i < lcolegas.size(); i++) {
      
      System.out.println(lcolegas.get(i).name());
      
    }

    System.out.println("Team Mates Online");
    
    for (int i = 0; i < lcolegas.size(); i++) {

      if (lcolegas.get(i).online() == true) {

        System.out.println(lcolegas.get(i).userId());
        
      }
      
    }
    
  }
  
}
