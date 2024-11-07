package encapsulationDemo;

public class Employee {
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    private int eid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private int experience;


    public Employee(String name,int eid,int age,int salary,int experience){
        this.setName(name);
        this.setSalary(salary);
        this.setEid(eid);
        this.setExperience(experience);
        this.setAge(age);
    }






}
