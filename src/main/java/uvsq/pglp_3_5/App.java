package uvsq.pglp_3_5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	UneClasseMetier metier = new UneClasseMetier(bw);
    	try {
			metier.uneMethodeMetier();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
