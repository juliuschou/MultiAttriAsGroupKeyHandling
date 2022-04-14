package pr.multiAttriAsGroupKey.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

import pr.multiAttriAsGroupKey.util.CBUtils;

public class GroupByTest {

	@Test
	public void testGroupByGender() {
		List<Member> members = Arrays.asList(
				new Member("1", "May", "F"),
				new Member("2", "July", "M"),
				new Member("3", "April", "F"),
				new Member("4", "March", "M")
				);
		LinkedHashMap<String, List<Member>> map = CBUtils.groupingBy(members, Member::getGender);
		System.out.println(map);
	}
	
	@Test
	public void testGroupByGenderAndCountry() {
		List<ClubMember> members = Arrays.asList(
				new ClubMember("1", "May", "F", "TW"),
				new ClubMember("2", "July", "M", "TW"),
				new ClubMember("3", "April", "F", "UK"),
				new ClubMember("4", "March", "M", "UK"),
				new ClubMember("5", "Mama", "F", "JP"),
				new ClubMember("6", "Papa", "M", "JP")
				);
		// 怎麼實作呢?
		
		LinkedHashMap<ClubMemberGroupKey, List<ClubMember>> groupingBy = CBUtils.groupingBy(members, ClubMember::getClubMemberGroupKey);
		
		System.out.println(groupingBy);
	}
	
	@Test
	public void testGroupByGenderAndCountryByCombindAttr() {
		List<ClubMember> members = Arrays.asList(
				new ClubMember("1", "May", "F", "TW"),
				new ClubMember("2", "July", "M", "TW"),
				new ClubMember("3", "April", "F", "UK"),
				new ClubMember("4", "March", "M", "UK"),
				new ClubMember("5", "Mama", "F", "JP"),
				new ClubMember("6", "Papa", "M", "JP")
				);
		// 怎麼實作呢?
		
		LinkedHashMap<String, List<ClubMember>> groupingBy = CBUtils.groupingBy(members, ClubMember::getGenderCountry);
		
		System.out.println(groupingBy);
	}	
	
}
