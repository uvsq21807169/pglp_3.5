package uvsq.pglp_3_5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class UneClasseMetier {

	BufferedWriter to;
	
	public UneClasseMetier(BufferedWriter to) {
		this.to = to;
	}
	
	public void uneMethodeMetier () throws IOException {
		to.write(LocalDateTime.now() + ": Début de uneMethodeMetier");
		
		// Traitements métiers
		
		
		to.write(LocalDateTime.now() + ": Fin de uneMethodeMetier"); 
	}

}
