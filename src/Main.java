import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

       int numberOfTasks  = numberOfTask();
      ArrayList<Task> taskArrayList = new ArrayList<Task>();

        for(int counter =1; counter<= numberOfTasks ;counter ++)
        {
            JOptionPane.showMessageDialog(null,"Task Number: "+counter);
            Task task  =  new Task();

            task.setTaskName( (JOptionPane.showInputDialog(null,"Please Enter the  Task Name")));
            String  taskDescription = JOptionPane.showInputDialog(null,"Please Enter the  Task Description");
            Rules r  = new Rules();

            while(!r.checkDescription(taskDescription)){
                taskDescription = JOptionPane.showInputDialog(null,"Please Enter the  Task Description");
            }

            task.setTaskDescription(taskDescription);

            task.setDeveloperDetails( (JOptionPane.showInputDialog(null,"Please Enter the  Developer Name & Surname")));
            task.setTaskDuration( Integer.parseInt(JOptionPane.showInputDialog(null,"How long will the  task Take in days?")));
            task.setStatus( (JOptionPane.showInputDialog(null,"What is  the  task Status")));
            task.setTaskNumber( (JOptionPane.showInputDialog(null,"What is the  Task Number")));

            task.setTaskId();

            taskArrayList.add(task);
            System.out.println(task.getTaskId());

        }
        for(Task task:taskArrayList){
            printATask(task);
        }

    }


    public static int numberOfTask()
    {
        int numberOfTasks =0;
        try{
            numberOfTasks= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of tasks that you want to do"));

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Invalid number");
        }
        return numberOfTasks;
    }

    public static void printATask(Task task){
        System.out.println("=================");
        System.out.println("Task ID          : "+task.getTaskId());
        System.out.println("Task Name        : "+ task.getTaskName());
        System.out.println("Task Number      : "+task.getTaskNumber());
        System.out.println("Task Description : "+task.getTaskDescription());
        System.out.println("Task Duration    : "+task.getTaskDuration());
        System.out.println("Task Status      : "+task.getStatus());

    }
}