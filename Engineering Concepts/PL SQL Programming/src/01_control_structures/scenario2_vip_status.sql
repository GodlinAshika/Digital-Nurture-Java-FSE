SET SERVEROUTPUT ON;

DECLARE
    CURSOR balance_cur IS
        SELECT CustomerID, Balance FROM Customers;
BEGIN
    FOR cust_rec IN balance_cur LOOP
        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
