package eu.artist.postmigration.nfrvt.lang.common.ui;

import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;

public class ARTISTCommonPluginResourceEditorInput extends XtextReadonlyEditorInput {

	private final ARTISTCommonPluginResourceStorage storage;
	
	public ARTISTCommonPluginResourceEditorInput(ARTISTCommonPluginResourceStorage storage) {
		super(storage);
		this.storage = storage;
	}

	@Override
	public String getToolTipText() {
		 return storage.getUri().toString();
	}
}
