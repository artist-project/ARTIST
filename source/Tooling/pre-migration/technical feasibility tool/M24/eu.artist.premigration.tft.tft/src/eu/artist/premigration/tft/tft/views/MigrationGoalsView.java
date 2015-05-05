/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.views;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import eu.artist.premigration.tft.tft.model.MigrationGoals;
import eu.artist.premigration.tft.tft.model.MigrationGoalsContainer;
import eu.artist.premigration.tft.tft.model.migrationstrategy.TargetPlatform;

//TODO: The tableTree widget of swt.custom library is deprecated and table population code is extremely unmaintainable.
//      Should be changed with JFace's TableTreeViewer

/**
 * Migration Goals View analyzes the MAT report and shows the migration goals in a tree structure
 * 
 * @author Burak Karaboga
 *
 */
public class MigrationGoalsView extends ViewPart {

	public static final String ID = "eu.artist.premigration.tft.tft.views.MigrationGoalsView";
	public static IFile xmlFile; 
	private Combo c1;

	/**
	 * Default Constructor
	 */
	public MigrationGoalsView() {
	}

	/**
	 * Creates technical goals under the given parent tree item
	 * 
	 * @param mGoals Migration goals model
	 * @param tg Parent tree item for the technical goals
	 */
	private void createTechnicalGoals(MigrationGoals mGoals, TreeItem tg){
		
		TreeItem ap = new TreeItem(tg, SWT.NONE);
		ap.setChecked(true);
		ap.setText(0, "Architecture and Programming");
		ap.setText(1, "");
		
		if (mGoals.getTechnicalGoals().getA_p() != null){
			
			TreeItem mpl = new TreeItem(ap, SWT.NONE);
			mpl.setChecked(true);
			mpl.setText(0, "Migrated Programing Language");
			mpl.setText(1, mGoals.getTechnicalGoals().getA_p().getMigratedProgrammingLanguage());
			TreeItem ml = new TreeItem(ap, SWT.NONE);
			ml.setChecked(true);
			ml.setText(0, "Multitenancy");
			ml.setText(1, mGoals.getTechnicalGoals().getA_p().getMultitenancy());
			TreeItem db = new TreeItem(ap, SWT.NONE);
			db.setChecked(true);
			db.setText(0, "Database Scalability Requirements");
			db.setText(1, mGoals.getTechnicalGoals().getA_p().getDatabaseScalabilityRequirements());
		}


		TreeItem sla = new TreeItem(tg, SWT.NONE);
		sla.setChecked(true);
		sla.setText(0, "SLA");
		sla.setText(1, "");
		if (mGoals.getTechnicalGoals().getSla() != null) {

			TreeItem rl = new TreeItem(sla, SWT.NONE);
			rl.setChecked(true);
			rl.setText(0, "Reliability");
			rl.setText(1, mGoals.getTechnicalGoals().getSla().getReliability().toString());
			TreeItem dl = new TreeItem(sla, SWT.NONE);
			dl.setChecked(true);
			dl.setText(0, "Data Location");
			dl.setText(1, mGoals.getTechnicalGoals().getSla().getDataLocation());
			TreeItem rs = new TreeItem(sla, SWT.NONE);
			rs.setChecked(true);
			rs.setText(0, "Response Set");
			rs.setText(1, mGoals.getTechnicalGoals().getSla().getResponseSet().toString());
		}

		TreeItem uc = new TreeItem(tg, SWT.NONE);
		uc.setChecked(true);
		uc.setText(0, "User Control and Security");
		uc.setText(1, "");
		if (mGoals.getTechnicalGoals().getU_c() != null) {
	
			TreeItem rlb = new TreeItem(uc, SWT.NONE);
			rlb.setChecked(true);
			rlb.setText(0, "Authorisation Requirements");
			rlb.setText(1, mGoals.getTechnicalGoals().getU_c().getAuthorisationRequirements());
			TreeItem dln = new TreeItem(uc, SWT.NONE);
			dln.setChecked(true);
			dln.setText(0, "Configuration Requirements");
			dln.setText(1, mGoals.getTechnicalGoals().getU_c().getConfigurationRequirements());
		}

		TreeItem iaas = new TreeItem(tg, SWT.NONE);
		iaas.setChecked(true);
		iaas.setText(0, "IAAS");
		iaas.setText(1, "");
		if (mGoals.getTechnicalGoals().getIaas() != null){
	
			TreeItem tp = new TreeItem(iaas, SWT.NONE);
			tp.setChecked(true);
			tp.setText(0, "Target Platform");
			tp.setText(1, mGoals.getTechnicalGoals().getIaas().getTargetPlatform().getName());
		}

		TreeItem iop = new TreeItem(tg, SWT.NONE);
		iop.setChecked(true);
		iop.setText(0, "Interoperability");
		iop.setText(1, "");

		if (mGoals.getTechnicalGoals().getInterop() != null){
			TreeItem req = new TreeItem(iop, SWT.NONE);
			req.setChecked(true);
			req.setText(0, "Interoperability Requirements");
			req.setText(1, mGoals.getTechnicalGoals().getInterop().getInteroperabilityRequirements());
		}

		iop.setExpanded(true);
		iaas.setExpanded(true);
		uc.setExpanded(true);
		ap.setExpanded(true);
		sla.setExpanded(true);
		tg.setExpanded(true);
	}

	/**
	 * Creates business goals under the given parent tree item
	 * 
	 * @param mGoals Migration goals model
	 * @param tg Parent tree item for the business goals
	 */
	private void createBusinessGoals(MigrationGoals mGoals, TreeItem bg) {
		TreeItem mon = new TreeItem(bg, SWT.NONE);
		mon.setChecked(true);
		mon.setText(0, "Monitoring");
		mon.setText(1, "");
		TreeItem me = new TreeItem(mon, SWT.NONE);
		me.setChecked(true);
		me.setText(0, "Measured Elements");
		me.setText(1, mGoals.getBusinessGoals().getMon().getMeasuredElements());

		TreeItem ui = new TreeItem(bg, SWT.NONE);
		ui.setChecked(true);
		ui.setText(0, "User Interface");
		ui.setText(1, "");
		TreeItem wai = new TreeItem(ui, SWT.NONE);
		wai.setChecked(true);
		wai.setText(0, "Wai Compilant");
		wai.setText(1, mGoals.getBusinessGoals().getUse().getWaiCompilant());

		TreeItem bil = new TreeItem(bg, SWT.NONE);
		bil.setChecked(true);
		bil.setText(0, "Billing");
		bil.setText(1, "");
		TreeItem rule = new TreeItem(bil, SWT.NONE);
		rule.setChecked(true);
		rule.setText(0, "Rule");
		rule.setText(1, mGoals.getBusinessGoals().getBil().getRule());

		TreeItem pro = new TreeItem(bg, SWT.NONE);
		pro.setChecked(true);
		pro.setText(0, "Provisioning");
		pro.setText(1, "");
		TreeItem lic = new TreeItem(pro, SWT.NONE);
		lic.setChecked(true);
		lic.setText(0, "License Model");
		lic.setText(1, mGoals.getBusinessGoals().getPro().getLicenseModel());

		mon.setExpanded(true);
		ui.setExpanded(true);
		bil.setExpanded(true);
		pro.setExpanded(true);
		bg.setExpanded(true);
	}

	/**
	 * Creates the table tree
	 * 
	 * @param mGoals Migration goals model
	 * @param parent Parent of the table tree
	 */
	private void createTableTree (MigrationGoals mGoals, Composite parent) {
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		Tree tableTree = new Tree(parent, SWT.CHECK | SWT.FILL);
		tableTree.setLayoutData(gridData);

		//Listener for item selection
		tableTree.addListener (SWT.Selection, new Listener () {

			private void checkUncheckChildren(TreeItem parentItem) {
				TreeItem[] items = parentItem.getItems();
				for (TreeItem treeItem : items) {
					treeItem.setChecked(parentItem.getChecked());
					if (treeItem.getItemCount() != 0) {
						checkUncheckChildren(treeItem);
					}
				}
			}
			//Handler for Check events
			public void handleEvent (Event event) {
				TreeItem parentItem = (TreeItem) event.item;
				//May also be a selection event
				if(event.detail == SWT.CHECK) {
					checkUncheckChildren(parentItem);
				}
			}
		});

		TreeColumn column1 = new TreeColumn(tableTree, SWT.LEFT);
		tableTree.setLinesVisible(true);
		column1.setAlignment(SWT.LEFT);
		column1.setText("Goals");
		column1.setWidth(160);
		TreeColumn column2 = new TreeColumn(tableTree, SWT.RIGHT);
		column2.setAlignment(SWT.LEFT);
		column2.setText("Value");
		column2.setWidth(100);

		TreeItem mg = new TreeItem(tableTree, SWT.NONE);
		mg.setChecked(true);
		mg.setText(0, "Migration Goals");
		mg.setText(1, "");

		TreeItem tg = new TreeItem(mg, SWT.NONE);
		tg.setChecked(true);
		tg.setText(0, "Technical Goals");
		tg.setText(1, "");

		TreeItem bg = new TreeItem(mg, SWT.NONE);
		bg.setChecked(true);
		bg.setText(0, "Business Goals");
		bg.setText(1, "");

		createTechnicalGoals(mGoals, tg);
		createBusinessGoals(mGoals, bg);

		mg.setExpanded(true);

		// Pack the columns
		TreeColumn[] columns = tableTree.getColumns();
		for (int i = 0, n = columns.length; i < n; i++) {
			columns[i].pack();
		}
	}

	/**
	 * Creates the combo box for the Migration Target selection
	 * 
	 * @param parent Combobox parent
	 */
	//TODO: Combobox data is hard coded, should be provided from a more appropriate source
	private void createMigrationTargetComboBox (Composite parent) {
		//		Label comboLabel = new Label(parent, SWT.NONE);
		//		comboLabel.setText("Migration Target: ");

		c1 = new Combo(parent, SWT.READ_ONLY);
		c1.setBounds(50, 50, 150, 65);
		String items[] = { "Amazon EC2", "Google Compute Engine", "Windows Azure", 
				"AWS Elastic Beanstalk", "Google App Engine", "Windows Azure Cloud Services"};
		c1.setItems(items);
		c1.select(0);
		c1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (c1.getText().equals("Google App Engine")) {
//					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform("GAE");
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform(TargetPlatform.GAE);
				}
				else if (c1.getText().equals("Windows Azure")){
//					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform("Azure");
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform(TargetPlatform.AZURE);
				}
				else if (c1.getText().equals("Amazon EC2")){
					//MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform("EC2");
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform(TargetPlatform.EC2);
				}
				
				InventoryView inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InventoryView.ID);
				if (inventoryView != null)
					inventoryView.reAnalyzeComponentsAndRefreshViewer();
			}
		});
		c1.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
	}

	@Override
	public void createPartControl(Composite parent) {

		InputStream input;
		MigrationGoals mGoals = new MigrationGoals();
		try {
			if (xmlFile != null) {
				input = new FileInputStream(xmlFile.getLocation().toOSString());
				mGoals = (MigrationGoals) JAXBContext.newInstance(MigrationGoals.class).createUnmarshaller().unmarshal(input);

				GridLayout layout = new GridLayout(2, false);
				parent.setLayout(layout);
				Label comboLabel = new Label(parent, SWT.NONE);
				comboLabel.setText("Target Platform: ");
				createMigrationTargetComboBox(parent);
				createTableTree(mGoals, parent);

				MigrationGoalsContainer.INSTANCE.setMigrationGoals(mGoals);

				//TODO: Enumerate cloud targets, fill and select them from the combo accordingly
				if (mGoals.getTechnicalGoals().getIaas().getTargetPlatform().equals(TargetPlatform.GAE)){
					c1.select(4);
//					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform("GAE");
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform(TargetPlatform.GAE);
				}
				else if (mGoals.getTechnicalGoals().getIaas().getTargetPlatform().equals(TargetPlatform.AZURE)){
					c1.select(2);
					//MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform("Azure");
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().setSelectedTargetPlatform(TargetPlatform.AZURE);
				}
			}
			else {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView(this);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public void setFocus() {
	}

}
