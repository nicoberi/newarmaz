import java.util.Objects;

public class Processor {
    private String name;

    public Processor(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Processor other = (Processor) obj;
		return Objects.equals(name, other.name);
	}

	
}
