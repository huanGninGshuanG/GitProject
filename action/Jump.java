/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author 18359
 */
public class Jump extends Action {
    ////////////////////////////////////////////////////////////////////////////
    //Prototype Design pattern
    @Override
    public Action clone(){ return new Jump("jump"); }
    protected Jump(String s){ actionName = s; }
    
    private Jump(){ super.addPrototype(this); }
    private static Jump _jump = new Jump();
    
    ////////////////////////////////////////////////////////////////////////////
    //Observer Design Pattern
    
    ////////////////////////////////////////////////////////////////////////////
    //每个动作类特有动作
    
    protected String actionName = "jump";
    
    @Override
    public void act(){
        System.out.println(actionName);
    }
}
