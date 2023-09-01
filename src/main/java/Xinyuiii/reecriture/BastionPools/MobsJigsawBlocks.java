package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.JointType;
import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MobsJigsawBlocks {
    public static final HashMap<String, List<JigsawBlock>> JIGSAW_BLOCKS = new HashMap<>() {
        private static final long serialVersionUID = -5883058025568056692L;
        {
            this.put("blocks/air", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "block_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
            ));
            this.put("blocks/gold", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "block_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
            ));
            this.put("mobs/crossbow_piglin", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.EAST, new BPos(0,0,0))
            ));
            this.put("mobs/empty", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0))
            ));
            this.put("mobs/hoglin", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,1))
            ));
            this.put("mobs/melee_piglin", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
            ));
            this.put("mobs/melee_piglin_always", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "melee_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
            ));
            this.put("mobs/sword_piglin", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mob_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0))
            ));
        }};
}