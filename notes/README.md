## Solid Principles of OOP

### Single Responsibility Principle
* Every class should have a single responsibility
* There should never be more than one reason for a class to change
* Every class should be small

### Open / Closed principle
* Classes should be open for extension
* Classes should be closed for modification
* It should be able to extend classes behaviour without modifying it
* Use private variables with getters and setters ONLY when needed
* Use abstract base classes

### Liskov Substitution principle
* Objects should be replaceable with instances of their subtypes
* Violations will often fail the "Is a" Test

### Interface Segregation principle
* Many client interfaces are better than one "general purpose" interface
* Keep components focused and minimize dependencies between them

### Dependency Inversion principle
* Abstractions should not depend upon details
* Details should depend upon abstractions
* Higher level and lower lever objects depend on the same abstract interaction
* This is not the same as Dependency Injection - which is how objects obtain <br> dependent objects


## Dependency Injection
A class is going to have a dependency, and we are asking the framework to provide that dependency.
<br>
Dependency Injection is where a needed dependency is injected by another object
<br>
The class being injected has no responsibility in instantiating the object being injected

### Types of Dependency Injection

* By class properties
* By Setters
* By Constructor

## Inversion of Control (Ioc)
* Is a technique to allow dependencies to be injected at runtime
* Dependencies are not predetermined


## IoC vs DI
DI refers much to the composition of your classes
IoC is the runtime environment of your code
* Spring Framework IoC container
* Spring is in control of the injection of dependencies

