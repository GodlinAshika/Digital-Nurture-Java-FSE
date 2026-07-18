package arrayops;

public class EmployeeArrayManager {

    private Employee[] employees;
    private int count;

    public EmployeeArrayManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean add(Employee employee) {
        if (count == employees.length) {
            return false;
        }
        employees[count] = employee;
        count++;
        return true;
    }

    public Employee search(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverse() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean delete(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
}
