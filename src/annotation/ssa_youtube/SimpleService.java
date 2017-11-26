package annotation.ssa_youtube;

@Service(name = "testName_SimpleService")

public class SimpleService {
	@Init
	public void initService() {
		System.out.println("Run method initService.");
	}
	public void notInitService() {
		System.out.println("Run method notInitService.");
	}
	
}
