package shcm.shsupercm.fabric.citresewn.pack.cits;

import net.minecraft.util.Identifier;
import shcm.shsupercm.fabric.citresewn.ex.CITParseException;
import shcm.shsupercm.fabric.citresewn.pack.CITPack;

import java.util.Properties;

public class CITElytra extends CIT {
    public final Identifier textureIdentifier;

    public CITElytra(CITPack pack, Identifier identifier, Properties properties) throws CITParseException {
        super(pack, identifier, properties);
        try {
            textureIdentifier = resolvePath(identifier, properties.getProperty("texture"), ".png", pack.resourcePack);
            if (textureIdentifier == null)
                throw new Exception("Cannot resolve texture");
        } catch (Exception e) {
            throw new CITParseException(pack.resourcePack, identifier, (e.getClass() == Exception.class ? "" : e.getClass().getSimpleName() + ": ") + e.getMessage());
        }
    }
}
