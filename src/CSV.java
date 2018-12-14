import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	public static List<String[]> read(String file){
		
		List<String[]> datas = new LinkedList<String[]>();
		
		String dataRow; 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
		    while((dataRow = br.readLine())!=null) {
		    	String []dataRecords = dataRow.split(",");
		    	datas.add(dataRecords);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("could not find the file");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("could not read the file"); 
			e.printStackTrace();
		}
		
		return datas;
		
	}
	
}
