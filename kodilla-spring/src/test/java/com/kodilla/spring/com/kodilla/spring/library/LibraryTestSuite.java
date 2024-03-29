package com.kodilla.spring.com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Autowired
    private Library library;

    @Test
    public void testLoadFromDb() {
        //Given
       // ApplicationContext context =
         //       new AnnotationConfigApplicationContext("com.kodilla.spring");
       // library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
       // ApplicationContext context =
         //       new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }
}
