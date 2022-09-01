package lesson15;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("doc/README.md");

        File dir = new File("doc");
        dir.mkdir();

        try {
            if(file.exists()) {
                boolean deleted = file.delete();
                System.out.println("File " + file.getName() + " was deleted at " + file.getAbsolutePath());
            }else {
                boolean created = file.createNewFile();
                System.out.println("File " + file.getName() + " has been created at " + file.getAbsolutePath());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for(String name : dir.list()) {
            System.out.println(name);
        }
    }
}
