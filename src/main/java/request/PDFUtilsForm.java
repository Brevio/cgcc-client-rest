package request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class PDFUtilsForm {

	@NotEmpty @NotNull @Pattern(regexp = "(?i).*\\.pdf$")
	private String fileName;
	@NotEmpty @NotNull
	private String fileBase64;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileBase64() {
		return fileBase64;
	}

	public void setFileBase64(String fileBase64) {
		this.fileBase64 = fileBase64;
	}

}
