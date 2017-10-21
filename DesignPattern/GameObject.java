package DesignPattern;

import action.Action;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class GameObject implements Observer {
    private static List<GameObject> gameObjects = new ArrayList<>();
    
    protected abstract GameObject clone();
    public abstract void getAnimalName();
    //此函数方便调试
    
    public static GameObject findAndClone(String type){
	for(GameObject go : gameObjects){
	    if(go.getClass().getName().equals(type))
		return go.clone();
	}
	return null;
    }
    
    protected void addPrototype(GameObject gameObject){
	gameObjects.add(gameObject);
    }
    
    protected void destroy(GameObject go){
	gameObjects.remove(go);
    }
    
    //此函数方便调试
    public void showContent(){
        for(GameObject go: gameObjects){
            go.getAnimalName();
        }
    }
    
    public static int getNumber(){
	Set<String> set = new HashSet<>();
	for(GameObject go : gameObjects){
	    set.add(go.getClass().getName());
	}
	return gameObjects.size() - set.size();
    }
    
    public void setAction(Action action){
        //System.out.println(action.getClass().getName()+" "+this.getClass().getName());
        action.attach(action, this);
    }
    
}
