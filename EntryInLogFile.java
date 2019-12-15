package CustomDataStructures;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EntryInLogFile {

    public void entryInLogFile(Exception e,String fileName) {
        File file = new File(fileName);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {

            Date date = new Date();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd  HH.mm.ss");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timing = sdf.format(timestamp);

            if (!file.exists()) {
                file.createNewFile();

            }

            bw.write("Timestamp:  " + timing);
            bw.write("\n");
            e.printStackTrace(new PrintWriter(bw));
            bw.write("\n");


        } catch (IOException io) {
            System.out.println(io.getMessage());
            io.printStackTrace();
        }
    }
}
