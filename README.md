# SpringScopeUsage
Demonstration how to get two beans using @Component instead of @Configuration and @Beans

It's possible by using @Scope("prototype") on @Component class. That's because by default it is singleton:

https://stackoverflow.com/questions/49106917/spring-framework-is-possible-to-create-two-beans-of-the-same-component-without/49106986#49106986
