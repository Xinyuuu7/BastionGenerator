package BastionGenerator.properties;

import com.seedfinding.mccore.rand.ChunkRand;

public class Main {
	public static void main(String [] args) {
		BastionGenerator gen = new BastionGenerator();
		if (gen.generate(48, 163, -288, new ChunkRand()))
			System.out.println("generated");
		
		for (BastionGenerator.Piece p : gen.pieces) {
			System.out.println(p.name);
			System.out.println("/tp " + p.box.minX + " " + p.box.minY + " " + p.box.minZ);
			System.out.println("/tp " + p.box.maxX + " " + p.box.maxY + " " + p.box.maxZ + "\n");
		}
	}
}
