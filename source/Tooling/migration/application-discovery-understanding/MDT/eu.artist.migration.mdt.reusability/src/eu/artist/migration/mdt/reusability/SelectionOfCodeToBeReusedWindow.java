package eu.artist.migration.mdt.reusability;


import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.tecnalia.artist.util.file.ForwardCopy;
import org.tecnalia.structures.Project;
import org.tecnalia.structures.SourceFile;
import org.tecnalia.structures.Method;
import org.tecnalia.utils.MarshallCode;


public class SelectionOfCodeToBeReusedWindow {

	protected Shell shell;
	protected Display display;
	Text textPresentationComponentsPath;
	private Tree treePresentationLayer;
	private TreeColumn column1;
	private TreeColumn column2;
	private TreeItem itemPresentationLayer;
	private TreeItem subItemPresentationLayer;
	private String strConfigurationFilePath="";
	
	private TreeColumn column3;
	private TreeItem itemBusinessLayer;
	private TreeItem subItem;
	private ArrayList<String> changedElementsList;
	private Text destinationPath;
	private Project projectWithReusabilityConditions;
	private Button btnForward = null;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SelectionOfCodeToBeReusedWindow window = new SelectionOfCodeToBeReusedWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {		
	    shell = new Shell();
	    shell.setLocation(400,100);
	    shell.setMinimumSize(new Point(221, 241));
	    shell.setSize(514, 370);
	    shell.setText("Selection of code to be reused");
	    changedElementsList = new ArrayList<String>();
	    boolean boolNotReusableEntirely;
	    
	    btnForward = new Button(shell, SWT.CHECK);
	    
	    
    	if (ContextData.isPresentationReused() && ContextData.isSameTechPresentation()){
	    	treePresentationLayer = new Tree(shell, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION | SWT.MULTI);		    	
		    treePresentationLayer.setBounds(0, 0, 481, 74);
		    treePresentationLayer.setHeaderVisible(true);
		    column1 = new TreeColumn(treePresentationLayer, SWT.LEFT);	    
		    column1.setWidth(150);
		    column2 = new TreeColumn(treePresentationLayer, SWT.LEFT);	    
		    column2.setWidth(200); 
		    itemPresentationLayer = new TreeItem(treePresentationLayer, SWT.NONE);		    		    
		    		    		    
		    itemPresentationLayer.setText(new String[] { "Presentation layer" });	    		    
		    subItemPresentationLayer = new TreeItem(itemPresentationLayer, SWT.NONE);
		    subItemPresentationLayer.setText(new String[] { "path",ContextData.getPresentationPath()});
    	}
	    
	    if (ContextData.isBusinessReused() && ContextData.isSameLangBusiness()){
	    	Project projectWithReusabilityConditions = Configuration.getProjectWithReusabilityConditions();
	    	ArrayList<SourceFile> sourceFileList = projectWithReusabilityConditions.getSourceFile();
	    	Iterator<SourceFile> iterator = sourceFileList.iterator();	    	
	    	final Tree treeBusinessLayer = new Tree(shell, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION | SWT.MULTI);			    
		    treeBusinessLayer.setBounds(0, 76, 481, 147);
		    
		    column3 = new TreeColumn(treeBusinessLayer, SWT.NONE);
		    column3.setWidth(200);
		    itemBusinessLayer = new TreeItem(treeBusinessLayer, SWT.NONE);
		    itemBusinessLayer.setText(new String[] { "Business layer" });

		    Font fontNonReusableMethods = new Font(null, new FontData("arial",9,2));
		    boolean reusable = false;
		    boolean automaticReusabilityChangedByUser = false;
		    
		    while (iterator.hasNext()){	
		    	SourceFile sourceFile = iterator.next();
		    	String reusabilityLevel = sourceFile.getReusabilityLevel();
		    	boolNotReusableEntirely = !new Boolean(sourceFile.getTotalyReusable()).booleanValue();	    				    		
	    		subItem = new TreeItem(itemBusinessLayer, SWT.NONE);
			    subItem.setText(new String[] { sourceFile.getName()});			    
			    subItem.setChecked(true);
			    //GEV last change to take into account the reusability level			    
			    if (reusabilityLevel.equalsIgnoreCase("class") && boolNotReusableEntirely){
			    	subItem.setChecked(false);
			    }
			    ArrayList<Method> methods = sourceFile.getMethods();			    
			    Iterator<Method> iterator2 = methods.iterator();
			    while (iterator2.hasNext()){
			    	final Method method = iterator2.next();
			    	final TreeItem subsubItem = new TreeItem(subItem, SWT.NONE);
			         subsubItem.setText(new String[] { method.getName()});
			         reusable = new Boolean (method.getReusable()).booleanValue();
			         automaticReusabilityChangedByUser = new Boolean (method.getAutomaticReusabilityChangedByUser()).booleanValue();
			         subsubItem.setChecked(reusable);
			       //GEV last change to take into account the reusability level		
			         if ((reusable==false)||(reusabilityLevel.equalsIgnoreCase("class") && boolNotReusableEntirely)){
			        	 subsubItem.setFont(fontNonReusableMethods);
			        	 boolNotReusableEntirely = true;
			        	 subsubItem.setChecked(false);
			         }
			         if (automaticReusabilityChangedByUser==true){			        	 
						subsubItem.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
			         }			         
					
			    }
			    if (boolNotReusableEntirely == true){
			    	subItem.setFont(fontNonReusableMethods);
			    }
			    	
			    
	    	}
		    treeBusinessLayer.addListener(SWT.Selection , new Listener(){				
				@Override
				public void handleEvent(Event e) {					
					TreeItem[] selection = treeBusinessLayer.getSelection();
					TreeItem item = null;
					for (int i=0;i<selection.length;i++){
						item = selection[i];						
						if (e.type==SWT.Selection){
							if (item.getChecked()){
								item.setChecked(false);
							}
							else{
								item.setChecked(true);								
							}
							if (item.getForeground().equals(display.getSystemColor(SWT.COLOR_BLUE))){
								item.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
								changedElementsList.remove(item.getText());
							}
							else{
								item.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
								changedElementsList.add(item.getText());
							}	
						}
					}											
					
				}
		    });
		    		    	
	    }
    
	    Button btnOk = new Button(shell, SWT.NONE);
	    btnOk.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseDown(MouseEvent e) {
	    		
	    		if ((btnForward.getSelection()) && (destinationPath.getText()=="")){
					MessageDialog.openWarning(shell, "Warning", "You have to select a path");
					destinationPath.setFocus();
					return;
				}
	    		projectWithReusabilityConditions = Configuration.getProjectWithReusabilityConditions();
	    		if (!changedElementsList.isEmpty()){	    			
	    	    	ArrayList<SourceFile> sourceFileList = projectWithReusabilityConditions.getSourceFile();
	    	    	Iterator<SourceFile> sourceFileListIterator = sourceFileList.iterator();
	    	    	Method method;
	    	    	String methodName;
	    	    	SourceFile sourceFile;
	    	    	ArrayList<Method> methods;			    				    
				    Iterator<Method> methodsIterator;				   
	    	    	while (sourceFileListIterator.hasNext()){			    	
	    		    		sourceFile = sourceFileListIterator.next();		    			    		    		
	    				    methods = sourceFile.getMethods();
	    				    methodsIterator = methods.iterator();	    				    
	    				    while (methodsIterator.hasNext()){
	    				    	method = methodsIterator.next();
	    				    	methodName = method.getName();
	    				    	if (changedElementsList.contains(methodName)){
	    				    		if (sourceFile.getTotalyReusable()=="true")
	    				    			sourceFile.setTotalyReusable("false");
	    				    		method.setAutomaticReusabilityChangedByUser("true");
	    				    		if (method.getReusable().equalsIgnoreCase("true"))
	    				    			method.setReusable("false");	    				    		
	    				    		else
	    				    			method.setReusable("true");
	    				    	}	    				    	
	    				    }	    				    
	    				   
	    	    	}	    	    		    	    		    			
	    		}
	    			    			    		
	    		    		
	    		String parent= ForwardCopy.fileCopy(projectWithReusabilityConditions.getBusinessPath(), destinationPath.getText());
    			int parentLen= projectWithReusabilityConditions.getBusinessPath().length();


    			//Sobresescribir los que no son totalmente reutilizables
    			for (SourceFile sf : projectWithReusabilityConditions.getSourceFile()) {
    				if(sf.getTotalyReusable().equals("false")){
    					System.out.println("********* Ficheros reescritos");
    					//String destino=destinationPath.getText()+sf.getPath().substring(numpadre);
    					String destino=destinationPath.getText()+"/"+parent+sf.getPath().substring(parentLen);
    					System.out.println(destino);
    					ForwardCopy.fileModify(sf.getPath(), destino, sf);
    				}
    			}
    			
    			
    	    	try {
    	    		//Pasar a Json el objeto project
	    			//MarshallCode.marshallProjectJSON(projectWithReusabilityConditions, destinationPath.getText()+"/output.json");
	    			//Pasar a XML el objeto project
	    			MarshallCode.marshallProjectXML(projectWithReusabilityConditions, destinationPath.getText()+"/output.xml");
				} catch (Exception e1) {						
					e1.printStackTrace();
				}
    	    	MessageDialog.openInformation(shell, "Info", "Thank you! The project has been generated at "+destinationPath.getText());
	    		
	    		shell.close();
	    	}
	    });
	    btnOk.setBounds(213, 281, 68, 23);
	    btnOk.setText("ok");
	    	    
	    
	    final Button btnPathSelection = new Button(shell, SWT.NONE);
	    btnPathSelection.setBounds(348, 250, 26, 25);
	    btnPathSelection.setText("...");
	    btnPathSelection.setVisible(false);
	    btnPathSelection.addSelectionListener(new SelectionAdapter() {
	    	public void widgetSelected(SelectionEvent e) {
	    		DirectoryDialog dialog = new DirectoryDialog(shell, SWT.NULL);
				strConfigurationFilePath = dialog.open();								
				destinationPath.setText(strConfigurationFilePath);
			}
		});
	    
	    final Label lblPath = new Label(shell, SWT.NONE);
	    lblPath.setBounds(22, 250, 107, 15);
	    lblPath.setText("Destination Path:");
	    lblPath.setVisible(false);
	    
	    
	    btnForward.setBounds(23, 228, 93, 16);
	    btnForward.setText("Forward");
	    btnForward.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {	    		
	    		destinationPath.setVisible(btnForward.getSelection());
	    		btnPathSelection.setVisible(btnForward.getSelection());
	    		lblPath.setVisible(btnForward.getSelection());
	    	}
	    });
	    	    
	    destinationPath = new Text(shell, SWT.BORDER);
	    destinationPath.setBounds(146, 250, 196, 21);
	    destinationPath.setVisible(false);
	    
	    
	   	    
	}
}
