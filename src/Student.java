/**
 * Created by Samin on 03/02/2018.
 */
public class Student extends Module
   {
      private String studentName;
      
      // Default constructor
      public Student() {
         this.studentName = "";
      }
      
      // Get functions
      public String getStudentName(){
         return studentName;
      }
      
      // Set functions
      public void setStudentName(String sn){
         this.studentName = sn;
      }
   }