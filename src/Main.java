import java.util.Scanner;

public class Main
   {
      
      private static Scanner scan = new Scanner(System.in);
      
      public static void main(String[] args)
         {
            System.out.println("Welcome to MyGrade, what's your name?");
            
            Student student = new Student();
            student.setStudentName(scan.nextLine());
            
            System.out.println("Hello, " + student.getStudentName() + ". Now let's create a module.");
            createModule();
            System.out.println("Great, here's what you've added: ");
            
            Module.printModuleArrl();
            
            boolean exit = false;
            int choice;
            System.out.print("Now you're ready! ");
            while(!exit)
               {
                  System.out.println("What would you like to do?" + "\n" +
                          "1. Create module" + "\n" +
                          "2. Edit module" + "\n" +
                          "3. Delete module" + "\n" +
                          "4. Print modules" + "\n" +
                          "5. Calculate overall grade" + "\n" +
                          "6. Exit");
                  
                  choice = scan.nextInt();
                  scan.nextLine();
                  
                  if(choice == 1)
                     {
                        createModule();
                     }
                  if(choice == 2)
                     {
                        editModule();
                     }
                  if(choice == 3)
                     {
                        deleteModule();
                     }
                  if(choice == 4)
                     {
                        Module.printModuleArrl();
                     }
                  if(choice == 5)
                     {/*Calculate grade to be completed*/}
                  if(choice == 6)
                     {
                        System.out.println("WARNING: Nothing will be saved after exiting. Are you sure you want to exit? (y/n)");
                        String answer = scan.nextLine();
                        if(answer.equals("y"))
                           {
                              exit = true;
                              
                           }
                        else
                           {
                              continue;
                           }
                     }
                  if(choice < 1 || choice > 6){
                     System.out.println("Sorry that's not an option");
                  }
               }
            scan.close();
            System.out.println("Goodbye.");
            System.exit(0);
         }
      
      /**
       * This function creates a new module and adds it to the list of other created modules
       *
       * @return a succesfully created module
       */
      public static Module createModule()
         {
            Module module = new Module();
            
            System.out.println("Module name:");
            module.setModuleName(scan.nextLine());
            
            System.out.println("Credits:");
            module.setCredits(scan.nextInt());
            
            System.out.println("Score:");
            module.setScore(scan.nextInt());
            
            module.addToModuleArrl(module);
            
            return module;
         }
      
      /**
       * This function deletes a selected module
       */
      public static void deleteModule()
         {
            if(Module.moduleArrl.size() < 1)
               {
                  System.out.println("There are no modules to delete!");
                  return;
               }
   
            boolean isValid = false;
            int moduleToDelete;
            
            while(!isValid){
               System.out.println("Here are the modules you've currently created");
               Module.printModuleArrl();
   
               System.out.println("Which one would you like to delete (enter the corresponding module number)");
               moduleToDelete = scan.nextInt();
               
               if(moduleToDelete > Module.moduleArrl.size() || moduleToDelete <=0){
                  System.out.println("Sorry, that's not an option. Please choose one of the modules");
               }
               else{
                  moduleToDelete--;
                  Module.moduleArrl.remove(moduleToDelete);
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
                        Module.printModuleArrl();
                        System.out.println("Which one would you like to edit? (enter the corresponding module number)");
                        
                        moduleToEdit = scan.nextInt();
                        if(moduleToEdit > Module.moduleArrl.size() || moduleToEdit <= 0)
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
                     int choice = scan.nextInt();
                     
                     if(choice == 1)
                        {
                           System.out.println("What would you like to change the name to?");
                           scan.nextLine();
                           String newModuleName = scan.nextLine();
                           Module.moduleArrl.get(moduleToEdit).setModuleName(newModuleName);
                           isValid = true;
                        }
                     if(choice == 2)
                        {
                           System.out.println("What would you like to change the credits to?");
                           scan.nextLine();
                           int newCredits = scan.nextInt();
                           Module.moduleArrl.get(moduleToEdit).setCredits(newCredits);
                           isValid = true;
                        }
                     if(choice==3)
                        {
                           System.out.println("What would you like to change the score to?");
                           scan.nextLine();
                           int newScore = scan.nextInt();
                           Module.moduleArrl.get(moduleToEdit).setScore(newScore);
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
   }
