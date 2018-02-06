import java.util.Scanner;

public class Main
   {
      
      public static Scanner scan = new Scanner(System.in);
      
      public static void main(String[] args)
         {
            System.out.println("Welcome to MyGrade, what's your name?");
            
            Student student = new Student();
            student.setStudentName(scan.nextLine());
            
            System.out.println("Hello, " + student.getStudentName() + ". Now let's create a module.");
            
            student.createModule();
            
            System.out.println("Great, here's what you've added: ");
            Module.printModules();
            
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
                  
                  if(choice == 1) {student.createModule();}
                  if(choice == 2) {student.editModule();}
                  if(choice == 3) {student.deleteModule();}
                  if(choice == 4) {student.printModules();}
                  if(choice == 5) {/*Calculate grade to be completed*/ calculateGrade();}
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
                  if(choice < 1 || choice > 6){System.out.println("Sorry that's not an option");}
               }
            scan.close();
            System.out.println("Goodbye.");
            System.exit(0);
         }
   
      /**
       * This function calculates the overall grade based off the modules
       * @return overall grade
       */
      public static int calculateGrade(){
         for(int i = 0; i < Module.moduleArrl.size();i++){
            
         }
         return 0;
      }
   }
