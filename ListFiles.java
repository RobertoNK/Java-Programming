import java.io.File;
import java.util.Arrays;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// prints directory
		//String cwd = System.getProperty("user.dir");
        //System.out.println("Current working directory : " + cwd);
		
		// "." --> current directory
		
		// Provide path
		File currentDirectory = new File("D:\\JavaCode\\HelloWord\\src\\HelloWorld\\src");
		String [] fileNames = currentDirectory.list();
		System.out.println(Arrays.toString(fileNames));
	}

}
