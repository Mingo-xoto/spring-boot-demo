package com.yhq.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yhq.service.IXFuckService;

@Service
public class FuckService implements IXFuckService {

	@Override
	public String fuck() {
		return "fuck you ,man!";
	}

}
