package baby_names;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A helper class for reading baby name entries from the states directory.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class FileIO
{
    /**
     * Reads the provided file that matches the input parameter. The input
     * should only be name of the state, lowercase, and without a file
     * extension. Only records from the file that match the year parameter
     * will be returned from the method.
     *
     * @param fileName the state name
     * @param requestedYear the year to match records from the file (1910-2019)
     * @return a list of BabyName objects with the data from each line matched
     *         in the file
     */
    public static List<BabyNames> read(String fileName, int requestedYear)
    {
        List<BabyNames> names = new ArrayList<>();
        try (Scanner reader = new Scanner(new File("states/" + fileName + ".txt")))
        {
            while(reader.hasNextLine())
            {
                String[] parts = reader.nextLine().split(",");
                int lineYear = Integer.parseInt(parts[2]);
                if (requestedYear == lineYear)
                {
                    names.add(new BabyNames(parts[0], parts[1],
                        Integer.parseInt(parts[2]), parts[3],
                        Integer.parseInt(parts[4])));
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Input file states/" + fileName + ".txt not found");
        }
        return names;
    }

    //converts a line of the file to a BabyNames object
    private static BabyNames readLine(String line, int year)
    {
        String[] parts = line.split(",");
        return new BabyNames(parts[0], parts[1],
            Integer.parseInt(parts[2]), parts[3],
            Integer.parseInt(parts[4]));
    }
}