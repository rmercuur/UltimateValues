import repast.simphony.random.RandomHelper;

public abstract class Value {
	private double satisfaction;
	private double strengthWeight; //Agent specific value-strength
	private double beta;
	private double k;

	public Value(double strengthWeight, double beta, double k){
		this.strengthWeight = strengthWeight;
		this.satisfaction =0.5;
		//this.satisfaction = RandomHelper.nextDoubleFromTo(0, 2*getThreshold()); //Any satisfaction within 0 and boundry
		this.beta = beta;
		this.k = k;
	}
	
	public abstract double getStrengthAvarage(); //valuetype specific avarage strength;
	public double getStrength() {
		return strengthWeight * getStrengthAvarage();
	}
	public double getThreshold(){
		return getStrength();		
	}
	public double getSatisfaction() {
		return satisfaction;
	}
	public double getNeed() {
		if(satisfaction < 0) satisfaction = 0.01; //does it give a overflow?
		return getThreshold()/satisfaction;  //only works if satisfaction stays positive, else the Needs get lower when satisfaction gets lower
	}
	private double getK() {
		double modifier = getStrength();
		return getStrength() * k;
	}

	public void updateSatisfactionFunction(double connectedFeaturesSum){
		double increment = Math.tanh( beta * (connectedFeaturesSum - getK()));
	//	System.out.println("Increment: " + this + "by: "+ increment);
		satisfaction += increment;
	}
	public abstract void updateSatisfaction(int result);


	protected void setBeta(double beta){
		this.beta = beta;
	}
	protected void setK(double k){
		this.k = k;
	}

	
}
