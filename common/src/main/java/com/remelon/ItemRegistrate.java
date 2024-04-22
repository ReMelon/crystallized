package com.remelon;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.remelon.Crystallized.CREGISTRATE;

public class ItemRegistrate {


	public static final BlockEntry<Block> EXAMPLE_BLOCK = CREGISTRATE.block("example_block", Block::new).register();

	public static final ItemEntry<Item> CLAY_POT = CREGISTRATE.item("clay_pot", Item::new)
			.register();


	public static void init() {
		// load the class and register everything
		Crystallized.LOGGER.info("Registering blocks for " + Crystallized.NAME);
	}
}
