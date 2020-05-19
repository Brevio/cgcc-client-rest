package response;

import java.util.ArrayList;
import java.util.List;


public class ResponseOrquestrador {

	private int status;

	private List<ResponseOrquestradorArquivo> arquivos;
	
	public ResponseOrquestrador() {
		arquivos = new ArrayList<ResponseOrquestradorArquivo>();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<ResponseOrquestradorArquivo> getArquivos() {
		return arquivos;
	}

	public void setArquivos(List<ResponseOrquestradorArquivo> arquivos) {
		this.arquivos = arquivos;
	}
	
	
	
}
