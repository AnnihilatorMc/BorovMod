package net.bor.borovmod.block;

import net.bor.borovmod.BorovMod;
import net.bor.borovmod.block.custom.ModFlammableRotatedPillarBlock;
import net.bor.borovmod.block.custom.ModPlanks;
import net.bor.borovmod.item.ModCreativeModeTab;
import net.bor.borovmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BorovMod.MOD_ID);


    public static final RegistryObject<Block> PYROPE_GARNET_ORE = registerBlock("pyrope_garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.BALKAN_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PYROPE_GARNET_ORE = registerBlock("deepslate_pyrope_garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.BALKAN_TAB);

    public static final RegistryObject<Block> PYROPE_GARNET_BLOCK = registerBlock("pyrope_garnet_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.BALKAN_TAB);

    public static final RegistryObject<Block> OLIVE_LOG = registerBlockThatIsAlsoFuel("olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> STRIPPED_OLIVE_LOG = registerBlockThatIsAlsoFuel("stripped_olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> OLIVE_WOOD = registerBlockThatIsAlsoFuel("olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> STRIPPED_OLIVE_WOOD = registerBlockThatIsAlsoFuel("stripped_olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlockThatIsAlsoFuel("olive_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> OLIVE_STAIRS = registerBlockThatIsAlsoFuel("olive_stairs",
            () -> new StairBlock(() -> ModBlocks.OLIVE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> OLIVE_SLAB = registerBlockThatIsAlsoFuel("olive_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            ModCreativeModeTab.BALKAN_TAB, 150);

    public static final RegistryObject<Block> OLIVE_FENCE = registerBlockThatIsAlsoFuel("olive_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> OLIVE_FENCE_GATE = registerBlockThatIsAlsoFuel("olive_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            ModCreativeModeTab.BALKAN_TAB, 300);


    private static <T extends Block> RegistryObject<T> registerBlockThatIsAlsoFuel(String name, Supplier<T> block,
                                                                                        CreativeModeTab tab, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItemThatIsAlsoFuel(name, toReturn, tab, burnTime);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItemThatIsAlsoFuel(String name, RegistryObject<T> Block,
                                                                           CreativeModeTab tab, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(Block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> Block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(Block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
