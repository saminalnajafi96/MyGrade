import java.util.ArrayList;

/**
 * Created by Samin on 03/02/2018.
 */
public class Module
   {
   
   private static ArrayList<Module> moduleArrl = new ArrayList<>();
   private String moduleName, grade;
   private int totalCredits, score;
   
   public Module(){
      this.moduleName = "";
      this.totalCredits = 0;
      this.score = 0;
   }
   
   public static void printModuleArrl(){
      int i = 0;
      for(Module module : moduleArrl){
         System.out.println("===== Module " + (i+1) + " =====");
         System.out.println(module);
         i++;
      }
   }
   
   public void addToModuleArrl(Module module){
      moduleArrl.add(module);
   }
   
   @Override
   public String toString(){
      return "Module name: " + this.moduleName + "\n" +
              "Credits: " + this.totalCredits + "\n" +
              "Score: " +  this.score + "\n";
   }
   
   // Get functions
   public String getModuleName(){
      return moduleName;
   }
   
   public int getTotalCredits(){
      return totalCredits;
   }
   
   public int getScore(){
      return score;
   }
   
   public String getGrade(){
      return grade;
   }
   
   // Set functions
   public void setModuleName(String sn){
      this.moduleName = sn;
   }
   
   public void setTotalCredits(int tc){
      this.totalCredits = tc;
   }
   
   public void setScore(int s){
      this.score = s;
   }
   
   public void setGrade(String g){
      this.grade = g;
   }
}
