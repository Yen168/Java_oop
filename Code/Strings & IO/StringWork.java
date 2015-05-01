import java.io.*;

public class StringWork {
    
	public static final void main (String[] args) {

		if (args.length == 1){
		
			System.out.println (args[0].charAt(0));//first char
			System.out.println (args[0].charAt(args[0].length() -1));//last char
			System.out.println (args[0].length());//its length
			
			for(int i=0; (i<3)&&(i<args[0].length()) ;i++)
				System.out.print (args[0].charAt(i));
			
			System.out.println ("");	
		
		}
		
		if (args.length == 3){
		
			StringBuffer s = new StringBuffer();
			String reverse = s.append(args[0]).append(args[1]).append(args[2]).toString(); // combine string
			
			System.out.println (reverse);
			
			//reverse here
			for(int i= (reverse.length() - 1) ; i >= 0;i--)
				System.out.print (reverse.charAt(i));
				
			System.out.println ("");
				
		}
		
		System.out.println ("File IO dispaly: ");	
		
		FileClass test = new FileClass();
		test.readFile("t.txt");
		test.writeFile("end.txt");
	}
}

class FileClass {

	StringBuffer data = new StringBuffer();
	
	public void readFile(String filename) {
			
		BufferedReader br = null;
		FileReader fr = null;
		String in = null;
		
		int count = 0;
		
		try{
			
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			while((in = br.readLine()) != null){
			
			data.append(in);
			data.append('\n');
			
			count++;
			}
			
			data.delete(data.length()-1,data.length());
			br.close();
		}
    
		catch(IOException ioe){}
		
		System.out.println(data);
	}
	

	public void writeFile(String filename) {
			
		BufferedWriter wr = null;
		String out = null;
		
		try{
			
			out = data.reverse().toString();
			System.out.println(data);
			
			wr = new BufferedWriter(new FileWriter(filename));
			
			wr.write(data.toString());
			wr.close();
			
			
		}
		catch(IOException ioe){}
		
	
	}
 

}