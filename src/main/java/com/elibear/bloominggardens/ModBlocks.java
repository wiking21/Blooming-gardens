package com.elibear.bloominggardens;

import java.util.function.Function;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    public static final Block CHERRY_BLOSSOM = register(
            ModBlockItemIds.CHERRY_BLOSSOM,
            properties -> new FlowerBlock(SuspiciousStewEffects.EMPTY, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)
    );

    public static final Block PINK_TULIP = register(
            ModBlockItemIds.PINK_TULIP,
            properties -> new FlowerBlock(SuspiciousStewEffects.EMPTY, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)
    );

    public static final Block MOONLIGHT_LILY = register(
            ModBlockItemIds.MOONLIGHT_LILY,
            properties -> new FlowerBlock(SuspiciousStewEffects.EMPTY, properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)
    );

    private static Block register(
            BlockItemId id,
            Function<BlockBehaviour.Properties, Block> factory,
            BlockBehaviour.Properties properties
    ) {
        Block block = factory.apply(properties.setId(id.block()));
        Registry.register(BuiltInRegistries.BLOCK, id.block(), block);

        BlockItem item = new BlockItem(
                block,
                new Item.Properties()
                        .useBlockDescriptionPrefix()
                        .setId(id.item())
        );

        Registry.register(BuiltInRegistries.ITEM, id.item(), item);
        return block;
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register(tab -> {
                    tab.accept(CHERRY_BLOSSOM.asItem());
                    tab.accept(PINK_TULIP.asItem());
                    tab.accept(MOONLIGHT_LILY.asItem());
                });
    }
}
