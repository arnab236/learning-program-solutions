package com.as.factory_methods;

import com.as.models.Document;

public abstract class DocumentFactory {
  
    public abstract Document createDocument();

    
    public void newDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}