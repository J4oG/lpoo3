package project2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
	 
	 public String name;
	 public int age;
	 
	 public Person() {
		 
	 }
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void inputAPersonInfo() {
        Scanner viewer = new Scanner(System.in);

        try {
        	System.out.println("|=============================================|");
        	System.out.print("|Digite seu nome: ");
            this.name = viewer.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("|Erro: Não foi possível criar o nome, tente novamente");
            System.out.println("|=============================================|");
        }

        try {
            System.out.print("|Digite sua Idade: ");
            this.age = viewer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("|Erro: Não foi possível criar a idade, tente novamente");
            viewer.nextLine();
            System.out.println("|=============================================|");
        }
    }

    public void displayDetails() {
    	System.out.println("|=============================================|");
        System.out.println("|Seu Nome: " + name);
        System.out.println("|Sua Idade: " + age);
        System.out.println("|=============================================|");
    }
}
//public static void main(String args[]) {
//	
//	Person persona = new Person();
//	persona.inputAPersonInfo();
//	persona.displayDetails();
//	
// }
//}