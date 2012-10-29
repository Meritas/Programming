import java.io .*;
import java.lang.*;
import java.util.Random;
import java.security.SecureRandom;

public class Belt2 {

	public static void main(String[] args) {
		String file_name = null;
		if (args.length > 0) {
			file_name = args[0];
			} else {
			System.out.println("WRONG!");
			}

	try {
		File input_file = new File(file_name);
		String new_name = file_name.substring(0, file_name.length()-4);
		File temp_file = new File("#{" + new_name + "}_result.csv");
		
		BufferedReader reader = new BufferedReader(new FileReader(input_file));
		BufferedWriter writer = new BufferedWriter(new FileWriter(temp_file));
		
		try{
		String current_line;
		StringBuffer sb = new StringBuffer(1024);
		
		while((current_line = reader.readLine()) != null ) {
			int current_x = Integer.parseInt(current_line.split(",")[1]);
			int rvalue;
			for ( rvalue = current_x/2; rvalue >= current_x/2; ) {	
				System.out.println("eto ti go: " + current_line);
				rvalue = new Random().nextInt((current_x)+1);
				int nvalue = new Random().nextInt((2*current_x)+2);
				rvalue -= nvalue;
				System.out.println(nvalue);
				System.out.println(rvalue);
				}
			sb.delete(0, sb.length());
			String final_line;
			final_line = sb.append(current_line).append(",").append(rvalue).toString();
			System.out.println(final_line);
			writer.write(final_line);
			writer.newLine();
			}
		}finally{
		writer.close();
		reader.close();
		}
		}catch(Exception e){}
		}
		
		
	}
	
	
				/*try {
					Thread.sleep(1000L);
				} catch (Exception e) {}*/	
				
				/*finally {
     				 	 writer.close();
     				 }*/	
	
				//boolean sucessful = temp_file.renameTo(input_file);
