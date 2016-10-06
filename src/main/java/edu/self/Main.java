package edu.self;

import edu.self.antlr.gen.CalculatorLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("res/input.txt");
        FileInputStream inputStream = new FileInputStream(file);

        ANTLRInputStream input = new ANTLRInputStream(inputStream);

        CalculatorLexer lexer = new CalculatorLexer(input);

        CommonTokenStream stream = new CommonTokenStream(lexer);


//        CalculatorParser parser = new CalculatorParser(stream);
//
//        ParseTree tree = parser.init();
//        System.out.println(tree.toStringTree(parser));
    }
}