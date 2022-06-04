package com.dp.abstractfactory;

public class CustomDocumentCreator implements DocumentCreator {
    @Override
    public Letter createLetter(Metadata metadata) {
        return null;
    }

    @Override
    public Resume createResume(Metadata metadata) {
        return null;
    }
}
