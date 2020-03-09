import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Text to Graph program,
 * this is meant to be a simple program that read a given number of inputs in stdin.
 * the structure will follow the pattern:
 * First line will give the total number of nodes.
 * when the following lines will give two 2 nodes, meaning that two nodes have a edge.
 * the final input will be a single line with END.
 * 
 * After receiving the inputs, the program will generate a graph using a matrix.
 */
public class textToGraph {

    public static int readInt(BufferedReader reader) {
        int resposta = 0;

        try {
            resposta = Integer.parseInt(input(reader));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return resposta;
    }

    public static String input(BufferedReader reader) {
        String input = "";
        
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    public static boolean readInputs(BufferedReader reader) {
        boolean validate = false;

        

        return validate;
    }

    public static void main(String[] args) {
        
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int x = readInt(br);


    }
}