# JBA_Cinema_room_REST_service
study project  
  
OOP, Spring Boot, REST, Exceptions, JSON  
  
  
GET "/seats" return information about the movie theatre  
  
POST "/purchase" requests and marks a booked ticket as purchased  
request  contain the following data (JSON):  
row — the row number;  
column — the column number  
  
POST "/return" requests and allow customers to refund their tickets  
request  contain the following data (JSON):
token — ticket identifyer;
