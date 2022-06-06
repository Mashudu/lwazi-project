import javax.swing.JOptionPane;
public class TaskOld
{
    /*
     * uses for loop for the number of task
     * must increment correctly
     */
    private String taskName;
    private String taskDescription;
    private String developerDetail;
    private int taskDuration;
    private int taskNumber;
    int counter;
    private String taskID;
    private String status;
    public void taskName()
    {
        String taskName;
        taskName = JOptionPane.showInputDialog(null,"Write the name of the task");
        JOptionPane.showMessageDialog(null, "TaskOld name:" +taskName );
    }
    public void taskDescription()
    {
        String taskDescription;
        taskDescription = JOptionPane.showInputDialog(null,"Enter the description of your task, it cannot be more than 50 words");
        JOptionPane.showMessageDialog(null,"TaskOld Desciption :"+taskDescription);
    }
    public void developerDetails()
    {
        String developerDetail;
        developerDetail= JOptionPane.showInputDialog(null,"Enter the first name and the last name of the devloper assigned the task");
        JOptionPane.showMessageDialog(null,"Developer details:"+ developerDetail);
    }
    public void taskNumber()
    {
        int numberOfTasks =0;
        try{
            numberOfTasks= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of tasks that you want to do"));
            if(numberOfTasks <1){throw new NumberFormatException();}
            for(int counter =1; counter<= numberOfTasks ;counter ++);

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Invalid number");
        } }
    public void taskID(String taskName,String developerDetail,int taskNumber)
    {
        JOptionPane.showMessageDialog(null,taskName.substring(0,2)+":"+taskNumber+":"+developerDetail.substring(developerDetail.length()-3)) ;
    }
}