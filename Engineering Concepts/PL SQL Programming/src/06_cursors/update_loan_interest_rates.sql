CREATE OR REPLACE PROCEDURE UpdateLoanInterestRates(p_new_rate IN NUMBER) AS
    CURSOR all_loans_cur IS SELECT LoanID FROM Loans FOR UPDATE;
BEGIN
    FOR loan_rec IN all_loans_cur LOOP
        UPDATE Loans
        SET InterestRate = p_new_rate
        WHERE CURRENT OF all_loans_cur;
    END LOOP;

    COMMIT;
END UpdateLoanInterestRates;
/
