package oopsCapgemini;

public class Employee {
	String name; long phno,salary;
	
	Employee(String name,long phno,int salary){
		this.name=name;
		this.phno=phno;
		this.salary=salary;
	}
	
	Employee(String name){
		this.name=name;
	}
	
	Employee(){
		
	}
	
	
	
}

/*
 * for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //For reversing the elements in the row by swapping them
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
 */