package pr.multiAttriAsGroupKey.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import pr.multiAttriAsGroupKey.util.WriteObjectAsJson;
import pr.multiAttriAsGroupKey.vo.EventRegisterVo;

public class MaintainEventRegisterServiceTest {
	
	private WriteObjectAsJson writeObjectAsJson = new WriteObjectAsJson("D:/temp/");
	
	private MaintainEventRegisterService service = new MaintainEventRegisterService();

	@Test
	public void testQueryEventRegister() {
		List<EventRegisterVo> eventRegisters = service.queryEventRegister();
		writeObjectAsJson.writeObjectValues(eventRegisters);
	}	

}
