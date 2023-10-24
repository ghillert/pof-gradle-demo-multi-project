package com.hillert.coherence.pof.utilities;

import com.tangosol.io.pof.schema.annotation.PortableType;

@PortableType(id=1000)
public class PofClass {
	private String name;

	public PofClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
