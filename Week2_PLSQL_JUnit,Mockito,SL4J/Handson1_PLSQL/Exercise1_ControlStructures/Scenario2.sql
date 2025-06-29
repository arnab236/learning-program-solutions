
--Scenario 2: A customer can be promoted to VIP status based on their balance.
--Question: Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.






-- Step 1: Add IsVIP column once (skip if already added)
ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

-- Step 2: Apply logic
BEGIN
  FOR cust IN (
    SELECT CustomerID FROM Customers WHERE Balance > 10000
  ) LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/
