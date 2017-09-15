package test;

import static org.junit.Assert.*;

import java.lang.reflect.Modifier;
import org.junit.Before;
import org.junit.Test;

import model.Bot;
import model.Worker;

public class TestBot {

	@Test
	public void testAbstractClass(){
		//check Abstract Class
		try{
			assertEquals(true,Modifier.isAbstract((Bot.class).getModifiers()));
		}catch(Exception e){
			fail("Bot doesnt exist");
		}
	}
	
	@Test
	public void testImplement(){
		//check Abstract Class
		assertEquals("model.Worker", Bot.class.getInterfaces()[0].getName());
	}
	
	@Test
	public void testAbstractMethod(){
		//check Abstract Method
		try{
			assertEquals(true,Modifier.isAbstract((Bot.class).getMethod("work", null).getModifiers()));}
		catch(Exception e){
			fail("work doesnt exist");
		}
		
	}
	@Test
	public void testStaticVariable(){
		try{
			assertEquals(true,Modifier.isStatic((Bot.class).getField("material").getModifiers()));
		}catch(Exception e){
			fail("material doesnt exist");
		}
		try{
			assertEquals(true,Modifier.isStatic((Bot.class).getField("finishedProduct").getModifiers()));
		}catch(Exception e){
			fail("finishedProduct doesnt exist");
		}
	}
}
