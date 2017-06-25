
Exercise 2
========== 

**BookDao** class has **not** changed from the previous exercise <br/>
**Library** class has one change, it now needs a **BookDao** instance in order to execute its logic

1. Create a Spring project that contains the following beans:
    - **BookDao**
    - **Library** with two names: "*libraryA*" and "*libA*"
    - Another **Library** with two names: "*libraryB*" and "*libB*"
    - Another **Library** with **prototype scope**, and name it "*prototypeLibrary*"
2. Notice that **Library** is dependent on **BookDao** for its logic!
3. Set the **Library** *open* method to be automatically executed when the library is created
   (in other words, *open* method should **not** be invoked by your main method code)
4. Inside **Main.main()** instantiate a spring container which includes the above beans, and then:
    - Retrieve "*libraryA*" bean from the container
    - Retrieve "*libA*" bean from the container
    - Verify that the two beans are actually the same bean (use *org.junit.Assert.assertEquals* method)
    - Retrieve "*libraryB*" bean from the container
    - Retrieve "*libB*" bean from the container
    - Verify that the two beans are actually the same bean (use *org.junit.Assert.assertEquals* method)
    - Verify that "*libraryA*" and "*libraryB*" are **NOT** the same bean (use *org.junit.Assert.assertNotEquals* method);
5. Still inside **Main.main()**:
    - Retrieve "*prototypeLibrary*" bean from the container
    - Retrieve another "*prototypeLibrary*" bean from the container
    - Verify that the two prototype beans are **NOT** the same bean (use *org.junit.Assert.assertNotEquals* method)
    - Verify that the two prototype beans are **NOT** the same as "*libraryA*" or "*libraryB*"
    - From each prototype bean fetch it's inner **BookDao** (add a getter inside Library code) and verify that both **BookDaos** are actually the same bean (use *org.junit.Assert.assertEquals* method)
    
###N O T I C E
- [ ] **Use** @Configuration
- [ ] **DO NOT USE** @Component and such
- [ ] **DO NOT USE** @Autowired
- [ ] **Use** AnnotationConfigApplicationContext
- [ ] Check the log

