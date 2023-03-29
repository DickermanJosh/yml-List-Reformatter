import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    This is a simple script to format lists to include two spaces and a hyphen before each element of the list, developed for moving large lists into yml files
    EXAMPLE:
    A
    B
    C
    Becomes ->
      - A
      - B
      - C
 */

public class Reformatter {
    public static void main(String[] args) {

        System.out.print("Enter the root path of the file you want to reformat: ");

        Scanner scan = new Scanner(System.in);
        String rawListPath = scan.nextLine().toString();

        ReadFromFile(rawListPath);
    }

    private static void ReadFromFile(String filename){
        File fileToConvert = new File(filename);
        List lines = new ArrayList<String>();
        try {
            Scanner scan = new Scanner(fileToConvert);

            while(scan.hasNextLine()){
                lines.add(scan.nextLine().toString());
            }

            ReformatFile(lines);

        }catch(FileNotFoundException e){
            System.out.println(filename + " could not be opened, bad pathway");
        }
    }
    private static void ReformatFile(List rawText){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ReformattedList.txt"))) {
            for(int i = 0; i < rawText.size(); i++){
                writer.write("  - " + rawText.get(i) + "\n");
            }
            System.out.println("File converted successfully as ReformattedList.txt");
        }catch(IOException e){
            System.out.println("Could not reformat file");
        }
    }
}
