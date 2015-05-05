package eu.artist.migration.mdt.reusability;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.tecnalia.artist.util.file.CSExplorer;
import org.tecnalia.artist.util.file.ClassExplorer;
import org.tecnalia.artist.util.file.JavaExplorer;
import org.tecnalia.artist.util.file.Searcher;
import org.tecnalia.structures.Project;
import org.tecnalia.structures.SearchResult;

import eu.artist.migration.mdt.reusability.beans.DataStorage;
import eu.artist.migration.mdt.reusability.beans.DataStorageFramework;
import eu.artist.migration.mdt.reusability.beans.DataStorageProduct;
import eu.artist.migration.mdt.reusability.beans.ProgrammingLanguage;

public class BusinessLayerReusabilityConditionsWindow {

	protected Shell shell;
	private Button btnSameProgrammingLanguageYes;
	private Button btnSameProgrammingLanguageNo;
	private Button btnSameTechDataStorageYes;
	private Button btnSameTechDataStorageNo;
	private Button btnSameProdDataStorageYes;
	private Button btnSameProdDataStorageNo;
	private Button btnDataStorageSpecificFunctionsYes;
	private Button btnDataStorageSpecificFunctionsNo;
	private Button btnStoredProceduresYes;
	private Button btnStoredProceduresNo;
	private Label lblProduct;
	private Combo comboStorageProducts;
	private Group grpSameTechnologyFor;
	private Group grpSameProgrammingLanguage;
	private Group grpSameProductFor;
	private Group grpDatastorageProductsSpecific;
	private Group grpStoredProceduresAre;
	private Label lblProcedureName;
	private Combo comboProcedureName;
	private Button btnAddProcedureName;
	private Text textBusinessComponentsPath;
	private Button btnPathSelection;
	private Group grpBusinessLayersComponents;
	private String selectedPath = "";
	private Label lblTechnologyOnSource;
	private Combo comboTechnologyOnSource;
	private Combo comboProgrammingLanguage;
	private Group grpSameDatastorageFramework;
	private Button btnSameDatastorageFrameworkYes;
	private Button btnSameDatastorageFrameworkNo;
	private Label labelDatastorageFrameworkOnSource;
	private Combo comboDatastorageFrameworkOnSource;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		try {
			String strConfigurationFilePath = "D:/Projects/ARTIST/RTT/config.xml";
			Configuration
					.setConfigurationFromConfigFile(strConfigurationFilePath);
			BusinessLayerReusabilityConditionsWindow window = new BusinessLayerReusabilityConditionsWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
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
	/**
	 * 
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setLocation(400,100);
		shell.setSize(544, 717);
		shell.setText("Business Layer Reusability Conditions");
		Button btnNext = new Button(shell, SWT.NONE);
		Collection<?> values = null;
		Iterator<?> iterator = null;
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if ((!ContextData.isSameTechPresentation())
						&& (!ContextData.isSameLangBusiness())) {
					MessageDialog.openWarning(shell, "Warning",
							"There is no possibility of reuse.");
					shell.close();					
					return;
				}
				if (btnSameProgrammingLanguageYes.getSelection()) {
					if (comboProgrammingLanguage.getText() == "") {
						MessageDialog.openWarning(shell, "Warning",
								"You have to select a programming language");
						comboProgrammingLanguage.setFocus();
						return;
					}
					if (selectedPath == "") {
						MessageDialog.openWarning(shell, "Warning",
								"You have to select a path");
						textBusinessComponentsPath.setFocus();
						return;
					}
					if (comboStorageProducts.getText() == "") {
						MessageDialog.openWarning(shell, "Warning",
								"You have to select an storage product");
						comboStorageProducts.setFocus();
						return;
					}
					grpSameTechnologyFor.setVisible(false);
					grpSameProductFor.setVisible(false);
					grpDatastorageProductsSpecific.setVisible(false);
					grpStoredProceduresAre.setVisible(false);
					grpBusinessLayersComponents.setVisible(false);
					if ((!btnSameTechDataStorageYes.getSelection())
							&& (!btnSameTechDataStorageNo.getSelection())) {
						MessageDialog
								.openWarning(
										shell,
										"Warning",
										"You have to specify is source and destination systems will use the same data storage technology");
						return;
					}
					if (comboTechnologyOnSource.getText() == "") {
						MessageDialog.openWarning(shell, "Warning",
								"You have to select an storage technology");
						comboTechnologyOnSource.setFocus();
						return;
					}
					if ((grpSameProductFor.isVisible())
							&& (!btnSameProdDataStorageYes.getSelection())
							&& (!btnSameProdDataStorageNo.getSelection())) {
						MessageDialog
								.openWarning(shell, "Warning",
										"You have to specify if same database product will be used in both systems");
						return;
					}
					if ((grpDatastorageProductsSpecific.isVisible())
							&& (!btnDataStorageSpecificFunctionsYes
									.getSelection())
							&& (!btnDataStorageSpecificFunctionsNo
									.getSelection())) {
						MessageDialog
								.openWarning(shell, "Warning",
										"You have to specify if specific data storage functions are being used");
						return;
					}
					if (grpStoredProceduresAre.isVisible()) {
						if ((!btnStoredProceduresYes.getSelection())
								&& (!btnStoredProceduresNo.getSelection())) {
							MessageDialog
									.openWarning(shell, "Warning",
											"You have to specify if stored procedures are being used");
							return;
						}
						if ((btnStoredProceduresYes.getSelection())
								&& (comboProcedureName.getItemCount() == 0)) {
							MessageDialog
									.openWarning(shell, "Warning",
											"Please, insert the names of the stored procedures");
							return;
						}
					}
				}
				setReusableMethods();
				shell.close();
				SelectionOfCodeToBeReusedWindow window = new SelectionOfCodeToBeReusedWindow();
				window.open();
			}
		});
		btnNext.setBounds(211, 656, 68, 23);
		btnNext.setText("Next");

		grpSameProgrammingLanguage = new Group(shell, SWT.NONE);
		grpSameProgrammingLanguage
				.setText("Same programming language on source and destination:");
		grpSameProgrammingLanguage.setBounds(45, 10, 350, 63);

		btnSameProgrammingLanguageYes = new Button(grpSameProgrammingLanguage,
				SWT.RADIO);
		btnSameProgrammingLanguageYes.setBounds(24, 22, 39, 16);
		btnSameProgrammingLanguageYes
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						grpSameTechnologyFor
								.setVisible(btnSameProgrammingLanguageYes
										.getSelection());
						grpBusinessLayersComponents
								.setVisible(btnSameProgrammingLanguageYes
										.getSelection());
						comboProgrammingLanguage
								.setVisible(btnSameProgrammingLanguageYes
										.getSelection());
						ContextData
								.setSameLangBusiness(btnSameProgrammingLanguageYes
										.getSelection());
					}
				});
		btnSameProgrammingLanguageYes.setText("Yes");
		if (Configuration.sameProgramingLanguageMAT.equalsIgnoreCase("Yes")){
			btnSameProgrammingLanguageYes.setSelection(true);
			ContextData.setSameLangBusiness(true);
		}

		btnSameProgrammingLanguageNo = new Button(grpSameProgrammingLanguage,
				SWT.RADIO);
		btnSameProgrammingLanguageNo.setBounds(23, 44, 83, 16);
		btnSameProgrammingLanguageNo.setText("No");
		if (Configuration.sameProgramingLanguageMAT.equalsIgnoreCase("No")){
			btnSameProgrammingLanguageNo.setSelection(true);		
			ContextData.setSameLangBusiness(false);
		}

		comboProgrammingLanguage = new Combo(grpSameProgrammingLanguage,
				SWT.NONE);
		comboProgrammingLanguage.setBounds(71, 20, 133, 23);
		HashMap<String, ProgrammingLanguage> mapProgrammingLanguages = Configuration.mapProgrammingLanguages;
		values = mapProgrammingLanguages.values();
		iterator = values.iterator();
		int index = 0;
		int selectionIndex=0;
		String strProgrammingLanguage ="";
		while (iterator.hasNext()) {
			ProgrammingLanguage programmingLanguage = (ProgrammingLanguage) iterator
					.next();
			strProgrammingLanguage=programmingLanguage.getName();
			comboProgrammingLanguage.add(strProgrammingLanguage,index);			
			if (ProgrammingLanguage.programingLanguajeMAT.equalsIgnoreCase(strProgrammingLanguage)){
				selectionIndex=index;				
			}
			index++;
			
		}		
		
		//GEV value selected in MAT is preselected
		if (ProgrammingLanguage.programingLanguajeMAT!=""){
			comboProgrammingLanguage.select(selectionIndex);
			comboProgrammingLanguage.setFocus();
		}		

		grpSameTechnologyFor = new Group(shell, SWT.NONE);
		grpSameTechnologyFor
				.setText("Same technology for data storage on source and destination:");
		grpSameTechnologyFor.setBounds(45, 151, 350, 96);

		btnSameTechDataStorageYes = new Button(grpSameTechnologyFor, SWT.RADIO);
		btnSameTechDataStorageYes.setBounds(25, 20, 83, 16);
		btnSameTechDataStorageYes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				grpSameProductFor.setVisible(btnSameTechDataStorageYes
						.getSelection());
				// grpSameProductFor.setVisible(false);
				grpSameDatastorageFramework
						.setVisible(btnSameTechDataStorageYes.getSelection());
				grpDatastorageProductsSpecific
						.setVisible(btnSameTechDataStorageYes.getSelection());
				grpStoredProceduresAre.setVisible(btnSameTechDataStorageYes
						.getSelection());

			}
		});
		btnSameTechDataStorageYes.setText("Yes");
		if (Configuration.sameDataStorageTypeMAT.equalsIgnoreCase("Yes"))
			btnSameTechDataStorageYes.setSelection(true);

		btnSameTechDataStorageNo = new Button(grpSameTechnologyFor, SWT.RADIO);
		btnSameTechDataStorageNo.setBounds(25, 42, 83, 16);
		btnSameTechDataStorageNo.setText("No");
		if (Configuration.sameDataStorageTypeMAT.equalsIgnoreCase("No"))
			btnSameTechDataStorageNo.setSelection(true);
		
		btnSameTechDataStorageNo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				grpSameProductFor.setVisible(btnSameTechDataStorageYes
						.getSelection());
				// grpSameProductFor.setVisible(false);
				grpSameDatastorageFramework
						.setVisible(btnSameTechDataStorageYes.getSelection());
				grpDatastorageProductsSpecific
						.setVisible(btnSameTechDataStorageYes.getSelection());
				grpStoredProceduresAre.setVisible(btnSameTechDataStorageYes
						.getSelection());

			}
		});

		lblTechnologyOnSource = new Label(grpSameTechnologyFor, SWT.NONE);
		lblTechnologyOnSource.setText("Technology on source:");
		lblTechnologyOnSource.setBounds(25, 66, 133, 20);

		comboTechnologyOnSource = new Combo(grpSameTechnologyFor, SWT.NONE);
		comboTechnologyOnSource.setBounds(164, 63, 133, 23);
		HashMap<String, DataStorage> mapDataStorages = Configuration.mapDataStorage;
		values = mapDataStorages.values();
		iterator = values.iterator();
		index = 0;
		selectionIndex=0;
		String strStorageTypeOnSource ="";
		while (iterator.hasNext()) {
			DataStorage dataStorage = (DataStorage) iterator.next();
			strStorageTypeOnSource= dataStorage.getName();
			comboTechnologyOnSource.add(strStorageTypeOnSource,index);
			if (DataStorage.dataStorageTypeMAT.equalsIgnoreCase(strStorageTypeOnSource)){
				selectionIndex=index;				
			}
			index++;
		}
		
		if (DataStorage.dataStorageTypeMAT!=""){
			comboTechnologyOnSource.select(selectionIndex);
			comboTechnologyOnSource.setFocus();
		}

		grpSameProductFor = new Group(shell, SWT.NONE);
		grpSameProductFor
				.setText("Same product for data storage on source and destination:");
		grpSameProductFor.setBounds(45, 358, 350, 96);

		btnSameProdDataStorageYes = new Button(grpSameProductFor, SWT.RADIO);
		btnSameProdDataStorageYes.setBounds(25, 21, 83, 16);
		btnSameProdDataStorageYes.setText("Yes");
		if (Configuration.sameDataStorageProductMAT.equalsIgnoreCase("Yes"))
			btnSameProdDataStorageYes.setSelection(true);

		btnSameProdDataStorageNo = new Button(grpSameProductFor, SWT.RADIO);
		btnSameProdDataStorageNo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				grpDatastorageProductsSpecific
						.setVisible(btnSameProdDataStorageNo.getSelection());
				grpStoredProceduresAre.setVisible(btnSameProdDataStorageNo
						.getSelection());
			}
		});
		btnSameProdDataStorageNo.setBounds(25, 43, 83, 16);
		btnSameProdDataStorageNo.setText("No");
		if (Configuration.sameDataStorageProductMAT.equalsIgnoreCase("No"))
			btnSameProdDataStorageNo.setSelection(true);

		lblProduct = new Label(grpSameProductFor, SWT.NONE);
		lblProduct.setBounds(25, 66, 118, 13);
		lblProduct.setText("Product on source:");

		comboStorageProducts = new Combo(grpSameProductFor, SWT.NONE);
		comboStorageProducts.setBounds(151, 63, 93, 23);
		HashMap<String, DataStorageProduct> mapdataStorageProducts = Configuration.mapdataStorageProducts;
		values = mapdataStorageProducts.values();
		iterator = values.iterator();
		index = 0;
		selectionIndex=0;
		String storageProductOnSource ="";
		while (iterator.hasNext()) {
			DataStorageProduct dataStorageProduct = (DataStorageProduct) iterator
					.next();			
			storageProductOnSource= dataStorageProduct.getName();
			comboStorageProducts.add(storageProductOnSource,index);
			if (DataStorageProduct.dataStorageProductMAT.equalsIgnoreCase(storageProductOnSource)){
				selectionIndex=index;				
			}
			index++;
		}
		if (DataStorageProduct.dataStorageProductMAT!=""){
			comboStorageProducts.select(selectionIndex);
			comboStorageProducts.setFocus();
		}
		
		grpDatastorageProductsSpecific = new Group(shell, SWT.NONE);
		grpDatastorageProductsSpecific
				.setText("Datastorage product's specific functions are being used?:");
		grpDatastorageProductsSpecific.setBounds(45, 460, 350, 63);

		btnDataStorageSpecificFunctionsYes = new Button(
				grpDatastorageProductsSpecific, SWT.RADIO);
		btnDataStorageSpecificFunctionsYes.setBounds(25, 21, 83, 16);
		btnDataStorageSpecificFunctionsYes.setText("Yes");
		if (Configuration.dataStorageSpecificfunctions.equalsIgnoreCase("Yes"))
			btnDataStorageSpecificFunctionsYes.setSelection(true);

		btnDataStorageSpecificFunctionsNo = new Button(
				grpDatastorageProductsSpecific, SWT.RADIO);
		btnDataStorageSpecificFunctionsNo.setBounds(25, 43, 83, 16);
		btnDataStorageSpecificFunctionsNo.setText("No");
		if (Configuration.dataStorageSpecificfunctions.equalsIgnoreCase("No"))
			btnDataStorageSpecificFunctionsNo.setSelection(true);

		grpStoredProceduresAre = new Group(shell, SWT.NONE);
		grpStoredProceduresAre.setText("Stored procedures are being used?:");
		grpStoredProceduresAre.setBounds(45, 534, 350, 106);

		btnStoredProceduresYes = new Button(grpStoredProceduresAre, SWT.RADIO);
		btnStoredProceduresYes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lblProcedureName.setVisible(btnStoredProceduresYes
						.getSelection());
				comboProcedureName.setVisible(btnStoredProceduresYes
						.getSelection());
				btnAddProcedureName.setVisible(btnStoredProceduresYes
						.getSelection());
			}
		});
		btnStoredProceduresYes.setBounds(25, 23, 83, 16);
		btnStoredProceduresYes.setText("Yes");
		if (Configuration.dataStorageStoredProcedures.equalsIgnoreCase("Yes"))
			btnStoredProceduresYes.setSelection(true);

		btnStoredProceduresNo = new Button(grpStoredProceduresAre, SWT.RADIO);
		btnStoredProceduresNo.setBounds(25, 45, 83, 16);
		btnStoredProceduresNo.setText("No");
		if (Configuration.dataStorageStoredProcedures.equalsIgnoreCase("No"))
			btnStoredProceduresNo.setSelection(true);

		lblProcedureName = new Label(grpStoredProceduresAre, SWT.NONE);
		lblProcedureName.setBounds(25, 68, 118, 15);
		lblProcedureName.setText("Procedure Name:");

		comboProcedureName = new Combo(grpStoredProceduresAre, SWT.NONE);
		comboProcedureName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				btnAddProcedureName.setEnabled(true);
			}
		});
		comboProcedureName.setBounds(151, 68, 91, 23);

		btnAddProcedureName = new Button(grpStoredProceduresAre, SWT.NONE);
		btnAddProcedureName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				comboProcedureName.add(comboProcedureName.getText());
				btnAddProcedureName.setEnabled(false);
				comboProcedureName.setFocus();
			}
		});
		btnAddProcedureName.setBounds(265, 68, 45, 25);
		btnAddProcedureName.setText("Add");

		grpBusinessLayersComponents = new Group(shell, SWT.NONE);
		grpBusinessLayersComponents.setText("Business Layer's components path");
		grpBusinessLayersComponents.setBounds(45, 79, 350, 68);

		textBusinessComponentsPath = new Text(grpBusinessLayersComponents,
				SWT.BORDER);
		textBusinessComponentsPath.setBounds(24, 26, 216, 19);

		btnPathSelection = new Button(grpBusinessLayersComponents, SWT.NONE);
		btnPathSelection.setBounds(268, 24, 38, 23);
		btnPathSelection.setText("...");

		grpSameDatastorageFramework = new Group(shell, SWT.NONE);
		grpSameDatastorageFramework
				.setText("Same framework for data storage on source and destination:");
		grpSameDatastorageFramework.setBounds(45, 256, 350, 96);

		btnSameDatastorageFrameworkYes = new Button(
				grpSameDatastorageFramework, SWT.RADIO);
		btnSameDatastorageFrameworkYes.setText("Yes");
		btnSameDatastorageFrameworkYes.setBounds(25, 20, 83, 16);
		if (Configuration.sameDataStorageFrameworkMAT.equalsIgnoreCase("Yes"))
			btnSameDatastorageFrameworkYes.setSelection(true);

		btnSameDatastorageFrameworkNo = new Button(grpSameDatastorageFramework,
				SWT.RADIO);
		btnSameDatastorageFrameworkNo.setText("No");
		btnSameDatastorageFrameworkNo.setBounds(25, 42, 83, 16);
		if (Configuration.sameDataStorageFrameworkMAT.equalsIgnoreCase("No"))
			btnSameDatastorageFrameworkNo.setSelection(true);

		labelDatastorageFrameworkOnSource = new Label(
				grpSameDatastorageFramework, SWT.NONE);
		labelDatastorageFrameworkOnSource.setText("Technology on source:");
		labelDatastorageFrameworkOnSource.setBounds(25, 66, 133, 20);

		comboDatastorageFrameworkOnSource = new Combo(
				grpSameDatastorageFramework, SWT.NONE);
		comboDatastorageFrameworkOnSource.setBounds(164, 63, 133, 23);

		HashMap<String, DataStorageFramework> mapDatastorageFrameworks = Configuration.mapDatastorageFrameworks;
		values = mapDatastorageFrameworks.values();
		iterator = values.iterator();
		index = 0;
		selectionIndex=0;
		String strStorageFrameworkOnSource ="";
		while (iterator.hasNext()) {
			DataStorageFramework dataStorageFramework = (DataStorageFramework) iterator
					.next();			
			strStorageFrameworkOnSource= dataStorageFramework.getName();
			comboDatastorageFrameworkOnSource.add(strStorageFrameworkOnSource,index);
			if (DataStorageFramework.dataStorageFrameworkMAT.equalsIgnoreCase(strStorageFrameworkOnSource)){
				selectionIndex=index;				
			}
			index++;
		}
		
		if (DataStorageFramework.dataStorageFrameworkMAT!=""){
			comboDatastorageFrameworkOnSource.select(selectionIndex);
			comboDatastorageFrameworkOnSource.setFocus();
		}
		
		btnPathSelection.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(shell, SWT.NULL);
				selectedPath = dialog.open();
				textBusinessComponentsPath.setText(selectedPath);
			}
		});
		grpSameTechnologyFor.setVisible(true);
		grpSameProductFor.setVisible(true);
		grpDatastorageProductsSpecific.setVisible(true);
		grpSameDatastorageFramework.setVisible(true);
		grpStoredProceduresAre.setVisible(true);
		grpBusinessLayersComponents.setVisible(true);
		lblProcedureName.setVisible(true);
		comboProcedureName.setVisible(true);
		btnAddProcedureName.setVisible(true);

		btnAddProcedureName.setEnabled(true);
		comboProgrammingLanguage.setVisible(true);

	}

	/**
	 * Selects and marks the methods that can be reused directly depending on
	 * user´s selection
	 */
	public void setReusableMethods() {
		String reusabilityLevel = "method";
		File folder = new File(selectedPath);
		Searcher s = new Searcher();
		ProgrammingLanguage programmingLanguage = Configuration.mapProgrammingLanguages
				.get(comboProgrammingLanguage.getText());
		s.addType(programmingLanguage.getFileExt());
		if (btnSameTechDataStorageNo.getSelection()) {
			HashMap<String, DataStorage> mapDataStorages = Configuration.mapDataStorage;
			DataStorage dataStorage = mapDataStorages
					.get(comboTechnologyOnSource.getText());
			reusabilityLevel = dataStorage.getReusabilityLevel();
			ArrayList<?> keywords = dataStorage.getKeywords();
			Iterator<?> iterator = keywords.iterator();
			while (iterator.hasNext()) {
				s.addParam(iterator.next().toString());
			}
		} else {
			if (btnSameDatastorageFrameworkNo.getSelection()) {
				HashMap<String, DataStorageFramework> mapDataStorageFrameworks = Configuration.mapDatastorageFrameworks;
				DataStorageFramework dataStorageFramework = mapDataStorageFrameworks
						.get(comboDatastorageFrameworkOnSource.getText());
				reusabilityLevel = dataStorageFramework.getReusabilityLevel();
				ArrayList<?> keywords = dataStorageFramework.getKeywords();
				Iterator<?> iterator = keywords.iterator();
				while (iterator.hasNext()) {
					s.addParam(iterator.next().toString());
				}

			} else {
				s.addParam("$$$$$$$$");
			}
		}
		try {
			s.searchInFolder(folder);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ClassExplorer ce = null;
		if (programmingLanguage.getFileExt().equalsIgnoreCase("cs"))
			ce = new CSExplorer();
		if (programmingLanguage.getFileExt().equalsIgnoreCase("java"))
			ce = new JavaExplorer();

		// ClassExplorer ce= new ClassExplorer();

		Project p = new Project();
		p.setName(folder.getPath());
		p.setBusinessPath(folder.getPath());

		System.out.println();
		System.out.println("****** Classes reutilizables totalmente");
		for (SearchResult sr : s.getNoResult()) {
			File sampleFile = new File(sr.getFileName());
			System.out.println(sr.getFileName());
			try {
				p.addSourceFile(ce.findMethodsParser(sampleFile,
						reusabilityLevel));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println();
		System.out.println("****** Classes reutilizables parcialmente");
		for (SearchResult sr : s.getResult()) {
			File sampleFile = new File(sr.getFileName());
			System.out.println(sr.getFileName());
			try {
				p.addSourceFile(ce.findMethodsParser(sampleFile,
						reusabilityLevel, sr.getLines()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		Configuration.setProjectWithReusabilityConditions(p);
	}
}
