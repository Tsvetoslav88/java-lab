package oraclecertifications.ocp.designpatternsandprinciple.creationalpatterns;

public class SingletonLazyInstantiation {
	private static SingletonLazyInstantiation instance;
	private SingletonLazyInstantiation(){}
	public static SingletonLazyInstantiation getInstance(){
		if(instance == null){
			synchronized(SingletonLazyInstantiation.class){
				if(instance == null){
					instance = new SingletonLazyInstantiation();
				}
			}
		}
		return instance;
	}
}
