SET SERVEROUTPUT ON;

DECLARE
    v_balance NUMBER;
    v_annual_salary NUMBER;
    v_total_balance NUMBER;
BEGIN
    CustomerManagement.AddCustomer(4, 'Arjun Verma', TO_DATE('1992-11-30', 'YYYY-MM-DD'), 3000);
    CustomerManagement.UpdateCustomerDetails(4, 'Arjun Verma', 3500);
    v_balance := CustomerManagement.GetCustomerBalance(4);
    DBMS_OUTPUT.PUT_LINE('Customer 4 balance: ' || v_balance);

    EmployeeManagement.HireEmployee(3, 'Sara Khan', 'Analyst', 50000, 'IT');
    EmployeeManagement.UpdateEmployeeDetails(3, 'Senior Analyst', 55000);
    v_annual_salary := EmployeeManagement.CalculateAnnualSalary(3);
    DBMS_OUTPUT.PUT_LINE('Employee 3 annual salary: ' || v_annual_salary);

    AccountOperations.OpenAccount(3, 4, 'Savings', 3500);
    v_total_balance := AccountOperations.GetTotalBalance(4);
    DBMS_OUTPUT.PUT_LINE('Customer 4 total balance across accounts: ' || v_total_balance);
    AccountOperations.CloseAccount(3);
END;
/
