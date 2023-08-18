package BastionGenerator.properties;

import com.seedfinding.mccore.util.pos.BPos;

import java.util.List;

public class BastionGenerator {
    public List<Piece> pieces;
    public enum PlacementBehaviour {
        RIGID,
        TERRAIN_MATCHING,
    }
    static public class Piece {
        String name;
        public BPos pos;
    }
}
