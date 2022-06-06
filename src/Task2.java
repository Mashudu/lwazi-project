import javax.swing.JOptionPane;
public class Task2
{
    /*
     * Welcome user to easyKanban
     * Show user menu bar
     * When user chooese option 1
     * Ask the user how many tasks they want to enter
     * ask about the tasks
     * show output using JOptionPane
     */
    private boolean validLogin;
    private int numberOfTasks;
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;

    public static void main(String[] args) {
        Task2 task2= new Task2();
        task2.runApp();
    }

    public void runApp()
    {
        JOptionPane.showInputDialog("","Enter your username");
        JOptionPane.showInputDialog("","Enter your password");
        checkValidLogin(validLogin);
        optionList();
    }
    public boolean checkValidLogin(boolean validLogin)
    {
        if(validLogin== true)
        {
            JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
        } else{
            JOptionPane.showMessageDialog(null,"Something is incorrect with your login");
            JOptionPane.showInputDialog("","Enter your username");
            JOptionPane.showInputDialog("","Enter your password");
        }
        return true;
    }

    public void numberOfTask()
    {
        int numberOfTasks =0;
        try{
            numberOfTasks= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of tasks that you want to do"));
            if(numberOfTasks <1){throw new NumberFormatException();}
            for(int counter =1; counter<= numberOfTasks ;counter ++)
            {
                JOptionPane.showMessageDialog(null,"TaskOld"+counter);
                taskName();
                taskDescription();
                developerDetail();
                taskDuration();
                taskStatus();
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Invalid number");
        }
    }
    public String taskName()
    {
        return JOptionPane.showInputDialog(null, "Enter the name of the task that you want to do");
    }
    public String taskDescription()
    {
        String taskDescription;
        return JOptionPane.showInputDialog(null,"Enter the description of your task, make sure that your description is less than 50 words");
    }
    public boolean checkTaskDescription()
    {
        if( taskDescription.length() <= 50)
        {
            JOptionPane.showMessageDialog(null,"TaskOld successfully captured");
        }else
        {
            JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 Characters");
        }
        return true;
    }

    public String developerDetail()
    {
        String developerDetails;
        return JOptionPane.showInputDialog(null,"Enter the first and the last name of the developer");
    }
    public int taskDuration()
    {
        int taskDuration;
        return Integer.parseInt( JOptionPane.showInputDialog(null,"Enter how long it may take to complete the task"));
    }
    public String taskStatus()
    {
        int status;
        String taskStatus="";
        taskStatus= JOptionPane.showInputDialog("Enter the status of your task \n"+" 1 To do \n"+"2 Doing \n"+"3Done");
        status = Integer.parseInt(taskStatus);
        do{
            switch(status){
                case 1: JOptionPane.showMessageDialog(null," Status :To Do");
                    break;
                case 2: JOptionPane.showMessageDialog(null," Status : Doing");
                    break;
                case 3:JOptionPane.showMessageDialog(null,"Status : Done");
                default : JOptionPane.showMessageDialog(null,"Invalid option");

            }
        }while (status>0 && status < 3);
        return taskStatus;
    }
    public void optionList()
    {
        int option;
        String feature= "";

        feature= JOptionPane.showInputDialog(null,"Select one feature on the menu \n"
                +"1).Add task\n"
                +"2).Show report\n"
                +"3).Quit");

        option=Integer.parseInt(feature);

        switch(option){
            case 1:
                numberOfTask();
                taskName();
                taskDescription();
                developerDetail();
                taskDuration();
                taskStatus();
                break;
            case 2: JOptionPane.showMessageDialog(null,"Coming Soon!!");
                break;
            case 3: JOptionPane.showMessageDialog(null,"Thank you for using EasyKanban");
                System.exit(0);
            default :
                JOptionPane.showMessageDialog(null,"Inavalid option");
        }
    }
}

