package minetux.common;

import net.minecraft.util.ChunkCoordinates;

public class PortalEtherPosition extends ChunkCoordinates
{
	public long field_85087_d;
	final TeleporterEther field_85088_e;

	public PortalEtherPosition(TeleporterEther teleporterEther, int par2, int par3, int par4, long par5)
	{
		super(par2, par3, par4);
		this.field_85088_e = teleporterEther;
		this.field_85087_d = par5;
	}
}