package pr.multiAttriAsGroupKey.service;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class EqualTest {

	@Test
	public void testSet() {
		Set<String> memberIds = new LinkedHashSet<>();
		memberIds.add("1");
		memberIds.add("2");

		//�а� memberIds ���X�����?
		System.out.println(memberIds);
	}
	
	
	@Test
	public void testSetWithObj() {
		Set<Member> members = new LinkedHashSet<>();
		members.add(new Member("1", "A"));
		members.add(new Member("2", "B"));
		members.add(new Member("1", "A"));
		//�а� members ���X�����
		System.out.println(members);
	}
	
	@Test
	public void testMap() {
		Map<String, String> collorMap = new LinkedHashMap<>();
		collorMap.put("while", "#ffffff");
		collorMap.put("black", "#000000");
		collorMap.put("while", "#ffffffxxx");
		// �а� collorMap ���X�����?
		System.out.println(collorMap);
	}
	
	@Test
	public void testMapUsingObjAsKey() {
		Map<Fruit, String> fruitMap = new LinkedHashMap<>();

		Fruit redApple = new Fruit("red", "apple");
		fruitMap.put(redApple, "��ī�G");

		Fruit redApple2 = new Fruit("red", "apple");
		fruitMap.put(redApple2, "��ī�G");

		Fruit greenBanana = new Fruit("green", "banana");
		fruitMap.put(greenBanana, "�񭻿�");
		
		Fruit yellowBanana = new Fruit("yellow", "banana");
		fruitMap.put(yellowBanana, "������");

		System.out.println(fruitMap);
	}
	
}
