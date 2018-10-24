//package com.BMDb;
//
//import static org.junit.Assert.assertNotNull;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.bmdb.actor.Actor;
//import com.bmdb.actor.ActorRepository;
//
//@RunWith(SpringRunner.class)
//public class BMDbActorTests extends BMDbApplicationTests {
//
//	@Autowired
//	private ActorRepository actorRepository;
//	
//	@Test
//	public void testActorCrudFunctions() {
//		//get all actors
//		Iterable<Actor> actors = actorRepository.findAll();
//		assertNotNull(actors);
//		
//		//add an actor
//		Actor a1 = new Actor("name", "gender", birthDate);
//		assertNotNull(actorRepository.save(a1));
//		int id = a1.getId();
//		
//		//get actor & validate a
//	}
//}
