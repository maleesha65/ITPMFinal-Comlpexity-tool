/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coupling;

import java.util.ArrayList;

/**
 *
 * @author nuwan
 */
public class CouplingMain {
    
    private ArrayList<CustomFile> fileList = new ArrayList<CustomFile>();
	private String fileType = "";

	public ArrayList<CustomFile> getFileList() {
		return fileList;
	}

	public void setFileList(ArrayList<CustomFile> fileList) {
		this.fileList = fileList;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public void run() {

		CouplingService couplingService = new CouplingServiceImp();

		for (CustomFile file : this.fileList) {

			if (!(file.getFileName().contains("java") || file.getFileName().contains("cpp"))) {
				System.out.println("Wrong file type");
			} else {

				if (file.getFileName().contains("java")) {
					fileType = "java";
				} else {
					fileType = "cpp";
				}

				FileRead fileRead = new FileRead(file.getFileName());
				FileReadService fileReadService = new FileReadServiceImp();

				fileReadService.openFile(fileRead, file);
				fileReadService.readFile(fileRead, file);

				couplingService.process1(file);
				fileReadService.closeFile(fileRead);
			}
		}
		if (this.fileList.size() > 1) {
			couplingService.process2(this.fileList);
		}
	}
}
