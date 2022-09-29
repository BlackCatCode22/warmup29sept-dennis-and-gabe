import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WarmUP29sep22 {
    public static void main(String[] args) {
        // References:
        // https://www.w3schools.com/java/java_files_create.asp

        // Instructions:
        // 1) Discuss this code with your lab partner
        //     a) what does it do?
        //     b) where does it do it?
        //     c) how are file and path names used?
        //     d) what is try and catch?
        // 2) Code up this warmup and examine your new files
        // 3) Create the genAnimalName function you are designing
        //
        // References:
        //   https://www.w3schools.com/java/java_files_read.asp
        //   https://www.w3schools.com/java/java_arrays.asp
        //   https://www.geeksforgeeks.org/searching-for-characters-and-substring-in-a-string-in-java/
        //   https://www.tutorialspoint.com/java/java_string_split.htm


        // Open a file and read it line by line.
        int lineCount = 0;
        try {
            File file = new File("C:/javaMidTermFiles/animalNames.txt");
            Scanner scanner = new Scanner(file);
            lineCount = 1;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
                lineCount++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Get the lines into a 1D array.
        // Create an array. Note the initialized array size.
        String[] linesInAnimalNameFile = new String[lineCount];
        int elementNum = 0;

        try {
            File file = new File("C:/javaMidTermFiles/animalNames.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String fileLineAsString = scanner.nextLine();
                // Write string data to the array.
                linesInAnimalNameFile[elementNum] = fileLineAsString;
                elementNum++;
            }
            // Close the file.
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Display the array of file lines.
        System.out.println("\n The array looks like this..\n");
        for (int i=0; i<lineCount; i++){
            System.out.println(linesInAnimalNameFile[i]);
        }

        // Parse the array!
        String aLine = "";
        aLine = linesInAnimalNameFile[2];
        System.out.println("\n aLine = " + aLine);

        // Use split to parse the line.
        String[] theWords;
        theWords = aLine.split(",");
        // Output the elements of theWords[]
        for (int i=0; i< theWords.length; i++) {
            System.out.println("theWords[" + i + "] = " + theWords[i]);
        }

        // Start from the beginning of the array and find the line containing hyena names.

        for (int i=0; i<lineCount; i++){
            if ("Hyena Names:".equals(linesInAnimalNameFile[i])) {
                System.out.println("Match found at line: " + i + " !!");
            }

        }




    }
}
