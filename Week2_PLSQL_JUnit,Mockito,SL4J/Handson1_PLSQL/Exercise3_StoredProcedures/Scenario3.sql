
--Scenario 3: Customers should be able to transfer funds between their accounts.
--Question: Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.


CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check balance of source account
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_account
  FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
  END IF;

  -- Debit source account
  UPDATE Accounts
  SET Balance = Balance - p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_from_account;

  -- Credit destination account
  UPDATE Accounts
  SET Balance = Balance + p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_to_account;

  COMMIT;
END;
/


--Usage
BEGIN
  TransferFunds(1, 2, 500);
END;
/
