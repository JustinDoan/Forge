package com.justind.testmod.proxy;

import com.justind.testmod.handlers.ItemHandler;

public class CommonProxy implements IProxy{

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		ItemHandler.init();
		ItemHandler.register();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}

}
