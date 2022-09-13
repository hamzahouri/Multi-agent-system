package agents;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

public class ConsumerContainer {

	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.instance();
		ProfileImpl profile = new ProfileImpl();
		profile.setParameter(Profile.MAIN_HOST,"localhost");
		AgentContainer container = runtime.createAgentContainer(profile);
		
		// deployer l'agent
		
		AgentController consumerAgent = 
				container.createNewAgent("consumer", "agents.ConsumerAgent", new Object[] {"XML"});
		consumerAgent.start();
		
		
		
	}
}
