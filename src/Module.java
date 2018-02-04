import java.util.ArrayList;

/**
 * Created by Samin on 03/02/2018.
 */
public class Module
   {
      
      public static ArrayList<Module> moduleArrl = new ArrayList<>();
      private String moduleName, grade;
      private int credits, totalCredits, score;
      
      // Default constructor
      public Module(){
         this.moduleName = "";
         this.credits = 0;
         this.score = 0;
      }
   
      /**
       * Prints the contents of modules list
       */
      public static void printModuleArrl(){
         if(moduleArrl.size() < 1){
            System.out.println("There are no modules to print!");
            return;
         }
         int i = 0;
         for(Module module : moduleArrl){
            System.out.println("===== Module " + (i+1) + " =====");
            System.out.println(module);
            i++;
         }
      }
   
      /**
       * Adds a module to list of created modules
       * @param module is a module to be added
       */
      public void addToModuleArrl(Module module){
         moduleArrl.add(module);
      }
      
      @Override
      public String toString(){
         return "Module name: " + this.moduleName + "\n" +
                 "Credits: " + this.credits + "\n" +
                 "Score: " +  this.score + "\n";
      }
      
      // Get functions
      public String getModuleName(){
         return moduleName;
      }
      
      public int getCredits(){
         return credits;
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
      
      public void setCredits(int tc){
         this.credits = tc;
      }
      
      public void setScore(int s){
         this.score = s;
      }
      
      public void setGrade(String g){
         this.grade = g;
      }
   }
