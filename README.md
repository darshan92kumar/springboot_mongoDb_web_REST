# Springboot + Thymeleaf + MongoDB + REST + Gradlew


This is springboot , thymeleaf CRUD implementation which uses mongo as backend. This project has both UI and REST entry points.
This project is built on gradlew.  

URL:   
localhost:8080/  

REST:  
GET  localhost:8080/product/  
POST localhost:8080/product/ 

POST BODY:  
{  
    "prodName": "Mobile",  
    "prodDesc": "Good Mobile",  
    "prodPrice": 800,  
    "prodImage": ""  
}  

header : 'Content-Type: application/json'
