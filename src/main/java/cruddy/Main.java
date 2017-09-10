package cruddy;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import cruddy.generated.CruddyLexer;
import cruddy.generated.CruddyListener;
import cruddy.generated.CruddyParser;
import cruddy.generated.CruddyParser.CrudExpressionContext;
import cruddy.model.writers.ClassWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		File cruddyfile = new File("example.cruddy");
		
		new Main().parse(cruddyfile);
	}
	
	private void parse(File cruddyString) throws IOException {
		CruddyLexer lexer = new CruddyLexer(CharStreams.fromPath(cruddyString.toPath(), StandardCharsets.UTF_8));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CruddyParser parser = new CruddyParser(tokens);
		CrudExpressionContext context = parser.crudExpression();
		ParseTreeWalker walker = new ParseTreeWalker();
		
		ValueObjectExtractor voe = new ValueObjectExtractor();
		
		CruddyListener listener = new CruddyVisitorListener(voe);
		
		walker.walk(listener, context);
		
		StringWriter sw = new StringWriter();
		ClassWriter.space4(sw).writeClass(voe.generate());
		
		System.out.println("--------");
		System.out.println(sw.toString());
		System.out.println("--------");
	}
}
