# SpringSecurity
The application is starting by running the SecurityApplication file. <br/>

To test the results in Postman: <br/>

1. Authentication endpoints, which is excluded in the SecurityFilterChain from the requirement of JWT token in the header: <br/>
   # localhost:8080/api/v1/auth <br>
2. To register new user make a POST request to 
   # localhost:8080/api/v1/auth/register
Required body JSON format:<br>
   <br>{<br>
   "firstname": "",<br>
   "lastname": "",<br>
   "email": "",<br>
   "password": ""<br>
   }<br>
The user will be saved in the DB, with encoded password. <br>
3. Confirm the user credentials with POST request to 
   # localhost:8080/api/v1/auth/authenticate
If authenticated the response will contain a JWT token, and response status 200

4. Confirm the token by GET request to 
   # localhost:8080/api/v1/access
Add the generated token to the request header -  Authorization -> Bearer Token
If everything is done correctly the response will be "ACCESS ALLOWED"
Response status 200
