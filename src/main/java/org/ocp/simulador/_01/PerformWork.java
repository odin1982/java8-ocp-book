package org.ocp.simulador._01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PerformWork {
	public void perform_work() throws IOException {

	}
}

class Work extends PerformWork {
	
	//si se puede sobreescribir con la misma excepción
	//public void perform_work() throws IOException {}
	
	//no se puede sobreescribir con una excepción padre
	//public void perform_work() throws Exception {}
	
	//si se puede es una RuntimeException
	//public void perform_work() throws NullPointerException {}
	
	//si se puede no declarar una exception
	//public void perform_work(){}
	
	//subclasses IOException:
	/*
	ClosedChannelException, EOFException, FileLockInterruptionException, 
	FileNotFoundException, FilerException, FileSystemException, 
	HttpRetryException, IIOException, InterruptedByTimeoutException, 
	InterruptedIOException, InvalidPropertiesFormatException, 
	JMXProviderException, JMXServerErrorException, MalformedURLException, 
	ObjectStreamException, ProtocolException, RemoteException, SaslException, 
	SocketException, SSLException, SyncFailedException, UnknownHostException, 
	UnknownServiceException, UnsupportedDataTypeException, 
	UnsupportedEncodingException, UserPrincipalNotFoundException, 
	UTFDataFormatException, ZipException
	*/
	
	
	// si se puede agregar una subclase de la exception en un metodo sobreescrito
	public void perform_work() throws FileNotFoundException {}
}
