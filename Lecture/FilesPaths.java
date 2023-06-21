import java.io.IOException;
import java.nio.file.DirectoryStream; //a interface—Objects of classes that implement this interface enable a program to iterate through the contents of a directory.
import java.nio.file.Files;    //a class provides static methods for common operations: creating , deleting , moving files and directories , getting information about the file
import java.nio.file.Path;     //a interface that represent the location of a file or directory
import java.nio.file.Paths;    //a class provides static methods for file operations

import java.util.Scanner;
public class FilesPaths{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name or directory: ");
		
		Path path = Paths.get(input.nextLine());
		if(Files.exists(path)) {
			System.out.printf("%s%n exists %n",path.getFileName());
			System.out.printf("%s a directory %n",Files.isDirectory(path) ? "Is" : "Is not");
			System.out.printf("%s an absolute path%n",path.isAbsolute() ? "Is" : "Is not");
			System.out.printf("Last modified %s%n",Files.getLastModifiedTime(path));
			System.out.printf("Size : %s%n",Files.size(path));
			System.out.printf("Path : %s%n",path);
			System.out.printf("Absolute path : %s%n",path.toAbsolutePath());
			if(Files.isDirectory(path)) {
				System.out.printf("Directory contents : %n");
				
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				for(Path p : directoryStream) {
					System.out.println(p);
				}
			}
		
		}else{
			System.out.printf(" %s does not exist%n",path);
		}
	}
	
	
	
}