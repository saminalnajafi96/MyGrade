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
      public static void printModules(){
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
   
      /**
       * This function creates a new module and adds it to the list of other created modules
       *
       * @return a succesfully created module
       */
      public void createModule()
         {
            if(totalCredits == 120){
               System.out.println("Sorry, there is a maximum of 120 credits. Check if you've entered module details " +
                       "correctly");
               return;
            }
            
            Module module = new Module();
            
            System.out.println("Module name:");
            module.setModuleName(Main.scan.nextLine());
         
            System.out.println("Credits:");
            module.setCredits(Main.scan.nextInt());
            totalCredits += module.getCredits();
         
            System.out.println("Score:");
            module.setScore(Main.scan.nextInt());
         
            addToModuleArrl(module);
         }
   
      /**
       * This function deletes a selected module
       */
      public static void deleteModule()
         {
            if(moduleArrl.size() < 1)
               {
                  System.out.println("There are no modules to delete!");
                  return;
               }
         
            boolean isValid = false;
            int moduleToDelete;
         
            while(!isValid){
               System.out.println("Here are the modules you've currently created");
               printModules();
            
               System.out.println("Which one would you like to delete (enter the corresponding module number)");
               moduleToDelete = Main.scan.nextInt();
            
               if(moduleToDelete > moduleArrl.size() || moduleToDelete <=0){
                  System.out.println("Sorry, that's not an option. Please choose one of the modules");
               }
               else{
                  moduleToDelete--;
                  moduleArrl.remove(moduleToDelete);
                  System.out.println("Module " + (moduleToDelete+1) + " successfully deleted.");
                  isValid = true;
               }
            }
         }
   
      /**
       * This function edits the details of a selected module
       */
      public static void editModule()
         {
            if(Module.moduleArrl.size() < 1)
               {
                  System.out.println("There are no modules to edit!");
                  return;
               }
            boolean isValid = false;
            int moduleToEdit = 0;
            try
               {
                  while(!isValid)
                     {
                        System.out.println("Here are the modules you've currently created");
                        printModules();
                        System.out.println("Which one would you like to edit? (enter the corresponding module number)");
                     
                        moduleToEdit = Main.scan.nextInt();
                        if(moduleToEdit > moduleArrl.size() || moduleToEdit <= 0)
                           {
                              System.out.println("Sorry, that's not an option. Please choose one of the modules.");
                           }
                        else {
                           moduleToEdit--;
                           isValid = true;
                        }
                     }
               
                  isValid = false;
               
                  while(!isValid){
                     System.out.println("What would you like to edit?" + "\n" +
                             "1. Module name" + "\n" +
                             "2. Credits" + "\n" +
                             "3. Score");
                     int choice = Main.scan.nextInt();
                  
                     if(choice == 1)
                        {
                           System.out.println("What would you like to change the name to?");
                           Main.scan.nextLine();
                           String newModuleName = Main.scan.nextLine();
                           moduleArrl.get(moduleToEdit).setModuleName(newModuleName);
                           isValid = true;
                        }
                     if(choice == 2)
                        {
                           System.out.println("What would you like to change the credits to?");
                           Main.scan.nextLine();
                           int newCredits = Main.scan.nextInt();
                           moduleArrl.get(moduleToEdit).setCredits(newCredits);
                           isValid = true;
                        }
                     if(choice==3)
                        {
                           System.out.println("What would you like to change the score to?");
                           Main.scan.nextLine();
                           int newScore = Main.scan.nextInt();
                           moduleArrl.get(moduleToEdit).setScore(newScore);
                           isValid = true;
                        }
                     else{
                        System.out.println("Sorry, that's not an option.");
                     }
                  }
               }
            catch(Exception e)
               {
                  System.out.println("Sorry, that's not an option");
               }
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
      
      public int getTotalCredits(){return totalCredits;}
      
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
