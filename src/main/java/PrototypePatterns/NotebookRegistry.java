package PrototypePatterns;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {   //very same as Factory class
    Map<String, Notebook> notebooks =new HashMap<>();


    void registerNotebook(String name, Notebook notebook) {
        notebooks.put(name, notebook);
    }

    Notebook getNotebook(String name) {
        return notebooks.get(name).clone();
    }
}
