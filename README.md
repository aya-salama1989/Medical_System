# Medical_System
ES Task for backend developers

Please notice that i used Springboot platform to excute the task, and Docker for virtualizing MYSQL8 DataBase,
use the following command to intialize Virtual DB;

`dcker run --rm --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql:8`

Also find Postman collection for testing 
https://www.getpostman.com/collections/567b6fc49461474887f6

The sample has the following features;
1. doctor can register
2. Doctor can add his appointments
3. Patient can register
4. Patient can show all doctors
5. Patient can book an appointment

These features were implemented in the most basic way and it could use some enhancements like;
1. secure user registeration data
2. return human readable messages from the API
3. Error handling Scenarios
4. Doctor can view his bookedAppointments 
5. Postman collection needs some adjustements to ease usage too :D
    
