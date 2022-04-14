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
		//�q DB �����
		List<EventRegister> eventRegisters = dao.queryEventRegister();
		
		// �ϥνƦXkey�A�NeventRegisters�A���O���������x�l��
		// ��K�᭱�B��ϥ�
		LinkedHashMap<EventRegisterGroupKey, List<EventRegister>> eventRegistersMap = CBUtils.groupingBy(eventRegisters, EventRegister::getGroupKey);
		
		List<EventRegisterVo> eventRegisterVos = new ArrayList<EventRegisterVo>();
		
		// ���X�C���x�l�A���ͫe�ݻݭn�����󵲺c
		for(EventRegisterGroupKey key: eventRegistersMap.keySet()) {
			EventRegisterVo eventRegisterVo = key.makeEventRegisterVo();
			
			// �Ѧ�: buildEventUsers(eventRegistersMap, key);
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
