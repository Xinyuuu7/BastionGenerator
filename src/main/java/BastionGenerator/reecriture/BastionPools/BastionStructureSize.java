package BastionGenerator.reecriture.BastionPools;

import com.seedfinding.mccore.util.pos.BPos;

import java.util.HashMap;

public class BastionStructureSize {
    public static final HashMap<String, BPos> STRUCTURE_SIZE = new HashMap<>() {{
        this.put("blocks/air",new BPos(1,1,1));
        this.put("bloks/gold_block", new BPos(1,1,1));
        this.put("bridge/bridge_pieces/bridge", new BPos(31, 19, 16));
        this.put("bridge/connectors/back_bridge_bottom", new BPos(8,8,19));
        this.put("bridge/connectors/back_bridge_top", new BPos(8,11,19));
        this.put("bridge/legs/leg_0", new BPos(3,22,3));
        this.put("bridge/legs/leg_1", new BPos(3,22,3));
        this.put("bridge/ramparts_plates/plate_0", new BPos(2,19,16));
        this.put("bridge/ramparts/rampart_0", new BPos(16,22,16));
        this.put("bridge/ramparts/rampart_1", new BPos(16,32,16));
        this.put("bridge/starting_pieces/entrance", new BPos(17, 32, 32));
        this.put("bridge/starting_pieces/entrance_base", new BPos(16, 32, 32));
        this.put("bridge/starting_pieces/entrance_face", new BPos(5, 24, 32));
        this.put("bridge/walls/wall_base_0", new BPos(16, 24, 16));
        this.put("bridge/walls/wall_base_1", new BPos(16, 24, 16));
        this.put("hoglin_stable/connectors/end_post_connector", new BPos(2,2,22));
        this.put("hoglin_stable/large_stables/inner_0", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/inner_1", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/inner_2", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/inner_3", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/inner_4", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/outer_0", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/outer_1", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/outer_2", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/outer_3", new BPos(14,6,8));
        this.put("hoglin_stable/large_stables/outer_4", new BPos(14,6,8));
        this.put("hoglin_stable/posts/end_post", new BPos(2,24,2));
        this.put("hoglin_stable/posts/stair_post", new BPos(2,24,10));
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", new BPos(2,19,16));
        this.put("hoglin_stable/ramparts/ramparts_1", new BPos(16,32,16));
        this.put("hoglin_stable/ramparts/ramparts_2", new BPos(16,21,16));
        this.put("hoglin_stable/ramparts/ramparts_3", new BPos(16,12,16));
        this.put("hoglin_stable/small_stables/inner_0", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/inner_1", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/inner_2", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/inner_3", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/outer_0", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/outer_1", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/outer_2", new BPos(12,6,8));
        this.put("hoglin_stable/small_stables/outer_3", new BPos(12,6,8));

        this.put("hoglin_stable/stairs/stairs_1_0", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_1_1", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_1_2", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_1_3", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_1_4", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_2_0", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_2_1", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_2_2", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_2_3", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_2_4", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_3_0", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_3_1", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_3_2", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_3_3", new BPos(14,6,16));
        this.put("hoglin_stable/stairs/stairs_3_4", new BPos(14,6,16));

        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", new BPos(15,6,16));
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", new BPos(15,6,16));
        this.put("hoglin_stable/walls/side_wall_0", new BPos(16,24,16));
        this.put("hoglin_stable/walls/side_wall_1", new BPos(16,24,16));
        this.put("hoglin_stable/walls/wall_base", new BPos(16,24,16));
        this.put("hoglin_stable/air_base", new BPos(30,24,48));

        this.put("mobs/crossbow_piglin", new BPos(1,3,1));
        this.put("mobs/empty", new BPos(1,1,1));
        this.put("mobs/hoglin", new BPos(2,3,2));
        this.put("mobs/melee_piglin", new BPos(1,3,1));
        this.put("mobs/melee_piglin_always", new BPos(1,3,1));
        this.put("mobs/sword_piglin", new BPos(1,3,1));

        this.put("treasure/bases/centers", new BPos());
        this.put("treasure/bases/lava_basin", new BPos());
        this.put("treasure/brains", new BPos());
        this.put("treasure/connectors", new BPos());
        this.put("treasure/corners", new BPos());
        this.put("treasure/entrances", new BPos());
        this.put("treasure/extensions", new BPos());
        this.put("treasure/ramparts", new BPos());
        this.put("treasure/roofs", new BPos());
        this.put("treasure/stairs", new BPos());
        this.put("treasure/walls", new BPos());

        this.put("treasure/big_air_full", new BPos());

    }};
}
