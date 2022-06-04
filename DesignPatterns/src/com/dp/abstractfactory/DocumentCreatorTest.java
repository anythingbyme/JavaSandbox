package com.dp.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentCreatorTest {

    @Test
    void createLetter() {
        //I can have an abstract factory to create DocumentCreator too
        // DocumentCreator.getDocument
        DocumentCreator dc = new CustomDocumentCreator();
        Document letter = dc.createDocument(null);
//        letter.
    }

    @Test
    void createResume() {
    }
}