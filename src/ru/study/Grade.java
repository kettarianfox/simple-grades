package ru.study;

import java.util.ArrayList;
import java.util.List;

/*
* Класс Grade (оценка).
* 4 свойства int: quality (обязательный), formalization (обязательный), speed (опциональный), politeness (опциональный)
* Метод calculateGrade, который вернет среднее значение от суммы всех присутсвующих полей
* */

public class Grade {
    int quality;
    int formalization;
    int speed;
    int politeness;

    //допустим, оценка должна быть по шкале от 1 до 5
    public static boolean isValidGrade (int grade) {
        if (grade >= 0 && grade <= 5) {
            return true;
        }
        else {
            try {
                throw new NullPointerException("Оценки какие-то неправильные :)");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }

    //вспомогательный метод
    List fillArrayList (List gradeList) {
        gradeList.add(this.quality);
        gradeList.add(this.formalization);
        if (this.speed != 0)  gradeList.add(this.speed);
        if (this.politeness != 0) gradeList.add(this.politeness);

        return gradeList;
    }

    double calculateGrade () {
        List<Integer> gradeList = new ArrayList<Integer>();
        fillArrayList(gradeList);
        double sumOfGrades = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            sumOfGrades += gradeList.get(i);
        }
        return sumOfGrades / gradeList.size();
    }


    //я человек простой, вижу разное количество параметров - делаю несколько конструкторов...
    Grade (int q, int f) {
        if (isValidGrade(q) && isValidGrade(f)) {
            this.quality = q;
            this.formalization = f;
        }
    }

    Grade (int q, int f, int s) {
        if (isValidGrade(q) && isValidGrade(f) && isValidGrade(s)) {
            this.quality = q;
            this.formalization = f;
            this.speed = s;
        }
    }

    Grade (int q, int f, int s, int p) {
        if (isValidGrade(q) && isValidGrade(f) && isValidGrade(s) && isValidGrade(p)) {
            this.quality = q;
            this.formalization = f;
            this.speed = s;
            this.politeness = p;
        }
    }

}
