# Todo Web Application using Spring MVC
This is a simple Task managing Web application that allows the user to add, edit and delete Tasks.

![readme_photo](https://i.ibb.co/tXD6Z2R/readme-photo.png)

## Table of Contents
* [General info](#general-info)
* [Technologies & Tools](#technologies--tools)
* [Setup](#setup)
* [Run](#run)
* [Future improvements & To dos](#future-improvements--to-dos)
* [License](#license)
## General info
This is a simple Task managing Web application that includes authenticated Log in. Model-View-Control architecture is used. The business logic (Model) and the Controllers are written in Java. HTML, CSS/Bootstrap and Javascript are used for the content, presentation and interactive layers respectively.

The user, once authenticated, can create, edit and delete Tasks. For each Task the user can add a Title, a Description, set its Priority and its Target Date (Due in), as well as mark is as "Done".

## Technologies & Tools
* Spring MVC
* Spring Boot
* Spring Security
* Maven

### Back-end:
* Java 13 (Model & Controllers)
* Tomcat server

### Front-end:
* HTML
* CSS
* Bootstrap 4
* Javascript


## Setup
To run this project, you just need to simply download it and import it in a programming environment (i.e. Eclipse IDE for Enterprise Java Developers).
Via command line:
```
$ cd  ../where_you_want_it_to_be_saved
$ git clone https://github.com/elenidriva/Todo-Web-Application-using-Spring-MVC.git
```
Or just download and import existing maven project in your programming environment.
## Run
Run as > Maven build

Add Goals: tomcat7:run

In order to Log In, use the following:
Username: user
Password: 1234
## Future improvements & To dos
* Add custom Log in page (instead of the default one from Spring Security)
* Sorting options (based on Target Date or Priority)
* Improve the display of TargetDate
* Other features

### License
The application is under the MIT license.
