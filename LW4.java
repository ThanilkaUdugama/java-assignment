import java.util.ArrayList;

abstract class Person{
    private String name;
    
    abstract void displayInfo();
    
    Person(String name){
        this.name = name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
}

class Course{
    private String name, enrollType;
    private Integer numberOfStudentsEnrolled;
    Lecturer lecturerInCharge;
    Degree degreeBelongsTo;
    
    Course(String name, String enrollType, Integer numberOfStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo){
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }
    
    void displayInfo(){
        System.out.printf("Course Name : %s\nEnrollType : %s\nNumber Of Students Enrolled : %d\nLecturer In Charge : %s\nDegree Belongs To : %s\n", this.name, this.enrollType, this.numberOfStudentsEnrolled, this.lecturerInCharge.getName(), this.degreeBelongsTo.getName());
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setEnrollType(String enrollType){
        this.enrollType = enrollType;
    }
    
    String getEnrollType(){
        return this.enrollType;
    }
    
    void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled){
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }
    
    Integer getNumberOfStudentsEnrolled(){
        return this.numberOfStudentsEnrolled;
    }
    
    void addLecturerInCharge(Lecturer lecturerInCharge){
        this.lecturerInCharge = lecturerInCharge;
    }
    
    void removeLecturerInCharge(){
        this.lecturerInCharge = null;
    }
    
    void addDegreeBelongsTo(Degree degreeBelongsTo){
        this.degreeBelongsTo = degreeBelongsTo;
    }
    
    void removeDegreeBelongsTo(){
        this.degreeBelongsTo = null;
    }
}

class Lecturer extends Person{
    private String position;
    Department department;
    private ArrayList<Course> coursesTeaching;
    
    Lecturer(String name, String position, Department department, ArrayList<Course> coursesTeaching){
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }
  
    void displayInfo(){
        System.out.printf("Name : %s\nPosition : %s\nDepartment : %s\n", this.getName(), this.position, this.department.getName());
    }
    
    void setPosition(String position){
        this.position = position;
    }
    
    String getPosition(){
        return this.position;
    }
    
    void setDepartment(Department department){
        this.department = department;
    }
    
    Department getDepartment(){
        return this.department;
    }
    
    void displayDepartmentInfo(){
        this.department.displayInfo();
    }
    
    void addCourse(Course course){
        this.coursesTeaching.add(course);
    }
    
    void removeCourse(Course course){
        this.coursesTeaching.remove(course);
    }
    
    void listCoursesTeaching(){
        for (Course course : this.coursesTeaching){
            System.out.println(course.getName());
        }
    }
}

class Student extends Person{
    private String studentID, year;
    Degree degree;
    ArrayList<Course> coursesEnrolled;
    
    Student(String name, String studentID, String year, Degree degree, ArrayList<Course> coursesEnrolled){
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }
    
   
    void displayInfo(){
        System.out.printf("Name : %s\nDegree : %s\n", this.getName(), this.degree.getName());
    }
    
    void setStudentID(String studentID){
        this.studentID = studentID;
    }
    
    String getStudentID(){
        return this.studentID;
    }
    
    void registerDegree(Degree degree){
        this.degree = degree;
    }
    
    void displayDegreeInfo(){
        this.degree.displayInfo();
    }
    
    void enrollCourse(Course course){
        this.coursesEnrolled.add(course);
    }
    
    void unenrollCourse(Course course){
        this.coursesEnrolled.remove(course);
    }
    
    void listCoursesEnrolled(){
        for (Course course : this.coursesEnrolled){
            System.out.println(course.getName());
        }
        
    }
    
}

class Degree{
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;
    
    Degree(String name, Integer numberOfStudents, ArrayList<Course> coursesOffering){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = coursesOffering;
    }
    
    void displayInfo(){
        System.out.printf("Degree Name : %s\nNumber of Students : %d\n",this.name, this.numberOfStudents);
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setNumberOfStudents(Integer numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
    
    Integer getNumberOfStudents(){
        return this.numberOfStudents;
    }
    
    void offerCourse(Course course){
        this.coursesOffering.add(course);
    }
    
    void withdrawCourse(Course course){
        this.coursesOffering.remove(course);
    }
    
    void listCoursesOffering(){
        for (Course course : this.coursesOffering){
            System.out.println(course.getName());
        }
    }
    
}

class Department{
    private String name;
    Lecturer departmentHead;
    ArrayList<Course> coursesOffering;
    ArrayList<Lecturer> lecturersBelongsTo;
    
    Department(String name, Lecturer departmentHead, ArrayList<Course> coursesOffering, ArrayList<Lecturer> lecturersBelongsTo){
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturersBelongsTo = lecturersBelongsTo;
    }
    
    void displayInfo(){
        System.out.printf("Department : %s\nHead : %s\n", this.name, this.departmentHead.getName());
    }
    
    void setName(String name){
        this.name =name;
    }
    
    String getName(){
        return this.name;
    }
    
    void appointDepartmentHead(Lecturer departmentHead){
        this.departmentHead = departmentHead;
    }
    
    void displayDepartmentHeadInfo(){
        System.out.printf("%s", this.departmentHead.getName());
    }
    
    void offerCourse(Course course){
        this.coursesOffering.add(course);
    }
    
    void withdrawCourse(Course course){
        this.coursesOffering.remove(course);
    }
    
    void addLecturer(Lecturer lecturer){
        this.lecturersBelongsTo.add(lecturer);
    }
    
    void removeLecturer(Lecturer lecturer){
        this.lecturersBelongsTo.remove(lecturer);
    }
}


public class UniversityManagementSystem {
  public static void main(String args[]) {
    ArrayList <Course> courses = new ArrayList<>();
    ArrayList <Degree> degrees = new ArrayList<>();
    ArrayList <Lecturer> lecturers = new ArrayList<>();
      
    Department dp = new Department("Software Engineering", null, courses, lecturers);
    
     
    Degree dg = new Degree("Computer Science", 1, courses);
    
    Course c1 = new Course("Object-Oriented Programming", "By Examination", 1, null, dg);
    
    Lecturer l1 = new Lecturer("Dr. Sarah Williams", "Head", dp, courses);
    
    Student s1 = new Student("U.M.T.V Udugama", "CS/2021/035", "2023", dg, courses);
    

    
    dp.appointDepartmentHead(l1);
    dp.offerCourse(c1);
    dp.addLecturer(l1);
    
    
    dg.offerCourse(c1);
    
    c1.addLecturerInCharge(l1);
    
    l1.addCourse(c1);
    
    s1.enrollCourse(c1);
    
    
    dp.displayInfo();
    dg.displayInfo();
    c1.displayInfo();
    l1.displayInfo();
    s1.displayInfo();
    
    
    
    
    
     
     
     
  }
}