package ar.com.ascentio.calcservice;

public class EvalRequest {
	
	public String statement;
	
	public EvalRequest(String expression) {
		this.statement = expression;
	}
	
	public EvalRequest() {
		
	}
}
