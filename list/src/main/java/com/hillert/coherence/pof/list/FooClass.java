package com.hillert.coherence.pof.list;

import com.tangosol.io.pof.schema.annotation.PortableType;

@PortableType(id=1000)
public class FooClass {
	private String name;

	public FooClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
