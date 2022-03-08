package ie.employee;

public class Employee {
    private String title;
    private String name;
    private String ppsId;
    private int phoneNumber;
    private String employmentType;
    private int age;

    public Employee(String Title, String Name, String PPSID, int PhoneNumber, String EmploymentType, int Age) {
        if (!"Mr".equals(Title) || !"Mrs".equals(Title) || !"Miss".equals(Title)){
            throw new IllegalArgumentException("Invalid title provided");
        }
        this.title = Title;

        if (Name.length() >= 22 || Name.length() <= 5 ){
            throw new IllegalArgumentException("Invalid name provided");
        }
        this.name = Name;

        if(PPSID.length() != 6){
            throw new IllegalArgumentException("Invalid pps provided");
        }
        this.ppsId = PPSID;

        if (String.valueOf(PhoneNumber).length() != 7){
            throw new IllegalArgumentException("Invalid phone number provided");
        }
        this.phoneNumber = PhoneNumber;

        if (!EmploymentType.equals("Full-time") || !EmploymentType.equals("Part-time")){
            throw new IllegalArgumentException("Invalid employment type provided");
        }
        this.employmentType = EmploymentType;

        if(Age < 18){
            throw new IllegalArgumentException("Invalid age provided");
        }
        this.age = Age;
    }



}
