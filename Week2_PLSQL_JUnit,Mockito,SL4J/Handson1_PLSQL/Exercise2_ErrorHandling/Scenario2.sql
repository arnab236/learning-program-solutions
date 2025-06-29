
--Scenario 2: Manage errors when updating employee salaries.
--Question: Write a stored procedure UpdateSalary that increases the salary of an employee by a given percentage. If the employee ID does not exist, handle the exception and log an error message.


CREATE OR REPLACE PROCEDURE UpdateSalary(
  p_emp_id     IN NUMBER,
  p_percentage IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + Salary * (p_percentage / 100)
  WHERE EmployeeID = p_emp_id;

  IF SQL%NOTFOUND THEN
    RAISE_APPLICATION_ERROR(-20002, 'Employee not found');
  END IF;

  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Salary update failed: ' || SQLERRM);
    ROLLBACK;
END;
/


--Usage

BEGIN
  UpdateSalary(1, 10);  -- Increases salary of EmployeeID 1 by 10%
END;
/
