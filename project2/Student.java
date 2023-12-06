package project2;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Student extends Person {
    private int registration;
    private String cnumber;
    
    public Student() {
    	
    }

    public Student(String name, int age, int registration, String cnumber) {
        super(name, age);
        this.registration = registration;
        this.cnumber = cnumber;
    }

    public int getRegistration() {
        return registration;
    }

    public String getCnumber() {
        return cnumber;
    }

    private void inputStudentDetails() {
        inputStudentDetails();
        Scanner viewer2 = new Scanner(System.in);
        System.out.print("|Digite o numero da sua turma: ");
        this.cnumber = viewer2.nextLine();
    }

    public void calculateRegistration() {
    	int currentYear = Year.now().getValue();
        this.registration = currentYear + getName().length() + getAge();
        System.out.println("|Matrícula do Aluno: " + registration);
    }
    
    private void displayStudentsDetails() {
        displayDetails();
        System.out.println("|Sua Turma: " + cnumber);
        System.out.println("|=============================================|");
    }
    
    private static boolean containsStudentRegistration(ArrayList<Student> students, int registration) {
        for (Student s : students) {
            if (s.getRegistration() == registration) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
    	
    	ArrayList<Student> studentsList = new ArrayList<>();
    	Student scholar = new Student();
    	scholar.inputStudentDetails();
    	scholar.calculateRegistration();
    	scholar.displayStudentsDetails();
    	
			try {
				scholar.containsStudentRegistration(studentsList, scholar.getRegistration());
			} catch (Exception e) {
				e.printStackTrace();
			}
    	
    	if (!containsStudentRegistration(studentsList, scholar.getRegistration())) {
            studentsList.add(scholar);
            System.out.println("|Aluno adicionado com sucesso");
            System.out.println("|=============================================|");
        } else {
            System.out.println("|Matrícula do Aluno já existe.");
            System.out.println("|=============================================|");
        }
	}
}