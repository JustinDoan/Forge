package com.justind.testmod.proxy;

import com.justind.testmod.handlers.ItemHandler;

public class ClientProxy extends CommonProxy{
	
	public void init() {
		  ItemHandler.registerRenders();
		 }

}
