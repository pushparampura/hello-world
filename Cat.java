import Animal;

public class Cat implements Animal {
	String name;
	public void Cat(String name)
	{
		this.name=name;
	}
	@Override
	public void sound()
	{
		System.out.println("maw maw");
	}
	public String name()
	{
		return this.name;
	}

}

