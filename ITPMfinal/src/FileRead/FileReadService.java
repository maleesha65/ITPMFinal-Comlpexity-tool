package FileRead;

import FileRead.CustomFile;
import FileRead.FileRead;

public interface FileReadService {
	
	public void openFile(FileRead file, CustomFile fileobj);
	public void readFile(FileRead file, CustomFile fileobj);
	public void closeFile(FileRead file);
	
}
