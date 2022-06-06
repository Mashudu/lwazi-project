public class Task {
    private String  taskDescription;
    private String  developerDetails;
    private String  taskNumber;
    private int     taskDuration;
    private String  status;
    private String  taskName;
    private String taskId;

    public void setTaskId() {
        this.taskId = this.makeTaskId();
    }
   public  String getTaskId(){
        return this.taskId;
   }


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDescriptionLength(){
        return this.taskDescription.length();
    }

    private String makeTaskId(){
        String s1 =  this.taskName.substring(0,2);
        String s2 =  ":";
        String s3 =  this.taskNumber;
        String s4 =  ":";
        String s5 = this.developerDetails.substring(this.developerDetails.length()-3);

        return s1+s2+s3+s4+s5;
    }



}
