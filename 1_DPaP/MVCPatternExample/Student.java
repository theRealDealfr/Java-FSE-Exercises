public class Student{
    String name;
    String ID;
    Double grade;
    Student(String n, String id, Double g){
        name = n;
        ID = id;
        grade = g;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public Double getGrade(){
        return grade;
    }
    public void setName(String n){
        name = n;
    }
    public void setID(String id){
        ID = id;
    }
    public void setGrade(Double g){
        grade =g;
    }
}