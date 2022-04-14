package pr.multiAttriAsGroupKey.dao;

import java.util.Arrays;
import java.util.List;

import pr.multiAttriAsGroupKey.entity.EventRegister;

public class MaintainEventRegisterDao {
	public List<EventRegister> queryEventRegister(){
		return Arrays.asList(
				new EventRegister("BigData", "Hadoop", "Chipbond", "1"),
				new EventRegister("BigData", "Hadoop", "Chipbond", "3"),
				new EventRegister("BigData", "Hadoop", "TSMC", "2"),
				new EventRegister("BigData", "Hadoop", "TSMC", "4"),
				new EventRegister("ML", "Classification", "Chipbond", "1"),
				new EventRegister("ML", "Classification", "Chipbond", "3"),
				new EventRegister("ML", "Classification", "TSMC", "2"),
				new EventRegister("ML", "Classification", "TSMC", "4"));
	}
}
