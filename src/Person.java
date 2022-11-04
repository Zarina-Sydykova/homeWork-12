public class Person {
    private String fullName;
    private String jobTitle;
    private String familyStatus;
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public void setFamilyStatus(String familyStatus){
        this.familyStatus=familyStatus;
    }
    String getFullName(){
        return fullName;
    }
    String getFamilyStatus(){
        return familyStatus;
    }
    String getJobTitle(){
        return jobTitle;
    }
}