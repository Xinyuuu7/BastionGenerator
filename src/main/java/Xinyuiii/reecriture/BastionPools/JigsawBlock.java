package Xinyuiii.reecriture.BastionPools;

import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import Xinyuiii.enumType.JointType;
import Xinyuiii.enumType.PoolType;

public class JigsawBlock {
    public PoolType poolType;
    public JointType jointType;
    public String name;
    public String targetName;
    public BlockDirection direction1;
    public BlockDirection direction2;
    public BPos relativePos;

    public JigsawBlock(PoolType poolType, JointType jointType, String name, String targetName,
                       BlockDirection direction1, BlockDirection direction2, BPos relativePos)
    {
        this.poolType = poolType;
        this.jointType = jointType;
        this.name = name;
        this.targetName = targetName;
        this.direction1 = direction1;
        this.direction2 = direction2;
        this.relativePos = relativePos;
    }
}