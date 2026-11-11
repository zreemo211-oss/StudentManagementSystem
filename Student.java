
package StudentManagement;

public class Student {

    String name;
    int age;
    String national_id;
    double grade;

    public Student(String name, int age, String national_id, double grade) {

        this.name = name;
        this.age = age;
        this.national_id = national_id;
        this.grade = grade;
    }

    public String getNational_id() {
        return national_id;
    }

    public String getStatus() {

        if (grade >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public String getEvaluation() {

        if (grade >= 90) {
            return "Excellent";
        } else if (grade >= 80) {
            return "Very Good";
        } else if (grade >= 70) {
            return "Good";
        } else if (grade >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void displayInfo() {

        System.out.println("--------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + national_id);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + getStatus());
        System.out.println("Evaluation: " + getEvaluation());
        System.out.println("-------------------");
    }
}

	
	

