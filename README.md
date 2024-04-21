This Spring Boot project implements a Cloud Vendor Service using the Spring MVC framework. 
Within this architecture, the Controller Component serves as the entry point for handling HTTP requests from clients, ensuring smooth communication. 
These requests are then routed to the Business Layer, where business logic is executed, before proceeding to the Repository Layer.
In Spring MVC, the Repository Layer interfaces with the database, retrieving and storing data, which is then passed back to the Service Layer. 
This layer processes the data and returns it to the Controller Component for delivery back to the client, thereby completing the request-response cycle.
