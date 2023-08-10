package framework.parsers.objects;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("User №")
    private String number;
    @SerializedName("First Name")
    private String firstName;
    @SerializedName("Last Name")
    private String lastName;
    @SerializedName("Email")
    private String email;
    @SerializedName("Age")
    private String age;
    @SerializedName("Salary")
    private String salary;
    @SerializedName("Department")
    private String department;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
