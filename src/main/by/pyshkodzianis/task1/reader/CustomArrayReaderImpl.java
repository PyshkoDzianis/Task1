package by.pyshkodzianis.task1.reader;

import by.pyshkodzianis.task1.exception.CustomArrayException;
import by.pyshkodzianis.task1.validation.CustomArrayValidator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomArrayReaderImpl implements CustomArrayReader {
    private static final Logger logger = LogManager.getLogger("CustomArrayReader");

    @Override
    public String readCustomArrayFromFile(String path) throws CustomArrayException {

        String resultString = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
           String string = bufferedReader.readLine();


            while (string != null) {
                if (CustomArrayValidator.validateInteger(string)) {
                    resultString = string;
                    break;
                }
                string = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "File can't be found");
            throw new CustomArrayException("File can't be found");
        } catch (IOException exception) {
            logger.log(Level.ERROR, "File can't be open");
            throw new CustomArrayException("File can't be open");
        }
        return resultString;
    }
}