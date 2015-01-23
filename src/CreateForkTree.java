package edu.ucsb.cs56.projects.utilities.fork_tree_creator;

/** Main class to create a fork tree 

*/

public class CreateForkTree {

  public static void main(String [] args) {
  
    if (args.length != 2) {
      System.err.println("Usage: java CreateForkTree inputFile.xml outputFile.png");
      System.err.println("   inputFile.xml should be formatted as per instructions in README.md in repo");
      System.exit(1);
  }
  String inputXmlFilename = args[0];
  String outputPngFilename = args[1];
  
  System.out.println("Replace this line with call to a method that opens xmlFilename and returns
                     " and inputStream\n");
  
  System.out.println("Replace this lines with code that reads from an inputStream\n" +
                     " and returns a data structure containing the information--a list of mentors,\n" +
                     " the name of an organization and a repo.\n");
                     
  System.out.println("ALSO: unit test that by setting a String literal to be the source for an InputStream\n" +
                     " creating that InputStream, passing it to the method, and making sure you get the \n" +
                     " expected results in the data structure");
  
  System.out.println("Replace this line with a call to a method that accepts the data structure \n" +
                     " and the outputPngFilename as input, or a method of the class for the data structure\n" +
                     "  that takes the outputPngFilename as input, and outputs a PNG file similar to the \n" +
                     "  example in the README.md");
  System.out.println("Print a message here indicating the name of the input file read, and \n",
                     "  name of output png file created");
                     
}
