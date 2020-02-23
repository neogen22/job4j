package ru.job4j.oop.tracker;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nikolay");
        student.setSurname("Podlezhaev");
        student.setOtchestvo("Vasilievich");
        student.setGroup(852);
        student.setDatapostuplenia("01.09.2019");
        System.out.println("Имя студента: " + student.getName() + System.lineSeparator() + "Фамилия студента: " + student.getSurname() + System.lineSeparator() + "Отчество студента: " + student.getOtchestvo() + System.lineSeparator() + "Номер группы, в которой обучается студент: " + student.getGroup() + System.lineSeparator() + "Дата поступления студента в ВУЗ: " + student.getDatapostuplenia());
    }
}
