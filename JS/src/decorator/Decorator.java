package decorator;

public abstract class Decorator extends Component {

	//why protected? 
	protected Component component;
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		if (null!=component) {
			component.operation();
		}
	}
	
	public void setComponent(Component component) {
		this.component = component;
	}

}
