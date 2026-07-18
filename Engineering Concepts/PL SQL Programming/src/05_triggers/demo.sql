SET SERVEROUTPUT ON;

UPDATE Customers SET Balance = Balance + 50 WHERE CustomerID = 1;

SELECT CustomerID, LastModified FROM Customers WHERE CustomerID = 1;

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (3, 1, SYSDATE, 150, 'Deposit');

SELECT * FROM AuditLog ORDER BY AuditID DESC;

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (4, 1, SYSDATE, -50, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (5, 1, SYSDATE, 999999, 'Withdrawal');
