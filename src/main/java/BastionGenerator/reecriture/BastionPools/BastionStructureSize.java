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
    }};
}
//加油大哥哥