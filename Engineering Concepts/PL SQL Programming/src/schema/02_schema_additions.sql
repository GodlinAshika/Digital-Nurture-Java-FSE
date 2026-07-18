ALTER TABLE Customers ADD (IsVIP CHAR(1) DEFAULT 'N');

CREATE TABLE AuditLog (
    AuditID NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    TransactionID NUMBER,
    AccountID NUMBER,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    LoggedAt DATE
);
