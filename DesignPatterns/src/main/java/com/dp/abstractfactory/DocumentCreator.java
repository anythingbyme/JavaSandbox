package com.dp.abstractfactory;

public interface DocumentCreator {
//    Letter createLetter(Metadata metadata);
//    Resume createResume(Metadata metadata);

    // or better
    Document createDocument(Metadata metadata);
//    Resume createResume(Metadata metadata);
}
