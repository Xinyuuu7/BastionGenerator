package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.reecriture.NewLootTables;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcfeature.loot.LootTable;

import java.util.HashMap;
import java.util.List;

public class BastionStructureLoot {
    // For version 1.16.0,1.16.1
    public static final HashMap<String, List<LootTable>> STRUCTURE_LOOT_1_16_0 = new HashMap<>() {{

        this.put("blocks/air", List.of());
        this.put("blocks/gold", List.of());

        this.put("mobs/crossbow_piglin", List.of());
        this.put("mobs/empty", List.of());
        this.put("mobs/hoglin", List.of());
        this.put("mobs/melee_piglin", List.of());
        this.put("mobs/melee_piglin_always", List.of());
        this.put("mobs/sword_piglin", List.of());

        this.put("units/center_pieces/center_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/center_pieces/center_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/center_pieces/center_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/edges/edge_0", List.of());
        this.put("units/fillers/stage_0", List.of());
        this.put("units/pathways/pathway_0", List.of());
        this.put("units/pathways/pathway_wall_0", List.of());
        this.put("units/rampart_plates/plate_0", List.of());
        this.put("units/ramparts/ramparts_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/ramparts/ramparts_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/ramparts/ramparts_2", List.of());
        this.put("units/stages/rot/stage_1_0", List.of());
        this.put("units/stages/stage_0_0", List.of());
        this.put("units/stages/stage_0_1", List.of());
        this.put("units/stages/stage_0_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/stages/stage_0_3", List.of());
        this.put("units/stages/stage_1_0", List.of());
        this.put("units/stages/stage_1_1", List.of());
        this.put("units/stages/stage_1_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/stages/stage_1_3", List.of());
        this.put("units/stages/stage_2_0", List.of());
        this.put("units/stages/stage_2_1", List.of());
        this.put("units/stages/stage_3_0", List.of());
        this.put("units/stages/stage_3_1", List.of());
        this.put("units/stages/stage_3_2", List.of());
        this.put("units/stages/stage_3_3", List.of());
        this.put("units/wall_units/edge_0_large", List.of());
        this.put("units/wall_units/unit_0", List.of());
        this.put("units/walls/connected_wall", List.of());
        this.put("units/walls/wall_base", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("units/air_base", List.of());

        this.put("hoglin_stable/connectors/end_post_connector", List.of());
        this.put("hoglin_stable/large_stables/inner_0", List.of());
        this.put("hoglin_stable/large_stables/inner_1", List.of());
        this.put("hoglin_stable/large_stables/inner_2", List.of());
        this.put("hoglin_stable/large_stables/inner_3", List.of(NewLootTables.BASTION_HOGLIN_STABLE_CHEST_1_16_0));
        this.put("hoglin_stable/large_stables/inner_4", List.of());
        this.put("hoglin_stable/large_stables/outer_0", List.of());
        this.put("hoglin_stable/large_stables/outer_1", List.of());
        this.put("hoglin_stable/large_stables/outer_2", List.of());
        this.put("hoglin_stable/large_stables/outer_3", List.of());
        this.put("hoglin_stable/large_stables/outer_4", List.of());
        this.put("hoglin_stable/posts/end_post", List.of());
        this.put("hoglin_stable/posts/stair_post", List.of());
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", List.of());
        this.put("hoglin_stable/ramparts/ramparts_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("hoglin_stable/ramparts/ramparts_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("hoglin_stable/ramparts/ramparts_3", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("hoglin_stable/small_stables/inner_0", List.of());
        this.put("hoglin_stable/small_stables/inner_1", List.of());
        this.put("hoglin_stable/small_stables/inner_2", List.of(NewLootTables.BASTION_HOGLIN_STABLE_CHEST_1_16_0));
        this.put("hoglin_stable/small_stables/inner_3", List.of());
        this.put("hoglin_stable/small_stables/outer_0", List.of());
        this.put("hoglin_stable/small_stables/outer_1", List.of());
        this.put("hoglin_stable/small_stables/outer_2", List.of());
        this.put("hoglin_stable/small_stables/outer_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_0", List.of());
        this.put("hoglin_stable/stairs/stairs_1_1", List.of());
        this.put("hoglin_stable/stairs/stairs_1_2", List.of());
        this.put("hoglin_stable/stairs/stairs_1_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_4", List.of());
        this.put("hoglin_stable/stairs/stairs_2_0", List.of());
        this.put("hoglin_stable/stairs/stairs_2_1", List.of());
        this.put("hoglin_stable/stairs/stairs_2_2", List.of());
        this.put("hoglin_stable/stairs/stairs_2_3", List.of());
        this.put("hoglin_stable/stairs/stairs_2_4", List.of());
        this.put("hoglin_stable/stairs/stairs_3_0", List.of());
        this.put("hoglin_stable/stairs/stairs_3_1", List.of());
        this.put("hoglin_stable/stairs/stairs_3_2", List.of());
        this.put("hoglin_stable/stairs/stairs_3_3", List.of());
        this.put("hoglin_stable/stairs/stairs_3_4", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", List.of());
        this.put("hoglin_stable/walls/side_wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("hoglin_stable/walls/side_wall_1", List.of());
        this.put("hoglin_stable/walls/wall_base", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("hoglin_stable/air_base", List.of());

        this.put("treasure/bases/centers/center_0", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_0));
        this.put("treasure/bases/centers/center_1", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_0, NewLootTables.BASTION_TREASURE_CHEST_1_16_0));
        this.put("treasure/bases/centers/center_2", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_0));
        this.put("treasure/bases/centers/center_3", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_0));
        this.put("treasure/bases/lava_basin", List.of());
        this.put("treasure/brains/center_brain", List.of());
        this.put("treasure/connectors/center_to_wall_middle", List.of());
        this.put("treasure/connectors/center_to_wall_top", List.of());
        this.put("treasure/connectors/center_to_wall_top_entrance", List.of());
        this.put("treasure/corners/bottom/corner_0", List.of());
        this.put("treasure/corners/bottom/corner_1", List.of());
        this.put("treasure/corners/edges/bottom", List.of());
        this.put("treasure/corners/edges/middle", List.of());
        this.put("treasure/corners/edges/top", List.of());
        this.put("treasure/corners/middle/corner_0", List.of());
        this.put("treasure/corners/middle/corner_1", List.of());
        this.put("treasure/corners/top/corner_0", List.of());
        this.put("treasure/corners/top/corner_1", List.of());
        this.put("treasure/entrances/entrance_0", List.of());
        this.put("treasure/extensions/empty", List.of());
        this.put("treasure/extensions/fire_room", List.of());
        this.put("treasure/extensions/house_0", List.of());
        this.put("treasure/extensions/house_1", List.of());
        this.put("treasure/extensions/large_bridge_0", List.of());
        this.put("treasure/extensions/large_bridge_1", List.of());
        this.put("treasure/extensions/large_bridge_2", List.of());
        this.put("treasure/extensions/large_bridge_3", List.of());
        this.put("treasure/extensions/roofed_bridge", List.of());
        this.put("treasure/extensions/small_bridge_0", List.of());
        this.put("treasure/extensions/small_bridge_1", List.of());
        this.put("treasure/extensions/small_bridge_2", List.of());
        this.put("treasure/extensions/small_bridge_3", List.of());
        this.put("treasure/ramparts/bottom_wall_0", List.of());
        this.put("treasure/ramparts/lava_basin_main", List.of());
        this.put("treasure/ramparts/lava_basin_side", List.of());
        this.put("treasure/ramparts/mid_wall_main", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("treasure/ramparts/mid_wall_side", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("treasure/ramparts/top_wall", List.of());
        this.put("treasure/roofs/center_roof", List.of());
        this.put("treasure/roofs/corner_roof", List.of());
        this.put("treasure/roofs/wall_roof", List.of());
        this.put("treasure/stairs/lower_stairs", List.of());
        this.put("treasure/walls/bottom/wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("treasure/walls/bottom/wall_1", List.of());
        this.put("treasure/walls/bottom/wall_2", List.of());
        this.put("treasure/walls/bottom/wall_3", List.of());
        this.put("treasure/walls/mid/wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("treasure/walls/mid/wall_1", List.of());
        this.put("treasure/walls/mid/wall_2", List.of());
        this.put("treasure/walls/outer/bottom_corner", List.of());
        this.put("treasure/walls/outer/medium_outer_wall", List.of());
        this.put("treasure/walls/outer/mid_corner", List.of());
        this.put("treasure/walls/outer/outer_wall", List.of());
        this.put("treasure/walls/outer/tall_outer_wall", List.of());
        this.put("treasure/walls/outer/top_corner", List.of());
        this.put("treasure/walls/top/main_entrance", List.of());
        this.put("treasure/walls/top/wall_0", List.of());
        this.put("treasure/walls/top/wall_1", List.of());
        this.put("treasure/walls/entrance_wall", List.of());
        this.put("treasure/walls/lava_wall", List.of());
        this.put("treasure/big_air_full", List.of());

        this.put("bridge/bridge_pieces/bridge", List.of());
        this.put("bridge/connectors/back_bridge_bottom", List.of());
        this.put("bridge/connectors/back_bridge_top", List.of());
        this.put("bridge/legs/leg_0", List.of());
        this.put("bridge/legs/leg_1", List.of());
        this.put("bridge/rampart_plates/plate_0", List.of());
        this.put("bridge/ramparts/rampart_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("bridge/ramparts/rampart_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0, NewLootTables.BASTION_OTHER_CHEST_1_16_0));
        this.put("bridge/starting_pieces/entrance", List.of(NewLootTables.BASTION_BRIDGE_CHEST_1_16_0));
        this.put("bridge/starting_pieces/entrance_base", List.of());
        this.put("bridge/starting_pieces/entrance_face", List.of());
        this.put("bridge/walls/wall_base_0", List.of());
        this.put("bridge/walls/wall_base_1", List.of());

    }};
    // For version 1.16.2 to 1.19.4
    public static final HashMap<String, List<LootTable>> STRUCTURE_LOOT_1_16_2 = new HashMap<>() {{

        this.put("blocks/air", List.of());
        this.put("blocks/gold", List.of());

        this.put("mobs/crossbow_piglin", List.of());
        this.put("mobs/empty", List.of());
        this.put("mobs/hoglin", List.of());
        this.put("mobs/melee_piglin", List.of());
        this.put("mobs/melee_piglin_always", List.of());
        this.put("mobs/sword_piglin", List.of());

        this.put("units/center_pieces/center_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/center_pieces/center_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/center_pieces/center_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/edges/edge_0", List.of());
        this.put("units/fillers/stage_0", List.of());
        this.put("units/pathways/pathway_0", List.of());
        this.put("units/pathways/pathway_wall_0", List.of());
        this.put("units/rampart_plates/plate_0", List.of());
        this.put("units/ramparts/ramparts_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/ramparts/ramparts_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/ramparts/ramparts_2", List.of());
        this.put("units/stages/rot/stage_1_0", List.of());
        this.put("units/stages/stage_0_0", List.of());
        this.put("units/stages/stage_0_1", List.of());
        this.put("units/stages/stage_0_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/stages/stage_0_3", List.of());
        this.put("units/stages/stage_1_0", List.of());
        this.put("units/stages/stage_1_1", List.of());
        this.put("units/stages/stage_1_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/stages/stage_1_3", List.of());
        this.put("units/stages/stage_2_0", List.of());
        this.put("units/stages/stage_2_1", List.of());
        this.put("units/stages/stage_3_0", List.of());
        this.put("units/stages/stage_3_1", List.of());
        this.put("units/stages/stage_3_2", List.of());
        this.put("units/stages/stage_3_3", List.of());
        this.put("units/wall_units/edge_0_large", List.of());
        this.put("units/wall_units/unit_0", List.of());
        this.put("units/walls/connected_wall", List.of());
        this.put("units/walls/wall_base", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("units/air_base", List.of());

        this.put("hoglin_stable/connectors/end_post_connector", List.of());
        this.put("hoglin_stable/large_stables/inner_0", List.of());
        this.put("hoglin_stable/large_stables/inner_1", List.of());
        this.put("hoglin_stable/large_stables/inner_2", List.of());
        this.put("hoglin_stable/large_stables/inner_3", List.of(NewLootTables.BASTION_HOGLIN_STABLE_CHEST_1_16_2));
        this.put("hoglin_stable/large_stables/inner_4", List.of());
        this.put("hoglin_stable/large_stables/outer_0", List.of());
        this.put("hoglin_stable/large_stables/outer_1", List.of());
        this.put("hoglin_stable/large_stables/outer_2", List.of());
        this.put("hoglin_stable/large_stables/outer_3", List.of());
        this.put("hoglin_stable/large_stables/outer_4", List.of());
        this.put("hoglin_stable/posts/end_post", List.of());
        this.put("hoglin_stable/posts/stair_post", List.of());
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", List.of());
        this.put("hoglin_stable/ramparts/ramparts_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("hoglin_stable/ramparts/ramparts_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("hoglin_stable/ramparts/ramparts_3", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("hoglin_stable/small_stables/inner_0", List.of());
        this.put("hoglin_stable/small_stables/inner_1", List.of());
        this.put("hoglin_stable/small_stables/inner_2", List.of(NewLootTables.BASTION_HOGLIN_STABLE_CHEST_1_16_2));
        this.put("hoglin_stable/small_stables/inner_3", List.of());
        this.put("hoglin_stable/small_stables/outer_0", List.of());
        this.put("hoglin_stable/small_stables/outer_1", List.of());
        this.put("hoglin_stable/small_stables/outer_2", List.of());
        this.put("hoglin_stable/small_stables/outer_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_0", List.of());
        this.put("hoglin_stable/stairs/stairs_1_1", List.of());
        this.put("hoglin_stable/stairs/stairs_1_2", List.of());
        this.put("hoglin_stable/stairs/stairs_1_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_4", List.of());
        this.put("hoglin_stable/stairs/stairs_2_0", List.of());
        this.put("hoglin_stable/stairs/stairs_2_1", List.of());
        this.put("hoglin_stable/stairs/stairs_2_2", List.of());
        this.put("hoglin_stable/stairs/stairs_2_3", List.of());
        this.put("hoglin_stable/stairs/stairs_2_4", List.of());
        this.put("hoglin_stable/stairs/stairs_3_0", List.of());
        this.put("hoglin_stable/stairs/stairs_3_1", List.of());
        this.put("hoglin_stable/stairs/stairs_3_2", List.of());
        this.put("hoglin_stable/stairs/stairs_3_3", List.of());
        this.put("hoglin_stable/stairs/stairs_3_4", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", List.of());
        this.put("hoglin_stable/walls/side_wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("hoglin_stable/walls/side_wall_1", List.of());
        this.put("hoglin_stable/walls/wall_base", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("hoglin_stable/air_base", List.of());

        this.put("treasure/bases/centers/center_0", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_2));
        this.put("treasure/bases/centers/center_1", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_2, NewLootTables.BASTION_TREASURE_CHEST_1_16_2));
        this.put("treasure/bases/centers/center_2", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_2));
        this.put("treasure/bases/centers/center_3", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_16_2));
        this.put("treasure/bases/lava_basin", List.of());
        this.put("treasure/brains/center_brain", List.of());
        this.put("treasure/connectors/center_to_wall_middle", List.of());
        this.put("treasure/connectors/center_to_wall_top", List.of());
        this.put("treasure/connectors/center_to_wall_top_entrance", List.of());
        this.put("treasure/corners/bottom/corner_0", List.of());
        this.put("treasure/corners/bottom/corner_1", List.of());
        this.put("treasure/corners/edges/bottom", List.of());
        this.put("treasure/corners/edges/middle", List.of());
        this.put("treasure/corners/edges/top", List.of());
        this.put("treasure/corners/middle/corner_0", List.of());
        this.put("treasure/corners/middle/corner_1", List.of());
        this.put("treasure/corners/top/corner_0", List.of());
        this.put("treasure/corners/top/corner_1", List.of());
        this.put("treasure/entrances/entrance_0", List.of());
        this.put("treasure/extensions/empty", List.of());
        this.put("treasure/extensions/fire_room", List.of());
        this.put("treasure/extensions/house_0", List.of());
        this.put("treasure/extensions/house_1", List.of());
        this.put("treasure/extensions/large_bridge_0", List.of());
        this.put("treasure/extensions/large_bridge_1", List.of());
        this.put("treasure/extensions/large_bridge_2", List.of());
        this.put("treasure/extensions/large_bridge_3", List.of());
        this.put("treasure/extensions/roofed_bridge", List.of());
        this.put("treasure/extensions/small_bridge_0", List.of());
        this.put("treasure/extensions/small_bridge_1", List.of());
        this.put("treasure/extensions/small_bridge_2", List.of());
        this.put("treasure/extensions/small_bridge_3", List.of());
        this.put("treasure/ramparts/bottom_wall_0", List.of());
        this.put("treasure/ramparts/lava_basin_main", List.of());
        this.put("treasure/ramparts/lava_basin_side", List.of());
        this.put("treasure/ramparts/mid_wall_main", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("treasure/ramparts/mid_wall_side", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("treasure/ramparts/top_wall", List.of());
        this.put("treasure/roofs/center_roof", List.of());
        this.put("treasure/roofs/corner_roof", List.of());
        this.put("treasure/roofs/wall_roof", List.of());
        this.put("treasure/stairs/lower_stairs", List.of());
        this.put("treasure/walls/bottom/wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("treasure/walls/bottom/wall_1", List.of());
        this.put("treasure/walls/bottom/wall_2", List.of());
        this.put("treasure/walls/bottom/wall_3", List.of());
        this.put("treasure/walls/mid/wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("treasure/walls/mid/wall_1", List.of());
        this.put("treasure/walls/mid/wall_2", List.of());
        this.put("treasure/walls/outer/bottom_corner", List.of());
        this.put("treasure/walls/outer/medium_outer_wall", List.of());
        this.put("treasure/walls/outer/mid_corner", List.of());
        this.put("treasure/walls/outer/outer_wall", List.of());
        this.put("treasure/walls/outer/tall_outer_wall", List.of());
        this.put("treasure/walls/outer/top_corner", List.of());
        this.put("treasure/walls/top/main_entrance", List.of());
        this.put("treasure/walls/top/wall_0", List.of());
        this.put("treasure/walls/top/wall_1", List.of());
        this.put("treasure/walls/entrance_wall", List.of());
        this.put("treasure/walls/lava_wall", List.of());
        this.put("treasure/big_air_full", List.of());

        this.put("bridge/bridge_pieces/bridge", List.of());
        this.put("bridge/connectors/back_bridge_bottom", List.of());
        this.put("bridge/connectors/back_bridge_top", List.of());
        this.put("bridge/legs/leg_0", List.of());
        this.put("bridge/legs/leg_1", List.of());
        this.put("bridge/rampart_plates/plate_0", List.of());
        this.put("bridge/ramparts/rampart_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("bridge/ramparts/rampart_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2, NewLootTables.BASTION_OTHER_CHEST_1_16_2));
        this.put("bridge/starting_pieces/entrance", List.of(NewLootTables.BASTION_BRIDGE_CHEST_1_16_2));
        this.put("bridge/starting_pieces/entrance_base", List.of());
        this.put("bridge/starting_pieces/entrance_face", List.of());
        this.put("bridge/walls/wall_base_0", List.of());
        this.put("bridge/walls/wall_base_1", List.of());

    }};
    // For version 1.20.0+
    public static final HashMap<String, List<LootTable>> STRUCTURE_LOOT_1_20_0 = new HashMap<>() {{

        this.put("blocks/air", List.of());
        this.put("blocks/gold", List.of());

        this.put("mobs/crossbow_piglin", List.of());
        this.put("mobs/empty", List.of());
        this.put("mobs/hoglin", List.of());
        this.put("mobs/melee_piglin", List.of());
        this.put("mobs/melee_piglin_always", List.of());
        this.put("mobs/sword_piglin", List.of());

        this.put("units/center_pieces/center_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/center_pieces/center_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/center_pieces/center_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/edges/edge_0", List.of());
        this.put("units/fillers/stage_0", List.of());
        this.put("units/pathways/pathway_0", List.of());
        this.put("units/pathways/pathway_wall_0", List.of());
        this.put("units/rampart_plates/plate_0", List.of());
        this.put("units/ramparts/ramparts_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/ramparts/ramparts_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/ramparts/ramparts_2", List.of());
        this.put("units/stages/rot/stage_1_0", List.of());
        this.put("units/stages/stage_0_0", List.of());
        this.put("units/stages/stage_0_1", List.of());
        this.put("units/stages/stage_0_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/stages/stage_0_3", List.of());
        this.put("units/stages/stage_1_0", List.of());
        this.put("units/stages/stage_1_1", List.of());
        this.put("units/stages/stage_1_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/stages/stage_1_3", List.of());
        this.put("units/stages/stage_2_0", List.of());
        this.put("units/stages/stage_2_1", List.of());
        this.put("units/stages/stage_3_0", List.of());
        this.put("units/stages/stage_3_1", List.of());
        this.put("units/stages/stage_3_2", List.of());
        this.put("units/stages/stage_3_3", List.of());
        this.put("units/wall_units/edge_0_large", List.of());
        this.put("units/wall_units/unit_0", List.of());
        this.put("units/walls/connected_wall", List.of());
        this.put("units/walls/wall_base", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("units/air_base", List.of());

        this.put("hoglin_stable/connectors/end_post_connector", List.of());
        this.put("hoglin_stable/large_stables/inner_0", List.of());
        this.put("hoglin_stable/large_stables/inner_1", List.of());
        this.put("hoglin_stable/large_stables/inner_2", List.of());
        this.put("hoglin_stable/large_stables/inner_3", List.of(NewLootTables.BASTION_HOGLIN_STABLE_CHEST_1_20_0));
        this.put("hoglin_stable/large_stables/inner_4", List.of());
        this.put("hoglin_stable/large_stables/outer_0", List.of());
        this.put("hoglin_stable/large_stables/outer_1", List.of());
        this.put("hoglin_stable/large_stables/outer_2", List.of());
        this.put("hoglin_stable/large_stables/outer_3", List.of());
        this.put("hoglin_stable/large_stables/outer_4", List.of());
        this.put("hoglin_stable/posts/end_post", List.of());
        this.put("hoglin_stable/posts/stair_post", List.of());
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", List.of());
        this.put("hoglin_stable/ramparts/ramparts_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("hoglin_stable/ramparts/ramparts_2", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("hoglin_stable/ramparts/ramparts_3", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("hoglin_stable/small_stables/inner_0", List.of());
        this.put("hoglin_stable/small_stables/inner_1", List.of());
        this.put("hoglin_stable/small_stables/inner_2", List.of(NewLootTables.BASTION_HOGLIN_STABLE_CHEST_1_20_0));
        this.put("hoglin_stable/small_stables/inner_3", List.of());
        this.put("hoglin_stable/small_stables/outer_0", List.of());
        this.put("hoglin_stable/small_stables/outer_1", List.of());
        this.put("hoglin_stable/small_stables/outer_2", List.of());
        this.put("hoglin_stable/small_stables/outer_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_0", List.of());
        this.put("hoglin_stable/stairs/stairs_1_1", List.of());
        this.put("hoglin_stable/stairs/stairs_1_2", List.of());
        this.put("hoglin_stable/stairs/stairs_1_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_4", List.of());
        this.put("hoglin_stable/stairs/stairs_2_0", List.of());
        this.put("hoglin_stable/stairs/stairs_2_1", List.of());
        this.put("hoglin_stable/stairs/stairs_2_2", List.of());
        this.put("hoglin_stable/stairs/stairs_2_3", List.of());
        this.put("hoglin_stable/stairs/stairs_2_4", List.of());
        this.put("hoglin_stable/stairs/stairs_3_0", List.of());
        this.put("hoglin_stable/stairs/stairs_3_1", List.of());
        this.put("hoglin_stable/stairs/stairs_3_2", List.of());
        this.put("hoglin_stable/stairs/stairs_3_3", List.of());
        this.put("hoglin_stable/stairs/stairs_3_4", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", List.of());
        this.put("hoglin_stable/walls/side_wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("hoglin_stable/walls/side_wall_1", List.of());
        this.put("hoglin_stable/walls/wall_base", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("hoglin_stable/air_base", List.of());

        this.put("treasure/bases/centers/center_0", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_20_0));
        this.put("treasure/bases/centers/center_1", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_20_0, NewLootTables.BASTION_TREASURE_CHEST_1_20_0));
        this.put("treasure/bases/centers/center_2", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_20_0));
        this.put("treasure/bases/centers/center_3", List.of(NewLootTables.BASTION_TREASURE_CHEST_1_20_0));
        this.put("treasure/bases/lava_basin", List.of());
        this.put("treasure/brains/center_brain", List.of());
        this.put("treasure/connectors/center_to_wall_middle", List.of());
        this.put("treasure/connectors/center_to_wall_top", List.of());
        this.put("treasure/connectors/center_to_wall_top_entrance", List.of());
        this.put("treasure/corners/bottom/corner_0", List.of());
        this.put("treasure/corners/bottom/corner_1", List.of());
        this.put("treasure/corners/edges/bottom", List.of());
        this.put("treasure/corners/edges/middle", List.of());
        this.put("treasure/corners/edges/top", List.of());
        this.put("treasure/corners/middle/corner_0", List.of());
        this.put("treasure/corners/middle/corner_1", List.of());
        this.put("treasure/corners/top/corner_0", List.of());
        this.put("treasure/corners/top/corner_1", List.of());
        this.put("treasure/entrances/entrance_0", List.of());
        this.put("treasure/extensions/empty", List.of());
        this.put("treasure/extensions/fire_room", List.of());
        this.put("treasure/extensions/house_0", List.of());
        this.put("treasure/extensions/house_1", List.of());
        this.put("treasure/extensions/large_bridge_0", List.of());
        this.put("treasure/extensions/large_bridge_1", List.of());
        this.put("treasure/extensions/large_bridge_2", List.of());
        this.put("treasure/extensions/large_bridge_3", List.of());
        this.put("treasure/extensions/roofed_bridge", List.of());
        this.put("treasure/extensions/small_bridge_0", List.of());
        this.put("treasure/extensions/small_bridge_1", List.of());
        this.put("treasure/extensions/small_bridge_2", List.of());
        this.put("treasure/extensions/small_bridge_3", List.of());
        this.put("treasure/ramparts/bottom_wall_0", List.of());
        this.put("treasure/ramparts/lava_basin_main", List.of());
        this.put("treasure/ramparts/lava_basin_side", List.of());
        this.put("treasure/ramparts/mid_wall_main", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("treasure/ramparts/mid_wall_side", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("treasure/ramparts/top_wall", List.of());
        this.put("treasure/roofs/center_roof", List.of());
        this.put("treasure/roofs/corner_roof", List.of());
        this.put("treasure/roofs/wall_roof", List.of());
        this.put("treasure/stairs/lower_stairs", List.of());
        this.put("treasure/walls/bottom/wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("treasure/walls/bottom/wall_1", List.of());
        this.put("treasure/walls/bottom/wall_2", List.of());
        this.put("treasure/walls/bottom/wall_3", List.of());
        this.put("treasure/walls/mid/wall_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("treasure/walls/mid/wall_1", List.of());
        this.put("treasure/walls/mid/wall_2", List.of());
        this.put("treasure/walls/outer/bottom_corner", List.of());
        this.put("treasure/walls/outer/medium_outer_wall", List.of());
        this.put("treasure/walls/outer/mid_corner", List.of());
        this.put("treasure/walls/outer/outer_wall", List.of());
        this.put("treasure/walls/outer/tall_outer_wall", List.of());
        this.put("treasure/walls/outer/top_corner", List.of());
        this.put("treasure/walls/top/main_entrance", List.of());
        this.put("treasure/walls/top/wall_0", List.of());
        this.put("treasure/walls/top/wall_1", List.of());
        this.put("treasure/walls/entrance_wall", List.of());
        this.put("treasure/walls/lava_wall", List.of());
        this.put("treasure/big_air_full", List.of());

        this.put("bridge/bridge_pieces/bridge", List.of());
        this.put("bridge/connectors/back_bridge_bottom", List.of());
        this.put("bridge/connectors/back_bridge_top", List.of());
        this.put("bridge/legs/leg_0", List.of());
        this.put("bridge/legs/leg_1", List.of());
        this.put("bridge/rampart_plates/plate_0", List.of());
        this.put("bridge/ramparts/rampart_0", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("bridge/ramparts/rampart_1", List.of(NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0, NewLootTables.BASTION_OTHER_CHEST_1_20_0));
        this.put("bridge/starting_pieces/entrance", List.of(NewLootTables.BASTION_BRIDGE_CHEST_1_20_0));
        this.put("bridge/starting_pieces/entrance_base", List.of());
        this.put("bridge/starting_pieces/entrance_face", List.of());
        this.put("bridge/walls/wall_base_0", List.of());
        this.put("bridge/walls/wall_base_1", List.of());

    }};
    // For all versions
    public static final HashMap<String, List<BPos>> STRUCTURE_LOOT_OFFSETS = new HashMap<>() {{

        this.put("blocks/air", List.of());
        this.put("blocks/gold", List.of());

        this.put("mobs/crossbow_piglin", List.of());
        this.put("mobs/empty", List.of());
        this.put("mobs/hoglin", List.of());
        this.put("mobs/melee_piglin", List.of());
        this.put("mobs/melee_piglin_always", List.of());
        this.put("mobs/sword_piglin", List.of());

        this.put("units/center_pieces/center_0", List.of(new BPos(8, 1, 3)));
        this.put("units/center_pieces/center_1", List.of(new BPos(6, 1, 9)));
        this.put("units/center_pieces/center_2", List.of(new BPos(1, 1, 7)));
        this.put("units/edges/edge_0", List.of());
        this.put("units/fillers/stage_0", List.of());
        this.put("units/pathways/pathway_0", List.of());
        this.put("units/pathways/pathway_wall_0", List.of());
        this.put("units/rampart_plates/plate_0", List.of());
        this.put("units/ramparts/ramparts_0", List.of(new BPos(7, 17, 7), new BPos(7, 17, 8), new BPos(7, 17, 12)));
        this.put("units/ramparts/ramparts_1", List.of(new BPos(3, 13, 6)));
        this.put("units/ramparts/ramparts_2", List.of());
        this.put("units/stages/rot/stage_1_0", List.of());
        this.put("units/stages/stage_0_0", List.of());
        this.put("units/stages/stage_0_1", List.of());
        this.put("units/stages/stage_0_2", List.of(new BPos(1, 4, 6)));
        this.put("units/stages/stage_0_3", List.of());
        this.put("units/stages/stage_1_0", List.of());
        this.put("units/stages/stage_1_1", List.of());
        this.put("units/stages/stage_1_2", List.of(new BPos(7, 1, 6)));
        this.put("units/stages/stage_1_3", List.of());
        this.put("units/stages/stage_2_0", List.of());
        this.put("units/stages/stage_2_1", List.of());
        this.put("units/stages/stage_3_0", List.of());
        this.put("units/stages/stage_3_1", List.of());
        this.put("units/stages/stage_3_2", List.of());
        this.put("units/stages/stage_3_3", List.of());
        this.put("units/wall_units/edge_0_large", List.of());
        this.put("units/wall_units/unit_0", List.of());
        this.put("units/walls/connected_wall", List.of());
        this.put("units/walls/wall_base", List.of(new BPos(2, 4, 5), new BPos(3, 4, 5)));
        this.put("units/air_base", List.of());

        this.put("hoglin_stable/connectors/end_post_connector", List.of());
        this.put("hoglin_stable/large_stables/inner_0", List.of());
        this.put("hoglin_stable/large_stables/inner_1", List.of());
        this.put("hoglin_stable/large_stables/inner_2", List.of());
        this.put("hoglin_stable/large_stables/inner_3", List.of(new BPos(1, 1, 5)));
        this.put("hoglin_stable/large_stables/inner_4", List.of());
        this.put("hoglin_stable/large_stables/outer_0", List.of());
        this.put("hoglin_stable/large_stables/outer_1", List.of());
        this.put("hoglin_stable/large_stables/outer_2", List.of());
        this.put("hoglin_stable/large_stables/outer_3", List.of());
        this.put("hoglin_stable/large_stables/outer_4", List.of());
        this.put("hoglin_stable/posts/end_post", List.of());
        this.put("hoglin_stable/posts/stair_post", List.of());
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", List.of());
        this.put("hoglin_stable/ramparts/ramparts_1", List.of(new BPos(7, 17, 7), new BPos(7, 17, 8), new BPos(7, 17, 11)));
        this.put("hoglin_stable/ramparts/ramparts_2", List.of(new BPos(12, 3, 13), new BPos(3, 13, 9)));
        this.put("hoglin_stable/ramparts/ramparts_3", List.of(new BPos(6, 3, 4)));
        this.put("hoglin_stable/small_stables/inner_0", List.of());
        this.put("hoglin_stable/small_stables/inner_1", List.of());
        this.put("hoglin_stable/small_stables/inner_2", List.of(new BPos(3, 1, 6)));
        this.put("hoglin_stable/small_stables/inner_3", List.of());
        this.put("hoglin_stable/small_stables/outer_0", List.of());
        this.put("hoglin_stable/small_stables/outer_1", List.of());
        this.put("hoglin_stable/small_stables/outer_2", List.of());
        this.put("hoglin_stable/small_stables/outer_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_0", List.of());
        this.put("hoglin_stable/stairs/stairs_1_1", List.of());
        this.put("hoglin_stable/stairs/stairs_1_2", List.of());
        this.put("hoglin_stable/stairs/stairs_1_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_4", List.of());
        this.put("hoglin_stable/stairs/stairs_2_0", List.of());
        this.put("hoglin_stable/stairs/stairs_2_1", List.of());
        this.put("hoglin_stable/stairs/stairs_2_2", List.of());
        this.put("hoglin_stable/stairs/stairs_2_3", List.of());
        this.put("hoglin_stable/stairs/stairs_2_4", List.of());
        this.put("hoglin_stable/stairs/stairs_3_0", List.of());
        this.put("hoglin_stable/stairs/stairs_3_1", List.of());
        this.put("hoglin_stable/stairs/stairs_3_2", List.of());
        this.put("hoglin_stable/stairs/stairs_3_3", List.of());
        this.put("hoglin_stable/stairs/stairs_3_4", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", List.of());
        this.put("hoglin_stable/walls/side_wall_0", List.of(new BPos(9, 7, 9)));
        this.put("hoglin_stable/walls/side_wall_1", List.of());
        this.put("hoglin_stable/walls/wall_base", List.of(new BPos(12, 4, 13)));
        this.put("hoglin_stable/air_base", List.of());

        this.put("treasure/bases/centers/center_0", List.of(new BPos(4, 3, 6)));
        this.put("treasure/bases/centers/center_1", List.of(new BPos(2, 3, 6), new BPos(4, 3, 6)));
        this.put("treasure/bases/centers/center_2", List.of(new BPos(1, 2, 4)));
        this.put("treasure/bases/centers/center_3", List.of(new BPos(3, 3, 5)));
        this.put("treasure/bases/lava_basin", List.of());
        this.put("treasure/brains/center_brain", List.of());
        this.put("treasure/connectors/center_to_wall_middle", List.of());
        this.put("treasure/connectors/center_to_wall_top", List.of());
        this.put("treasure/connectors/center_to_wall_top_entrance", List.of());
        this.put("treasure/corners/bottom/corner_0", List.of());
        this.put("treasure/corners/bottom/corner_1", List.of());
        this.put("treasure/corners/edges/bottom", List.of());
        this.put("treasure/corners/edges/middle", List.of());
        this.put("treasure/corners/edges/top", List.of());
        this.put("treasure/corners/middle/corner_0", List.of());
        this.put("treasure/corners/middle/corner_1", List.of());
        this.put("treasure/corners/top/corner_0", List.of());
        this.put("treasure/corners/top/corner_1", List.of());
        this.put("treasure/entrances/entrance_0", List.of());
        this.put("treasure/extensions/empty", List.of());
        this.put("treasure/extensions/fire_room", List.of());
        this.put("treasure/extensions/house_0", List.of());
        this.put("treasure/extensions/house_1", List.of());
        this.put("treasure/extensions/large_bridge_0", List.of());
        this.put("treasure/extensions/large_bridge_1", List.of());
        this.put("treasure/extensions/large_bridge_2", List.of());
        this.put("treasure/extensions/large_bridge_3", List.of());
        this.put("treasure/extensions/roofed_bridge", List.of());
        this.put("treasure/extensions/small_bridge_0", List.of());
        this.put("treasure/extensions/small_bridge_1", List.of());
        this.put("treasure/extensions/small_bridge_2", List.of());
        this.put("treasure/extensions/small_bridge_3", List.of());
        this.put("treasure/ramparts/bottom_wall_0", List.of());
        this.put("treasure/ramparts/lava_basin_main", List.of());
        this.put("treasure/ramparts/lava_basin_side", List.of());
        this.put("treasure/ramparts/mid_wall_main", List.of(new BPos(11, 29, 6), new BPos(13, 29, 8)));
        this.put("treasure/ramparts/mid_wall_side", List.of(new BPos(11, 29, 6), new BPos(11, 29, 7)));
        this.put("treasure/ramparts/top_wall", List.of());
        this.put("treasure/roofs/center_roof", List.of());
        this.put("treasure/roofs/corner_roof", List.of());
        this.put("treasure/roofs/wall_roof", List.of());
        this.put("treasure/stairs/lower_stairs", List.of());
        this.put("treasure/walls/bottom/wall_0", List.of(new BPos(3, 6, 2)));
        this.put("treasure/walls/bottom/wall_1", List.of());
        this.put("treasure/walls/bottom/wall_2", List.of());
        this.put("treasure/walls/bottom/wall_3", List.of());
        this.put("treasure/walls/mid/wall_0", List.of(new BPos(3, 11, 22)));
        this.put("treasure/walls/mid/wall_1", List.of());
        this.put("treasure/walls/mid/wall_2", List.of());
        this.put("treasure/walls/outer/bottom_corner", List.of());
        this.put("treasure/walls/outer/medium_outer_wall", List.of());
        this.put("treasure/walls/outer/mid_corner", List.of());
        this.put("treasure/walls/outer/outer_wall", List.of());
        this.put("treasure/walls/outer/tall_outer_wall", List.of());
        this.put("treasure/walls/outer/top_corner", List.of());
        this.put("treasure/walls/top/main_entrance", List.of());
        this.put("treasure/walls/top/wall_0", List.of());
        this.put("treasure/walls/top/wall_1", List.of());
        this.put("treasure/walls/entrance_wall", List.of());
        this.put("treasure/walls/lava_wall", List.of());
        this.put("treasure/big_air_full", List.of());

        this.put("bridge/bridge_pieces/bridge", List.of());
        this.put("bridge/connectors/back_bridge_bottom", List.of());
        this.put("bridge/connectors/back_bridge_top", List.of());
        this.put("bridge/legs/leg_0", List.of());
        this.put("bridge/legs/leg_1", List.of());
        this.put("bridge/rampart_plates/plate_0", List.of());
        this.put("bridge/ramparts/rampart_0", List.of(new BPos(3, 13, 7)));
        this.put("bridge/ramparts/rampart_1", List.of(new BPos(7, 17, 7), new BPos(7, 17, 8), new BPos(7, 17, 12)));
        this.put("bridge/starting_pieces/entrance", List.of(new BPos(9, 16, 4)));
        this.put("bridge/starting_pieces/entrance_base", List.of());
        this.put("bridge/starting_pieces/entrance_face", List.of());
        this.put("bridge/walls/wall_base_0", List.of());
        this.put("bridge/walls/wall_base_1", List.of());

    }};


    public static final HashMap<String, Pair<List<BPos>, Float>> STRUCTURE_VARIABLE_GOLD_OFFSETS = new HashMap<>() {{
        this.put("treasure/ramparts/top_wall", new Pair<>(
                List.of(new BPos(9, 2, 10), new BPos(9, 5, 3), new BPos(9, 5, 7), new BPos(9, 8, 6), new BPos(9, 8, 7), new BPos(9, 8, 10))
                , 0.3F));


        this.put("hoglin_stable/walls/side_wall_1", new Pair<>(
                List.of(new BPos(8, 4, 10), new BPos(9, 4, 11), new BPos(10, 4, 10), new BPos(10, 4, 12), new BPos(11, 4, 11), new BPos(11, 4, 12),
                        new BPos(7, 8, 3), new BPos(8, 8, 3), new BPos(7, 9, 3), new BPos(8, 9, 3), new BPos(9, 12, 3), new BPos(14, 17, 5))
                , 0.1F));
//        this.put("hoglin_stable/large_stables/outer_1", new Pair<>(//TODO these
//                List.of(new BPos(8, 0, 1))
//                , 0.75F));
//        this.put("hoglin_stable/small_stables/inner_1", new Pair<>(
//                List.of(new BPos(8, 0, 6))
//                , 0.75F));
//        this.put("hoglin_stable/small_stables/outer_1", new Pair<>(
//                List.of(new BPos(2, 0, 1))
//                , 0.75F));


        this.put("bridge/starting_pieces/entrance", new Pair<>(
                List.of(new BPos(14, 0, 27), new BPos(14, 1, 27), new BPos(15, 1, 27), new BPos(8, 9, 30), new BPos(9, 9, 30), new BPos(8, 10, 30), new BPos(9, 10, 30))
                , 0.6F));//TODO not sure 0.6
//        this.put("bridge/starting_pieces/entrance_base", new Pair<>(//TODO this piece
//                List.of(new BPos(12, 22, 27), new BPos(12, 22, 28), new BPos(13, 22, 28), new BPos(12, 23, 29), new BPos(12, 23, 31), new BPos(13, 23, 29), new BPos(13, 23, 31))
//                , 0.1F));
        this.put("bridge/walls/wall_base_0", new Pair<>(
                List.of(new BPos(7, 1, 11), new BPos(7, 2, 11), new BPos(7, 3, 11))
                , 0.3F));
//        this.put("bridge/walls/wall_base_1", List.of(new BPos()));//TODO wiki say 2 gold but I found nothing in nbt


//        this.put("units/stages/stage_0_0", new Pair<>(TODO ALL Housing
//                List.of(new BPos(7, 0, 6))
//                , 0.75F));
//        this.put("units/stages/stage_0_2", new Pair<>(
//                List.of(new BPos(7, 3, 6))
//                , 0.75F));
//        this.put("units/stages/stage_0_3", new Pair<>(
//                List.of(new BPos(0, 3, 6))
//                , 0.75F));
//        this.put("units/stages/stage_1_0", new Pair<>(
//                List.of(new BPos(7, 0, 5))
//                , 0.75F));
//        this.put("units/stages/stage_1_1", new Pair<>(
//                List.of(new BPos(8, 3, 5))
//                , 0.75F));
//        this.put("units/stages/stage_1_3", new Pair<>(
//                List.of(new BPos(7, 3, 6))
//                , 0.75F));
//        this.put("units/wall_unites/unit_0", new Pair<>(
//                List.of(new BPos(10, 0, 5))
//                , 0.75F));
    }};
}