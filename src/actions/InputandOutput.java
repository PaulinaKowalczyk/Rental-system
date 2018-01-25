package actions;

import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InputandOutput{

    public static void writingObjects(String filename, List outputlist) throws IOException {
        ObjectOutputStream output = null;

        try {
            output = new ObjectOutputStream(new FileOutputStream(filename));
            output.writeObject(outputlist);
        }finally {
            if (output != null) {
                output.close();
            }

        }
    }

    public static List readingObjects(String filename) throws IOException, ClassNotFoundException {
        List<List> list=new ArrayList();
        ObjectInputStream input = null;

        try {
            input = new ObjectInputStream(new FileInputStream(filename));
            list = (ArrayList) input.readObject();

        } catch (EOFException e) {
        } finally {
            if (input != null) {
                input.close();
            }

        }

        return list;

    }
}
