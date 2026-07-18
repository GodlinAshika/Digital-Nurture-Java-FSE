SET SERVEROUTPUT ON;

BEGIN
    ProcessMonthlyInterest;
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 5);
END;
/

BEGIN
    TransferFunds(2, 1, 100);
END;
/

BEGIN
    TransferFunds(2, 1, 999999);
END;
/
