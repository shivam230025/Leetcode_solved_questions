# Write your MySQL query statement below
select Em.name , Emuni.unique_id from Employees Em left join EmployeeUNI Emuni on Em.id=Emuni.id;