
public interface Interest {
   
	default double getBasicRate() {
		return 0.25;
	}
}
