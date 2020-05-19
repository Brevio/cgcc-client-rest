package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

import response.ResponseOrquestrador;

public class UtilsCgcc {

	public static String getStringBase64(File file) throws IOException {
		return Base64.getEncoder().encodeToString(Files.readAllBytes(file.toPath()));
	}
	
	public static void  responseToFile(ResponseOrquestrador response, String pathOutput) {
		response.getArquivos().forEach(a -> {
			FileWriter w;
			try {
				System.out.println("Writing file " + a.getNomeArquivo());
				w = new FileWriter(new File(pathOutput + a.getNomeArquivo() + ".txt"));
				w.append(a.getTexto());
				w.flush();
				w.close();
			} catch (IOException e) {
				System.err.println("Error! Writing file " + a.getNomeArquivo());
				e.printStackTrace();
			}
		});
	}
}
