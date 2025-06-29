

--Scenario 3: Ensure data integrity when adding a new customer.
--Question: Write a stored procedure AddNewCustomer that inserts a new customer into the Customers table. If a customer with the same ID already exists, handle the exception by logging an error and preventing the insertion.


CREATE OR REPLACE PROCEDURE AddNewCustomer(
  p_id      IN NUMBER,
  p_name    IN VARCHAR2,
  p_dob     IN DATE,
  p_balance IN NUMBER
) IS
BEGIN
  INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
  VALUES (p_id, p_name, p_dob, p_balance, SYSDATE);

  COMMIT;
EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Error: Customer ID already exists.');
    ROLLBACK;
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Insert failed: ' || SQLERRM);
    ROLLBACK;
END;
/

--usage

BEGIN
  AddNewCustomer(3, 'Sam Wilson', TO_DATE('1988-03-10', 'YYYY-MM-DD'), 1200);
END;
/
