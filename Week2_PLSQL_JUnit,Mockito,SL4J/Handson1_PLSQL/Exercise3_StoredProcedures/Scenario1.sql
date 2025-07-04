

--Scenario 1: The bank needs to process monthly interest for all savings accounts.
--Question: Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01),
      LastModified = SYSDATE
  WHERE AccountType = 'Savings';

  COMMIT;
END;
/

--Usage
BEGIN
  ProcessMonthlyInterest;
END;
/
