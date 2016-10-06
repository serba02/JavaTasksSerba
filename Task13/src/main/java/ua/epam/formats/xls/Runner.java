package ua.epam.formats.xls;

import javax.swing.text.html.parser.Parser;

/**
 * Created by Bredok on 07.10.2016.
 */
public class Runner {
    public static void main(String[] args){

        String file = "src\\main\\resources\\Actors.xls";
        System.out.println(XlsParser.parse(file));

    }
}
