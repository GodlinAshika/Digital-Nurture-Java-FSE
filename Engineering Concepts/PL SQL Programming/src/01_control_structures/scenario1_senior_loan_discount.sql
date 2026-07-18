SET SERVEROUTPUT ON;

DECLARE
    CURSOR senior_customers_cur IS
        SELECT CustomerID
        FROM Customers
        WHERE MONTHS_BETWEEN(SYSDATE, DOB) / 12 > 60;
BEGIN
    FOR customer_rec IN senior_customers_cur LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - (InterestRate * 0.01)
        WHERE CustomerID = customer_rec.CustomerID;
    END LOOP;
    COMMIT;
END;
/
