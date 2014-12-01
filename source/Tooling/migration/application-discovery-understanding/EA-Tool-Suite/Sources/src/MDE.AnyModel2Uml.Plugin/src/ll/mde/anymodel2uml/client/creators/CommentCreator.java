package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

public class CommentCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
      Comment newComment = parent.createOwnedComment();
      newComment.setBody(objectToCreate.getProperty("Documentation"));
      
      return newComment;
    }

}
