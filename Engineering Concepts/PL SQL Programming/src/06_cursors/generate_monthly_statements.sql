CREATE OR REPLACE PROCEDURE GenerateMonthlyStatements AS
    CURSOR monthly_txn_cur IS
        SELECT AccountID, Amount, TransactionType, TransactionDate
        FROM Transactions
        WHERE TRUNC(TransactionDate, 'MM') = TRUNC(SYSDATE, 'MM');

    v_txn monthly_txn_cur%ROWTYPE;
BEGIN
    OPEN monthly_txn_cur;
    LOOP
        FETCH monthly_txn_cur INTO v_txn;
        EXIT WHEN monthly_txn_cur%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Account ' || v_txn.AccountID || ': ' || v_txn.TransactionType ||
                              ' of ' || v_txn.Amount || ' on ' || TO_CHAR(v_txn.TransactionDate, 'YYYY-MM-DD'));
    END LOOP;
    CLOSE monthly_txn_cur;
END GenerateMonthlyStatements;
/
