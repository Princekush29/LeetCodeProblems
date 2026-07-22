package pq;
Question 53 Why Java main method is static?

#interviewquestions #interviewtips

👨💻 Why is the Java main method static?
👉 It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

Bonus Question
👨💻 Can we execute a program without main() method?
👉 No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a java class without the main method.
👉 It is executed before the main method at the time of class loading.

Share your view in Comment section 😍

Which of these methods must be made static?
main()
delete()
run()
finalize()
