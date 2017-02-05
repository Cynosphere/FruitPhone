package io.github.elytra.fruitphone.early;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

public class FruitPhoneDummyModContainer extends DummyModContainer {

	public FruitPhoneDummyModContainer(String name, String id) {
		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = id;
		meta.name = "FruitPhone ("+name+" Compat)";
		meta.version = "@VERSION@";
		meta.authorList = Arrays.asList("Una Thompson (unascribed)");
		meta.description = "Dummy mod for Fruit Phone compatibility with "+name+". Serves only as a marker.";
		meta.screenshots = new String[0];
		meta.autogenerated = true;
		meta.parent = "fruitphone";
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		return true;
	}
	
}
