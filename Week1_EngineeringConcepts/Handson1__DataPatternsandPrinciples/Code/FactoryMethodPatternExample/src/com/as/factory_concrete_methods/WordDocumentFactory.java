package com.as.factory_concrete_methods;

import com.as.concrete_docs.WordDocument;
import com.as.factory_methods.DocumentFactory;
import com.as.models.Document;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}