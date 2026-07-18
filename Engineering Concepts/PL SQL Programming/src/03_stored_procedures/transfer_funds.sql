CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
) AS
    v_from_balance NUMBER;
BEGIN
    SELECT Balance INTO v_from_balance FROM Accounts WHERE AccountID = p_from_account;

    IF v_from_balance >= p_amount THEN
        UPDATE Accounts SET Balance = Balance - p_amount, LastModified = SYSDATE
        WHERE AccountID = p_from_account;

        UPDATE Accounts SET Balance = Balance + p_amount, LastModified = SYSDATE
        WHERE AccountID = p_to_account;

        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient balance in account ' || p_from_account);
    END IF;
END TransferFunds;
/
