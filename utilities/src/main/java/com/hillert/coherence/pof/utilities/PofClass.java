package com.hillert.coherence.pof.utilities;

import com.hillert.coherence.pof.list.FooClass;
import com.tangosol.io.pof.schema.annotation.PortableMap;
import com.tangosol.io.pof.schema.annotation.PortableType;

import java.util.HashMap;

@PortableType(id=1000)
public class PofClass {
	private String name;

	public PofClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@PortableMap(since=1)
	private HashMap<Long, FooClass> aliases = new HashMap<>();
}
