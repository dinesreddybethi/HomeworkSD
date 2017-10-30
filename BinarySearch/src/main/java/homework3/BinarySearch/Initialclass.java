package homework3.BinarySearch;

import java.util.List;
//import java.util.StringTokenizer;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Initialclass {
	 public static final int NOT_FOUND = -1;
	public static int binarySearch( Comparable [ ] a, Comparable x )
    {
        int initial = 0;
        int end = a.length - 1;
        int middle;

        while( initial <= end )
        {
            middle = ( initial + end ) / 2;

            if( a[ middle ].compareTo( x ) < 0 )
                initial = middle + 1;
            else if( a[ middle ].compareTo( x ) > 0 )
                end = middle - 1;
            else
                return middle;
        }

        return NOT_FOUND;     // NOT_FOUND = -1
    }


 public static void main(String[] args) throws Exception {
	
     //Comparable [ ] a1 = new String [4];
    // for( int i = 0; i < args.length; i++ )
     
    	
     
  Options options = new Options();

  Option input = new Option("type", "input", true, "input file to read data from");
  input.setRequired(true);
  input.setArgName("FILE PATH");
  options.addOption(input);

  Option output = new Option("key", "output", true, "output file to write the final result");
  output.setRequired(true);
  output.setArgName("FILE PATH");
  options.addOption(output);
  
 Option output2 = new Option("list", "output2", false, "output file to write the final result");
  output2.setRequired(false);
  output2.setArgName("FILE PATH");
  options.addOption(output2);

  CommandLineParser commandLineParser = new DefaultParser();

  CommandLine commandLine;
try{
  commandLine = commandLineParser.parse(options, args);

  String inputFilePath = commandLine.getOptionValue("input");
  String outputFilePath = commandLine.getOptionValue("output");
  String firstelement = commandLine.getOptionValue("output2");
  List<String> list = commandLine.getArgList();
  System.out.println(firstelement);
  if(firstelement==null) {
	  System.err.println("-1");
  System.exit(1);
  }
  String [ ] a1 = new String [list.size()+1];
  a1[0]=firstelement;
 // Integer [ ] a2 = new Integer[list.size()+1];
  for (int i=1;i<list.size()+1;i++)
	  a1[i]=list.get(i-1);
 
  if(inputFilePath.compareTo("s")==0)
	  System.out.println(binarySearch(a1,outputFilePath));
  else
	  System.out.println(binarySearch(a1,outputFilePath));
  /*else{
	  System.out.println("i");
	  for (int i=0;i<list.size();i++)
		  a2[i]=Integer.parseInt(a1[i]);
	  int outputFilePath1=Integer.parseInt(outputFilePath);
	  System.out.println(binarySearch(a2,outputFilePath1));
  }*/
	}

  catch( ParseException exp ) {
	    System.out.println( "Unexpected exception:" + exp.getMessage() );
	}

 
  //String outputFilePath = commandLine.getOptionValue("output");
 
 }
 
 }


