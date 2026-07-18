SET SERVEROUTPUT ON;

BEGIN
    GenerateMonthlyStatements;
END;
/

BEGIN
    ApplyAnnualFee(25);
END;
/

BEGIN
    UpdateLoanInterestRates(4.5);
END;
/
