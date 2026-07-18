SET SERVEROUTPUT ON;

BEGIN
    SafeTransferFunds(1, 2, 200);
END;
/

BEGIN
    SafeTransferFunds(1, 2, 999999);
END;
/

BEGIN
    UpdateSalary(1, 10);
END;
/

BEGIN
    UpdateSalary(999, 10);
END;
/

BEGIN
    AddNewCustomer(3, 'Meera Pillai', TO_DATE('1995-02-10', 'YYYY-MM-DD'), 500);
END;
/

BEGIN
    AddNewCustomer(1, 'Duplicate Customer', TO_DATE('1980-01-01', 'YYYY-MM-DD'), 100);
END;
/
