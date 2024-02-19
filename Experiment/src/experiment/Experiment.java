package experiment;

public class Experiment {

    public static void main(String[] args) {

int[][] grades = new int[20][5];
	for(int i = 0; i< 20; i++)
        {for(int j = 0; j<5; j++){
			grades[i][j] = j*2;}}
for(int i = 0; i< 20; i++)
        {for(int j = 0; j<5; j++){
			System.out.print(grades[i][j]);}}

    
}}
