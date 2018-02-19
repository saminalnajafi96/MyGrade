import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Samin on 11/02/2018.
 */
public class GUI
   {
      public static void startMenu(){
         JFrame frame = new JFrame("MyGrade");
         JTable moduleTable = new JTable();
         JTable tasksTable = new JTable();
         
         // Creating columns, models and other settings to do with tables
         Object[] moduleTableColumns = {"Module", "Credits", "Grade"};
         DefaultTableModel moduleTableModel = new DefaultTableModel();
         moduleTableModel.setColumnIdentifiers(moduleTableColumns);
         
         Object[] tasksTableColumns = {"Task", "Weighting", "Grade"};
         DefaultTableModel tasksTableModel = new DefaultTableModel();
         tasksTableModel.setColumnIdentifiers(tasksTableColumns);
         
         moduleTable.setModel(moduleTableModel);
         tasksTable.setModel(tasksTableModel);
         
         moduleTable.setBackground(Color.LIGHT_GRAY);
         moduleTable.setForeground((Color.BLACK));
         moduleTable.setRowHeight(30);
         
         tasksTable.setBackground(Color.LIGHT_GRAY);
         tasksTable.setForeground(Color.BLACK);
         tasksTable.setRowHeight(30);
         
         // Fields, buttons and labels
         JTextField moduleName = new JTextField();
         JTextField moduleCredits = new JTextField();
         
         JButton btnAdd = new JButton("Add");
         JButton btnDelete = new JButton("Delete");
         
         moduleName.setBounds(135, 212, 100, 25);
         moduleCredits.setBounds(135, 249, 100, 25);
         
         btnAdd.setBounds(400, 220, 100, 25);
         btnDelete.setBounds(400, 265, 100, 25);
         
         JScrollPane moduleTablePane = new JScrollPane(moduleTable);
         moduleTablePane.setBounds(0, 0, 440, 200);
         
         JScrollPane tasksTablePane = new JScrollPane(tasksTable);
         tasksTablePane.setBounds(450, 0, 440, 200);
         
         JLabel lblModule = new JLabel("Module");
         lblModule.setBounds(10, 217, 61, 16);
         
         JLabel lblCredits = new JLabel("Credits");
         lblCredits.setBounds(10, 254, 61, 16);
         
         JTextField taskName = new JTextField();
         taskName.setBounds(660, 212, 100, 25);
         
         JTextField taskWeighting = new JTextField();
         taskWeighting.setBounds(660, 249, 100, 25);
         
         JTextField taskGrade = new JTextField();
         taskGrade.setBounds(660, 286, 100, 25);
         
         JLabel lblName = new JLabel("Name");
         lblName.setBounds(587, 217, 61, 16);
         
         JLabel lblWeighting = new JLabel("Weighting");
         lblWeighting.setBounds(573, 254, 75, 16);
         
         JLabel lblGrade = new JLabel("Grade");
         lblGrade.setBounds(587, 291, 61, 16);
         
         // Adding components to frame
         frame.getContentPane().setLayout(null);
         
         frame.getContentPane().add(moduleTablePane);
         frame.getContentPane().add(tasksTablePane);
         
         // Add labels to frame
         frame.getContentPane().add(lblGrade);
         frame.getContentPane().add(lblWeighting);
         frame.getContentPane().add(lblName);
         frame.getContentPane().add(lblCredits);
         frame.getContentPane().add(lblModule);
         
         // Add text fields to frame
         frame.getContentPane().add(moduleName);
         frame.getContentPane().add(moduleCredits);
         frame.getContentPane().add(taskName);
         frame.getContentPane().add(taskWeighting);
         frame.getContentPane().add(taskGrade);
         
         // Add buttons to the jframe
         frame.getContentPane().add(btnAdd);
         frame.getContentPane().add(btnDelete);
         
         // Create an array of objects to set the row data for both tables
         Object[] moduleTableRow = new Object[3];
         Object[] tasksTableRow = new Object[3];
         
         // Button to add data to row(s)
         btnAdd.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
               if(taskName.getText().isEmpty() && taskWeighting.getText().isEmpty() && taskGrade.getText().isEmpty() &&
                       moduleName.getText().isEmpty() && moduleCredits.getText().isEmpty()){
                  JOptionPane.showMessageDialog(null, "All fields are empty", "Error",
                          JOptionPane.ERROR_MESSAGE);
               }
               else if(taskName.getText().isEmpty() && taskWeighting.getText().isEmpty() && taskGrade.getText()
                       .isEmpty())
                  {
                     moduleTableRow[0] = moduleName.getText();
                     moduleTableRow[1] = moduleCredits.getText();
                     moduleTableRow[2] = 0;
                     
                     moduleTableModel.addRow(moduleTableRow);
                     
                     moduleName.setText("");
                     moduleCredits.setText("");
                  }
               else{
                     if(moduleTableModel.getRowCount() == 0){
                        JOptionPane.showMessageDialog(null, "Start by adding some modules first", "Error",
                                JOptionPane.ERROR_MESSAGE);
   
                        taskName.setText("");
                        taskWeighting.setText("");
                        taskGrade.setText("");
                     }
                     else
                        {
                           tasksTableRow[0] = taskName.getText();
                           tasksTableRow[1] = taskWeighting.getText();
                           tasksTableRow[2] = taskGrade.getText();
                           
                           tasksTableModel.addRow(tasksTableRow);
                           
                           taskName.setText("");
                           taskWeighting.setText("");
                           taskGrade.setText("");
                        }
                  }
            }
         });
         
         // Button to delete data from selected row
         btnDelete.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
               
               // i = the index of the selected row
               int i = moduleTable.getSelectedRow();
               int j = tasksTable.getSelectedRow();
               if(i >= 0){
                  // remove a row from jtable
                  moduleTableModel.removeRow(i);
               }
               else if(j >= 0){
                  tasksTableModel.removeRow(j);
               }
               else{
                     JOptionPane.showMessageDialog(null,"Nothing selected to delete!","Error",JOptionPane
                             .ERROR_MESSAGE);
                  }
            }
         });
         
         frame.setSize(900,500);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);
         frame.setResizable(false);
         frame.setVisible(true);
      }
   }