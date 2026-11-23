package com.elibear.bloominggardens;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {

    public static final BlockItemId CHERRY_BLOSSOM = create("cherry_blossom");
    public static final BlockItemId PINK_TULIP = create("pink_tulip");

    public static final BlockItemId MOONLIGHT_LILY = create("moonlight_lily");

    private static BlockItemId create(String name) {
        Identifier id = BloomingGardens.id(name);
        return BlockItemId.create(id, id);
    }
}
