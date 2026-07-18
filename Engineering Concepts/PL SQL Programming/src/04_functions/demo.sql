SET SERVEROUTPUT ON;

DECLARE
    v_age         NUMBER;
    v_installment NUMBER;
    v_sufficient  BOOLEAN;
BEGIN
    SELECT CalculateAge(DOB) INTO v_age FROM Customers WHERE CustomerID = 1;
    DBMS_OUTPUT.PUT_LINE('Customer 1 age: ' || v_age);

    v_installment := CalculateMonthlyInstallment(5000, 5, 5);
    DBMS_OUTPUT.PUT_LINE('Monthly installment: ' || v_installment);

    v_sufficient := HasSufficientBalance(1, 500);
    IF v_sufficient THEN
        DBMS_OUTPUT.PUT_LINE('Account 1 has sufficient balance for 500.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Account 1 does not have sufficient balance for 500.');
    END IF;
END;
/
