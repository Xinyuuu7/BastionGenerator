package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.JointType;
import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MobsJigsawBlocks {
    public static final HashMap<String, List<JigsawBlock>> JIGSAW_BLOCKS = new HashMap<>() {{
        this.put("jigsaws/air", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "block_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
        ));
        this.put("jigsaws/crossbow_piglin", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.EAST, new BPos(0,0,0))
        ));
        this.put("jigsaws/empty", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0))
        ));
        this.put("jigsaws/gold", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "block_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
        ));
        this.put("jigsaws/hoglin", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,1))
        ));
        this.put("jigsaws/melee_piglin", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
        ));
        this.put("jigsaws/melee_piglin_always", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "melee_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
        ));
        this.put("jigsaws/sword_piglin", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
        ));
    }};
}
