

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class JavaService

{
	// ---( internal utility methods )---

	final static JavaService _instance = new JavaService();

	static JavaService _newInstance() { return new JavaService(); }

	static JavaService _cast(Object o) { return (JavaService)o; }

	// ---( server methods )---




	public static final void replaceSpecialChars (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceSpecialChars)>> ---
		// @sigtype java 3.5
		// [i] field:0:required text
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	text = IDataUtil.getString( pipelineCursor, "text" );
		pipelineCursor.destroy();
		
		String result = text.replaceAll("[^a-zA-Z0-9]", "~");
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result);
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void sleep (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sleep)>> ---
		// @sigtype java 3.5
		// [i] field:0:required sleep
		//pipeline for reading input
		IDataCursor pipelinecursor = pipeline.getCursor();
		int time = Integer.parseInt(IDataUtil.getString(pipelinecursor,"sleep"));
		try
		{
				Thread.sleep(time*1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
			
		// --- <<IS-END>> ---

                
	}
}

