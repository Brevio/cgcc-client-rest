package request;

import java.util.List;


public class RequestOrquestrador {

	private String centroCusto;

	private String canal;

	private String titulo;

	private String extensao;

	private String mimetype;

	private String identificacaoRastreio;

	private String tipoDocumento;

	private Integer codigoProcesso;

	private TipoExtracao tipoExtracao;

	private Motor motorPrioritario;
	
	private Integer confianca;
	
	private List<Metadado> metadados;
	
	private List<Arquivo> arquivos;
	
	public String getCentroCusto() {
		return centroCusto;
	}
	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getExtensao() {
		return extensao;
	}
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	public String getMimetype() {
		return mimetype;
	}
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}
	public String getIdentificacaoRastreio() {
		return identificacaoRastreio;
	}
	public void setIdentificacaoRastreio(String identificacaoRastreio) {
		this.identificacaoRastreio = identificacaoRastreio;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getCodigoProcesso() {
		return codigoProcesso;
	}
	public void setCodigoProcesso(Integer codigoProcesso) {
		this.codigoProcesso = codigoProcesso;
	}
	public TipoExtracao getTipoExtracao() {
		return tipoExtracao;
	}
	public void setTipoExtracao(TipoExtracao tipoExtracao) {
		this.tipoExtracao = tipoExtracao;
	}
	public Motor getMotorPrioritario() {
		return motorPrioritario;
	}
	public void setMotorPrioritario(Motor motorPrioritario) {
		this.motorPrioritario = motorPrioritario;
	}
	public Integer getConfianca() {
		return confianca;
	}
	public void setConfianca(Integer confianca) {
		this.confianca = confianca;
	}
	public List<Metadado> getMetadados() {
		return metadados;
	}
	public void setMetadados(List<Metadado> metadados) {
		this.metadados = metadados;
	}
	public List<Arquivo> getArquivos() {
		return arquivos;
	}
	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}
	
}
