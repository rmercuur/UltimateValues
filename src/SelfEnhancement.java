public class SelfEnhancement extends Value {

	public SelfEnhancement(double strengthWeigth) {
		super(strengthWeigth, CFG.SELFE_beta(), CFG.SELFE_k()); //Different implementation of using constuctor than before.
	}
	
	public void updateSatisfaction(int result){
		super.updateSatisfactionFunction(result);
	}

	@Override
	public double getStrengthAvarage() {
		return CFG.SELFE_AVG_STRENGTH();
	}
}
