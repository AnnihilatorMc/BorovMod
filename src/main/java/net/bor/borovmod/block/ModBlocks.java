package net.bor.borovmod.block;

import net.bor.borovmod.BorovMod;
import net.bor.borovmod.block.custom.ModFlammableRotatedPillarBlock;
import net.bor.borovmod.block.custom.ModFlammableBlocks;
import net.bor.borovmod.block.custom.ModLeaves;
import net.bor.borovmod.item.ModCreativeModeTab;
import net.bor.borovmod.item.ModItems;
import net.bor.borovmod.world.feature.tree.FigTreeGrower;
import net.bor.borovmod.world.feature.tree.OliveTreeGrower;
import net.minecraft.world.effect.MobEffects;
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
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
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

    public static final RegistryObject<Block> OLIVE_BUTTON = registerBlockThatIsAlsoFuel("olive_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)),
            ModCreativeModeTab.BALKAN_TAB, 100);

    public static final RegistryObject<Block> OLIVE_PRESSURE_PLATE = registerBlockThatIsAlsoFuel("olive_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> OLIVE_DOOR = registerBlockThatIsAlsoFuel("olive_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),
            ModCreativeModeTab.BALKAN_TAB, 200);

    public static final RegistryObject<Block> OLIVE_TRAPDOOR = registerBlockThatIsAlsoFuel("olive_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),
            ModCreativeModeTab.BALKAN_TAB, 300);


    public static final RegistryObject<Block> FIG_LOG = registerBlockThatIsAlsoFuel("fig_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> STRIPPED_FIG_LOG = registerBlockThatIsAlsoFuel("stripped_fig_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_WOOD = registerBlockThatIsAlsoFuel("fig_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> STRIPPED_FIG_WOOD = registerBlockThatIsAlsoFuel("stripped_fig_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_PLANKS = registerBlockThatIsAlsoFuel("fig_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_STAIRS = registerBlockThatIsAlsoFuel("fig_stairs",
            () -> new StairBlock(() -> ModBlocks.FIG_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_SLAB = registerBlockThatIsAlsoFuel("fig_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            ModCreativeModeTab.BALKAN_TAB, 150);

    public static final RegistryObject<Block> FIG_FENCE = registerBlockThatIsAlsoFuel("fig_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_FENCE_GATE = registerBlockThatIsAlsoFuel("fig_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_BUTTON = registerBlockThatIsAlsoFuel("fig_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)),
            ModCreativeModeTab.BALKAN_TAB, 100);

    public static final RegistryObject<Block> FIG_PRESSURE_PLATE = registerBlockThatIsAlsoFuel("fig_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> FIG_DOOR = registerBlockThatIsAlsoFuel("fig_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),
            ModCreativeModeTab.BALKAN_TAB, 200);

    public static final RegistryObject<Block> FIG_TRAPDOOR = registerBlockThatIsAlsoFuel("fig_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),
            ModCreativeModeTab.BALKAN_TAB, 300);

    public static final RegistryObject<Block> BALKAN_ROSE = registerBlock("balkan_rose",
            () -> new FlowerBlock(MobEffects.LUCK, 10,
                    BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTab.BALKAN_TAB);

    public static final RegistryObject<Block> POTTED_BALKAN_ROSE = registerBlockWithoutBlockItem("potted_balkan_rose",
            () -> new FlowerPotBlock(null, ModBlocks.BALKAN_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)),
            ModCreativeModeTab.BALKAN_TAB);

    public static final RegistryObject<Block> OLIVE_SAPLING = registerBlockThatIsAlsoFuel("olive_sapling",
            () -> new SaplingBlock(new OliveTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.BALKAN_TAB, 200);

    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)),
            ModCreativeModeTab.BALKAN_TAB);

    public static final RegistryObject<Block> FIG_SAPLING = registerBlockThatIsAlsoFuel("fig_sapling",
            () -> new SaplingBlock(new FigTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.BALKAN_TAB, 200);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

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
