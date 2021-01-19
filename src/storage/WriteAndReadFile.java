package storage;

import java.io.*;

public class WriteAndReadFile {
    public static void writeFile(String fileName, Object obj){
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
          oos.writeObject(obj);
          oos.close();
          fos.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static Object  readFile(String fileName){
        Object obj = null;
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            fis.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return obj;
    }
}
