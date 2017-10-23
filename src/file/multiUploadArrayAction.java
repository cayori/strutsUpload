package file;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

public class multiUploadArrayAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private File[] uploads;
	private String[] uploadsFileName;
	private String[] uploadsContentType;
	private String fileUploadPath = "C:\\upload\\";
	
	public String upload() throws Exception {
		for(int i=0; i<uploads.length; i++) {
			File destFile = new File(fileUploadPath + uploadsFileName[i]);
			FileUtils.copyFile(uploads[i], destFile);
		}
		return SUCCESS;
	}
	
	public File[] getUploads() {
		return uploads;
	}

	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}

	public String[] getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(String[] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}

	public String[] getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}
}
