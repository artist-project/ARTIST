package eu.artist.postmigration.nfrvt.lang.common.renderer;

import java.util.Collection;

public interface ITextRenderer {
	public String doRender(Object obj);
	public String doRender(String leftParenthesis, String rightParenthesis, String delimiter, Object... objects);
	public String doRender(Object... objects);
	public String doRender(String leftParenthesis, String rightParenthesis, String delimiter, Collection<? extends Object> objects);
	public String doRender(Collection<? extends Object> objects);
}
