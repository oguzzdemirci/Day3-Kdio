public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Oğuzhan");
        student.setLastName("DEMİRCİ");
        student.setAge(21);
        student.setId(31234);
        student.setStudentNumber(354565134);

        System.out.println(student.getStudentNumber());
        System.out.println("-----------------------------------------");
        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setAge(32);
        instructor.setId(16744);
        instructor.setSalary(10000);

        System.out.println(instructor.getSalary());
        System.out.println("-----------------------------------------");
        UserManager userManager = new UserManager();
        userManager.Add(student);
        userManager.Add(instructor);
        userManager.Update(student);
        userManager.Update(instructor);
        System.out.println("-----------------------------------------");

        StudentManager studentManager = new StudentManager();
        studentManager.NumberUpdate();
        System.out.println("-----------------------------------------");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.SalaryCalculate(instructor);

    }
}
