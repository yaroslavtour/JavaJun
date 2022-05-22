public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String getInfo(int month) {
        return "Сотрудник " + name + ", " + "должность \"" + position + "\", " + "за последние " + month + " месяцев получил " + month * salary + " рублей.";
    }
}
