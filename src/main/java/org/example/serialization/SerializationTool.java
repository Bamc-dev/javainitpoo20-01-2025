package org.example.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.*;
import java.util.Set;

public class SerializationTool {
    //Sérialization binaire des taches
    public static void serializeToBin(Set<Task> tasks, String path) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))){
            oos.writeObject(tasks);
        }
    }
    public static Set<Task> deserializeFromBin(String path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))){
            return (Set<Task>) ois.readObject();
        }
    }

    public static void serializeToJSON(Set<Task> tasks, String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(path), tasks);
    }

    public static Set<Task> deserializeFromJSON(String path) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(path), mapper.getTypeFactory().constructCollectionType(Set.class, Task.class));
    }

    public static void serializeToXML(Set<Task> tasks, String path) throws IOException{
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(path), tasks);
    }

    public static Set<Task> deserializeFromXML(String path) throws IOException{
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(new File(path), Set.class);
    }
}
