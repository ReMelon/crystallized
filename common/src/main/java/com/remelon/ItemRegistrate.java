package com.remelon;

import com.remelon.itemTypes.conductive.CoChipped;
import com.remelon.itemTypes.conductive.CoDamaged;
import com.remelon.itemTypes.conductive.CoInfinite;
import com.remelon.itemTypes.conductive.CoPerfect;
import com.remelon.itemTypes.nether.NeChipped;
import com.remelon.itemTypes.nether.NeDamaged;
import com.remelon.itemTypes.nether.NeInfinite;
import com.remelon.itemTypes.nether.NePerfect;
import com.simibubi.create.foundation.data.CreateRegistrate;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;


import static com.remelon.Crystallized.MOD_ID;

public class ItemRegistrate {


	public static final CreateRegistrate CREGISTRATE = CreateRegistrate.create(MOD_ID);

//	public static final NonNullSupplier<CreateRegistrate> CREGISTRATE = NonNullSupplier.lazy(() -> CreateRegistrate.create(MOD_ID));

	// [---------------------------SLIDES---------------------------]

	public static final ItemEntry<Item> GLASS_SLIDE =
			CREGISTRATE.item("glass_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Item> STRONG_SLIDE =
			CREGISTRATE.item("strong_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();






	// [---------------------------NETHER SLIDES---------------------------]

	public static final ItemEntry<NeInfinite> NETHER_STRONG_SLIDE =
			CREGISTRATE.item("strong_nether_slide", NeInfinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<NePerfect> NETHER_SLIDE =
			CREGISTRATE.item("nether_slide", NePerfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<NeChipped> CHIPPED_NETHER_SLIDE =
			CREGISTRATE.item("chipped_nether_slide", NeChipped::new)
					.register();

	public static final ItemEntry<NeDamaged> DAMAGED_NETHER_SLIDE =
			CREGISTRATE.item("damaged_nether_slide", NeDamaged::new)
					.register();

	// [---------------------------FILLED NETHER SLIDES---------------------------]

	public static final ItemEntry<NePerfect> NETHER_SLIDE_FILLED =
			CREGISTRATE.item("nether_filled", NePerfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<NeChipped> CHIPPED_NETHER_FILLED =
			CREGISTRATE.item("chipped_nether_filled", NeChipped::new)
					.register();

	public static final ItemEntry<NeDamaged> DAMAGED_NETHER_FILLED =
			CREGISTRATE.item("damaged_nether_filled", NeDamaged::new)
					.register();

	public static final ItemEntry<NeInfinite> NETHER_STRONG_FILLED =
			CREGISTRATE.item("strong_nether_filled", NeInfinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();





	// [---------------------------CONDUCTIVE SLIDES---------------------------]

	public static final ItemEntry<CoInfinite> CONDUCTIVE_STRONG_SLIDE =
			CREGISTRATE.item("strong_conductive_slide", CoInfinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<CoPerfect> CONDUCTIVE_SLIDE =
			CREGISTRATE.item("conductive_slide", CoPerfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<CoChipped> CHIPPED_CONDUCTIVE_SLIDE =
			CREGISTRATE.item("chipped_conductive_slide", CoChipped::new)
					.register();

	public static final ItemEntry<CoDamaged> DAMAGED_CONDUCTIVE_SLIDE =
			CREGISTRATE.item("damaged_conductive_slide", CoDamaged::new)
					.register();

	// [---------------------------FILLED CONDUCTIVE SLIDES---------------------------]

	public static final ItemEntry<CoPerfect> CONDUCTIVE_SLIDE_FILLED =
			CREGISTRATE.item("conductive_filled", CoPerfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<CoChipped> CHIPPED_CONDUCTIVE_FILLED =
			CREGISTRATE.item("chipped_conductive_filled", CoChipped::new)
					.register();

	public static final ItemEntry<CoDamaged> DAMAGED_CONDUCTIVE_FILLED =
			CREGISTRATE.item("damaged_conductive_filled", CoDamaged::new)
					.register();

	public static final ItemEntry<CoInfinite> CONDUCTIVE_STRONG_FILLED =
			CREGISTRATE.item("strong_conductive_filled", CoInfinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();





	// [---------------------------OTHER---------------------------]
	public static final ItemEntry<Item> CONDUCTIVE =
			CREGISTRATE.item("conductive_compound", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();




	// [---------------------------CRYSTALS---------------------------]
	public static final ItemEntry<Item> NETHER_CRYSTAL =
			CREGISTRATE.item("nether_crystal", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();


	public static void init() {
	}


}
