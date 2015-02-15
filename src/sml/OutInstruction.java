/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sml;

/**
 *
 * @author noel
 */
public class OutInstruction extends Instruction {

	private int result;
	private int op1;


	public OutInstruction(String label, String op) {
		super(label, op);
	}
        
	public OutInstruction(String label, int result) {
		this(label, "out");
		this.result = result;
	}
        
	@Override
	public void execute(Machine m) {
		int value1 = m.getRegisters().getRegister(op1);
                System.out.println("In register " + op1 + " the value is "
                        + value1);
	}

	@Override
	public String toString() {
		return super.toString() + " " + op1;
	}
}
