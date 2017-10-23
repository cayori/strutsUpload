package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private File tempUpload;
	private String tempUploadContentType;
	private String tempUploadFileName;
	private String fileUploadPath = "C:\\upload\\";
	
	public String upload() throws Exception {
		// ==== FileUtils의 copyFile() 메소드 이용해서 작업
		/*
		File destFile = new File(fileUploadPath + getTempUploadFileName());
		FileUtils.copyFile(getTempUpload(), destFile);
		*/
		// ==== FileInputStream, FileOutputStream 이용해서 작업
		
		FileInputStream inputStream = new FileInputStream(tempUpload);
		FileOutputStream outputStream = new FileOutputStream(fileUploadPath + getTempUploadFileName());
		int bytesRead = 0;
		byte[] buffer = new byte[1024];
		while( (bytesRead = inputStream.read(buffer,0,1024)) != -1 ) {
			outputStream.write(buffer,0,bytesRead);
		}
		outputStream.close();
		inputStream.close();
		
		
		return SUCCESS;
	}
	
	public File getTempUpload() {
		return tempUpload;
	}

	public void setTempUpload(File tempUpload) {
		this.tempUpload = tempUpload;
	}

	public String getTempUploadContentType() {
		return tempUploadContentType;
	}

	public void setTempUploadContentType(String tempUploadContentType) {
		this.tempUploadContentType = tempUploadContentType;
	}

	public String getTempUploadFileName() {
		return tempUploadFileName;
	}

	public void setTempUploadFileName(String tempUploadFileName) {
		this.tempUploadFileName = tempUploadFileName;
	}
}
