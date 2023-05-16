# Student Course Mapping

-   Tech stack used: Spring Boot, Hibernate, MySQL, OOPs, Postman, Swagger, and Java

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#prerequisites)Prerequisites

-   [![MySql](https://camo.githubusercontent.com/ba7cdc426003905af438f0938e0890b3437e590d2c249d671115d19ca32b5df6/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f44424d532d4d5953514c253230352e372532306f722532304869676865722d726564)](https://camo.githubusercontent.com/ba7cdc426003905af438f0938e0890b3437e590d2c249d671115d19ca32b5df6/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f44424d532d4d5953514c253230352e372532306f722532304869676865722d726564)

-   [![SpringBoot](https://camo.githubusercontent.com/a6677a4ec12bd03f835c62db09a8db96a6d726afe3985c8fbf5c43db9b6cb8ad/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4672616d65776f726b2d537072696e67426f6f742d677265656e)](https://camo.githubusercontent.com/a6677a4ec12bd03f835c62db09a8db96a6d726afe3985c8fbf5c43db9b6cb8ad/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4672616d65776f726b2d537072696e67426f6f742d677265656e)

-   [![Java](https://camo.githubusercontent.com/be815b7d90eac640a950b5ef6e2bd93f30cab6ac1cd9ace277bc560e3e6fc11c/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c616e67756167652d4a617661253230382532306f722532306869676865722d79656c6c6f77)](https://camo.githubusercontent.com/be815b7d90eac640a950b5ef6e2bd93f30cab6ac1cd9ace277bc560e3e6fc11c/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c616e67756167652d4a617661253230382532306f722532306869676865722d79656c6c6f77)

-   Implemented CRUD operations with data validation, MySQL database configuration, Swagger integration, authentication and established table relationships. This project is a portal that handles different types of relationships (one-to-one, one-to-many, many-to-one, and many-to-many) between various entities. It provides CRUD (Create, Read, Update, Delete) operations for each model, allowing you to manage the data effectively.

> [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#data-flow)Data flow
> --------------------------------------------------------------------------------

In this project, we have four layers-

-   Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
-   Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
-   Repository - This layer mainatains the CRUD operations are performed
-   Model - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

[](https://github.com/ankitSarwar/Mapping_Practice/tree/main#models)Models
--------------------------------------------------------------------------

The portal includes the following models:

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#student)Student

-   ID: The unique identifier for the student.
-   name: The name of the student.
-   age: The age of the student.
-   phoneNumber: The phone number of the student.
-   branch: The branch of study for the student.
-   department: The department to which the student belongs.

### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#relationships)Relationships

-   address: One-to-one relationship with the Address model.

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#laptop)Laptop

-   ID: The unique identifier for the laptop.
-   name: The name of the laptop.
-   brand: The brand of the laptop.
-   price: The price of the laptop.

### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#relationships-1)Relationships

-   student: One-to-one relationship with the Student model.

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#course)Course

-   ID: The unique identifier for the course.
-   title: The title of the course.
-   description: The description of the course.
-   duration: The duration of the course.

### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#relationships-2)Relationships

-   studentList: Many-to-many relationship with the Student model.

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#book)Book

-   ID: The unique identifier for the book.
-   title: The title of the book.
-   author: The author of the book.
-   description: The description of the book.
-   price: The price of the book.

### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#relationships-3)Relationships

-   student: Many-to-one relationship with the Student model.

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#address)Address

-   landmark: The landmark of the address.
-   zipcode: The ZIP code of the address.
-   district: The district of the address.
-   state: The state of the address.
-   country: The country of the address.

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#crud-operations--controllers-and-apis)CRUD Operations && Controllers and APIs

The portal provides the following CRUD operations for each model:

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#student-1)Student

-   Create a new student: POST /students/add
-   Get all students: GET /students/getAll
-   Get a student by ID: GET /students/{ID}
-   Update a student: PUT /students/update
-   Delete a student: DELETE /students/{ID}

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#laptop-1)Laptop

-   Create a new laptop: POST /laptops/add
-   Get all laptops: GET /laptops/getAll
-   Get a laptop by ID: GET /laptops/{ID}
-   Update a laptop: PUT /laptops/update
-   Delete a laptop: DELETE /laptops/{ID}

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#course-1)Course

-   Create a new course: POST /courses/add
-   Get all courses: GET /courses/getAll
-   Get a course by ID: GET /courses/{ID}
-   Update a course: PUT /courses/update
-   Delete a course: DELETE /courses/{ID}

> ### [](https://github.com/ankitSarwar/Mapping_Practice/tree/main#book-1)Book

-   Create a new book: POST /books/add
-   Get all books: GET /books/getAll
-   Get a book by ID: GET /books/{ID}
-   Update a book: PUT /books/update
-   Delete a book: DELETE /books/{ID}

[](https://github.com/ankitSarwar/Mapping_Practice/tree/main#address-1)Address
------------------------------------------------------------------------------

-   Create a new address: POST /addresses/add
-   Get all addresses: GET /addresses/getAll
-   Get an address by ID: GET /addresses/{ID}
-   Update an address: PUT /addresses/update
-   Delete an address: DELETE /addresses/{ID}
