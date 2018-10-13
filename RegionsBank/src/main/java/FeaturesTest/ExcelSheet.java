package FeaturesTest;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ExcelSheet extends CommonAPI {
    DataReader dtr = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../RegionsBank/data/" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }
}
