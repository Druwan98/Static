package exercises.Static;

public class Employee {
    private String name;
    private String surname;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return "Name: " + name + "Surname: " + surname + "Address: " + address;
    }

}
