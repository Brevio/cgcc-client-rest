package br.com.cgcc.apis.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import br.com.cgcc.apis.OcrClient;
import request.Arquivo;
import request.Metadado;
import request.Motor;
import request.RequestOrquestrador;
import request.TipoExtracao;
import response.ResponseOrquestrador;
import utils.UtilsCgcc;

public class RestApiClientTest {

	private OcrClient client = new OcrClient();
	private RequestOrquestrador request = new RequestOrquestrador();
	private String extencao = "pdf";
	private String mimetype = "application/pdf";
	private String pathOutput = "";
	

	@Test
	public void testOcrPdf() {
		request.setCentroCusto("gccn");
		request.setCanal("mobile");
		request.setTitulo("TESTE");
		request.setExtensao(extencao);
		request.setMimetype(mimetype);
		request.setIdentificacaoRastreio(UUID.randomUUID().toString());
		request.setTipoDocumento("7");
		request.setCodigoProcesso(10);
		request.setTipoExtracao(TipoExtracao.PRIORITARIO);
		request.setMotorPrioritario(Motor.CALLERE);
		request.setConfianca(70);
		List<Metadado> metadados = new ArrayList<Metadado>();
		Metadado metadado = new Metadado();
		metadado.setNome("id");
		metadado.setValor(UUID.randomUUID().toString());
		metadados.add(metadado);
		request.setMetadados(metadados);
		
		List<Arquivo> arquivos = new ArrayList<Arquivo>();
		Arquivo arquivo = new Arquivo();
		
		//set nomo, set string 64
		
		
		
		
		arquivos.add(arquivo);
		request.setArquivos(arquivos);
		
		ResponseEntity<ResponseOrquestrador> ocr = client.getOcr(request);
		UtilsCgcc.responseToFile(ocr.getBody(), pathOutput);
		
		

	}

}
