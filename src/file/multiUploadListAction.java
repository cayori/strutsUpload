package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

public class multiUploadListAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private List<File> uploads = new ArrayList<File>();
	private List<String> uploadsFileName = new ArrayList<String>();
	private List<String> uploadsContentType = new ArrayList<String>();
	private String fileUploadPath = "C:\\upload\\";
	
	public String upload() throws Exception {
		for(int i=0; i<uploads.size(); i++) {
			File destFile = new File(fileUploadPath + uploadsFileName.get(i));
			FileUtils.copyFile(uploads.get(i), destFile);		// getUploads(i).get(i) 써야하나?
		}
		return SUCCESS;
	}
	
	public List<File> getUploads() {
		return uploads;
	}

	public void setUploads(List<File> uploads) {
		this.uploads = uploads;
	}

	public List<String> getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(List<String> uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}

	public List<String> getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(List<String> uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}
}
