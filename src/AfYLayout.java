import java.io.Serializable;

/* 纵向布局器，和  AfColumnLayout 等效
 * 
 */
public class AfYLayout extends AfColumnLayout implements Serializable
{
	public AfYLayout()
	{		
	}
	public AfYLayout(int gap)
	{		
		super(gap);
	}
	public AfYLayout(int gap, boolean usePerferredSize)
	{	
		super(gap, usePerferredSize);
	}
}
