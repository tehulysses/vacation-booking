## D288 Back-End Programming  
### B.   Create your subgroup and project by logging into GitLab using the web link provided and do the following:
•    connect your new Java project
•    commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)
> * Created GitLab repository
> * Connected local machine to GitLab
> * Updated README.md
> * COMPLETE

### C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.

> * Created 4 packages: controller, entities, services, dao
> * Created config package
> * copied application.properties over from lab
> * created RestDataConfig in config folder
> * COMPLETE
### D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

> * Wrote code using the database generated EER diagram for variable names and correct column names
> * Used the generated EER to map relationships and join tables
> * created enums for StatusType
> * COMPLETE

### E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

> * Wrote dao repositories for each entity extending JpaRepository
> * COMPLETE

### F.   Write code for the services package that includes each of the following:
•    a purchase data class with a customer cart and a set of cart items
> *  COMPLETE
•    a purchase response data class that contains an order tracking number
> *  COMPLETE
•    a checkout service interface
> *  COMPLETE
•    a checkout service implementation 
> *  COMPLETE

### G.   Write code to include validation to enforce the inputs needed by the Angular front-end.
> * Added nullable = false to certain fields
> * Added updatable = false for create dates
> * Converted Sets into HashSets

### H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.

Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.

> * Created REST controller to include post mapping for orders
> * COMPLETE

### I.   Add five sample customers to the application programmatically.

> * Created BootStrap.java file
> * Populated database with 5 new customers using customerRepository
> * COMPLETE

Note: Make sure the customer information is not overwritten each time you run the application.

### J.   Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:
•    that your application does not generate a network error when adding the data
•    your database tables using MySQL Workbench to show the data was successfully added

Note: The screenshot should include the front-end view and the inspection console in the browser.