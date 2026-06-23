public class StudentController{
    Student model;
    StudentView view;
    StudentController(Student m, StudentView v){
        model = m;
        view = v;
    }
    public void setStudentDetails(String n, String id, Double g){
        model.setName(n);
        model.setID(id);
        model.setGrade(g);
    }
    public void displayStudentName(){
        view.displayName(model.getName());
    }
    public void displayStudentID(){
        view.displayID(model.getID());
    }
    public void displayStudentGrade(){
        view.displayGrade(model.getGrade());
    }
}