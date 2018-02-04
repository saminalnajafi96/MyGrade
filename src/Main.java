import java.util.Scanner;

public class Main {
   
   public static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      System.out.println("Welcome to MyGrade, what's your name?");
      
      Student student = new Student();
      student.setStudentName(scan.nextLine());
      
      System.out.println("Hello, " + student.getStudentName() + ". Now let's create a module.");
      createSubject();
      System.out.println("Great, here's what you've added: ");
      
      Module.printSubjectArrl();
      
      boolean exit = false;
      int choice;
      System.out.print("Now you're ready! ");
      while(exit == false){
         System.out.println("What would you like to do?" + "\n" +
                 "1. Create module" + "\n" +
                 "2. Edit module" + "\n" +
                 "3. Delete module" + "\n" +
                 "4. Print modules" + "\n" +
                 "5. Calculate overall grade" + "\n" +
                 "6. Exit");
         
         choice = scan.nextInt();
         scan.nextLine();
         
         if(choice==1){
            createSubject();
         }
         if(choice==4){
            Module.printSubjectArrl();}
         if(choice==6){
            System.out.println("WARNING: Nothing will be saved after exiting. Are you sure you want to exit? (y/n)");
            String answer = scan.nextLine();
            if(answer.equals('y')) {
               exit = true;
            }
            else{
               continue;
            }
         }
      }
      scan.close();
      System.out.println("Goodbye.");
      System.exit(0);
   }
   
   public static Module createSubject(){
      Module module = new Module();
      
      System.out.println("Module name:");
      module.setModuleName(scan.nextLine());
      
      System.out.println("Credits:");
      module.setTotalCredits(scan.nextInt());
      
      System.out.println("Score:");
      module.setScore(scan.nextInt());
      
      module.addToSubjectArrl(module);
      
      return module;
   }
   
}
