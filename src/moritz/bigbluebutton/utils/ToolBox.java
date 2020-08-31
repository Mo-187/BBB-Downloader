package moritz.bigbluebutton.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ToolBox {

    public static class Web {

        public static InputStream openUrlStream(String url) {
            try {
                return new URL(url).openStream();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

    }

    public static class StreamReader {

        public static String readStringFromInputStream(InputStream inputStream) {
            if(inputStream == null) return null;

            try {
                StringBuilder stringBuilder = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String currentLine;

                while((currentLine = bufferedReader.readLine()) != null) stringBuilder.append(currentLine);

                bufferedReader.close();
                return stringBuilder.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public static ArrayList<Byte> readInputStream(InputStream inputStream) {
            if(inputStream == null) return null;

            try {
                ArrayList<Byte> readBytes = new ArrayList<>();
                int read;
                while((read = inputStream.read()) != -1) {
                    readBytes.add((byte)read);
                }
                inputStream.close();
                return readBytes;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

    }

    public static class Console {

        private static Scanner SCANNER = null;

        static {
            SCANNER = new Scanner(System.in);
        }

        public static String nextLine(Object message) {
            System.out.println(message);
            return SCANNER.nextLine();
        }

    }

}
