public class SelfTranscendence extends Value {

	public SelfTranscendence(double strengthWeigth) {
		super(strengthWeigth, CFG.SELFE_beta(), CFG.SELFE_k()); //Different implementation of using constuctor than before.
	}
	
	public void updateSatisfaction(int result){
		super.updateSatisfactionFunction((100-result));
	}

	@Override
	public double getStrengthAvarage() {
		return CFG.SELFE_AVG_STRENGTH();
	}
}
