package pq;
Question 51 Explain static keyword in Java?

#interviewquestions #interviewtips

👨💻 Java static keyword

👉 The static keyword in Java is used for memory management mainly.
👉 We can apply java static keyword with variables, methods, blocks and nested class.
👉 The static keyword belongs to the class than an instance of the class.

👨💻 The static can be:
👉 Variable (also known as a class variable)
👉 Method (also known as a class method)
👉 Nested class

👨💻 Java static variable
👉 If you declare any variable as static, it is known as a static variable.
👉 The static variable can be used to refer to the common property of all (which is not unique for each object), for example, the company name of employees, college name of students, etc.
👉 The static variable gets memory only once in the class area at the time of class loading.

👨💻 Advantages of static variable
👉 It makes your program memory efficient (i.e., it saves memory).
👉 Java static property is shared to all objects.

👨💻 Java static method
👉 If you apply static keyword with any method, it is known as static method.
👉 A static method belongs to the class rather than the object of a class.
👉 A static method can be invoked without the need for creating an instance of a class.
👉 A static method can access static data member and can change the value of it.

👨💻 Restrictions for the static method
👉 The static method cannot use non static data member or call non-static method directly.
👉 this and super cannot be used in static context.

Share your view in the Comment section 😍

Can we overload static methods?
True
False
