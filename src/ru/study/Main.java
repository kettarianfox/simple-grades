package ru.study;

public class Main {

    public static void main(String[] args) {
	    Grade full_grage = new Grade(5, 5, 5, 5);
	    System.out.println("Среднее значение оценок:" + full_grage.calculateGrade());
    }
}
