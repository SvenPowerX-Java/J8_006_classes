package annotation.ssa_youtube;

@Service(name = "testName_LazyService")
public class LazyService {
	@Init
	public void lazyInit()throws Exception {
		System.out.println("Run method lazyInit.");
	}
	public void notLazyInit()throws Exception {
		System.out.println("Run method notLazyInit.");
	}
	
}
