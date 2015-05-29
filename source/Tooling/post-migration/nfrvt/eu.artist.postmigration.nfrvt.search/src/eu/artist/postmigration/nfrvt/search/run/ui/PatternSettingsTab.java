/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.search.run.ui;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import eu.artist.postmigration.nfrvt.search.MigrationExplorerActivator;

public class PatternSettingsTab extends AbstractLaunchConfigurationTab {
	
//	protected VerifyListener integerVerification = new VerifyListener() {
//		@Override
//		public void verifyText(VerifyEvent e) {
//			e.doit = e.text.isEmpty() || getInteger(e.text) != null;
//		}
//	};
//	
//	protected VerifyListener doubleVerification = new VerifyListener() {
//		@Override
//		public void verifyText(VerifyEvent e) {
//			e.doit = e.text.isEmpty() || getDouble(e.text) != null;
//		}
//	};
	
	protected ModifyListener updateModification = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			setErrorMessage(null);		
			setMessage(null);
			updateLaunchConfigurationDialog();
		}
	};
	
	protected String name = "Pattern Settings";
	protected Text fixedScalingMinimum;
	protected Text fixedScalingMaximum;
	
	protected Text autoScalingMinimumMinimum;
	protected Text autoScalingMinimumMaximum;
	protected Text autoScalingMaximumMinimum;
	protected Text autoScalingMaximumMaximum;
	
	protected Text speedUpInstance;
	protected Text speedUpCache;
	
	protected Text pricingCache;
	protected Text pricingInstance;

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_VERTICAL));

		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 8;
		composite.setLayout(layout);

		createMainControls(composite);
		setControl(composite);
	}

	protected void createMainControls(Composite parent) {
		Group scalingGroup = new Group(parent, SWT.SHADOW_NONE);
		scalingGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
		{	// block to avoid name collisions
			GridLayout layout = new GridLayout(1, false);
			layout.marginTop = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.marginBottom = 0;
			layout.verticalSpacing = 0;
			layout.horizontalSpacing = 0;
			scalingGroup.setLayout(layout);
		}
		scalingGroup.setText("Scaling");
		
		Composite scaling = new Composite(scalingGroup, SWT.NONE);
		scaling.setLayoutData (new GridData(SWT.FILL, SWT.FILL, true, false));
		scaling.setLayout(new GridLayout(4, false));	
		
		{
			Label fixedScalingLabel = new Label(scaling, SWT.LEFT);
			fixedScalingLabel.setText("FixedScaling:");
			fixedScalingLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			fixedScalingMinimum = new Text(scaling, SWT.LEFT | SWT.BORDER);
			fixedScalingMinimum.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));	
//			fixedScalingMinimum.addVerifyListener(integerVerification);
			fixedScalingMinimum.addModifyListener(updateModification);
			
			Label dashLabel = new Label(scaling, SWT.LEFT);
			dashLabel.setText("-");
			dashLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			fixedScalingMaximum = new Text(scaling, SWT.LEFT | SWT.BORDER);
			fixedScalingMaximum.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));	
//			fixedScalingMaximum.addVerifyListener(integerVerification);
			fixedScalingMaximum.addModifyListener(updateModification);
		}
		{
			Label autoScalingLabel = new Label(scaling, SWT.LEFT);
			autoScalingLabel.setText("AutoScaling:");
			autoScalingLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			{
				Composite minimum = new Composite(scaling, SWT.NONE);
				minimum.setLayoutData (new GridData(SWT.FILL, SWT.FILL, true, false));
				minimum.setLayout(new GridLayout(3, false));
				
				autoScalingMinimumMinimum = new Text(minimum, SWT.BEGINNING | SWT.BORDER);
				autoScalingMinimumMinimum.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));
//				autoScalingMinimumMinimum.addVerifyListener(integerVerification);
				autoScalingMinimumMinimum.addModifyListener(updateModification);
				
				Label dashLabel = new Label(minimum, SWT.LEFT);
				dashLabel.setText("-");
				dashLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
				
				autoScalingMinimumMaximum = new Text(minimum, SWT.BEGINNING | SWT.BORDER);
				autoScalingMinimumMaximum.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));
//				autoScalingMinimumMaximum.addVerifyListener(integerVerification);
				autoScalingMinimumMaximum.addModifyListener(updateModification);
			}
			
			Label dashLabel = new Label(scaling, SWT.LEFT);
			dashLabel.setText("-");
			dashLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			{
				Composite minimum = new Composite(scaling, SWT.NONE);
				minimum.setLayoutData (new GridData(SWT.FILL, SWT.FILL, true, false));
				minimum.setLayout(new GridLayout(3, false));
				
				autoScalingMaximumMinimum = new Text(minimum, SWT.BEGINNING | SWT.BORDER);
				autoScalingMaximumMinimum.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));
//				autoScalingMaximumMinimum.addVerifyListener(integerVerification);
				autoScalingMaximumMinimum.addModifyListener(updateModification);
				
				Label dashMaxLabel = new Label(minimum, SWT.LEFT);
				dashMaxLabel.setText("-");
				dashMaxLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
				
				autoScalingMaximumMaximum = new Text(minimum, SWT.BEGINNING | SWT.BORDER);
				autoScalingMaximumMaximum.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));
//				autoScalingMaximumMaximum.addVerifyListener(integerVerification);
				autoScalingMaximumMaximum.addModifyListener(updateModification);
			}
		}		
	
		Group speedUpGroup = new Group(parent, SWT.SHADOW_NONE);
		speedUpGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
		{	// block to avoid name collisions
			GridLayout layout = new GridLayout(1, false);
			layout.marginTop = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.marginBottom = 0;
			layout.verticalSpacing = 0;
			layout.horizontalSpacing = 0;
			speedUpGroup.setLayout(layout);
		}
		speedUpGroup.setText("SpeedUp");
		
		Composite speedUp = new Composite(speedUpGroup, SWT.NONE);
		speedUp.setLayoutData (new GridData(SWT.FILL, SWT.FILL, true, false));
		speedUp.setLayout(new GridLayout(2, false));
		{
			Label cacheSpeedUpLabel = new Label(speedUp, SWT.LEFT);
			cacheSpeedUpLabel.setText("Default Cache SpeedUp:");
			cacheSpeedUpLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			speedUpCache = new Text(speedUp, SWT.BEGINNING | SWT.BORDER);
			speedUpCache.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));	
//			speedUpCache.addVerifyListener(doubleVerification);
			speedUpCache.addModifyListener(updateModification);
		}
		{
			Label instanceSpeedUpLabel = new Label(speedUp, SWT.LEFT);
			instanceSpeedUpLabel.setText("Default Instance SpeedUp:");
			instanceSpeedUpLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			speedUpInstance = new Text(speedUp, SWT.BEGINNING | SWT.BORDER);
			speedUpInstance.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));	
//			speedUpInstance.addVerifyListener(doubleVerification);
			speedUpInstance.addModifyListener(updateModification);
		}
		
		Group pricingGroup = new Group(parent, SWT.SHADOW_NONE);
		pricingGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
		{	// block to avoid name collisions
			GridLayout layout = new GridLayout(1, false);
			layout.marginTop = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.marginBottom = 0;
			layout.verticalSpacing = 0;
			layout.horizontalSpacing = 0;
			pricingGroup.setLayout(layout);
		}
		pricingGroup.setText("Pricing");
		
		Composite pricing = new Composite(pricingGroup, SWT.NONE);
		pricing.setLayoutData (new GridData(SWT.FILL, SWT.FILL, true, false));
		pricing.setLayout(new GridLayout(2, false));
		{
			Label cacheCostLabel = new Label(pricing, SWT.LEFT);
			cacheCostLabel.setText("Estimated Cache Cost per Time Unit:");
			cacheCostLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			pricingCache = new Text(pricing, SWT.BEGINNING | SWT.BORDER);
			pricingCache.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));	
//			pricingCache.addVerifyListener(doubleVerification);
			pricingCache.addModifyListener(updateModification);
		}
		{
			Label instanceCostLabel = new Label(pricing, SWT.LEFT);
			instanceCostLabel.setText("Estimated Instance Cost per Time Unit:");
			instanceCostLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
			
			pricingInstance = new Text(pricing, SWT.BEGINNING | SWT.BORDER);
			pricingInstance.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));	
//			pricingInstance.addVerifyListener(doubleVerification);
			pricingInstance.addModifyListener(updateModification);
		}
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		Integer fixedScalingMin = getFixedScalingMinimum();
		Integer fixedScalingMax = getFixedScalingMaximum();
		
		Integer autoScalingMinMin = getAutoScalingMinimumMinimum();
		Integer autoScalingMinMax = getAutoScalingMinimumMaximum();
		Integer autoScalingMaxMin = getAutoScalingMaximumMinimum();
		Integer autoScalingMaxMax = getAutoScalingMaximumMaximum();
		
		Double speedUpCache = getSpeedUpCache();
		Double speedUpInstance = getSpeedUpInstance();
		
		Double pricingCache = getPricingCache();
		Double pricingInstance = getPricingInstance();
		
		if(fixedScalingMin == null || fixedScalingMin < 2) {
			setErrorMessage("Provide a valid minimum for fixed scaling (>= 2).");
			return false;
		} else if(fixedScalingMax == null || fixedScalingMax <= fixedScalingMin) {
			setErrorMessage("Provide a valid maximum for fixed scaling (> minScaling).");
			return false;
		} else if(autoScalingMinMin == null || autoScalingMinMin < 1) {
			setErrorMessage("Provide a valid minimum minimum for auto scaling (>= 1).");
			return false;
		} else if(autoScalingMinMax == null || autoScalingMinMax <= autoScalingMinMin) {
			setErrorMessage("Provide a valid minimum maximum for auto scaling (> minScaling).");
			return false;
		} else if(autoScalingMaxMin == null || autoScalingMaxMin <= 1) {
			setErrorMessage("Provide a valid maximum minimum for auto scaling (> 1).");
			return false;
		} else if(autoScalingMaxMax == null || autoScalingMaxMax <= autoScalingMaxMin) {
			setErrorMessage("Provide a valid maximum maximum for auto scaling (> minScaling).");
			return false;
		} else if(speedUpCache == null || speedUpCache <= 0.0) {
			setErrorMessage("Provide a valid speedup for caching (> 0.0).");
			return false;
		} else if(speedUpInstance == null || speedUpInstance <= 0.0) {
			setErrorMessage("Provide a valid speedup for instances (> 0.0).");
			return false;
		} else if(pricingCache == null || pricingCache <= 0.0) {
			setErrorMessage("Provide a valid pricing for caching (> 0.0).");
			return false;
		} else if(pricingInstance == null || pricingInstance <= 0.0) {
			setErrorMessage("Provide a valid pricing for instances (> 0.0).");
			return false;
		} else {
			setErrorMessage(null);
			setMessage(null);
			return super.isValid(launchConfig);
		}
	}

	protected Integer getInteger(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	public Integer getFixedScalingMinimum() {
		return getInteger(fixedScalingMinimum.getText().trim());
	}
	
	public Integer getFixedScalingMaximum() {
		return getInteger(fixedScalingMaximum.getText().trim());
	}
	
	public Integer getAutoScalingMinimumMinimum() {
		return getInteger(autoScalingMinimumMinimum.getText().trim());
	}
	
	public Integer getAutoScalingMinimumMaximum() {
		return getInteger(autoScalingMinimumMaximum.getText().trim());
	}
	
	public Integer getAutoScalingMaximumMinimum() {
		return getInteger(autoScalingMaximumMinimum.getText().trim());
	}
	
	public Integer getAutoScalingMaximumMaximum() {
		return getInteger(autoScalingMaximumMaximum.getText().trim());
	}
	
	protected Double getDouble(String text) {
		try {
			return Double.parseDouble(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	public Double getSpeedUpCache() {
		return getDouble(speedUpCache.getText().trim());
	}
	
	public Double getSpeedUpInstance() {
		return getDouble(speedUpInstance.getText().trim());
	}
	
	public Double getPricingCache() {
		return getDouble(pricingCache.getText().trim());
	}
	
	public Double getPricingInstance() {
		return getDouble(pricingInstance.getText().trim());
	}
	
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_FIXED_MIN, 
				"" + getFixedScalingMinimum());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_FIXED_MAX,
				"" + getFixedScalingMaximum());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MIN,
				"" + getAutoScalingMinimumMinimum());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MAX,
				"" + getAutoScalingMinimumMaximum());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MIN,
				"" + getAutoScalingMaximumMinimum());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MAX,
				"" + getAutoScalingMaximumMaximum());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_CACHE,
				"" + getSpeedUpCache());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_INSTANCE,
				"" + getSpeedUpInstance());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_PRICE_CACHE,
				"" + getPricingCache());
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_PRICE_INSTANCE,
				"" + getPricingInstance());
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_FIXED_MIN, "2");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_FIXED_MAX, "5");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MIN, "1");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MAX, "5");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MIN, "3");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MAX, "7");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_CACHE, "1.0");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_INSTANCE, "0.9");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_PRICE_CACHE, "0.0015");
		configuration.setAttribute(MigrationExplorerActivator.ATT_PATTERN_PRICE_INSTANCE, " 0.0010");
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		String fixedScalingMin = "";
		String fixedScalingMax = "";
		String autoScalingMinMin = "";
		String autoScalingMinMax = "";
		String autoScalingMaxMin = "";
		String autoScalingMaxMax = "";
		
		String defaultSpeedUpCache = "";
		String defaultSpeedUpInstance = "";
		
		String priceCache = "";
		String priceInstance = "";

		try {
			fixedScalingMin = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_FIXED_MIN, "");
			fixedScalingMax = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_FIXED_MAX, "");
			autoScalingMinMin = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MIN, "");
			autoScalingMinMax = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MAX, "");
			autoScalingMaxMin = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MIN, "");
			autoScalingMaxMax = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MAX, "");
			
			defaultSpeedUpCache = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_CACHE, "");
			defaultSpeedUpInstance = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_INSTANCE, "");
			
			priceCache = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_PRICE_CACHE, "");
			priceInstance = configuration.getAttribute(MigrationExplorerActivator.ATT_PATTERN_PRICE_INSTANCE, "");
		} catch (CoreException e) {
		}
		
		fixedScalingMaximum.setText(fixedScalingMax);
		fixedScalingMinimum.setText(fixedScalingMin);
		autoScalingMinimumMinimum.setText(autoScalingMinMin);
		autoScalingMinimumMaximum.setText(autoScalingMinMax);
		autoScalingMaximumMinimum.setText(autoScalingMaxMin);
		autoScalingMaximumMaximum.setText(autoScalingMaxMax);
		
		speedUpCache.setText(defaultSpeedUpCache);
		speedUpInstance.setText(defaultSpeedUpInstance);
		
		pricingCache.setText(priceCache);
		pricingInstance.setText(priceInstance);
	}
	
	@Override
	public Image getImage() {
		URL imgUrl = MigrationExplorerActivator.getDefault().getBundle().getEntry("icons/PatternSettings.gif");
		if(imgUrl != null) {
			ImageDescriptor id = null;
			Image result = MigrationExplorerActivator.getDefault().getImageRegistry().get(imgUrl.toExternalForm());
			if (result == null) {
				id = ImageDescriptor.createFromURL(imgUrl);
				if (id != null) {
					result = id.createImage();
					MigrationExplorerActivator.getDefault().getImageRegistry().put(imgUrl.toExternalForm(), result);
				}
			}
			return result;
		}
		return null;
	}

}
