package project2;

import java.io.Serializable;
import java.time.Year;
import java.util.Scanner;

class Professor extends Person implements Serializable {
		
		private static final long serialVersionUID = 1L;
		private String discipline;
		private int Yoe;
		private int id_prof;
	
	public Professor (String name, int age, String discipline, int yoe, int id_prof) {
		super(name, age);
		this.setDiscipline(discipline);
		this.setYoe(yoe);
		this.setId_prof(id_prof);
	}
	
	public Professor() {
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public int getYoe() {
		return Yoe;
	}

	public void setYoe(int yoe) {
		Yoe = yoe;
	}
	
	public int getId_prof() {
		return id_prof;
	}

	public void setId_prof(int id_prof) {
		this.id_prof = id_prof;
	}
	
	private void inputProfessorDetails() {
        inputProfessorDetails();
        Scanner viewer1 = new Scanner(System.in);

        System.out.print("|Digite sua Disciplina: ");
        this.discipline = viewer1.nextLine();

        System.out.print("|Digite Quantos anos de Experiência na área: ");
        this.Yoe = viewer1.nextInt();
    }

    private void displayProfessorDetails() {
        displayDetails();
        System.out.println("Sua Disciplina: " + discipline);
        System.out.println("Sua Experiência: " + Yoe);
        System.out.println("|=============================================|");
    }

    private void calculateIdProf() {
    	int currentYear = Year.now().getValue();
    	this.id_prof = getName().length() + currentYear;
    	System.out.println("|ID do Professor calculado: " + id_prof);
        System.out.println("|=============================================|");
    }
	 public static void main(String[] args) {

		 Professor prof = new Professor();
		 prof.inputProfessorDetails();
		 prof.displayDetails();
		 prof.calculateIdProf();
	 }
}  