import Animal;

public class Tiger implements Animal {
	String name;
	public void Tiger(String name)
	{
		this.name=name;
	}
@Override
public void sound()
{
	System.out.println("waw waw");
}
public String name()
{
	return this.name;
}
}

