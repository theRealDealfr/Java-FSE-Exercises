class MVCTest{
    public static void main(String[] args){
        Student s = new Student("Athira", "RS0340",9.1);
        StudentView v = new StudentView();
        StudentController c = new StudentController(s, v);
        c.displayStudentName();
        c.displayStudentID();
        c.displayStudentGrade();
        c.setStudentDetails("Athira H", "RS0340", 8.9);
        c.displayStudentName();
        c.displayStudentID();
        c.displayStudentGrade();
        //System.out.println("------------------------------");

    }
}