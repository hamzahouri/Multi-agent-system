package agents;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.wrapper.ControllerException;

public class ConsumerAgent extends Agent{

	
	@Override
	protected void setup() {
		String bookName =null;
		if(this.getArguments().length==1) {
			bookName=(String)this.getArguments()[0];
			
		}
		System.out.println("initialisation de l'agent"+this.getAID().getName());
		System.out.println("i'm trying to buy thr book"+bookName);
		
		addBehaviour(new Behaviour() {
			
			private int counter =0;
			@Override
			public boolean done() {
				// TODO Auto-generated method stub
				return (counter==10);
			}
			
			@Override
			public void action() {
				System.out.println("-----------------------");
				System.out.println("step "+counter);
				System.out.println("-----------------------");

				counter++;
				
			}
		});
	}
	
	@Override
	protected void beforeMove() {
		try {
			System.out.println("befor migration from."+this.getContainerController().getContainerName());
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
	@Override
	protected void afterMove() {
		try {
			System.out.println("after migration to."+this.getContainerController().getContainerName());
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void takeDown() {
		System.out.println("i'm going to die");
		System.out.println("...........................");
	}
}
