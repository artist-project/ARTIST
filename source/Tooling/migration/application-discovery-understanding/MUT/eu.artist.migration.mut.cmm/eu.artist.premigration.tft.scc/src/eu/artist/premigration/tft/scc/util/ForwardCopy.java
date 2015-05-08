package eu.artist.premigration.tft.scc.util;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

import eu.artist.premigration.tft.scc.structures.Method;
import eu.artist.premigration.tft.scc.structures.SourceFile;


public class ForwardCopy {
	public static int  EntraIncial=0;      

	public static String fileCopy(String sourceFile, String destinationFile) {
		System.out.println("Desde: " + sourceFile);
		System.out.println("Hacia: " + destinationFile);

			File inFile = new File(sourceFile);
			File outFile = new File(destinationFile);
			Copiar(inFile, outFile);
			return inFile.getName();
		
	}

	
	public static void fileModify(String sourceFile, String destinationFile, SourceFile sf){  
        try {  
//        	RandomAccessFile fichero = new RandomAccessFile(destinationFile, "rw");
        	
        	BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        	BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
        	
        	int numlinea=0;
        	String comentario="//";
			String linea="";
			for (Method m : sf.getMethods()) {
    			if(m.getReusable().equals("false")){
    				
    				for (int i=numlinea; i<Integer.parseInt(m.getBline())-1; i++){
    					numlinea++;
    					linea=reader.readLine();
    					writer.write(linea+ "\r\n");
    				}
					writer.write("//TODO change this methos code\r\n");
    				for (int i=numlinea; i<Integer.parseInt(m.getEline()); i++){
    					numlinea++;
    					linea=reader.readLine();
    					writer.write(comentario+linea+ "\r\n");
        				
    				}
    				
    				
    			}
    		}
			while((linea=reader.readLine())!=null) {
				writer.write(linea+ "\r\n");
			}
			reader.close();
			writer.close();
			
          
	    } catch (Exception ex) {  
	        System.out.println(ex.getMessage()); 
	        ex.printStackTrace();
	      
	   }  
  
  
	}  	
	
	public static int insertCode(String sourceFile, int bline, String code){  
        try {  
        	
        	BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        	
			String linea="";
			Vector container = new Vector();

			for (int i=0; i<bline; i++){
				linea=reader.readLine();
				container.add(linea+ "\r\n");
			}
			
			container.add("//TODO This is legacy code \r\n");			
			String[] codelines= code.split("\n");
			for (int i=0; i<codelines.length; i++){
				container.add("//"+codelines[i]+ "\r\n");
			}
    				
			while((linea=reader.readLine())!=null) {
				container.add(linea+ "\r\n");
			}
			reader.close();
        	BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile));
        	for (int i=0; i<container.size(); i++){
        		writer.write((String)container.get(i));
			}
        	writer.close();
			
          return codelines.length+1;
	    } catch (Exception ex) {  
	        System.out.println(ex.getMessage()); 
	        ex.printStackTrace();
	        return 0;
	      
	   }  
       
  
	}  	
	
	
	
	private static void Copiar(File FOrigen,File FDestino){  
        if(!FOrigen.isDirectory()){  
            CopiarFichero(FOrigen,FDestino);  
        }else{  
           //incremento el contador de entradas a esta función   
           EntraIncial++;   
           //solo se entra acá cuando se quiera copiar una carpeta y   
           //sea la primera es decir la carpeta padre  
           if(EntraIncial==1){  
                //Cambio la ruta destino por el nombre que tenia mas el nombre de  
                //la carpeta padre  
                FDestino=new File(FDestino.getAbsolutePath()+"/"+FOrigen.getName());   
                //si la carpeta no existe la creo  
                if(!FDestino.exists()){  
                    FDestino.mkdir();  
                }  
           }   
           //obtengo el nombre de todos los archivos y carpetas que   
           //pertenecen a este fichero(FOrigen)  
           String []Rutas=FOrigen.list();  
           //recorro uno a uno el contenido de la carpeta  
             
           /*IMPORTANTE:EL HML SE DESCONFIGURA Y NO ME DEJA  
             PORNE LA LINEA FOR SIGUIENTE BIEN, TENGO PROBLEMA  
             CON EL SIGNO MENOR.SI UD LE PASA LO MISMO DESCARGE EL 
             PROGRAMA CON EL LINK DE ABAJO Y VÉALO DE FORMA SEGURA            
           */  
             for(int i=0;i<Rutas.length;i++){  
              //establezco el nombre del nuevo archivo origen   
              File FnueOri=new File(FOrigen.getAbsolutePath()+"/"+Rutas[i]);  
              //establezco el nombre del nuevo archivo destino   
              File FnueDest= new File(FDestino.getAbsolutePath()+"/"+Rutas[i]);  
              //si no existe el archivo destino lo creo  
              if(FnueOri.isDirectory() && !FnueDest.exists()){  
                  FnueDest.mkdir();                          
              }  
              //uso recursividad y llamo a esta misma funcion has llegar  
              //al ultimo elemento      
              Copiar(FnueOri,FnueDest);   
           }  
        }  
          
	}   
	/*Funcion que copia un fichero 
	 *PARAMETRO1:FOrigen:Fichero o carpeta que se desea copiar 
	 *PARAMETRO2:FDestino:Carpeta destino 
	 */  
	private static void CopiarFichero(File FOrigen,File FDestino){  
	            try {  
	            if(FOrigen.exists()){  
                    //Flujo de lectura al fichero origen(que se va a copiar)              
                    FileInputStream LeeOrigen= new FileInputStream(FOrigen);  
                    //Flujo de lectura al fichero destino(donde se va a copiar)  
                    OutputStream Salida = new FileOutputStream(FDestino);  
                    //separo un buffer de 1MB de lectura  
                    byte[] buffer = new byte[1024];  
                    int tamaño;  
                    //leo el fichero a copiar cada 1MB  
                    while ((tamaño = LeeOrigen.read(buffer)) > 0) {  
                    //Escribe el MB en el fichero destino  
                    Salida.write(buffer, 0, tamaño);  
                    }  
                    System.out.println(FOrigen.getName()+" Copiado con Exito!!");  
                    //cierra los flujos de lectura y escritura  
                    Salida.close();  
                    LeeOrigen.close();  
	                  
	            }else{//l fichero a copiar no existe                  
	                System.out.println("El fichero a copiar no existe..."+FOrigen.getAbsolutePath());  
	            }  
	              
	        } catch (Exception ex) {  
	            System.out.println(ex.getMessage()); 
	            ex.printStackTrace();
	          
	       }  
	      
	      
	}  	

	
	

}
