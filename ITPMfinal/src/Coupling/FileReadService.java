package Coupling;

import Coupling.CustomFile;
import Coupling.FileRead;

public interface FileReadService {
	
	public void openFile(FileRead file, CustomFile fileobj);
	public void readFile(FileRead file, CustomFile fileobj);
	public void closeFile(FileRead file);
	
}
