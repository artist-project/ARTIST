/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.Viewport;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.actions.CreateInitialStateAction;
import org.eclipse.emf.henshin.statespace.explorer.actions.EditPropertiesAction;
import org.eclipse.emf.henshin.statespace.explorer.actions.ExportStateSpaceAction;
import org.eclipse.emf.henshin.statespace.explorer.actions.ImportRulesAction;
import org.eclipse.emf.henshin.statespace.explorer.actions.MergeTerminalStatesAction;
import org.eclipse.emf.henshin.statespace.explorer.actions.ResetStateSpaceAction;
import org.eclipse.emf.henshin.statespace.explorer.edit.StateSpaceEditPart;
import org.eclipse.emf.henshin.statespace.explorer.jobs.LayoutStateSpaceJob;
import org.eclipse.emf.henshin.statespace.explorer.jobs.StateSpaceJobManager;
import org.eclipse.emf.henshin.statespace.explorer.jobs.ValidateStateSpaceJob;
import org.eclipse.emf.henshin.statespace.layout.StateSpaceSpringLayouter;
import org.eclipse.emf.henshin.statespace.impl.ShortestPathStateSpaceValidator;
import org.eclipse.emf.henshin.statespace.StateSpaceValidator;
import org.eclipse.emf.henshin.statespace.util.StateSpaceXYPlot;
import org.eclipse.emf.henshin.statespace.StateValidator;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.Validator;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Text;

/**
 * Composite for the tools menu in the state space explorer.
 * @author Christian Krause
 */
public class StateSpaceToolsMenu extends Composite {
	
	// Supported zoom levels:
	public static double[] ZOOM_LEVELS = {  .1, .15, .2, .25, .3, .35, .4, .45, .5, .55, 
											.6, .65, .7, .75, .8, .85, .9, .95, 1};
	
	public static final double REPULSION_FACTOR = 2;
	public static final double ATTRACTION_FACTOR = 0.05;
	
	public static final int NATURAL_LENGTH = 25;
	
	// State space job manager:
	private StateSpaceJobManager jobManager;

	// State space explorer instance:
	private StateSpaceExplorer explorer;

	// Labels:
	private Label statesLabel;
	private Label transitionsLabel;
	private Label rulesLabel;
		
	// ZoomManager:
	private ZoomManager zoomManager;
	private Scale zoomScale;
	
	// Canvas:
	private FigureCanvas canvas;
	
	// Scales:
	private Scale repulsionScale;
	private Scale attractionScale;
	
	// Links:
	private Link layouterLink;
	private Link explorerLink;
	private Link initialStateLink;
	private Link importLink;
	private Link resetLink;
	private Link exportLink;
	private Link propertiesLink;
	private Link mergeTerminalsLink;
	
	// Normal buttons:
	private Button validateButton;
	
	// Check buttons:
	private Button hideIndizesButton;
	private Button hideLabelsButton;
	
	// Text widget for validation property:
	private Text validationText;
	
	// Combo for choosing validator:
	private Combo validatorCombo;

	// List of registered validators.
	private List<StateSpaceValidator> validators;
	
	
	/**
	 * Default constructor
	 * @param parent Parent composite.
	 */
	public StateSpaceToolsMenu(Composite parent) {
		super(parent, SWT.NONE);
		init();
	}
	
	/*
	 * Initialize the menu.
	 */
	private void init() {
		
		setLayout(new FillLayout());
		
		// Create expand bar:
		ExpandBar bar = new ExpandBar(this, SWT.V_SCROLL);
		
		// The details group:
		Composite details = StateSpaceToolsMenuFactory.newExpandItemComposite(bar,2);
		statesLabel = StateSpaceToolsMenuFactory.newDoubleLabel(details, "States:", "0");
		transitionsLabel = StateSpaceToolsMenuFactory.newDoubleLabel(details, "Transitions:", "0");
		rulesLabel = StateSpaceToolsMenuFactory.newDoubleLabel(details, "Rules:", "0");
		StateSpaceToolsMenuFactory.newExpandItem(bar, details, "Details", 0);
		
		// The tasks group:
		Composite tasks = StateSpaceToolsMenuFactory.newExpandItemComposite(bar,2);
		layouterLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Start layouter</a>");
		initialStateLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>New initial state</a>");
		explorerLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Start explorer</a>");
		importLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Import rules</a>");
		resetLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Reset state space</a>");
		exportLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Export state space</a>");		
		propertiesLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Edit properties</a>");
		mergeTerminalsLink = StateSpaceToolsMenuFactory.newLink(tasks, "<a>Merge terminal states</a>");
		StateSpaceToolsMenuFactory.newExpandItem(bar, tasks, "Tasks", 1);

		// The display group:
		Composite display = StateSpaceToolsMenuFactory.newExpandItemComposite(bar,3);
		StateSpaceToolsMenuFactory.newLabel(display, "Zoom: " + (int) (ZOOM_LEVELS[0]*100) + "%", GridData.HORIZONTAL_ALIGN_END);
		zoomScale = new Scale(display, SWT.NONE);
		zoomScale.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		zoomScale.setEnabled(false);
		zoomScale.setIncrement(1);
		zoomScale.setPageIncrement(2);
		zoomScale.setMinimum(0);
		zoomScale.setMaximum(ZOOM_LEVELS.length-1);
		zoomScale.setSelection(ZOOM_LEVELS.length-1);
		StateSpaceToolsMenuFactory.newLabel(display, (int) (ZOOM_LEVELS[ZOOM_LEVELS.length-1]*100) + "%", GridData.HORIZONTAL_ALIGN_BEGINNING);
		repulsionScale = StateSpaceToolsMenuFactory.newScale(display, "Repulsion:", 1, 100, 5, 10, false, null);
		attractionScale = StateSpaceToolsMenuFactory.newScale(display, "Attraction:", 1, 100, 5, 10, false, null);
		Composite chks = new Composite(display, SWT.NONE);
		chks.setLayout(new GridLayout(3, false));
		hideIndizesButton = new Button(chks, SWT.CHECK);
		hideIndizesButton.setText("Hide indizes");
		hideLabelsButton = new Button(chks, SWT.CHECK);
		hideLabelsButton.setText("Hide labels");
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		data.horizontalSpan = 3;
		chks.setLayoutData(data);
		StateSpaceToolsMenuFactory.newExpandItem(bar, display, "Display", 2);

		// The validation group:
		Composite validation = StateSpaceToolsMenuFactory.newExpandItemComposite(bar,2);
		validationText = StateSpaceToolsMenuFactory.newMultiText(validation, 2, 80);
		validatorCombo = new Combo(validation, SWT.BORDER);
		validatorCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		validateButton = StateSpaceToolsMenuFactory.newButton(validation, "Run");
		StateSpaceToolsMenuFactory.newExpandItem(bar, validation, "Validation", 3);

		initControlsData();
		setEnabled(false);
		
	}
	
	/*
	 * Initialize the controls with their required data.
	 */
	private void initControlsData() {
		
		// Load the validators. We make new instances.
		validators = new ArrayList<StateSpaceValidator>();
		String lastId = null; // getPreferenceStore().getString(VALIDATOR_KEY);
		Validator lastValidator = null;
		for (Validator validator : StateSpacePlugin.INSTANCE.getValidators().values()) {
			if (lastId!=null && StateSpacePlugin.INSTANCE.getValidators().get(lastId)==validator) {
				lastValidator = validator;
			}
			try {
				Validator old = validator;
				validator = validator.getClass().newInstance();
				if (lastValidator==old) lastValidator = validator;
			} catch (Throwable t) {
				StateSpaceExplorerPlugin.getInstance().logError("Validator cannot be reinstantiated", t);
			}
			
			if (validator instanceof StateSpaceValidator) {			
				validators.add((StateSpaceValidator) validator);
			} else {
				validators.add(new ShortestPathStateSpaceValidator((StateValidator) validator));
			}
			
		}
		Collections.sort(validators, new Comparator<Validator>() {
			public int compare(Validator v1, Validator v2) {
				String n1 = v1.getName();
				String n2 = v2.getName();
				return (n1!=null && n2!=null) ? n1.compareTo(n2) : 0;
			}
		});
		validatorCombo.add("");
		for (Validator current : validators) {
			validatorCombo.add(current.getName());
		}
		validatorCombo.select(0);
		
		// Validation property:
		String property = ""; // getPreferenceStore().getString(VALIDATION_PROPERTY_KEY);
		validationText.setText(property!=null ? property : "");
		validationText.setEnabled(getActiveValidator()!=null && getActiveValidator().usesProperty());
		
	}	
	
	/*
	 * Update the layouter properties.
	 */
	private void updateLayouterProperties() {
		
		// Get the layouter:
		if (jobManager==null) return;
		LayoutStateSpaceJob layoutJob = jobManager.getLayoutJob();
		StateSpaceSpringLayouter layouter = layoutJob.getLayouter();
		StateSpace stateSpace = explorer.getStateSpaceManager().getStateSpace();
		
		// Set basic properties:
		layouter.setStateRepulsion(((double) stateSpace.getLayoutStateRepulsion()+10) * REPULSION_FACTOR);
		layouter.setTransitionAttraction(((double) stateSpace.getLayoutTransitionAttraction()+40) * ATTRACTION_FACTOR);
		layouter.setNaturalTransitionLength(NATURAL_LENGTH);

		double zoom = ZOOM_LEVELS[stateSpace.getLayoutZoomLevel() * (ZOOM_LEVELS.length-1) / 100];
		if (zoomManager!=null) {
			zoomManager.setZoom(zoom);
		}

		// Set the center:
		if (canvas!=null) {
			Viewport port = canvas.getViewport();
			double x = (port.getHorizontalRangeModel().getValue() + (port.getHorizontalRangeModel().getExtent() / 2)) / zoom;
			double y = (port.getVerticalRangeModel().getValue() + (port.getVerticalRangeModel().getExtent() / 2)) / zoom;
			layouter.setCenter(new double[] {x,y});
		} else {
			layouter.setCenter(null);
		}		
		
	}
	
	private void commitMetadata() {
		boolean hideIndizes = hideIndizesButton.getSelection();
		boolean hideLabels = hideLabelsButton.getSelection();
		StateSpace stateSpace = explorer.getStateSpaceManager().getStateSpace();
		stateSpace.setLayoutZoomLevel((zoomScale.getSelection()+1) * 100 / ZOOM_LEVELS.length);
		stateSpace.setLayoutStateRepulsion(repulsionScale.getSelection());
		stateSpace.setLayoutTransitionAttraction(attractionScale.getSelection());
		stateSpace.setLayoutHideIndizes(hideIndizes);
		stateSpace.setLayoutHideLabels(hideLabels);
	}

	/**
	 * Refresh the tools menu content.
	 */
	public void refresh() {
		if (isDisposed()) return;
		if (jobManager==null) {
			statesLabel.setText("0");
			transitionsLabel.setText("0");
			rulesLabel.setText("0");
		} else {
			StateSpace stateSpace = jobManager.getStateSpaceManager().getStateSpace();
			statesLabel.setText(stateSpace.getStateCount() + " (" + stateSpace.getOpenStates().size() + " open)");
			transitionsLabel.setText(stateSpace.getTransitionCount() + "");
			rulesLabel.setText(stateSpace.getRules().size() + "");
			hideIndizesButton.setSelection(stateSpace.isLayoutHideIndizes());
			hideLabelsButton.setSelection(stateSpace.isLayoutHideLabels());
		}
	}
	
	private void updateScales() {
		StateSpace stateSpace = jobManager.getStateSpaceManager().getStateSpace();
		zoomScale.setSelection(stateSpace.getLayoutZoomLevel() * ZOOM_LEVELS.length / 100);
		repulsionScale.setSelection(stateSpace.getLayoutStateRepulsion());
		attractionScale.setSelection(stateSpace.getLayoutTransitionAttraction());		
	}
	
	/**
	 * Set the job manager to be used.
	 * @param manager Job manager.
	 */
	public void setJobManager(StateSpaceJobManager jobManager) {
		if (this.jobManager!=null) removeListeners();
		this.jobManager = jobManager;
		setEnabled(jobManager!=null);
		refresh();
		updateScales();
		if (jobManager!=null) addListeners();
	}	
	
	/**
	 * Enable or disable this menu.
	 */
	public void setEnabled(boolean enabled) {
		initialStateLink.setEnabled(enabled);
		importLink.setEnabled(enabled);
		resetLink.setEnabled(enabled);
		propertiesLink.setEnabled(enabled);
		layouterLink.setEnabled(enabled);
		explorerLink.setEnabled(enabled);
		exportLink.setEnabled(enabled);
		mergeTerminalsLink.setEnabled(enabled);
		repulsionScale.setEnabled(enabled);
		attractionScale.setEnabled(enabled);
		validateButton.setEnabled(enabled);
		validatorCombo.setEnabled(enabled);
		validationText.setEnabled(enabled);
		hideIndizesButton.setEnabled(enabled);
		hideLabelsButton.setEnabled(enabled);
	}
	
	/**
	 * Set the zoom manager to be used.
	 * @param zoomManager Zoom manager.
	 */
	public void setZoomManager(ZoomManager zoomManager) {
		this.zoomManager = zoomManager;
		zoomScale.setEnabled(zoomManager!=null);
		if (zoomManager!=null) {
			zoomManager.setZoomLevels(ZOOM_LEVELS);
			zoomManager.setZoomAnimationStyle(ZoomManager.ANIMATE_ZOOM_IN_OUT);
		}
	}
	
	/**
	 * Set the used figure canvas for the explorer.
	 * @param canvas Figure canvas.
	 */
	public void setCanvas(FigureCanvas canvas) {
		this.canvas = canvas;
		canvas.getHorizontalBar().addSelectionListener(scrollBarListener);
		canvas.getVerticalBar().addSelectionListener(scrollBarListener);
		canvas.addListener(SWT.Resize, canvasListener);
	}
	
	/**
	 * Set the state space explorer to be used.
	 * @param explorer Explorer instance.
	 */
	public void setExplorer(StateSpaceExplorer explorer) {
		this.explorer = explorer;
	}
	
	/*
	 * Called when the validation job has finished.
	 */
	private void validationFinished(ValidationResult result, IStatus status) {
		if (status.isOK() && result!=null) {
			if (result.getResult() instanceof Path && explorer!=null) {
				explorer.selectPath((Path) result.getResult());
			}
			if (result.isValid()) {
				if (result.getResult() instanceof StateSpaceXYPlot) {
					String title = getActiveValidator().getName() + " Plot";
					new StateSpaceXYPlotDialog(getShell(), (StateSpaceXYPlot) result.getResult(), title).open();
				} else {
					MessageDialog.openInformation(getShell(), "Validation", result.getMessage());
				}
			} else {
				MessageDialog.openError(getShell(), "Validation", result.getMessage());					
			}
		}
		validateButton.setEnabled(true);		
	}

	private StateSpaceValidator getActiveValidator() {
		int index = validatorCombo.getSelectionIndex()-1;
		return (index>=0) ? validators.get(index) : null;
	}

	// ------------------- //
	// ---- LISTENERS ---- // 
	// ------------------- //
	
	/*
	 * Add all listeners.
	 */
	private void addListeners() {
		jobManager.getStateSpaceManager().getStateSpace().eAdapters().add(adapter);
		repulsionScale.addSelectionListener(layouterScaleListener);
		attractionScale.addSelectionListener(layouterScaleListener);
		zoomScale.addSelectionListener(zoomListener);
		explorerLink.addSelectionListener(explorerListener);
		layouterLink.addSelectionListener(layouterListener);
		initialStateLink.addSelectionListener(initialStateListener);
		importLink.addSelectionListener(importListener);
		exportLink.addSelectionListener(exportListener);
		resetLink.addSelectionListener(resetListener);
		propertiesLink.addSelectionListener(propertiesListener);
		mergeTerminalsLink.addSelectionListener(mergeTerminalsListener);
		validateButton.addSelectionListener(validateListener);
		hideIndizesButton.addSelectionListener(hideLabelsListener);
		hideLabelsButton.addSelectionListener(hideLabelsListener);
		
		addLinkJobListener(jobManager.getLayoutJob(), layouterLink);
		addLinkJobListener(jobManager.getExploreJob(), explorerLink);
		final ValidateStateSpaceJob validateJob = jobManager.getValidateJob();
		addButtonJobListener(validateJob, validateButton);
		validateJob.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						validationFinished(validateJob.getValidationResult(), event.getResult());
					}
				});
			}			
		});
	}
	
	/*
	 * Remove all listeners.
	 */
	private void removeListeners() {
		jobManager.getStateSpaceManager().getStateSpace().eAdapters().remove(adapter);	
		repulsionScale.removeSelectionListener(layouterScaleListener);
		attractionScale.removeSelectionListener(layouterScaleListener);
		zoomScale.removeSelectionListener(zoomListener);
		initialStateLink.removeSelectionListener(initialStateListener);
		importLink.removeSelectionListener(importListener);
		exportLink.removeSelectionListener(exportListener);
		propertiesLink.removeSelectionListener(propertiesListener);
		resetLink.removeSelectionListener(resetListener);
		explorerLink.removeSelectionListener(explorerListener);
		layouterLink.removeSelectionListener(layouterListener);
		mergeTerminalsLink.removeSelectionListener(mergeTerminalsListener);
		validateButton.removeSelectionListener(validateListener);
		hideIndizesButton.removeSelectionListener(hideLabelsListener);
		hideLabelsButton.removeSelectionListener(hideLabelsListener);
	}
	
	/*
	 *  State space adapter.
	 */
	private Adapter adapter = new AdapterImpl() {
		  public void notifyChanged(Notification event) {
			  refresh();
		  }
	};
	
	/*
	 * Selection listeners for layouter scales.
	 */
	private SelectionListener layouterScaleListener = new SelectionListener() {
		public void widgetDefaultSelected(SelectionEvent e) {
			commitMetadata();
			updateLayouterProperties();
		}
		public void widgetSelected(SelectionEvent e) {
			commitMetadata();
			updateLayouterProperties();
		}
	};

	
	/*
	 * Selection listeners for the scroll bars.
	 */
	private SelectionListener scrollBarListener = new SelectionListener() {
		public void widgetDefaultSelected(SelectionEvent e) {
			updateLayouterProperties();
		}
		public void widgetSelected(SelectionEvent e) {
			updateLayouterProperties();
		}
	};

	
	/*
	 * Canvas listener.
	 */
	private Listener canvasListener = new Listener() {
		public void handleEvent(Event event) {
			updateLayouterProperties();
		}
	};
	
	/*
	 * Zoom listener.
	 */
	private SelectionListener zoomListener = new SelectionListener() {
		public void widgetSelected(SelectionEvent e) {
			commitMetadata();
			updateLayouterProperties();
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Hide-labels listener.
	 */
	private SelectionListener hideLabelsListener = new SelectionListener() {
		public void widgetSelected(SelectionEvent e) {
			commitMetadata();
			if (explorer!=null) {
				RootEditPart root = explorer.getGraphicalViewer().getRootEditPart();
				((StateSpaceEditPart) root.getChildren().get(0)).refreshLabels();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * New initial state link listener.
	 */
	private SelectionListener initialStateListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (explorer!=null) {
				CreateInitialStateAction action = new CreateInitialStateAction();
				action.setExplorer(explorer);
				action.run(null);
				refresh();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Import rules link listener.
	 */
	private SelectionListener importListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (explorer!=null) {
				ImportRulesAction action = new ImportRulesAction();
				action.setExplorer(explorer);
				action.run(null);
				refresh();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Export state space link listener.
	 */
	private SelectionListener exportListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (explorer!=null) {
				ExportStateSpaceAction action = new ExportStateSpaceAction();
				action.setExplorer(explorer);
				action.run(null);
				refresh();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Reset link listener.
	 */
	private SelectionListener resetListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (explorer!=null) {
				ResetStateSpaceAction action = new ResetStateSpaceAction();
				action.setExplorer(explorer);
				action.run(null);
				refresh();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Properties link listener.
	 */
	private SelectionListener propertiesListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (explorer!=null) {
				EditPropertiesAction action = new EditPropertiesAction();
				action.setExplorer(explorer);
				action.run(null);
				refresh();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Merge terminals link listener.
	 */
	private SelectionListener mergeTerminalsListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (explorer!=null) {
				MergeTerminalStatesAction action = new MergeTerminalStatesAction();
				action.setExplorer(explorer);
				action.run(null);
				refresh();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Explorer link listener.
	 */
	private SelectionListener explorerListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (jobManager==null) return;			
			if (explorerLink.getText().indexOf("Start")>=0) {
				jobManager.startExploreJob();
				explorerLink.setText(explorerLink.getText().replaceFirst("Start","Stop"));
			} else {
				jobManager.getExploreJob().cancel();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Layouter link listener.
	 */
	private SelectionListener layouterListener = new SelectionListener() {
		public void widgetSelected(SelectionEvent e) {
			if (jobManager==null) return;
			if (layouterLink.getText().indexOf("Start")>=0) {
				updateLayouterProperties();
				jobManager.startLayoutJob();
				layouterLink.setText(layouterLink.getText().replaceFirst("Start","Stop"));
			} else {
				jobManager.stopLayoutJob();
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

	/*
	 * Validate checkbox listener.
	 */
	private SelectionListener validateListener = new SelectionListener() {			
		public void widgetSelected(SelectionEvent e) {
			if (jobManager==null || getActiveValidator()==null) return;			
			validateButton.setEnabled(false);
			jobManager.getValidateJob().setProperty(validationText.getText());
			jobManager.getValidateJob().setValidator(getActiveValidator());
			jobManager.startValidateJob();
		}
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	};

	/*
	 * Add a job listener for a (check-box) button.
	 */
	private void addButtonJobListener(Job job, final Button checkbox) {
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (checkbox!=null && !checkbox.isDisposed()) {
							checkbox.setEnabled(true);    // normal buttons
							checkbox.setSelection(false); // check-boxes
						}
					}
				});
			}
		});
	}

	/*
	 * Add a job listener for a link.
	 */
	private void addLinkJobListener(Job job, final Link link) {
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						refresh();
						link.setText(link.getText().replaceFirst("Stop","Start"));
					}
				});
			}
		});		
	}

}
