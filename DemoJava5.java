public interface DemoJava5
{
	public void doProcess();
	
	public void exitProcess();

}
public class DemoIntra implements DemoJava5
{
	public void doProcess(){
	 
	 sysout("this is starting the process");
	}
	public void exitProcess(){
	
	   sysout("this is exit the process");
	}
}