CREATE OR REPLACE PROCEDURE ApplyAnnualFee(p_fee_amount IN NUMBER) AS
    CURSOR all_accounts_cur IS SELECT AccountID FROM Accounts;
    v_account_id Accounts.AccountID%TYPE;
BEGIN
    OPEN all_accounts_cur;
    LOOP
        FETCH all_accounts_cur INTO v_account_id;
        EXIT WHEN all_accounts_cur%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - p_fee_amount, LastModified = SYSDATE
        WHERE AccountID = v_account_id;
    END LOOP;
    CLOSE all_accounts_cur;

    COMMIT;
END ApplyAnnualFee;
/
