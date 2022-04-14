package pr.multiAttriAsGroupKey.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pr.multiAttriAsGroupKey.dao.MaintainEventRegisterDao;
import pr.multiAttriAsGroupKey.entity.EventRegister;
import pr.multiAttriAsGroupKey.entity.EventRegisterGroupKey;
import pr.multiAttriAsGroupKey.util.CBUtils;
import pr.multiAttriAsGroupKey.util.WriteObjectAsJson;
import pr.multiAttriAsGroupKey.vo.EventRegisterVo;
import pr.multiAttriAsGroupKey.vo.User;

public class MaintainEventRegisterService {
	private WriteObjectAsJson writeObjectAsJson = new WriteObjectAsJson("D:/temp/");
	
	private MaintainEventRegisterDao dao = new MaintainEventRegisterDao();
	
	public List<EventRegisterVo> queryEventRegister(){
		//從 DB 撈資料
		List<EventRegister> eventRegisters = dao.queryEventRegister();
		
		// 使用複合key，將eventRegisters，分別丟到對應的籃子裡
		// 方便後面運算使用
		LinkedHashMap<EventRegisterGroupKey, List<EventRegister>> eventRegistersMap = CBUtils.groupingBy(eventRegisters, EventRegister::getGroupKey);
		
		List<EventRegisterVo> eventRegisterVos = new ArrayList<EventRegisterVo>();
		
		// 走訪每個籃子，產生前端需要的物件結構
		for(EventRegisterGroupKey key: eventRegistersMap.keySet()) {
			EventRegisterVo eventRegisterVo = key.makeEventRegisterVo();
			
			// 參考: buildEventUsers(eventRegistersMap, key);
			List<User> eventUsers = eventRegistersMap.get(key).stream()
				.map(e-> new User(e.getUserId()))
				.collect(Collectors.toList());
			
			eventRegisterVo.addRegUsers(eventUsers);

			eventRegisterVos.add(eventRegisterVo);
		}
		
		return eventRegisterVos;
		
	}
	
	private List<User> buildEventUsers(Map<EventRegisterGroupKey, List<EventRegister>> eventRegistersMap, EventRegisterGroupKey key){
		List<User> users = new ArrayList<>();
		
		for(EventRegister e: eventRegistersMap.get(key)) 
			users.add(new User(e.getUserId()));
		
		return users;
	}
	
}
